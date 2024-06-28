
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
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.energy")).icon(() -> new ItemStack(FaroutModItems.REACTOR_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModBlocks.LARGE_SOLAR_PANELS.get().asItem());
				tabData.accept(FaroutModItems.SUPER_CAPACITORS.get());
				tabData.accept(FaroutModBlocks.ANCIENT_SEDIMENT.get().asItem());
				tabData.accept(FaroutModBlocks.SALT_BLOCK.get().asItem());
				tabData.accept(FaroutModBlocks.LUMIBLOSSOM_LEAVES.get().asItem());
				tabData.accept(FaroutModBlocks.RUST.get().asItem());
				tabData.accept(FaroutModItems.AQUEOUS_AMMONIA_BUCKET.get());
				tabData.accept(FaroutModItems.BERYLLIUM_INGOT.get());
				tabData.accept(FaroutModBlocks.HYDROGEN_FUEL_CELL.get().asItem());
				tabData.accept(FaroutModBlocks.BASALTIC_DIRT.get().asItem());
				tabData.accept(FaroutModBlocks.STIRLING_ENGINE.get().asItem());
				tabData.accept(FaroutModItems.AMMETER.get());
				tabData.accept(FaroutModItems.IRON_WHEEL.get());
				tabData.accept(FaroutModItems.SOLID_ANTIMATTER_PENNING_TRAP.get());
				tabData.accept(FaroutModItems.PENNING_TRAP.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROCKETRY = REGISTRY.register("rocketry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.rocketry")).icon(() -> new ItemStack(FaroutModItems.ROCKETRY_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.FISSION_FRAGMENT_ENGINE.get());
				tabData.accept(FaroutModItems.SMALL_ATMOSPHERIC_LANDER.get());
				tabData.accept(FaroutModItems.GALACTIC_CORE_TRACKER.get());
				tabData.accept(FaroutModItems.HIGH_HEAT_LOAD_GRAPHINE_RADIATORS.get());
				tabData.accept(FaroutModItems.INTERSTELLAR_HABITATION_MODULE.get());
				tabData.accept(FaroutModItems.FISSION_FRAGMENT_FUEL_TANK.get());
				tabData.accept(FaroutModItems.STARSHIP_CORE.get());
				tabData.accept(FaroutModItems.LANDER_BAY.get());
				tabData.accept(FaroutModItems.CARGO_CONTAINER.get());
				tabData.accept(FaroutModItems.SPACECRAFT_CONSTRUCTION_METERIALS.get());
				tabData.accept(FaroutModItems.OPEN_CARGO_FAIRING.get());
				tabData.accept(FaroutModItems.CRYOGENIC_STASIS_CHAMBER.get());
				tabData.accept(FaroutModBlocks.DESIGNING_WORKBENCH.get().asItem());
				tabData.accept(FaroutModItems.SPACESHIP_BLUEPRINT.get());
				tabData.accept(FaroutModBlocks.LAUNCHPAD_TILES.get().asItem());
				tabData.accept(FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get().asItem());
				tabData.accept(FaroutModBlocks.ROCKET_ASSEMBLER.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ELECTRONICS = REGISTRY.register("electronics",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.electronics")).icon(() -> new ItemStack(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.LOW_FREQUENCY_INTEGRATED_CIRCUIT.get());
				tabData.accept(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get());
				tabData.accept(FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR.get().asItem());
				tabData.accept(FaroutModItems.UNETCHED_SILICON_WAFER.get());
				tabData.accept(FaroutModItems.HIGH_CAPACITY_MEMORY.get());
				tabData.accept(FaroutModItems.MEDIUM_CAPACITY_MEMORY.get());
				tabData.accept(FaroutModItems.LOW_CAPACITY_MEMORY.get());
				tabData.accept(FaroutModItems.INERTIAL_NAVIGATION_SYSTEM.get());
				tabData.accept(FaroutModItems.LASER.get());
				tabData.accept(FaroutModItems.PHOTOVOLTAIC_WAFER.get());
				tabData.accept(FaroutModItems.RELAY.get());
				tabData.accept(FaroutModItems.CAPACITOR.get());
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
			tabData.accept(FaroutModBlocks.LITHIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.SUPER_ALLOY_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.BORON_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.RHENIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.OSMIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.SULFUR_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.POTASSIUM_NITRATE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.GUNPOWDER_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.DESKTOP_COMPUTER.get().asItem());
			tabData.accept(FaroutModBlocks.GRAPHITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.GRAPHITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.SILICON_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.BIO_PLASTIC_WINDOW.get().asItem());
			tabData.accept(FaroutModBlocks.ALUMINIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.BAUXITE.get().asItem());
			tabData.accept(FaroutModBlocks.CARBORUNDUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.SPHALERITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.BORACITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.CHEMOSYNTHETIC_NODULES.get().asItem());
			tabData.accept(FaroutModBlocks.CRYSTALINE_EXOSKELETON.get().asItem());
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
			tabData.accept(FaroutModBlocks.MUSNIUS_WOOD.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_BUTTON.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_PLANKS.get().asItem());
			tabData.accept(FaroutModItems.LIQUID_METHANE_BUCKET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_BUTTON.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(FaroutModItems.THE_FAROUT_GUIDE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FaroutModItems.SPACE_SUIT_HELMET.get());
			tabData.accept(FaroutModItems.SPACE_SUIT_CHESTPLATE.get());
			tabData.accept(FaroutModItems.SPACE_SUIT_LEGGINGS.get());
			tabData.accept(FaroutModItems.SUPER_ALLOY_SWORD.get());
			tabData.accept(FaroutModItems.HEXURAN_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FaroutModItems.DISPLAY.get());
			tabData.accept(FaroutModItems.LITHIUM_INGOT.get());
			tabData.accept(FaroutModItems.DEPLETED_URANIUM.get());
			tabData.accept(FaroutModItems.SUPER_ALLOY_INGOT.get());
			tabData.accept(FaroutModItems.BORON_INGOT.get());
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
			tabData.accept(FaroutModItems.FAN.get());
			tabData.accept(FaroutModItems.COPPER_WIRE.get());
			tabData.accept(FaroutModItems.ELECTRO_MAGNET.get());
			tabData.accept(FaroutModItems.SILICON_DUST.get());
			tabData.accept(FaroutModItems.AMMONIA.get());
			tabData.accept(FaroutModItems.AIRTIGHT_FABRIC.get());
			tabData.accept(FaroutModItems.ARGON.get());
			tabData.accept(FaroutModItems.BIO_PLASTIC.get());
			tabData.accept(FaroutModItems.INFLATABLE_MODULE.get());
			tabData.accept(FaroutModItems.BENZENE.get());
			tabData.accept(FaroutModItems.SODIUM.get());
			tabData.accept(FaroutModItems.BORATED_STEEL_INGOT.get());
			tabData.accept(FaroutModItems.MOONSHINE.get());
			tabData.accept(FaroutModItems.LITHIUM_DEUTERIDE.get());
			tabData.accept(FaroutModItems.LIGHT_ISOTOPES.get());
			tabData.accept(FaroutModItems.GRAPHENE.get());
			tabData.accept(FaroutModItems.ALUMINIUM_INGOT.get());
			tabData.accept(FaroutModItems.CARBORUNDUM_INGOT.get());
			tabData.accept(FaroutModItems.SPHALERITE.get());
			tabData.accept(FaroutModItems.BORACITE.get());
			tabData.accept(FaroutModItems.HYDROGEN.get());
			tabData.accept(FaroutModItems.SULFURIC_ACID_BUCKET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(FaroutModItems.GRAPHITE_INGOT.get());
			tabData.accept(FaroutModItems.GRAPHITEROD.get());
			tabData.accept(FaroutModItems.SODIUM_HYDROXIDE.get());
			tabData.accept(FaroutModItems.UNACTIVATED_GLOWSTONE_DUST.get());
			tabData.accept(FaroutModItems.GREEN_OIL_BUCKET.get());
			tabData.accept(FaroutModItems.COFFINITE.get());
			tabData.accept(FaroutModItems.SPODUMENE.get());
			tabData.accept(FaroutModItems.DRIED_CHLORELLA.get());
			tabData.accept(FaroutModItems.SALT_DUST.get());
			tabData.accept(FaroutModItems.URANIUM_CARBIDE.get());
			tabData.accept(FaroutModItems.PLUTONIUM_CARBIDE.get());
			tabData.accept(FaroutModItems.IRON_ROD.get());
			tabData.accept(FaroutModItems.XENON.get());
			tabData.accept(FaroutModItems.HAFNIUM_CARBONITRIDE_INGOT.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FaroutModItems.SALTWATER_BUCKET.get());
			tabData.accept(FaroutModBlocks.CARDBOARDBOX.get().asItem());
			tabData.accept(FaroutModBlocks.CHACOA.get().asItem());
			tabData.accept(FaroutModBlocks.CHACOAVINES.get().asItem());
			tabData.accept(FaroutModBlocks.ALIEN_REEDS.get().asItem());
			tabData.accept(FaroutModBlocks.BORACITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.SOLAR_VINES_CAP.get().asItem());
			tabData.accept(FaroutModBlocks.SOLAR_VINES.get().asItem());
			tabData.accept(FaroutModBlocks.RED_TORCHER.get().asItem());
			tabData.accept(FaroutModBlocks.YELLOW_TORCHER.get().asItem());
			tabData.accept(FaroutModBlocks.BLUE_TORCHER.get().asItem());
			tabData.accept(FaroutModItems.CHLORELLA_CULTURE_BUCKET.get());
			tabData.accept(FaroutModItems.LIQUID_SULFUR_DIOXIDE_BUCKET.get());
			tabData.accept(FaroutModBlocks.CRUSHED_QUARTZ.get().asItem());
			tabData.accept(FaroutModBlocks.ETAUOSIAN_GRAINSTALK.get().asItem());
			tabData.accept(FaroutModItems.ETAUOSIAN_GRAIN_STALK_SEEDS.get());
			tabData.accept(FaroutModBlocks.IMMATURE_ETAUOSIAN_GRAINSTALK.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_TREE_TRUNK.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_LEAVES.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_SAPLING.get().asItem());
			tabData.accept(FaroutModBlocks.STRALAKITE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
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
