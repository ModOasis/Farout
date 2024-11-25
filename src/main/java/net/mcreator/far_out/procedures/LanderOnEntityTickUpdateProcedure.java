package net.mcreator.far_out.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.DoubleTag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.LanderEntity;
import net.mcreator.far_out.FaroutMod;

public class LanderOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity LanderEntity = null;
		boolean yES = false;
		double PitchRad = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Normalization = 0;
		double YawRad = 0;
		double yaw = 0;
		double Tick = 0;
		double i = 0;
		double wait = 0;
		if (entity.getDeltaMovement().y() > 0) {
			if (entity instanceof LanderEntity) {
				((LanderEntity) entity).setAnimation("Animation.Lander.Liftoff");
			}
		} else {
			if (entity instanceof LanderEntity) {
				((LanderEntity) entity).setAnimation("Animation.Lander.Landing");
			}
		}
		if (entity.isVehicle()) {
			if (((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).EngineOn) {
				entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y() + 0.1), 0));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 5, 0, 0, 0, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, x, y, z, 20, 0, 0, 0, 0.05);
				if (wait == 12) {
					wait = 0;
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("farout:rocket_engine_noise")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("farout:rocket_engine_noise")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				} else {
					wait = wait + 1;
				}
			}
			{
				CompoundTag _compoundTag = FaroutModVariables.WorldVariables.get(world).SpacecraftHab;
				for (String keyiterator : _compoundTag.getAllKeys()) {
					Tag dataelementiterator = _compoundTag.get(keyiterator);
					if (i == entity.getPersistentData().getDouble("select")) {
						entity.getPersistentData().putString("SpacecraftName", keyiterator);
					} else {
						i = i + 1;
					}
				}
			}
			if (entity.getY() >= 1000) {
				{
					double _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftHab.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof DoubleTag _doubleTag ? _doubleTag.getAsDouble() : 0.0D;
					(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitHabitation = _setval;
						capability.syncPlayerVariables((entity.getFirstPassenger()));
					});
				}
				{
					double _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftRequiredDeltaV.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof DoubleTag _doubleTag ? _doubleTag.getAsDouble() : 0.0D;
					(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitTransferDeltaV = _setval;
						capability.syncPlayerVariables((entity.getFirstPassenger()));
					});
				}
				{
					double _setval = ((FaroutModVariables.WorldVariables.get(world).SpacecraftDeltav.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof DoubleTag _doubleTag ? _doubleTag.getAsDouble() : 0.0D)
							- (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).TransitTransferDeltaV;
					(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitDeltaV = _setval;
						capability.syncPlayerVariables((entity.getFirstPassenger()));
					});
				}
				{
					String _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftDestinationPlanet.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
					(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitDestination = _setval;
						capability.syncPlayerVariables((entity.getFirstPassenger()));
					});
				}
				{
					String _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftDeparturePlanet.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
					(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitSource = _setval;
						capability.syncPlayerVariables((entity.getFirstPassenger()));
					});
				}
				{
					String _setval = entity.getPersistentData().getString("SpacecraftName");
					(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitName = _setval;
						capability.syncPlayerVariables((entity.getFirstPassenger()));
					});
				}
				FaroutModVariables.WorldVariables.get(world).SpacecraftHab.remove((entity.getPersistentData().getString("SpacecraftName")));
				FaroutModVariables.WorldVariables.get(world).SpacecraftDeltav.remove((entity.getPersistentData().getString("SpacecraftName")));
				FaroutModVariables.WorldVariables.get(world).SpacecraftRequiredDeltaV.remove((entity.getPersistentData().getString("SpacecraftName")));
				FaroutModVariables.WorldVariables.get(world).SpacecraftDestinationPlanet.remove((entity.getPersistentData().getString("SpacecraftName")));
				FaroutModVariables.WorldVariables.get(world).SpacecraftDeparturePlanet.remove((entity.getPersistentData().getString("SpacecraftName")));
				FaroutMod.LOGGER.info(((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).TransitDestination);
				{
					Entity _ent = (entity.getFirstPassenger());
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("execute in farout:" + ((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).TransitDestination + " run tp ~ 1000 ~"));
					}
				}
			}
		}
	}
}
