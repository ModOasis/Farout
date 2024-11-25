
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
				tabData.accept(FaroutModBlocks.HYDROGEN_FUEL_CELL.get().asItem());
				tabData.accept(FaroutModBlocks.STIRLING_ENGINE.get().asItem());
				tabData.accept(FaroutModItems.AMMETER.get());
				tabData.accept(FaroutModItems.IRON_WHEEL.get());
				tabData.accept(FaroutModItems.SOLID_ANTIMATTER_PENNING_TRAP.get());
				tabData.accept(FaroutModItems.PENNING_TRAP.get());
				tabData.accept(FaroutModBlocks.SOLAR_PANELS.get().asItem());
				tabData.accept(FaroutModBlocks.GRAPHITE_ROD_ASSEMBLY.get().asItem());
				tabData.accept(FaroutModItems.BASIC_SOLAR_CELL.get());
				tabData.accept(FaroutModBlocks.METHANE_POLYMERIZER.get().asItem());
				tabData.accept(FaroutModItems.NUCLEAR_PISTON.get());
				tabData.accept(FaroutModBlocks.NUCLEAR_REACTOR.get().asItem());
				tabData.accept(FaroutModItems.IRON_PENTACARBONYL_BUCKET.get());
				tabData.accept(FaroutModBlocks.ACTIVATED_LAMP.get().asItem());
				tabData.accept(FaroutModBlocks.HEAT_PIPE.get().asItem());
				tabData.accept(FaroutModBlocks.PLUTONIUM_FUEL_ROD_BUNDLE.get().asItem());
				tabData.accept(FaroutModBlocks.HEAT_PIPE_BENT.get().asItem());
				tabData.accept(FaroutModBlocks.LIGHT_WATER_MODERATION_TANKS.get().asItem());
				tabData.accept(FaroutModBlocks.STEAM_GENERATOR.get().asItem());
				tabData.accept(FaroutModBlocks.COPPER_CABLE.get().asItem());
				tabData.accept(FaroutModBlocks.RADIOISOTOPE_THERMOELECTRIC_GENERATOR.get().asItem());
				tabData.accept(FaroutModBlocks.CRUDE_SEEBECK_GENERATOR.get().asItem());
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
	public static final RegistryObject<CreativeModeTab> CHEMISTRY = REGISTRY.register("chemistry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.chemistry")).icon(() -> new ItemStack(FaroutModItems.METHANE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.SODIUM_HYDROXIDE.get());
				tabData.accept(FaroutModItems.HYDROGEN.get());
				tabData.accept(FaroutModItems.OXYGEN_BOTTLE.get());
				tabData.accept(FaroutModItems.CARBON_DIOXIDE.get());
				tabData.accept(FaroutModBlocks.ATMOSPHERIC_LIQUIDFIER.get().asItem());
				tabData.accept(FaroutModItems.IMPURE_CRYOGENIC_FLUIDS.get());
				tabData.accept(FaroutModItems.NITROGEN.get());
				tabData.accept(FaroutModItems.CHLORINE.get());
				tabData.accept(FaroutModItems.AMMONIA.get());
				tabData.accept(FaroutModItems.SULFUR_DIOXIDE.get());
				tabData.accept(FaroutModBlocks.CHEMISTRY_WORKBENCH.get().asItem());
				tabData.accept(FaroutModItems.STEAM.get());
				tabData.accept(FaroutModItems.SODIUM_ALUMINATE.get());
				tabData.accept(FaroutModItems.ALUMINIUM_HYDROXIDE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ELECTRONICS = REGISTRY.register("electronics",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.electronics")).icon(() -> new ItemStack(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.LOW_FREQUENCY_INTEGRATED_CIRCUIT.get());
				tabData.accept(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get());
				tabData.accept(FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR.get().asItem());
				tabData.accept(FaroutModItems.UNETCHED_SILICON_WAFER.get());
				tabData.accept(FaroutModItems.MEDIUM_CAPACITY_MEMORY.get());
				tabData.accept(FaroutModItems.LOW_CAPACITY_MEMORY.get());
				tabData.accept(FaroutModItems.INERTIAL_NAVIGATION_SYSTEM.get());
				tabData.accept(FaroutModItems.LASER.get());
				tabData.accept(FaroutModItems.PHOTOVOLTAIC_WAFER.get());
				tabData.accept(FaroutModItems.RELAY.get());
				tabData.accept(FaroutModItems.CAPACITOR.get());
				tabData.accept(FaroutModItems.CATHODE_RAY_TUBE_MONITOR.get());
				tabData.accept(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT_PHOTOMASK.get());
				tabData.accept(FaroutModItems.MEDIUM_CAPACITY_MEMORY_PHOTOMASK.get());
				tabData.accept(FaroutModItems.PHOTOVOLTAIC_WAFER_PHOTOMASK.get());
				tabData.accept(FaroutModItems.INERTIAL_NAV_UNIT_PHOTOMASK.get());
				tabData.accept(FaroutModItems.BLACK_HOLE_COMPUTER.get());
				tabData.accept(FaroutModBlocks.ROM_PROGRAMMER.get().asItem());
				tabData.accept(FaroutModItems.CALCULATOR.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ECONOMIC = REGISTRY.register("economic",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.economic")).icon(() -> new ItemStack(FaroutModItems.TRIHASSIAN_CURRENCY.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.TRIHASSIAN_CURRENCY.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ROCKETRY = REGISTRY.register("rocketry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.farout.rocketry")).icon(() -> new ItemStack(FaroutModItems.ROCKETRY_ICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FaroutModItems.SMALL_ATMOSPHERIC_LANDER.get());
				tabData.accept(FaroutModItems.GALACTIC_CORE_TRACKER.get());
				tabData.accept(FaroutModBlocks.DESIGNING_WORKBENCH.get().asItem());
				tabData.accept(FaroutModItems.SPACESHIP_BLUEPRINT.get());
				tabData.accept(FaroutModBlocks.LAUNCHPAD_TILES.get().asItem());
				tabData.accept(FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER.get().asItem());
				tabData.accept(FaroutModBlocks.ROCKET_ASSEMBLER.get().asItem());
				tabData.accept(FaroutModItems.SANDOS_STARMAP.get());
				tabData.accept(FaroutModItems.ANTIMATTER_COLLECTOR_BLUEPRINT.get());
				tabData.accept(FaroutModItems.AVIONICS_GUIDANCE_SYSTEM.get());
				tabData.accept(FaroutModItems.TELESCOPE_BLUEPRINT.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(FaroutModBlocks.DESKTOP_COMPUTER.get().asItem());
			tabData.accept(FaroutModBlocks.GRAPHITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.BIO_PLASTIC_WINDOW.get().asItem());
			tabData.accept(FaroutModBlocks.BAUXITE.get().asItem());
			tabData.accept(FaroutModBlocks.CHEMOSYNTHETIC_NODULES.get().asItem());
			tabData.accept(FaroutModBlocks.CRYSTALINE_EXOSKELETON.get().asItem());
			tabData.accept(FaroutModBlocks.ASPHALT.get().asItem());
			tabData.accept(FaroutModItems.LIQUID_AMMONIA_BUCKET.get());
			tabData.accept(FaroutModBlocks.AIRTIGHT_HABITAT_WALL.get().asItem());
			tabData.accept(FaroutModBlocks.COFFINITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.SPODUMENE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_WOOD.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_LOG.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_PLANKS.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.QUARTZ_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.RUST.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_WOOD.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_BUTTON.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_PLANKS.get().asItem());
			tabData.accept(FaroutModItems.LIQUID_METHANE_BUCKET.get());
			tabData.accept(FaroutModBlocks.KEMPAT_WOOD.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_LOG.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_PLANKS.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_BUTTON.get().asItem());
			tabData.accept(FaroutModBlocks.SUBSPACE_CATALYST.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_WOOD.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_LOG.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_PLANKS.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_BUTTON.get().asItem());
			tabData.accept(FaroutModBlocks.LONSDALEITE_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_WOOD.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_LOG.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_PLANKS.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_BUTTON.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_WOOD.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_LOG.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_PLANKS.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_STAIRS.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_SLAB.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_BUTTON.get().asItem());
			tabData.accept(FaroutModBlocks.CONSTRATIUM_BLOCK.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_DOOR.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(FaroutModBlocks.ELECTROLYZER.get().asItem());
			tabData.accept(FaroutModItems.THE_FAROUT_GUIDE.get());
			tabData.accept(FaroutModBlocks.MATTER_ANTIMATTER_COMPRESSOR.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_FENCE_GATE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_PRESSURE_PLATE.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_BUTTON.get().asItem());
			tabData.accept(FaroutModBlocks.UNACTIVATED_LAMP.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FaroutModItems.SPACE_SUIT_HELMET.get());
			tabData.accept(FaroutModItems.SPACE_SUIT_CHESTPLATE.get());
			tabData.accept(FaroutModItems.SPACE_SUIT_LEGGINGS.get());
			tabData.accept(FaroutModItems.HEXURAN_SWORD.get());
			tabData.accept(FaroutModItems.TRANSCONIUM_SWORD.get());
			tabData.accept(FaroutModItems.IRON_REINFORCED_SPACE_SUIT_HELMET.get());
			tabData.accept(FaroutModItems.IRON_REINFORCED_SPACE_SUIT_CHESTPLATE.get());
			tabData.accept(FaroutModItems.IRON_REINFORCED_SPACE_SUIT_LEGGINGS.get());
			tabData.accept(FaroutModItems.DIAMOND_REINFOCED_SPACE_SUIT_HELMET.get());
			tabData.accept(FaroutModItems.DIAMOND_REINFOCED_SPACE_SUIT_CHESTPLATE.get());
			tabData.accept(FaroutModItems.DIAMOND_REINFOCED_SPACE_SUIT_LEGGINGS.get());
			tabData.accept(FaroutModItems.LONSDALEITE_SWORD.get());
			tabData.accept(FaroutModItems.LONSDALEITE_ARMOR_HELMET.get());
			tabData.accept(FaroutModItems.LONSDALEITE_ARMOR_CHESTPLATE.get());
			tabData.accept(FaroutModItems.LONSDALEITE_ARMOR_LEGGINGS.get());
			tabData.accept(FaroutModItems.LONSDALEITE_ARMOR_BOOTS.get());
			tabData.accept(FaroutModItems.RAILGUN.get());
			tabData.accept(FaroutModItems.BULLET_ITEM.get());
			tabData.accept(FaroutModItems.AUTOMATIC_RIFLE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FaroutModItems.ASTRAL_DRAGON_SPAWN_EGG.get());
			tabData.accept(FaroutModItems.KARVON_WARPSHIP_SPAWN_EGG.get());
			tabData.accept(FaroutModItems.SENTINEL_SPAWN_EGG.get());
			tabData.accept(FaroutModItems.TRIHASSIAN_SPAWN_EGG.get());
			tabData.accept(FaroutModItems.TRIHASSIAN_SOLDER_SPAWN_EGG.get());
			tabData.accept(FaroutModItems.HAPOLITE_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(FaroutModItems.DEPLETED_URANIUM.get());
			tabData.accept(FaroutModItems.BORON_INGOT.get());
			tabData.accept(FaroutModItems.HELIUM_3.get());
			tabData.accept(FaroutModItems.HELIUM.get());
			tabData.accept(FaroutModItems.IRONPLATE.get());
			tabData.accept(FaroutModItems.HEXURANINGOT.get());
			tabData.accept(FaroutModItems.SULFUR_DUST.get());
			tabData.accept(FaroutModItems.POTASSIUM_NITRATE_DUST.get());
			tabData.accept(FaroutModItems.MOTOR.get());
			tabData.accept(FaroutModItems.PIPE.get());
			tabData.accept(FaroutModItems.GRAPHITE_INGOT.get());
			tabData.accept(FaroutModItems.COPPER_WIRE.get());
			tabData.accept(FaroutModItems.ELECTRO_MAGNET.get());
			tabData.accept(FaroutModItems.SILICON_DUST.get());
			tabData.accept(FaroutModItems.GRAPHITEROD.get());
			tabData.accept(FaroutModItems.BORATED_STEEL_INGOT.get());
			tabData.accept(FaroutModItems.ALUMINIUM_INGOT.get());
			tabData.accept(FaroutModItems.SULFURIC_ACID_BUCKET.get());
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
			tabData.accept(FaroutModItems.METHANE.get());
			tabData.accept(FaroutModItems.POLYETHYLENE.get());
			tabData.accept(FaroutModItems.BAUXITE_NUGGET.get());
			tabData.accept(FaroutModItems.BORAX.get());
			tabData.accept(FaroutModItems.BORIC_ACID.get());
			tabData.accept(FaroutModItems.SODIUM_INGOT.get());
			tabData.accept(FaroutModItems.PYRITE_NUGGET.get());
			tabData.accept(FaroutModItems.ZIRCON.get());
			tabData.accept(FaroutModItems.LONSDALEITE.get());
			tabData.accept(FaroutModItems.AIRTIGHT_FABRIC.get());
			tabData.accept(FaroutModItems.DEPLETED_PLUTONIUM.get());
			tabData.accept(FaroutModItems.CONSTRATIUM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FaroutModItems.SALTWATER_BUCKET.get());
			tabData.accept(FaroutModBlocks.CARDBOARDBOX.get().asItem());
			tabData.accept(FaroutModBlocks.CHACOA.get().asItem());
			tabData.accept(FaroutModBlocks.CHACOAVINES.get().asItem());
			tabData.accept(FaroutModBlocks.ALIEN_REEDS.get().asItem());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_FENCE.get().asItem());
			tabData.accept(FaroutModBlocks.SOLAR_VINES_CAP.get().asItem());
			tabData.accept(FaroutModBlocks.SOLAR_VINES.get().asItem());
			tabData.accept(FaroutModBlocks.RED_TORCHER.get().asItem());
			tabData.accept(FaroutModBlocks.YELLOW_TORCHER.get().asItem());
			tabData.accept(FaroutModBlocks.BLUE_TORCHER.get().asItem());
			tabData.accept(FaroutModItems.CHLORELLA_CULTURE_BUCKET.get());
			tabData.accept(FaroutModBlocks.ANCIENT_SEDIMENT.get().asItem());
			tabData.accept(FaroutModBlocks.SALT_BLOCK.get().asItem());
			tabData.accept(FaroutModItems.LIQUID_SULFUR_DIOXIDE_BUCKET.get());
			tabData.accept(FaroutModBlocks.LUMIBLOSSOM_LEAVES.get().asItem());
			tabData.accept(FaroutModBlocks.CRUSHED_QUARTZ.get().asItem());
			tabData.accept(FaroutModItems.AQUEOUS_AMMONIA_BUCKET.get());
			tabData.accept(FaroutModBlocks.BASALTIC_DIRT.get().asItem());
			tabData.accept(FaroutModBlocks.ETAUOSIAN_GRAINSTALK.get().asItem());
			tabData.accept(FaroutModItems.ETAUOSIAN_GRAIN_STALK_SEEDS.get());
			tabData.accept(FaroutModBlocks.IMMATURE_ETAUOSIAN_GRAINSTALK.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_TREE_TRUNK.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_LEAVES.get().asItem());
			tabData.accept(FaroutModBlocks.MUSNIUS_SAPLING.get().asItem());
			tabData.accept(FaroutModBlocks.STRALAKITE.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_LEAVES.get().asItem());
			tabData.accept(FaroutModBlocks.CHLORINATED_EARTH.get().asItem());
			tabData.accept(FaroutModBlocks.BORAX_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.PYRITE.get().asItem());
			tabData.accept(FaroutModBlocks.ZIRCON_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.PURPLEGRASS.get().asItem());
			tabData.accept(FaroutModBlocks.QUZAN_LEAVES.get().asItem());
			tabData.accept(FaroutModBlocks.LONSDALEITE_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.KEMPAT_SAPLING.get().asItem());
			tabData.accept(FaroutModBlocks.OXYFION_LEAVES.get().asItem());
			tabData.accept(FaroutModBlocks.URANISTONE.get().asItem());
			tabData.accept(FaroutModBlocks.KERANON_LEAVES.get().asItem());
			tabData.accept(FaroutModBlocks.RED_ALGAE.get().asItem());
			tabData.accept(FaroutModBlocks.CONSTRATIUM_ORE.get().asItem());
			tabData.accept(FaroutModBlocks.SUPERCOOLED_ICE.get().asItem());
			tabData.accept(FaroutModBlocks.AMMONICITE.get().asItem());
			tabData.accept(FaroutModItems.HYDROGEN_SULFIDE_BUCKET.get());
			tabData.accept(FaroutModBlocks.SULFUR_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(FaroutModItems.VODKA.get());
			tabData.accept(FaroutModItems.EMERGENCY_RATIONS.get());
			tabData.accept(FaroutModItems.ALGAE_BAR.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FaroutModItems.HEXURAN_PICKAXE.get());
			tabData.accept(FaroutModItems.HEXURAN_AXE.get());
			tabData.accept(FaroutModItems.HEXURAN_SHOVEL.get());
			tabData.accept(FaroutModItems.HEXURAN_HOE.get());
			tabData.accept(FaroutModItems.WRENCH.get());
			tabData.accept(FaroutModItems.RADIO_LOCATOR_FORWARD.get());
			tabData.accept(FaroutModItems.LONSDALEITE_PICKAXE.get());
			tabData.accept(FaroutModItems.LONSDALEITE_AXE.get());
			tabData.accept(FaroutModItems.LONSDALEITE_SHOVEL.get());
			tabData.accept(FaroutModItems.LONSDALEITE_HOE.get());
		}
	}
}
