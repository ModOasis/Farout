package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.far_out.entity.SentinelEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SentinelAttackingAnimationsProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingChangeTargetEvent event) {
		execute(event, event.getEntity().level(), event.getOriginalTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double partialX = 0;
		double partialY = 0;
		double partialZ = 0;
		double SubDevisions = 0;
		if (entity instanceof SentinelEntity) {
			if (entity instanceof SentinelEntity) {
				((SentinelEntity) entity).setAnimation("animation.model.FireGun");
			}
			X = entity.getX() - sourceentity.getX();
			Y = entity.getY() - sourceentity.getY();
			Z = entity.getZ() - sourceentity.getZ();
			SubDevisions = 50;
			partialX = X / SubDevisions;
			partialY = Y / SubDevisions;
			partialZ = Z / SubDevisions;
			for (int index0 = 0; index0 < (int) SubDevisions; index0++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_LAVA, partialX, partialY, partialZ, 5, 0, 0, 0, 0);
				partialX = partialX + partialX;
				partialY = partialY + partialY;
				partialZ = partialZ + partialZ;
			}
		}
	}
}
