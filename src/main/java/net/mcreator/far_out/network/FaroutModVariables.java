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
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.far_out.FaroutMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FaroutModVariables {
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
			clone.EngineTechLevel = original.EngineTechLevel;
			clone.HabTechLevel = original.HabTechLevel;
			clone.GeneratorTechLevel = original.GeneratorTechLevel;
			clone.ControlUnitTechLevel = original.ControlUnitTechLevel;
			clone.ObtainedCapacitor = original.ObtainedCapacitor;
			clone.ObtainedRelay = original.ObtainedRelay;
			clone.SystemID = original.SystemID;
			if (!event.isWasDeath()) {
				clone.AccessLocationX = original.AccessLocationX;
				clone.AccessLocationY = original.AccessLocationY;
				clone.AccessLocationZ = original.AccessLocationZ;
				clone.InFormalonSystem = original.InFormalonSystem;
				clone.DepartureBody = original.DepartureBody;
				clone.UsingComputer = original.UsingComputer;
				clone.Xvel = original.Xvel;
				clone.Yvel = original.Yvel;
				clone.Zvel = original.Zvel;
				clone.Pitch = original.Pitch;
				clone.Yaw = original.Yaw;
				clone.Index = original.Index;
				clone.InTransit = original.InTransit;
				clone.StarshipFuelPlayer = original.StarshipFuelPlayer;
				clone.TargetIndex = original.TargetIndex;
				clone.RecipeNumber = original.RecipeNumber;
				clone.TransitName = original.TransitName;
				clone.TransitHabitation = original.TransitHabitation;
				clone.TransitDeltaV = original.TransitDeltaV;
				clone.TransitDestination = original.TransitDestination;
				clone.TransitSource = original.TransitSource;
				clone.TransitControlLevel = original.TransitControlLevel;
				clone.TransitTransferDeltaV = original.TransitTransferDeltaV;
				clone.TransitDirection = original.TransitDirection;
				clone.GoingToSpace = original.GoingToSpace;
				clone.PlayerTimer = original.PlayerTimer;
				clone.TransitTimer = original.TransitTimer;
				clone.CompareDimension = original.CompareDimension;
				clone.PlayerIndex = original.PlayerIndex;
				clone.UsedLander = original.UsedLander;
				clone.HasRibonix = original.HasRibonix;
				clone.RibonixPlagueIncubation = original.RibonixPlagueIncubation;
				clone.EngineOn = original.EngineOn;
				clone.SpacecraftIndex = original.SpacecraftIndex;
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
		public String InterstellarVesselProgress = "12345678S";
		public double AirResistance = 0.0;
		public double SpaceStation = 0;
		public double WattageProduced = 0;
		public double WattageUsed = 0;
		public String LaunchedCrafts = "";
		public double StationConstruction = 0;
		public double StationStorage = 0;
		public double StationEnergy = 0;
		public double UraniumNumber = 144.0;
		public double IronNumber = 32.0;
		public double StarshipFuel = 0;
		public ListTag SpacecraftNames = new ListTag();
		public ListTag SpacecraftHabitiationTime = new ListTag();
		public ListTag SpacecraftDeltaV = new ListTag();
		public ListTag SpacecraftDestination = new ListTag();
		public ListTag SpacecraftSource = new ListTag();
		public ListTag SpacecraftControlLevel = new ListTag();
		public ListTag SpacecraftTransferDeltaV = new ListTag();
		public ListTag SpacecraftDirection = new ListTag();
		public double Capitualation = 0;
		public double TotalDivisions = 0;
		public double AntimatterProduction = 0;
		public double PrimaryCelestialObjectSize = 0.0;
		public boolean WarDeclared = false;
		public CompoundTag SpacecraftHab = new CompoundTag();
		public CompoundTag SpacecraftDeltav = new CompoundTag();
		public CompoundTag SpacecraftRequiredDeltaV = new CompoundTag();
		public CompoundTag SpacecraftDestinationPlanet = new CompoundTag();
		public CompoundTag SpacecraftDeparturePlanet = new CompoundTag();

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			InterstellarVesselProgress = nbt.getString("InterstellarVesselProgress");
			AirResistance = nbt.getDouble("AirResistance");
			SpaceStation = nbt.getDouble("SpaceStation");
			WattageProduced = nbt.getDouble("WattageProduced");
			WattageUsed = nbt.getDouble("WattageUsed");
			LaunchedCrafts = nbt.getString("LaunchedCrafts");
			StationConstruction = nbt.getDouble("StationConstruction");
			StationStorage = nbt.getDouble("StationStorage");
			StationEnergy = nbt.getDouble("StationEnergy");
			UraniumNumber = nbt.getDouble("UraniumNumber");
			IronNumber = nbt.getDouble("IronNumber");
			StarshipFuel = nbt.getDouble("StarshipFuel");
			this.SpacecraftNames = nbt.get("SpacecraftNames") instanceof ListTag SpacecraftNames ? SpacecraftNames : new ListTag();
			this.SpacecraftHabitiationTime = nbt.get("SpacecraftHabitiationTime") instanceof ListTag SpacecraftHabitiationTime ? SpacecraftHabitiationTime : new ListTag();
			this.SpacecraftDeltaV = nbt.get("SpacecraftDeltaV") instanceof ListTag SpacecraftDeltaV ? SpacecraftDeltaV : new ListTag();
			this.SpacecraftDestination = nbt.get("SpacecraftDestination") instanceof ListTag SpacecraftDestination ? SpacecraftDestination : new ListTag();
			this.SpacecraftSource = nbt.get("SpacecraftSource") instanceof ListTag SpacecraftSource ? SpacecraftSource : new ListTag();
			this.SpacecraftControlLevel = nbt.get("SpacecraftControlLevel") instanceof ListTag SpacecraftControlLevel ? SpacecraftControlLevel : new ListTag();
			this.SpacecraftTransferDeltaV = nbt.get("SpacecraftTransferDeltaV") instanceof ListTag SpacecraftTransferDeltaV ? SpacecraftTransferDeltaV : new ListTag();
			this.SpacecraftDirection = nbt.get("SpacecraftDirection") instanceof ListTag SpacecraftDirection ? SpacecraftDirection : new ListTag();
			Capitualation = nbt.getDouble("Capitualation");
			TotalDivisions = nbt.getDouble("TotalDivisions");
			AntimatterProduction = nbt.getDouble("AntimatterProduction");
			PrimaryCelestialObjectSize = nbt.getDouble("PrimaryCelestialObjectSize");
			WarDeclared = nbt.getBoolean("WarDeclared");
			this.SpacecraftHab = nbt.get("SpacecraftHab") instanceof CompoundTag SpacecraftHab ? SpacecraftHab : new CompoundTag();
			this.SpacecraftDeltav = nbt.get("SpacecraftDeltav") instanceof CompoundTag SpacecraftDeltav ? SpacecraftDeltav : new CompoundTag();
			this.SpacecraftRequiredDeltaV = nbt.get("SpacecraftRequiredDeltaV") instanceof CompoundTag SpacecraftRequiredDeltaV ? SpacecraftRequiredDeltaV : new CompoundTag();
			this.SpacecraftDestinationPlanet = nbt.get("SpacecraftDestinationPlanet") instanceof CompoundTag SpacecraftDestinationPlanet ? SpacecraftDestinationPlanet : new CompoundTag();
			this.SpacecraftDeparturePlanet = nbt.get("SpacecraftDeparturePlanet") instanceof CompoundTag SpacecraftDeparturePlanet ? SpacecraftDeparturePlanet : new CompoundTag();
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("InterstellarVesselProgress", InterstellarVesselProgress);
			nbt.putDouble("AirResistance", AirResistance);
			nbt.putDouble("SpaceStation", SpaceStation);
			nbt.putDouble("WattageProduced", WattageProduced);
			nbt.putDouble("WattageUsed", WattageUsed);
			nbt.putString("LaunchedCrafts", LaunchedCrafts);
			nbt.putDouble("StationConstruction", StationConstruction);
			nbt.putDouble("StationStorage", StationStorage);
			nbt.putDouble("StationEnergy", StationEnergy);
			nbt.putDouble("UraniumNumber", UraniumNumber);
			nbt.putDouble("IronNumber", IronNumber);
			nbt.putDouble("StarshipFuel", StarshipFuel);
			nbt.put("SpacecraftNames", this.SpacecraftNames);
			nbt.put("SpacecraftHabitiationTime", this.SpacecraftHabitiationTime);
			nbt.put("SpacecraftDeltaV", this.SpacecraftDeltaV);
			nbt.put("SpacecraftDestination", this.SpacecraftDestination);
			nbt.put("SpacecraftSource", this.SpacecraftSource);
			nbt.put("SpacecraftControlLevel", this.SpacecraftControlLevel);
			nbt.put("SpacecraftTransferDeltaV", this.SpacecraftTransferDeltaV);
			nbt.put("SpacecraftDirection", this.SpacecraftDirection);
			nbt.putDouble("Capitualation", Capitualation);
			nbt.putDouble("TotalDivisions", TotalDivisions);
			nbt.putDouble("AntimatterProduction", AntimatterProduction);
			nbt.putDouble("PrimaryCelestialObjectSize", PrimaryCelestialObjectSize);
			nbt.putBoolean("WarDeclared", WarDeclared);
			nbt.put("SpacecraftHab", this.SpacecraftHab);
			nbt.put("SpacecraftDeltav", this.SpacecraftDeltav);
			nbt.put("SpacecraftRequiredDeltaV", this.SpacecraftRequiredDeltaV);
			nbt.put("SpacecraftDestinationPlanet", this.SpacecraftDestinationPlanet);
			nbt.put("SpacecraftDeparturePlanet", this.SpacecraftDeparturePlanet);
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
		public double DV = 0;
		public double Hab = 0;
		public boolean FireTime = false;
		public double SpacecraftWatts = 0;
		public double SpacecraftMass = 0;
		public boolean StartupComplete = false;
		public double FairingHabTime = 0;
		public double FairingDeltaV = 0;
		public double FairingWattage = 0;
		public boolean InterstellarVesselMade = false;
		public boolean OtherPlanetsKnown = false;
		public String Vessels = "\"\"";
		public boolean EtauianBaseSpawned = false;
		public double TransportDelay = 10.0;
		public double ArrivalDelay = 200.0;
		public boolean EtauosianBaseSpawned = false;
		public double Gravity = 9.81;
		public double GravitationalMultiplier = 200.0;
		public String SpacecraftStatus = "\"\"";
		public String WorkingSudoArray = "~Hey;Hi~";
		public String ModID = "farout";
		public double SpaceStationLevel = 0;
		public String SelectedDimension = "";
		public double AluminiumNumber = 256.0;
		public double MediumComputeChipsNumber = 10.0;
		public double HafniumCarbonitrideNumber = 10.0;
		public double CopperIngotNumber = 20.0;
		public double DeuteriumNumber = 5.0;
		public double GatewayX = 0;
		public double GatewayZ = 0;
		public boolean PlacedSandosArenaPortal = false;
		public double EtauosMonolithX = 0;
		public double EtauosMonolithZ = 0;
		public double OceanusMonolithX = 0;
		public double OceanusMonolithZ = 0;
		public boolean AetherianConquererKilled = false;
		public CompoundTag Economy = new CompoundTag();
		public CompoundTag RocketBuildingItems = new CompoundTag();
		public String ShadowMask = "noclipforstars";
		public CompoundTag GravitationalParameters = new CompoundTag();
		public CompoundTag SemiMajorAxis = new CompoundTag();
		public CompoundTag ParentBody = new CompoundTag();
		public CompoundTag Tempature = new CompoundTag();
		public double TriangulationCount = 0;
		public boolean SandosTelescope = false;
		public boolean FormalonTelescope = false;
		public boolean TuQegTelescope = false;
		public CompoundTag HeatValues = new CompoundTag();
		public CompoundTag OrbitalPeriods = new CompoundTag();

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			MathAns = nbt.getString("MathAns");
			DV = nbt.getDouble("DV");
			Hab = nbt.getDouble("Hab");
			FireTime = nbt.getBoolean("FireTime");
			SpacecraftWatts = nbt.getDouble("SpacecraftWatts");
			SpacecraftMass = nbt.getDouble("SpacecraftMass");
			StartupComplete = nbt.getBoolean("StartupComplete");
			FairingHabTime = nbt.getDouble("FairingHabTime");
			FairingDeltaV = nbt.getDouble("FairingDeltaV");
			FairingWattage = nbt.getDouble("FairingWattage");
			InterstellarVesselMade = nbt.getBoolean("InterstellarVesselMade");
			OtherPlanetsKnown = nbt.getBoolean("OtherPlanetsKnown");
			Vessels = nbt.getString("Vessels");
			EtauianBaseSpawned = nbt.getBoolean("EtauianBaseSpawned");
			TransportDelay = nbt.getDouble("TransportDelay");
			ArrivalDelay = nbt.getDouble("ArrivalDelay");
			EtauosianBaseSpawned = nbt.getBoolean("EtauosianBaseSpawned");
			Gravity = nbt.getDouble("Gravity");
			GravitationalMultiplier = nbt.getDouble("GravitationalMultiplier");
			SpacecraftStatus = nbt.getString("SpacecraftStatus");
			WorkingSudoArray = nbt.getString("WorkingSudoArray");
			ModID = nbt.getString("ModID");
			SpaceStationLevel = nbt.getDouble("SpaceStationLevel");
			SelectedDimension = nbt.getString("SelectedDimension");
			AluminiumNumber = nbt.getDouble("AluminiumNumber");
			MediumComputeChipsNumber = nbt.getDouble("MediumComputeChipsNumber");
			HafniumCarbonitrideNumber = nbt.getDouble("HafniumCarbonitrideNumber");
			CopperIngotNumber = nbt.getDouble("CopperIngotNumber");
			DeuteriumNumber = nbt.getDouble("DeuteriumNumber");
			GatewayX = nbt.getDouble("GatewayX");
			GatewayZ = nbt.getDouble("GatewayZ");
			PlacedSandosArenaPortal = nbt.getBoolean("PlacedSandosArenaPortal");
			EtauosMonolithX = nbt.getDouble("EtauosMonolithX");
			EtauosMonolithZ = nbt.getDouble("EtauosMonolithZ");
			OceanusMonolithX = nbt.getDouble("OceanusMonolithX");
			OceanusMonolithZ = nbt.getDouble("OceanusMonolithZ");
			AetherianConquererKilled = nbt.getBoolean("AetherianConquererKilled");
			this.Economy = nbt.get("Economy") instanceof CompoundTag Economy ? Economy : new CompoundTag();
			this.RocketBuildingItems = nbt.get("RocketBuildingItems") instanceof CompoundTag RocketBuildingItems ? RocketBuildingItems : new CompoundTag();
			ShadowMask = nbt.getString("ShadowMask");
			this.GravitationalParameters = nbt.get("GravitationalParameters") instanceof CompoundTag GravitationalParameters ? GravitationalParameters : new CompoundTag();
			this.SemiMajorAxis = nbt.get("SemiMajorAxis") instanceof CompoundTag SemiMajorAxis ? SemiMajorAxis : new CompoundTag();
			this.ParentBody = nbt.get("ParentBody") instanceof CompoundTag ParentBody ? ParentBody : new CompoundTag();
			this.Tempature = nbt.get("Tempature") instanceof CompoundTag Tempature ? Tempature : new CompoundTag();
			TriangulationCount = nbt.getDouble("TriangulationCount");
			SandosTelescope = nbt.getBoolean("SandosTelescope");
			FormalonTelescope = nbt.getBoolean("FormalonTelescope");
			TuQegTelescope = nbt.getBoolean("TuQegTelescope");
			this.HeatValues = nbt.get("HeatValues") instanceof CompoundTag HeatValues ? HeatValues : new CompoundTag();
			this.OrbitalPeriods = nbt.get("OrbitalPeriods") instanceof CompoundTag OrbitalPeriods ? OrbitalPeriods : new CompoundTag();
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("MathAns", MathAns);
			nbt.putDouble("DV", DV);
			nbt.putDouble("Hab", Hab);
			nbt.putBoolean("FireTime", FireTime);
			nbt.putDouble("SpacecraftWatts", SpacecraftWatts);
			nbt.putDouble("SpacecraftMass", SpacecraftMass);
			nbt.putBoolean("StartupComplete", StartupComplete);
			nbt.putDouble("FairingHabTime", FairingHabTime);
			nbt.putDouble("FairingDeltaV", FairingDeltaV);
			nbt.putDouble("FairingWattage", FairingWattage);
			nbt.putBoolean("InterstellarVesselMade", InterstellarVesselMade);
			nbt.putBoolean("OtherPlanetsKnown", OtherPlanetsKnown);
			nbt.putString("Vessels", Vessels);
			nbt.putBoolean("EtauianBaseSpawned", EtauianBaseSpawned);
			nbt.putDouble("TransportDelay", TransportDelay);
			nbt.putDouble("ArrivalDelay", ArrivalDelay);
			nbt.putBoolean("EtauosianBaseSpawned", EtauosianBaseSpawned);
			nbt.putDouble("Gravity", Gravity);
			nbt.putDouble("GravitationalMultiplier", GravitationalMultiplier);
			nbt.putString("SpacecraftStatus", SpacecraftStatus);
			nbt.putString("WorkingSudoArray", WorkingSudoArray);
			nbt.putString("ModID", ModID);
			nbt.putDouble("SpaceStationLevel", SpaceStationLevel);
			nbt.putString("SelectedDimension", SelectedDimension);
			nbt.putDouble("AluminiumNumber", AluminiumNumber);
			nbt.putDouble("MediumComputeChipsNumber", MediumComputeChipsNumber);
			nbt.putDouble("HafniumCarbonitrideNumber", HafniumCarbonitrideNumber);
			nbt.putDouble("CopperIngotNumber", CopperIngotNumber);
			nbt.putDouble("DeuteriumNumber", DeuteriumNumber);
			nbt.putDouble("GatewayX", GatewayX);
			nbt.putDouble("GatewayZ", GatewayZ);
			nbt.putBoolean("PlacedSandosArenaPortal", PlacedSandosArenaPortal);
			nbt.putDouble("EtauosMonolithX", EtauosMonolithX);
			nbt.putDouble("EtauosMonolithZ", EtauosMonolithZ);
			nbt.putDouble("OceanusMonolithX", OceanusMonolithX);
			nbt.putDouble("OceanusMonolithZ", OceanusMonolithZ);
			nbt.putBoolean("AetherianConquererKilled", AetherianConquererKilled);
			nbt.put("Economy", this.Economy);
			nbt.put("RocketBuildingItems", this.RocketBuildingItems);
			nbt.putString("ShadowMask", ShadowMask);
			nbt.put("GravitationalParameters", this.GravitationalParameters);
			nbt.put("SemiMajorAxis", this.SemiMajorAxis);
			nbt.put("ParentBody", this.ParentBody);
			nbt.put("Tempature", this.Tempature);
			nbt.putDouble("TriangulationCount", TriangulationCount);
			nbt.putBoolean("SandosTelescope", SandosTelescope);
			nbt.putBoolean("FormalonTelescope", FormalonTelescope);
			nbt.putBoolean("TuQegTelescope", TuQegTelescope);
			nbt.put("HeatValues", this.HeatValues);
			nbt.put("OrbitalPeriods", this.OrbitalPeriods);
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
		public double AccessLocationX = 0;
		public double AccessLocationY = 0;
		public double AccessLocationZ = 0;
		public String SelectedTrajectory = "\"\"";
		public boolean ToggleTutorial = true;
		public double Progress = 0;
		public boolean InFormalonSystem = false;
		public boolean VehicleMode = true;
		public String DepartureBody = "\"\"";
		public boolean UsingComputer = false;
		public double CurrentSystemID = 0;
		public String PlayerStarSystem = "\"\"";
		public double Xvel = 0;
		public double Yvel = 0;
		public double Zvel = 0;
		public double Pitch = 0;
		public double Yaw = 0;
		public double EngineTechLevel = 0.0;
		public double HabTechLevel = 0.0;
		public double GeneratorTechLevel = 0;
		public double ControlUnitTechLevel = 0;
		public double Index = 0.0;
		public String InTransit = "";
		public boolean ObtainedCapacitor = false;
		public boolean ObtainedRelay = false;
		public double StarshipFuelPlayer = 0;
		public double SystemID = 0;
		public double TargetIndex = 0;
		public double RecipeNumber = 0;
		public String TransitName = "\"\"";
		public double TransitHabitation = 0;
		public double TransitDeltaV = 0;
		public String TransitDestination = "\"\"";
		public String TransitSource = "\"\"";
		public boolean TransitControlLevel = false;
		public double TransitTransferDeltaV = 0;
		public boolean TransitDirection = false;
		public boolean GoingToSpace = false;
		public double PlayerTimer = 0.0;
		public double TransitTimer = 300.0;
		public String CompareDimension = "\"\"";
		public double PlayerIndex = 0;
		public boolean UsedLander = false;
		public boolean HasRibonix = false;
		public double RibonixPlagueIncubation = 0;
		public boolean EngineOn = false;
		public double SpacecraftIndex = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				FaroutMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("Boot_Complete", Boot_Complete);
			nbt.putDouble("knowledgeBasePageNumber", knowledgeBasePageNumber);
			nbt.putDouble("AccessLocationX", AccessLocationX);
			nbt.putDouble("AccessLocationY", AccessLocationY);
			nbt.putDouble("AccessLocationZ", AccessLocationZ);
			nbt.putString("SelectedTrajectory", SelectedTrajectory);
			nbt.putBoolean("ToggleTutorial", ToggleTutorial);
			nbt.putDouble("Progress", Progress);
			nbt.putBoolean("InFormalonSystem", InFormalonSystem);
			nbt.putBoolean("VehicleMode", VehicleMode);
			nbt.putString("DepartureBody", DepartureBody);
			nbt.putBoolean("UsingComputer", UsingComputer);
			nbt.putDouble("CurrentSystemID", CurrentSystemID);
			nbt.putString("PlayerStarSystem", PlayerStarSystem);
			nbt.putDouble("Xvel", Xvel);
			nbt.putDouble("Yvel", Yvel);
			nbt.putDouble("Zvel", Zvel);
			nbt.putDouble("Pitch", Pitch);
			nbt.putDouble("Yaw", Yaw);
			nbt.putDouble("EngineTechLevel", EngineTechLevel);
			nbt.putDouble("HabTechLevel", HabTechLevel);
			nbt.putDouble("GeneratorTechLevel", GeneratorTechLevel);
			nbt.putDouble("ControlUnitTechLevel", ControlUnitTechLevel);
			nbt.putDouble("Index", Index);
			nbt.putString("InTransit", InTransit);
			nbt.putBoolean("ObtainedCapacitor", ObtainedCapacitor);
			nbt.putBoolean("ObtainedRelay", ObtainedRelay);
			nbt.putDouble("StarshipFuelPlayer", StarshipFuelPlayer);
			nbt.putDouble("SystemID", SystemID);
			nbt.putDouble("TargetIndex", TargetIndex);
			nbt.putDouble("RecipeNumber", RecipeNumber);
			nbt.putString("TransitName", TransitName);
			nbt.putDouble("TransitHabitation", TransitHabitation);
			nbt.putDouble("TransitDeltaV", TransitDeltaV);
			nbt.putString("TransitDestination", TransitDestination);
			nbt.putString("TransitSource", TransitSource);
			nbt.putBoolean("TransitControlLevel", TransitControlLevel);
			nbt.putDouble("TransitTransferDeltaV", TransitTransferDeltaV);
			nbt.putBoolean("TransitDirection", TransitDirection);
			nbt.putBoolean("GoingToSpace", GoingToSpace);
			nbt.putDouble("PlayerTimer", PlayerTimer);
			nbt.putDouble("TransitTimer", TransitTimer);
			nbt.putString("CompareDimension", CompareDimension);
			nbt.putDouble("PlayerIndex", PlayerIndex);
			nbt.putBoolean("UsedLander", UsedLander);
			nbt.putBoolean("HasRibonix", HasRibonix);
			nbt.putDouble("RibonixPlagueIncubation", RibonixPlagueIncubation);
			nbt.putBoolean("EngineOn", EngineOn);
			nbt.putDouble("SpacecraftIndex", SpacecraftIndex);
			return nbt;
		}

		public void readNBT(Tag tag) {
			CompoundTag nbt = (CompoundTag) tag;
			Boot_Complete = nbt.getBoolean("Boot_Complete");
			knowledgeBasePageNumber = nbt.getDouble("knowledgeBasePageNumber");
			AccessLocationX = nbt.getDouble("AccessLocationX");
			AccessLocationY = nbt.getDouble("AccessLocationY");
			AccessLocationZ = nbt.getDouble("AccessLocationZ");
			SelectedTrajectory = nbt.getString("SelectedTrajectory");
			ToggleTutorial = nbt.getBoolean("ToggleTutorial");
			Progress = nbt.getDouble("Progress");
			InFormalonSystem = nbt.getBoolean("InFormalonSystem");
			VehicleMode = nbt.getBoolean("VehicleMode");
			DepartureBody = nbt.getString("DepartureBody");
			UsingComputer = nbt.getBoolean("UsingComputer");
			CurrentSystemID = nbt.getDouble("CurrentSystemID");
			PlayerStarSystem = nbt.getString("PlayerStarSystem");
			Xvel = nbt.getDouble("Xvel");
			Yvel = nbt.getDouble("Yvel");
			Zvel = nbt.getDouble("Zvel");
			Pitch = nbt.getDouble("Pitch");
			Yaw = nbt.getDouble("Yaw");
			EngineTechLevel = nbt.getDouble("EngineTechLevel");
			HabTechLevel = nbt.getDouble("HabTechLevel");
			GeneratorTechLevel = nbt.getDouble("GeneratorTechLevel");
			ControlUnitTechLevel = nbt.getDouble("ControlUnitTechLevel");
			Index = nbt.getDouble("Index");
			InTransit = nbt.getString("InTransit");
			ObtainedCapacitor = nbt.getBoolean("ObtainedCapacitor");
			ObtainedRelay = nbt.getBoolean("ObtainedRelay");
			StarshipFuelPlayer = nbt.getDouble("StarshipFuelPlayer");
			SystemID = nbt.getDouble("SystemID");
			TargetIndex = nbt.getDouble("TargetIndex");
			RecipeNumber = nbt.getDouble("RecipeNumber");
			TransitName = nbt.getString("TransitName");
			TransitHabitation = nbt.getDouble("TransitHabitation");
			TransitDeltaV = nbt.getDouble("TransitDeltaV");
			TransitDestination = nbt.getString("TransitDestination");
			TransitSource = nbt.getString("TransitSource");
			TransitControlLevel = nbt.getBoolean("TransitControlLevel");
			TransitTransferDeltaV = nbt.getDouble("TransitTransferDeltaV");
			TransitDirection = nbt.getBoolean("TransitDirection");
			GoingToSpace = nbt.getBoolean("GoingToSpace");
			PlayerTimer = nbt.getDouble("PlayerTimer");
			TransitTimer = nbt.getDouble("TransitTimer");
			CompareDimension = nbt.getString("CompareDimension");
			PlayerIndex = nbt.getDouble("PlayerIndex");
			UsedLander = nbt.getBoolean("UsedLander");
			HasRibonix = nbt.getBoolean("HasRibonix");
			RibonixPlagueIncubation = nbt.getDouble("RibonixPlagueIncubation");
			EngineOn = nbt.getBoolean("EngineOn");
			SpacecraftIndex = nbt.getDouble("SpacecraftIndex");
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
					variables.AccessLocationX = message.data.AccessLocationX;
					variables.AccessLocationY = message.data.AccessLocationY;
					variables.AccessLocationZ = message.data.AccessLocationZ;
					variables.SelectedTrajectory = message.data.SelectedTrajectory;
					variables.ToggleTutorial = message.data.ToggleTutorial;
					variables.Progress = message.data.Progress;
					variables.InFormalonSystem = message.data.InFormalonSystem;
					variables.VehicleMode = message.data.VehicleMode;
					variables.DepartureBody = message.data.DepartureBody;
					variables.UsingComputer = message.data.UsingComputer;
					variables.CurrentSystemID = message.data.CurrentSystemID;
					variables.PlayerStarSystem = message.data.PlayerStarSystem;
					variables.Xvel = message.data.Xvel;
					variables.Yvel = message.data.Yvel;
					variables.Zvel = message.data.Zvel;
					variables.Pitch = message.data.Pitch;
					variables.Yaw = message.data.Yaw;
					variables.EngineTechLevel = message.data.EngineTechLevel;
					variables.HabTechLevel = message.data.HabTechLevel;
					variables.GeneratorTechLevel = message.data.GeneratorTechLevel;
					variables.ControlUnitTechLevel = message.data.ControlUnitTechLevel;
					variables.Index = message.data.Index;
					variables.InTransit = message.data.InTransit;
					variables.ObtainedCapacitor = message.data.ObtainedCapacitor;
					variables.ObtainedRelay = message.data.ObtainedRelay;
					variables.StarshipFuelPlayer = message.data.StarshipFuelPlayer;
					variables.SystemID = message.data.SystemID;
					variables.TargetIndex = message.data.TargetIndex;
					variables.RecipeNumber = message.data.RecipeNumber;
					variables.TransitName = message.data.TransitName;
					variables.TransitHabitation = message.data.TransitHabitation;
					variables.TransitDeltaV = message.data.TransitDeltaV;
					variables.TransitDestination = message.data.TransitDestination;
					variables.TransitSource = message.data.TransitSource;
					variables.TransitControlLevel = message.data.TransitControlLevel;
					variables.TransitTransferDeltaV = message.data.TransitTransferDeltaV;
					variables.TransitDirection = message.data.TransitDirection;
					variables.GoingToSpace = message.data.GoingToSpace;
					variables.PlayerTimer = message.data.PlayerTimer;
					variables.TransitTimer = message.data.TransitTimer;
					variables.CompareDimension = message.data.CompareDimension;
					variables.PlayerIndex = message.data.PlayerIndex;
					variables.UsedLander = message.data.UsedLander;
					variables.HasRibonix = message.data.HasRibonix;
					variables.RibonixPlagueIncubation = message.data.RibonixPlagueIncubation;
					variables.EngineOn = message.data.EngineOn;
					variables.SpacecraftIndex = message.data.SpacecraftIndex;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
