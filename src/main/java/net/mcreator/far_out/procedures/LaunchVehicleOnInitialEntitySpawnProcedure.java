package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.far_out.init.FaroutModMobEffects;
import net.mcreator.far_out.FaroutMod;

public class LaunchVehicleOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 120, 2, false, false));
		if (entity.getPersistentData().getBoolean("Launching") || entity.getPersistentData().getBoolean("Unmanned")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 120, 10, false, false));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 5, 0, 0, 0, 0);
			FaroutMod.queueServerWork(1000, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
	}
}
