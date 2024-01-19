
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.far_out.FaroutMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FaroutModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FaroutMod.MODID);
	public static final RegistryObject<CreativeModeTab> ENERGY = REGISTRY.register("energy",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.energy")).icon(() -> new ItemStack(FaroutModBlocks.NUCLEAR_REACTOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModBlocks.NUCLEAR_REACTOR.get().asItem());
				tabData.accept(FaroutModBlocks.LARGE_SOLAR_PANELS.get().asItem());
				tabData.accept(FaroutModItems.ENERGY_METER.get());
				tabData.accept(FaroutModBlocks.BATTERY_BLOCK.get().asItem());
				tabData.accept(FaroutModBlocks.BIOMASS_BURNER.get().asItem());
				tabData.accept(FaroutModBlocks.GEOTHERMAL_GENERATOR.get().asItem());
				tabData.accept(FaroutModItems.SUPER_CAPACITORS.get());
				tabData.accept(FaroutModBlocks.SUPERCONDUCTING_MAGNETIC_BATTERY.get().asItem());
				tabData.accept(FaroutModItems.NUCLEAR_RODS.get());
				tabData.accept(FaroutModBlocks.BIOLOGICAL_EXPERIMENT.get().asItem());
				tabData.accept(FaroutModBlocks.ANCIENT_SEDIMENT.get().asItem());
				tabData.accept(FaroutModBlocks.GREENSTONE.get().asItem());
				tabData.accept(FaroutModBlocks.SALT_BLOCK.get().asItem());
				tabData.accept(FaroutModBlocks.LUMIBLOSSOM_LEAVES.get().asItem());
				tabData.accept(FaroutModBlocks.RUST.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROCKETRY = REGISTRY.register("rocketry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.rocketry")).icon(() -> new ItemStack(FaroutModItems.UNEQUIPPED_ROCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.CHEMICAL_ROCKET_ENGINE.get());
				tabData.accept(FaroutModItems.OPEN_CORE_NUCLEAR_THERMAL_ROCKET.get());
				tabData.accept(FaroutModItems.SOLID_CORE_NUCLEAR_THERMAL_ROCKET.get());
				tabData.accept(FaroutModItems.METALLIC_HYDROGEN_ENGINE.get());
				tabData.accept(FaroutModItems.VASMIR_ION_ENGINE.get());
				tabData.accept(FaroutModItems.NUCLEAR_SALT_WATER_ROCKET.get());
				tabData.accept(FaroutModItems.NOZZLE.get());
				tabData.accept(FaroutModItems.INFLATABLE_HAB_RING.get());
				tabData.accept(FaroutModItems.INFLATABLE_SEGMENT.get());
				tabData.accept(FaroutModItems.INFLATABLE_HABITAT.get());
				tabData.accept(FaroutModItems.BASIC_HAB_MODULE.get());
				tabData.accept(FaroutModItems.UNEQUIPPED_ROCKET.get());
				tabData.accept(FaroutModItems.FAIRING_SEGMENTS.get());
				tabData.accept(FaroutModItems.CHEMICAL_FUEL_TANK.get());
				tabData.accept(FaroutModItems.LIQUID_HYDROGEN_FUEL_TANK.get());
				tabData.accept(FaroutModItems.LI_H_6_TANK.get());
				tabData.accept(FaroutModItems.ARGON_FUEL_TANK.get());
				tabData.accept(FaroutModItems.NUCLEAR_SALT_WATER_FUEL_TANK.get());
				tabData.accept(FaroutModItems.FUSION_FUEL_TANK.get());
				tabData.accept(FaroutModItems.OPEN_FAIRING.get());
				tabData.accept(FaroutModItems.EMPTY_FUEL_TANK.get());
				tabData.accept(FaroutModItems.MAGETO_INERTIAL_CONFINEMENT_FUSION_ENGINE.get());
				tabData.accept(FaroutModItems.BASIC_COMMAND_DISK.get());
				tabData.accept(FaroutModItems.ADVANCED_COMMAND_DISK.get());
				tabData.accept(FaroutModItems.FISSION_FRAGMENT_ENGINE.get());
				tabData.accept(FaroutModItems.SMALL_ATMOSPHERIC_LANDER.get());
				tabData.accept(FaroutModItems.GALACTIC_CORE_TRACKER.get());
				tabData.accept(FaroutModItems.HIGH_HEAT_LOAD_GRAPHINE_RADIATORS.get());
				tabData.accept(FaroutModItems.SOLAR_COLLECTOR.get());
				tabData.accept(FaroutModItems.INTERSTELLAR_HABITATION_MODULE.get());
				tabData.accept(FaroutModBlocks.AIRLOCK_DOOR.get().asItem());
				tabData.accept(FaroutModItems.FISSION_FRAGMENT_FUEL_TANK.get());
				tabData.accept(FaroutModItems.STARSHIP_CORE.get());
				tabData.accept(FaroutModItems.LANDER_BAY.get());
				tabData.accept(FaroutModItems.CARGO_CONTAINER.get());
				tabData.accept(FaroutModItems.SPACECRAFT_CONSTRUCTION_METERIALS.get());
				tabData.accept(FaroutModItems.OPEN_CARGO_FAIRING.get());
				tabData.accept(FaroutModItems.CRYOGENIC_STASIS_CHAMBER.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> UNNMANNED_ROCKETRY = REGISTRY.register("unnmanned_rocketry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.unnmanned_rocketry")).icon(() -> new ItemStack(FaroutModItems.UNMANNED_PAYLOAD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.UNMANNED_PAYLOAD.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ELECTRONICS = REGISTRY.register("electronics",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.electronics")).icon(() -> new ItemStack(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.LOW_FREQUENCY_INTEGRATED_CIRCUIT.get());
				tabData.accept(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get());
				tabData.accept(FaroutModItems.HIGH_FREQUENCY_INTEGRATED_CIRCUIT.get());
				tabData.accept(FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR.get().asItem());
				tabData.accept(FaroutModItems.UNETCHED_SILICON_WAFER.get());
				tabData.accept(FaroutModItems.HIGH_CAPACITY_MEMORY.get());
				tabData.accept(FaroutModItems.MEDIUM_CAPACITY_MEMORY.get());
				tabData.accept(FaroutModBlocks.LOW_FREQUENCY_INTEGRATED_CIRCUIT_FABRICATOR.get().asItem());
				tabData.accept(FaroutModItems.LOW_CAPACITY_MEMORY.get());
				tabData.accept(FaroutModItems.INERTIAL_NAVIGATION_SYSTEM.get());
				tabData.accept(FaroutModBlocks.HIGH_FREQUENCY_INTERGRATED_CIRCUT_FABRICATOR.get().asItem());
				tabData.accept(FaroutModItems.LASER.get());
				tabData.accept(FaroutModItems.UNETCHED_GRAPHENE_WAFER.get());
				tabData.accept(FaroutModItems.RADIO_RECEIVER.get());
				tabData.accept(FaroutModItems.PHOTOVOLTAIC_WAFER.get());
				tabData.accept(FaroutModItems.DATA_DISK_1.get());
				tabData.accept(FaroutModItems.LOW_FREQUENCY_INTEGRATED_CIRCUIT_PHOTOMASK.get());
				tabData.accept(FaroutModItems.LOW_CAPACITY_MEMORY_PHOTOMASK.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> CHEMISTRY = REGISTRY.register("chemistry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.chemistry")).icon(() -> new ItemStack(FaroutModItems.CHEMICALS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModBlocks.ELECTROLYZER.get().asItem());
				tabData.accept(FaroutModItems.ORGANIC_MOLECULES.get());
				tabData.accept(FaroutModItems.CHEMICALS.get());
				tabData.accept(FaroutModBlocks.CHEMICAL_REACTOR.get().asItem());
				tabData.accept(FaroutModItems.BACTERIAL_CULTURE.get());
				tabData.accept(FaroutModItems.MEAT_PROTEIN_GENE.get());
				tabData.accept(FaroutModItems.OXYGEN_BOTTLE.get());
				tabData.accept(FaroutModItems.LIQUID_CRYSTAL.get());
				tabData.accept(FaroutModBlocks.PLANETARY_CLIMATE_ANALYZER.get().asItem());
				tabData.accept(FaroutModItems.ATMOSPHERIC_ANALYZER.get());
				tabData.accept(FaroutModItems.DRY_WATER_BUCKET.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> NUCLEAR_FUSION = REGISTRY.register("nuclear_fusion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.nuclear_fusion")).icon(() -> new ItemStack(FaroutModBlocks.TOKAMAKFUSIONREACTOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.DEUTERIUM.get());
				tabData.accept(FaroutModItems.TRITIUM.get());
				tabData.accept(FaroutModBlocks.TOKAMAKFUSIONREACTOR.get().asItem());
				tabData.accept(FaroutModBlocks.Z_PINCH_FUSION_REACTOR.get().asItem());
				tabData.accept(FaroutModItems.FUSION_CHAMBER.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(FaroutModBlocks.FUNGUSTRUNK.get().asItem());
			tabData.accept(FaroutModBlocks.FUNGUS_CAP.get().asItem());
			tabData.accept(FaroutModBlocks.URANIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.LITHIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.FUNGUS_PLANKS.get().asItem());
			tabData.accept(FaroutModBlocks.FUNGUS_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.FUNGUS_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.FUNGUS_BUTTON.get().asItem());
			tabData.accept(FaroutModBlocks.SUPER_ALLOY_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.BORON_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.RHENIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.OSMIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.SULFUR_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.POTASSIUM_NITRATE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.GUNPOWDER_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.DESKTOP_COMPUTER.get().asItem());
			tabData.accept(FaroutModBlocks.LIMESTONE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.TRUSS.get().asItem());
			tabData.accept(FaroutModBlocks.GRAPHITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.GRAPHITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.SILICON_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.PLANETARY_LOGISTICS_MODULE.get().asItem());
			tabData.accept(FaroutModBlocks.CESIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.BIO_PLASTIC_WINDOW.get().asItem());
			tabData.accept(FaroutModBlocks.ZEOLITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.ZEOLITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.ALUMINIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.BAUXITE.get().asItem());
			tabData.accept(FaroutModBlocks.CARBORUNDUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.SPHALERITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.SPHALERITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.BORACITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.BORACITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.MOLYBDENITE.get().asItem());
			tabData.accept(FaroutModBlocks.MOLYBDENUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.CHEMOSYNTHETIC_NODULES.get().asItem());
			tabData.accept(FaroutModBlocks.CRYSTALINE_EXOSKELETON.get().asItem());
			tabData.accept(FaroutModBlocks.ERBIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.MONAZITE.get().asItem());
			tabData.accept(FaroutModBlocks.ASPHALT.get().asItem());
			tabData.accept(FaroutModItems.LIQUID_AMMONIA_BUCKET.get());
			tabData.accept(FaroutModBlocks.AIRTIGHT_HABITAT_WALL.get().asItem());
			tabData.accept(FaroutModBlocks.COFFINITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.COFFINITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.SPODUMENE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.SPODUMENE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_WOOD.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_LOG.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_PLANKS.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.QUARTZ_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(FaroutModBlocks.AIR_PURIFIER.get().asItem());
			tabData.accept(FaroutModItems.THE_FAROUT_GUIDE.get());
			tabData.accept(FaroutModBlocks.ORE_EXTRACTOR.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(FaroutModBlocks.FUNGUS_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.FUNGUS_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_BUTTON.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FaroutModItems.SPACE_SUIT_HELMET.get());
			tabData.accept(FaroutModItems.SPACE_SUIT_CHESTPLATE.get());
			tabData.accept(FaroutModItems.SPACE_SUIT_LEGGINGS.get());
			tabData.accept(FaroutModItems.SUPER_ALLOY_SWORD.get());
			tabData.accept(FaroutModItems.HEXURAN_SWORD.get());
			tabData.accept(FaroutModBlocks.NUCLEAR_BOMB.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FaroutModItems.DISPLAY.get());
			tabData.accept(FaroutModItems.EMBEDEDCOMPUTER.get());
			tabData.accept(FaroutModItems.URANIUM_INGOT.get());
			tabData.accept(FaroutModItems.LITHIUM_INGOT.get());
			tabData.accept(FaroutModItems.DEPLETED_URANIUM.get());
			tabData.accept(FaroutModItems.SUPER_ALLOY_INGOT.get());
			tabData.accept(FaroutModItems.BORON_INGOT.get());
			tabData.accept(FaroutModItems.RHENIUM_INGOT.get());
			tabData.accept(FaroutModItems.OSMIUM_INGOT.get());
			tabData.accept(FaroutModItems.HELIUM_3.get());
			tabData.accept(FaroutModItems.HELIUM.get());
			tabData.accept(FaroutModItems.IRONPLATE.get());
			tabData.accept(FaroutModItems.RADIATOR.get());
			tabData.accept(FaroutModItems.HEXURANINGOT.get());
			tabData.accept(FaroutModItems.SULFUR_DUST.get());
			tabData.accept(FaroutModItems.POTASSIUM_NITRATE_DUST.get());
			tabData.accept(FaroutModItems.ASH.get());
			tabData.accept(FaroutModItems.MOTOR.get());
			tabData.accept(FaroutModItems.PIPE.get());
			tabData.accept(FaroutModItems.GENERATOR.get());
			tabData.accept(FaroutModItems.FAN.get());
			tabData.accept(FaroutModItems.LIMESTONE_DUST.get());
			tabData.accept(FaroutModItems.GRAPHITE_INGOT.get());
			tabData.accept(FaroutModItems.COPPER_WIRE.get());
			tabData.accept(FaroutModItems.ELECTRO_MAGNET.get());
			tabData.accept(FaroutModItems.SILICON_DUST.get());
			tabData.accept(FaroutModItems.PROPANE.get());
			tabData.accept(FaroutModItems.AMMONIA.get());
			tabData.accept(FaroutModItems.AIRTIGHT_FABRIC.get());
			tabData.accept(FaroutModItems.CESIUM_DUST.get());
			tabData.accept(FaroutModItems.ARGON.get());
			tabData.accept(FaroutModItems.BIO_PLASTIC.get());
			tabData.accept(FaroutModItems.INFLATABLE_MODULE.get());
			tabData.accept(FaroutModItems.BENZENE.get());
			tabData.accept(FaroutModItems.SODIUM.get());
			tabData.accept(FaroutModItems.BORATED_STEEL_INGOT.get());
			tabData.accept(FaroutModItems.MOONSHINE.get());
			tabData.accept(FaroutModItems.LITHIUM_DEUTERIDE.get());
			tabData.accept(FaroutModItems.LITHIUM_HYDRIDE.get());
			tabData.accept(FaroutModItems.LIGHT_ISOTOPES.get());
			tabData.accept(FaroutModItems.URANIUM_DUST.get());
			tabData.accept(FaroutModItems.GRAPHENE.get());
			tabData.accept(FaroutModItems.ZEOLITE.get());
			tabData.accept(FaroutModItems.ALUMINIUM_INGOT.get());
			tabData.accept(FaroutModItems.CARBORUNDUM_INGOT.get());
			tabData.accept(FaroutModItems.SPHALERITE.get());
			tabData.accept(FaroutModItems.BORACITE.get());
			tabData.accept(FaroutModItems.MOLYBDENUM_INGOT.get());
			tabData.accept(FaroutModItems.RAW_MOLYBDENUM.get());
			tabData.accept(FaroutModItems.HYDROGEN.get());
			tabData.accept(FaroutModItems.SULFURIC_ACID_BUCKET.get());
			tabData.accept(FaroutModItems.ERBIUM.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(FaroutModItems.GRAPHITEROD.get());
			tabData.accept(FaroutModItems.SODIUM_HYDROXIDE.get());
			tabData.accept(FaroutModItems.UNACTIVATED_GLOWSTONE_DUST.get());
			tabData.accept(FaroutModItems.GREEN_OIL_BUCKET.get());
			tabData.accept(FaroutModItems.COFFINITE.get());
			tabData.accept(FaroutModItems.SPODUMENE.get());
			tabData.accept(FaroutModItems.DRIED_CHLORELLA.get());
			tabData.accept(FaroutModItems.SALT_DUST.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FaroutModItems.SALTWATER_BUCKET.get());
			tabData.accept(FaroutModBlocks.FUNGUS_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.CARDBOARDBOX.get().asItem());
			tabData.accept(FaroutModBlocks.CHACOA.get().asItem());
			tabData.accept(FaroutModBlocks.CHACOAVINES.get().asItem());
			tabData.accept(FaroutModBlocks.AILEN_MOSS.get().asItem());
			tabData.accept(FaroutModBlocks.ALIEN_REEDS.get().asItem());
			tabData.accept(FaroutModBlocks.SPORE_EMITTER.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.SOLAR_VINES_CAP.get().asItem());
			tabData.accept(FaroutModBlocks.SOLAR_VINES.get().asItem());
			tabData.accept(FaroutModBlocks.RED_TORCHER.get().asItem());
			tabData.accept(FaroutModBlocks.YELLOW_TORCHER.get().asItem());
			tabData.accept(FaroutModBlocks.BLUE_TORCHER.get().asItem());
			tabData.accept(FaroutModItems.CHLORELLA_CULTURE_BUCKET.get());
			tabData.accept(FaroutModBlocks.CRYSTALITE_SOIL.get().asItem());
			tabData.accept(FaroutModItems.LIQUID_SULFUR_DIOXIDE_BUCKET.get());
			tabData.accept(FaroutModBlocks.CRUSHED_QUARTZ.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(FaroutModBlocks.SPORE_BERRIE_BLOCK.get().asItem());
			tabData.accept(FaroutModItems.SPORE_BERRIES.get());
			tabData.accept(FaroutModItems.VODKA.get());
			tabData.accept(FaroutModItems.EMERGENCY_RATIONS.get());
			tabData.accept(FaroutModItems.SYNTHETIC_MEAT.get());
			tabData.accept(FaroutModItems.COOKED_SYNTHETIC_MEAT.get());
			tabData.accept(FaroutModItems.ALGAE_BAR.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FaroutModItems.SUPER_ALLOY_PICKAXE.get());
			tabData.accept(FaroutModItems.SUPER_ALLOY_AXE.get());
			tabData.accept(FaroutModItems.SUPER_ALLOY_SHOVEL.get());
			tabData.accept(FaroutModItems.SUPER_ALLOY_HOE.get());
			tabData.accept(FaroutModItems.HEXURAN_PICKAXE.get());
			tabData.accept(FaroutModItems.HEXURAN_AXE.get());
			tabData.accept(FaroutModItems.HEXURAN_SHOVEL.get());
			tabData.accept(FaroutModItems.HEXURAN_HOE.get());
			tabData.accept(FaroutModItems.WRENCH.get());
		}
	}
}
