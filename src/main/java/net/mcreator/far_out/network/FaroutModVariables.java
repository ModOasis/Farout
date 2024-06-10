package net.mcreator.far_out.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.far_out.FaroutMod;

import java.util.function.Supplier;

import java.io.File;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FaroutModVariables {
	public static File SystemData = new File("");

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		FaroutMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		FaroutMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.Boot_Complete = original.Boot_Complete;
			clone.knowledgeBasePageNumber = original.knowledgeBasePageNumber;
			clone.SelectedTrajectory = original.SelectedTrajectory;
			clone.ToggleTutorial = original.ToggleTutorial;
			clone.Progress = original.Progress;
			clone.VehicleMode = original.VehicleMode;
			clone.CurrentSystemID = original.CurrentSystemID;
			clone.PlayerStarSystem = original.PlayerStarSystem;
			if (!event.isWasDeath()) {
				clone.InFormalonSystem = original.InFormalonSystem;
				clone.DepartureBody = original.DepartureBody;
				clone.UsingComputer = original.UsingComputer;
				clone.WantedPitch = original.WantedPitch;
				clone.WantedYaw = original.WantedYaw;
				clone.WantedEngineStatus = original.WantedEngineStatus;
				clone.Xvel = original.Xvel;
				clone.Yvel = original.Yvel;
				clone.Zvel = original.Zvel;
				clone.Pitch = original.Pitch;
				clone.Yaw = original.Yaw;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					FaroutMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					FaroutMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					FaroutMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "farout_worldvars";
		public double Energy = 0;
		public double TotalCapacty = 10.0;
		public String InterstellarVesselProgress = "12345678S";
		public double SpaceStation = 0;
		public double WattageProduced = 0;
		public double WattageUsed = 0;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			Energy = nbt.getDouble("Energy");
			TotalCapacty = nbt.getDouble("TotalCapacty");
			InterstellarVesselProgress = nbt.getString("InterstellarVesselProgress");
			SpaceStation = nbt.getDouble("SpaceStation");
			WattageProduced = nbt.getDouble("WattageProduced");
			WattageUsed = nbt.getDouble("WattageUsed");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("Energy", Energy);
			nbt.putDouble("TotalCapacty", TotalCapacty);
			nbt.putString("InterstellarVesselProgress", InterstellarVesselProgress);
			nbt.putDouble("SpaceStation", SpaceStation);
			nbt.putDouble("WattageProduced", WattageProduced);
			nbt.putDouble("WattageUsed", WattageUsed);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				FaroutMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "farout_mapvars";
		public String MathAns = "\"\"";
		public double ServerNumber = 0;
		public double DV = 0;
		public double Hab = 0;
		public boolean FireTime = false;
		public double SpacecraftWatts = 0;
		public double SpacecraftMass = 0;
		public double AccessLocationX = 0;
		public double AccessLocationY = 0;
		public double AccessLocationZ = 0;
		public boolean StartupComplete = false;
		public double SelectedMicrochipRecipe = 3.0;
		public double Tick = 0;
		public double FairingHabTime = 0;
		public double FairingDeltaV = 0;
		public double FairingWattage = 0;
		public boolean InterstellarVesselMade = false;
		public boolean OtherPlanetsKnown = false;
		public String Vessels = "\"\"";
		public String InTransit = "S12345678F";
		public boolean EtauianBaseSpawned = false;
		public double TransportDelay = 10.0;
		public double ArrivalDelay = 200.0;
		public boolean EtauosianBaseSpawned = false;
		public double Gravity = 9.81;
		public double AirResistance = 0.0;
		public double GravitationalMultiplier = 200.0;
		public String CurrentWorldSaveName = "\"\"";
		public String SpacecraftStatus = "\"\"";
		public String SpacecraftType = "\"\"";
		public String SpacecraftFuelCapacity = "\"\"";
		public String WorkingSudoArray = "~Hey;Hi~";
		public double WantedIndex = 1.0;
		public double RotationSpeed = 0;
		public double SandosLuminosity = 0.0;
		public String ModID = "farout";
		public double SpaceStationLevel = 0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			MathAns = nbt.getString("MathAns");
			ServerNumber = nbt.getDouble("ServerNumber");
			DV = nbt.getDouble("DV");
			Hab = nbt.getDouble("Hab");
			FireTime = nbt.getBoolean("FireTime");
			SpacecraftWatts = nbt.getDouble("SpacecraftWatts");
			SpacecraftMass = nbt.getDouble("SpacecraftMass");
			AccessLocationX = nbt.getDouble("AccessLocationX");
			AccessLocationY = nbt.getDouble("AccessLocationY");
			AccessLocationZ = nbt.getDouble("AccessLocationZ");
			StartupComplete = nbt.getBoolean("StartupComplete");
			SelectedMicrochipRecipe = nbt.getDouble("SelectedMicrochipRecipe");
			Tick = nbt.getDouble("Tick");
			FairingHabTime = nbt.getDouble("FairingHabTime");
			FairingDeltaV = nbt.getDouble("FairingDeltaV");
			FairingWattage = nbt.getDouble("FairingWattage");
			InterstellarVesselMade = nbt.getBoolean("InterstellarVesselMade");
			OtherPlanetsKnown = nbt.getBoolean("OtherPlanetsKnown");
			Vessels = nbt.getString("Vessels");
			InTransit = nbt.getString("InTransit");
			EtauianBaseSpawned = nbt.getBoolean("EtauianBaseSpawned");
			TransportDelay = nbt.getDouble("TransportDelay");
			ArrivalDelay = nbt.getDouble("ArrivalDelay");
			EtauosianBaseSpawned = nbt.getBoolean("EtauosianBaseSpawned");
			Gravity = nbt.getDouble("Gravity");
			AirResistance = nbt.getDouble("AirResistance");
			GravitationalMultiplier = nbt.getDouble("GravitationalMultiplier");
			CurrentWorldSaveName = nbt.getString("CurrentWorldSaveName");
			SpacecraftStatus = nbt.getString("SpacecraftStatus");
			SpacecraftType = nbt.getString("SpacecraftType");
			SpacecraftFuelCapacity = nbt.getString("SpacecraftFuelCapacity");
			WorkingSudoArray = nbt.getString("WorkingSudoArray");
			WantedIndex = nbt.getDouble("WantedIndex");
			RotationSpeed = nbt.getDouble("RotationSpeed");
			SandosLuminosity = nbt.getDouble("SandosLuminosity");
			ModID = nbt.getString("ModID");
			SpaceStationLevel = nbt.getDouble("SpaceStationLevel");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("MathAns", MathAns);
			nbt.putDouble("ServerNumber", ServerNumber);
			nbt.putDouble("DV", DV);
			nbt.putDouble("Hab", Hab);
			nbt.putBoolean("FireTime", FireTime);
			nbt.putDouble("SpacecraftWatts", SpacecraftWatts);
			nbt.putDouble("SpacecraftMass", SpacecraftMass);
			nbt.putDouble("AccessLocationX", AccessLocationX);
			nbt.putDouble("AccessLocationY", AccessLocationY);
			nbt.putDouble("AccessLocationZ", AccessLocationZ);
			nbt.putBoolean("StartupComplete", StartupComplete);
			nbt.putDouble("SelectedMicrochipRecipe", SelectedMicrochipRecipe);
			nbt.putDouble("Tick", Tick);
			nbt.putDouble("FairingHabTime", FairingHabTime);
			nbt.putDouble("FairingDeltaV", FairingDeltaV);
			nbt.putDouble("FairingWattage", FairingWattage);
			nbt.putBoolean("InterstellarVesselMade", InterstellarVesselMade);
			nbt.putBoolean("OtherPlanetsKnown", OtherPlanetsKnown);
			nbt.putString("Vessels", Vessels);
			nbt.putString("InTransit", InTransit);
			nbt.putBoolean("EtauianBaseSpawned", EtauianBaseSpawned);
			nbt.putDouble("TransportDelay", TransportDelay);
			nbt.putDouble("ArrivalDelay", ArrivalDelay);
			nbt.putBoolean("EtauosianBaseSpawned", EtauosianBaseSpawned);
			nbt.putDouble("Gravity", Gravity);
			nbt.putDouble("AirResistance", AirResistance);
			nbt.putDouble("GravitationalMultiplier", GravitationalMultiplier);
			nbt.putString("CurrentWorldSaveName", CurrentWorldSaveName);
			nbt.putString("SpacecraftStatus", SpacecraftStatus);
			nbt.putString("SpacecraftType", SpacecraftType);
			nbt.putString("SpacecraftFuelCapacity", SpacecraftFuelCapacity);
			nbt.putString("WorkingSudoArray", WorkingSudoArray);
			nbt.putDouble("WantedIndex", WantedIndex);
			nbt.putDouble("RotationSpeed", RotationSpeed);
			nbt.putDouble("SandosLuminosity", SandosLuminosity);
			nbt.putString("ModID", ModID);
			nbt.putDouble("SpaceStationLevel", SpaceStationLevel);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				FaroutMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("farout", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean Boot_Complete = false;
		public double knowledgeBasePageNumber = 0;
		public String SelectedTrajectory = "\"\"";
		public boolean ToggleTutorial = true;
		public double Progress = 0;
		public boolean InFormalonSystem = false;
		public boolean VehicleMode = true;
		public String DepartureBody = "\"\"";
		public boolean UsingComputer = false;
		public double CurrentSystemID = 0;
		public String PlayerStarSystem = "\"\"";
		public double WantedPitch = 0;
		public double WantedYaw = 0;
		public boolean WantedEngineStatus = false;
		public double Xvel = 0;
		public double Yvel = 0;
		public double Zvel = 0;
		public double Pitch = 0;
		public double Yaw = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				FaroutMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("Boot_Complete", Boot_Complete);
			nbt.putDouble("knowledgeBasePageNumber", knowledgeBasePageNumber);
			nbt.putString("SelectedTrajectory", SelectedTrajectory);
			nbt.putBoolean("ToggleTutorial", ToggleTutorial);
			nbt.putDouble("Progress", Progress);
			nbt.putBoolean("InFormalonSystem", InFormalonSystem);
			nbt.putBoolean("VehicleMode", VehicleMode);
			nbt.putString("DepartureBody", DepartureBody);
			nbt.putBoolean("UsingComputer", UsingComputer);
			nbt.putDouble("CurrentSystemID", CurrentSystemID);
			nbt.putString("PlayerStarSystem", PlayerStarSystem);
			nbt.putDouble("WantedPitch", WantedPitch);
			nbt.putDouble("WantedYaw", WantedYaw);
			nbt.putBoolean("WantedEngineStatus", WantedEngineStatus);
			nbt.putDouble("Xvel", Xvel);
			nbt.putDouble("Yvel", Yvel);
			nbt.putDouble("Zvel", Zvel);
			nbt.putDouble("Pitch", Pitch);
			nbt.putDouble("Yaw", Yaw);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			Boot_Complete = nbt.getBoolean("Boot_Complete");
			knowledgeBasePageNumber = nbt.getDouble("knowledgeBasePageNumber");
			SelectedTrajectory = nbt.getString("SelectedTrajectory");
			ToggleTutorial = nbt.getBoolean("ToggleTutorial");
			Progress = nbt.getDouble("Progress");
			InFormalonSystem = nbt.getBoolean("InFormalonSystem");
			VehicleMode = nbt.getBoolean("VehicleMode");
			DepartureBody = nbt.getString("DepartureBody");
			UsingComputer = nbt.getBoolean("UsingComputer");
			CurrentSystemID = nbt.getDouble("CurrentSystemID");
			PlayerStarSystem = nbt.getString("PlayerStarSystem");
			WantedPitch = nbt.getDouble("WantedPitch");
			WantedYaw = nbt.getDouble("WantedYaw");
			WantedEngineStatus = nbt.getBoolean("WantedEngineStatus");
			Xvel = nbt.getDouble("Xvel");
			Yvel = nbt.getDouble("Yvel");
			Zvel = nbt.getDouble("Zvel");
			Pitch = nbt.getDouble("Pitch");
			Yaw = nbt.getDouble("Yaw");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.Boot_Complete = message.data.Boot_Complete;
					variables.knowledgeBasePageNumber = message.data.knowledgeBasePageNumber;
					variables.SelectedTrajectory = message.data.SelectedTrajectory;
					variables.ToggleTutorial = message.data.ToggleTutorial;
					variables.Progress = message.data.Progress;
					variables.InFormalonSystem = message.data.InFormalonSystem;
					variables.VehicleMode = message.data.VehicleMode;
					variables.DepartureBody = message.data.DepartureBody;
					variables.UsingComputer = message.data.UsingComputer;
					variables.CurrentSystemID = message.data.CurrentSystemID;
					variables.PlayerStarSystem = message.data.PlayerStarSystem;
					variables.WantedPitch = message.data.WantedPitch;
					variables.WantedYaw = message.data.WantedYaw;
					variables.WantedEngineStatus = message.data.WantedEngineStatus;
					variables.Xvel = message.data.Xvel;
					variables.Yvel = message.data.Yvel;
					variables.Zvel = message.data.Zvel;
					variables.Pitch = message.data.Pitch;
					variables.Yaw = message.data.Yaw;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
