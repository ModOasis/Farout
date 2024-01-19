package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Time;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModMobEffects;

import java.util.Random;
import java.util.Comparator;

public class AirPurifierGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Random = 0;
		double Time = 0;
		double Radius = 0;
		if (0 <= FaroutModVariables.WorldVariables.get(world).Energy) {
			Radius = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "Radius");
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), Radius, Radius, Radius), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), Radius, Radius, Radius), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 60, 2, false, false));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SNOWFLAKE, x, y, z, (int) (Radius * 10), Radius, Radius, Radius, 1);
				FaroutModVariables.WorldVariables.get(world).Energy = FaroutModVariables.WorldVariables.get(world).Energy - Math.pow(Radius, 2);
				FaroutModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
