package net.mcreator.far_out.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModEntities;
import net.mcreator.far_out.entity.LaunchVehicleEntity;
import net.mcreator.far_out.FaroutMod;

import java.util.Comparator;

public class RocketNoFairingRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double LaunchPosX = 0;
		double LaunchPosY = 0;
		double LaunchPosZ = 0;
		Entity LaunchVehicle = null;
		LaunchPosX = entity.getX();
		LaunchPosY = entity.getY();
		LaunchPosZ = entity.getZ();
		if (FaroutModItems.FAIRING.get() == (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FaroutModEntities.LAUNCH_VEHICLE.get().spawn(_level, BlockPos.containing(LaunchPosX, LaunchPosY, LaunchPosZ), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
			if (!world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 1, 1, 1), e -> true).isEmpty()) {
				entity.getPersistentData().putBoolean("Unmanned", false);
				((Entity) world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(LaunchPosX, LaunchPosY, LaunchPosZ)).findFirst().orElse(null)).getPersistentData().putDouble("Delta-V", (itemstack.getOrCreateTag().getDouble("Delta-V")));
				((Entity) world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(LaunchPosX, LaunchPosY, LaunchPosZ)).findFirst().orElse(null)).getPersistentData().putDouble("Watts", (itemstack.getOrCreateTag().getDouble("Watts")));
				((Entity) world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(LaunchPosX, LaunchPosY, LaunchPosZ)).findFirst().orElse(null)).getPersistentData().putDouble("HabTime", (itemstack.getOrCreateTag().getDouble("HabTime")));
				((Entity) world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(LaunchPosX, LaunchPosY, LaunchPosZ)).findFirst().orElse(null)).getPersistentData().putDouble("Mass", (itemstack.getOrCreateTag().getDouble("Mass")));
				((Entity) world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(LaunchPosX, LaunchPosY, LaunchPosZ)).findFirst().orElse(null)).getPersistentData().putBoolean("InterplanetryCapable", (itemstack.getOrCreateTag().getBoolean("InterplanetryCapable")));
				((Entity) world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(LaunchPosX, LaunchPosY, LaunchPosZ)).findFirst().orElse(null)).getPersistentData().putString("VesselName", (itemstack.getOrCreateTag().getString("VesselName")));
				FaroutModVariables.MapVariables.get(world).SpacecraftStatus = FaroutModVariables.MapVariables.get(world).SpacecraftStatus + "" + (itemstack.getOrCreateTag().getString("VesselName") + ", Situation: Ready to launch" + ";");
				FaroutModVariables.MapVariables.get(world).syncData(world);
			}
			(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).setCount(0);
		} else if (FaroutModItems.CARGO_FAIRING.get() == (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FaroutModEntities.LAUNCH_VEHICLE.get().spawn(_level, BlockPos.containing(LaunchPosX, LaunchPosY, LaunchPosZ), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
			if (!world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 1, 1, 1), e -> true).isEmpty()) {
				((Entity) world.getEntitiesOfClass(LaunchVehicleEntity.class, AABB.ofSize(new Vec3(LaunchPosX, LaunchPosY, LaunchPosZ), 2, 2, 2), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(LaunchPosX, LaunchPosY, LaunchPosZ)).findFirst().orElse(null)).getPersistentData().putBoolean("Unmanned", true);
				if (ForgeRegistries.ITEMS.getValue(new ResourceLocation(
						(((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Payload"))).toLowerCase(java.util.Locale.ENGLISH))) == FaroutModItems.STARSHIP_CORE.get()) {
					FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.replace("1", "0");
					FaroutModVariables.WorldVariables.get(world).syncData(world);
				} else if (ForgeRegistries.ITEMS.getValue(new ResourceLocation(
						(((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Payload"))).toLowerCase(java.util.Locale.ENGLISH))) == FaroutModItems.SPACECRAFT_CONSTRUCTION_METERIALS
								.get()) {
					FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.replace("2", "0");
					FaroutModVariables.WorldVariables.get(world).syncData(world);
				} else if (ForgeRegistries.ITEMS.getValue(
						new ResourceLocation((((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Payload"))).toLowerCase(java.util.Locale.ENGLISH))) == FaroutModItems.LANDER_BAY
								.get()) {
					FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.replace("3", "0");
					FaroutModVariables.WorldVariables.get(world).syncData(world);
				} else if (ForgeRegistries.ITEMS.getValue(new ResourceLocation(
						(((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Payload"))).toLowerCase(java.util.Locale.ENGLISH))) == FaroutModItems.HIGH_HEAT_LOAD_GRAPHINE_RADIATORS
								.get()) {
					FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.replace("4", "0");
					FaroutModVariables.WorldVariables.get(world).syncData(world);
				} else if (ForgeRegistries.ITEMS.getValue(new ResourceLocation(
						(((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Payload"))).toLowerCase(java.util.Locale.ENGLISH))) == FaroutModItems.CARGO_CONTAINER.get()) {
					FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.replace("5", "0");
					FaroutModVariables.WorldVariables.get(world).syncData(world);
				} else if (ForgeRegistries.ITEMS.getValue(new ResourceLocation(
						(((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Payload"))).toLowerCase(java.util.Locale.ENGLISH))) == FaroutModItems.INTERSTELLAR_HABITATION_MODULE
								.get()) {
					FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.replace("6", "0");
					FaroutModVariables.WorldVariables.get(world).syncData(world);
				} else if (ForgeRegistries.ITEMS.getValue(new ResourceLocation(
						(((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Payload"))).toLowerCase(java.util.Locale.ENGLISH))) == FaroutModItems.FISSION_FRAGMENT_FUEL_TANK
								.get()) {
					FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.replace("7", "0");
					FaroutModVariables.WorldVariables.get(world).syncData(world);
				} else if (ForgeRegistries.ITEMS.getValue(new ResourceLocation(
						(((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Payload"))).toLowerCase(java.util.Locale.ENGLISH))) == FaroutModItems.FISSION_FRAGMENT_ENGINE.get()) {
					FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress.replace("8", "0");
					FaroutModVariables.WorldVariables.get(world).syncData(world);
				}
				FaroutMod.LOGGER.debug(FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress);
			}
		}
	}
}
