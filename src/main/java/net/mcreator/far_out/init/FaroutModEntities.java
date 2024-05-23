
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.entity.SpaceStationRocketEntity;
import net.mcreator.far_out.entity.RocketNoFairingEntity;
import net.mcreator.far_out.entity.LaunchVehicleEntity;
import net.mcreator.far_out.entity.LanderEntity;
import net.mcreator.far_out.entity.CapsuleEntity;
import net.mcreator.far_out.FaroutMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FaroutModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FaroutMod.MODID);
	public static final RegistryObject<EntityType<CapsuleEntity>> CAPSULE = register("capsule",
			EntityType.Builder.<CapsuleEntity>of(CapsuleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CapsuleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LaunchVehicleEntity>> LAUNCH_VEHICLE = register("launch_vehicle",
			EntityType.Builder.<LaunchVehicleEntity>of(LaunchVehicleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LaunchVehicleEntity::new)

					.sized(3.8f, 22f));
	public static final RegistryObject<EntityType<RocketNoFairingEntity>> ROCKET_NO_FAIRING = register("rocket_no_fairing", EntityType.Builder.<RocketNoFairingEntity>of(RocketNoFairingEntity::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RocketNoFairingEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpaceStationRocketEntity>> SPACE_STATION_ROCKET = register("space_station_rocket",
			EntityType.Builder.<SpaceStationRocketEntity>of(SpaceStationRocketEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpaceStationRocketEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LanderEntity>> LANDER = register("lander",
			EntityType.Builder.<LanderEntity>of(LanderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LanderEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CapsuleEntity.init();
			LaunchVehicleEntity.init();
			RocketNoFairingEntity.init();
			SpaceStationRocketEntity.init();
			LanderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CAPSULE.get(), CapsuleEntity.createAttributes().build());
		event.put(LAUNCH_VEHICLE.get(), LaunchVehicleEntity.createAttributes().build());
		event.put(ROCKET_NO_FAIRING.get(), RocketNoFairingEntity.createAttributes().build());
		event.put(SPACE_STATION_ROCKET.get(), SpaceStationRocketEntity.createAttributes().build());
		event.put(LANDER.get(), LanderEntity.createAttributes().build());
	}
}
