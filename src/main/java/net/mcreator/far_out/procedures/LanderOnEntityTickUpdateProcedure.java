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
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.LanderEntity;

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
		}
	}
}
