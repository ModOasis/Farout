
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

import net.mcreator.far_out.entity.TrihassianSolderEntity;
import net.mcreator.far_out.entity.TrihassianEntity;
import net.mcreator.far_out.entity.SentinelEntity;
import net.mcreator.far_out.entity.RailgunRodEntity;
import net.mcreator.far_out.entity.LaunchVehicleEntity;
import net.mcreator.far_out.entity.LanderEntity;
import net.mcreator.far_out.entity.KarvonWarpshipEntity;
import net.mcreator.far_out.entity.HapoliteEntity;
import net.mcreator.far_out.entity.CargoSSTOEntity;
import net.mcreator.far_out.entity.BulletEntity;
import net.mcreator.far_out.entity.AtomicBombEntity;
import net.mcreator.far_out.entity.AstralDragonEntity;
import net.mcreator.far_out.entity.AncientDroneEntity;
import net.mcreator.far_out.entity.AetherianConquerorEntity;
import net.mcreator.far_out.FaroutMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FaroutModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FaroutMod.MODID);
	public static final RegistryObject<EntityType<LaunchVehicleEntity>> LAUNCH_VEHICLE = register("launch_vehicle",
			EntityType.Builder.<LaunchVehicleEntity>of(LaunchVehicleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LaunchVehicleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LanderEntity>> LANDER = register("lander",
			EntityType.Builder.<LanderEntity>of(LanderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LanderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CargoSSTOEntity>> CARGO_SSTO = register("cargo_ssto",
			EntityType.Builder.<CargoSSTOEntity>of(CargoSSTOEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CargoSSTOEntity::new)

					.sized(2f, 8.125f));
	public static final RegistryObject<EntityType<AetherianConquerorEntity>> AETHERIAN_CONQUEROR = register("aetherian_conqueror",
			EntityType.Builder.<AetherianConquerorEntity>of(AetherianConquerorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AetherianConquerorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RailgunRodEntity>> RAILGUN_ROD = register("railgun_rod",
			EntityType.Builder.<RailgunRodEntity>of(RailgunRodEntity::new, MobCategory.MISC).setCustomClientFactory(RailgunRodEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AstralDragonEntity>> ASTRAL_DRAGON = register("astral_dragon",
			EntityType.Builder.<AstralDragonEntity>of(AstralDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AstralDragonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KarvonWarpshipEntity>> KARVON_WARPSHIP = register("karvon_warpship",
			EntityType.Builder.<KarvonWarpshipEntity>of(KarvonWarpshipEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KarvonWarpshipEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AncientDroneEntity>> ANCIENT_DRONE = register("ancient_drone",
			EntityType.Builder.<AncientDroneEntity>of(AncientDroneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AncientDroneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SentinelEntity>> SENTINEL = register("sentinel",
			EntityType.Builder.<SentinelEntity>of(SentinelEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SentinelEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TrihassianEntity>> TRIHASSIAN = register("trihassian",
			EntityType.Builder.<TrihassianEntity>of(TrihassianEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrihassianEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BulletEntity>> BULLET = register("bullet",
			EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC).setCustomClientFactory(BulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TrihassianSolderEntity>> TRIHASSIAN_SOLDER = register("trihassian_solder",
			EntityType.Builder.<TrihassianSolderEntity>of(TrihassianSolderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrihassianSolderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AtomicBombEntity>> ATOMIC_BOMB = register("atomic_bomb",
			EntityType.Builder.<AtomicBombEntity>of(AtomicBombEntity::new, MobCategory.MISC).setCustomClientFactory(AtomicBombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HapoliteEntity>> HAPOLITE = register("hapolite",
			EntityType.Builder.<HapoliteEntity>of(HapoliteEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HapoliteEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LaunchVehicleEntity.init();
			LanderEntity.init();
			CargoSSTOEntity.init();
			AetherianConquerorEntity.init();
			AstralDragonEntity.init();
			KarvonWarpshipEntity.init();
			AncientDroneEntity.init();
			SentinelEntity.init();
			TrihassianEntity.init();
			TrihassianSolderEntity.init();
			HapoliteEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LAUNCH_VEHICLE.get(), LaunchVehicleEntity.createAttributes().build());
		event.put(LANDER.get(), LanderEntity.createAttributes().build());
		event.put(CARGO_SSTO.get(), CargoSSTOEntity.createAttributes().build());
		event.put(AETHERIAN_CONQUEROR.get(), AetherianConquerorEntity.createAttributes().build());
		event.put(ASTRAL_DRAGON.get(), AstralDragonEntity.createAttributes().build());
		event.put(KARVON_WARPSHIP.get(), KarvonWarpshipEntity.createAttributes().build());
		event.put(ANCIENT_DRONE.get(), AncientDroneEntity.createAttributes().build());
		event.put(SENTINEL.get(), SentinelEntity.createAttributes().build());
		event.put(TRIHASSIAN.get(), TrihassianEntity.createAttributes().build());
		event.put(TRIHASSIAN_SOLDER.get(), TrihassianSolderEntity.createAttributes().build());
		event.put(HAPOLITE.get(), HapoliteEntity.createAttributes().build());
	}
}
