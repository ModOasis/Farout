
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.far_out.block.ZPinchFusionReactorBlock;
import net.mcreator.far_out.block.YellowTorcherBlock;
import net.mcreator.far_out.block.TokamakfusionreactorBlock;
import net.mcreator.far_out.block.Super_AlloyBlockBlock;
import net.mcreator.far_out.block.SulfuricAcidBlock;
import net.mcreator.far_out.block.SulfurBlockBlock;
import net.mcreator.far_out.block.StralakiteBlock;
import net.mcreator.far_out.block.StirlingEngineBlock;
import net.mcreator.far_out.block.SpodumeneOreBlock;
import net.mcreator.far_out.block.SpodumeneBlockBlock;
import net.mcreator.far_out.block.SphaleriteBlockBlock;
import net.mcreator.far_out.block.SolarVinesCapBlock;
import net.mcreator.far_out.block.SolarVinesBlock;
import net.mcreator.far_out.block.SiliconBlockBlock;
import net.mcreator.far_out.block.SaltwaterBlock;
import net.mcreator.far_out.block.SaltBlockBlock;
import net.mcreator.far_out.block.RustBlock;
import net.mcreator.far_out.block.RocketAssemblyManagerBlock;
import net.mcreator.far_out.block.RocketAssemblerBlock;
import net.mcreator.far_out.block.RheniumBlockBlock;
import net.mcreator.far_out.block.RedTorcherBlock;
import net.mcreator.far_out.block.QuartzOreBlock;
import net.mcreator.far_out.block.Potassium_nitrateBlockBlock;
import net.mcreator.far_out.block.OsmiumBlockBlock;
import net.mcreator.far_out.block.MusniusWoodBlock;
import net.mcreator.far_out.block.MusniusTreeTrunkBlock;
import net.mcreator.far_out.block.MusniusStairsBlock;
import net.mcreator.far_out.block.MusniusSlabBlock;
import net.mcreator.far_out.block.MusniusSaplingBlock;
import net.mcreator.far_out.block.MusniusPressurePlateBlock;
import net.mcreator.far_out.block.MusniusPlanksBlock;
import net.mcreator.far_out.block.MusniusLeavesBlock;
import net.mcreator.far_out.block.MusniusFenceGateBlock;
import net.mcreator.far_out.block.MusniusFenceBlock;
import net.mcreator.far_out.block.MusniusButtonBlock;
import net.mcreator.far_out.block.LumiblossomWoodBlock;
import net.mcreator.far_out.block.LumiblossomStairsBlock;
import net.mcreator.far_out.block.LumiblossomSlabBlock;
import net.mcreator.far_out.block.LumiblossomPressurePlateBlock;
import net.mcreator.far_out.block.LumiblossomPlanksBlock;
import net.mcreator.far_out.block.LumiblossomLogBlock;
import net.mcreator.far_out.block.LumiblossomLeavesBlock;
import net.mcreator.far_out.block.LumiblossomFenceGateBlock;
import net.mcreator.far_out.block.LumiblossomFenceBlock;
import net.mcreator.far_out.block.LumiblossomButtonBlock;
import net.mcreator.far_out.block.LithiumBlockBlock;
import net.mcreator.far_out.block.LiquidSulfurDioxideBlock;
import net.mcreator.far_out.block.LiquidMethaneBlock;
import net.mcreator.far_out.block.LiquidAmmoniaBlock;
import net.mcreator.far_out.block.LaunchpadTilesBlock;
import net.mcreator.far_out.block.LargeSolarPanelsBlock;
import net.mcreator.far_out.block.IntegratedCircuitFabricatorBlock;
import net.mcreator.far_out.block.ImmatureEtauosianGrainstalkBlock;
import net.mcreator.far_out.block.HydrogenFuelCellBlock;
import net.mcreator.far_out.block.GunpowderBlockBlock;
import net.mcreator.far_out.block.GreenOilBlock;
import net.mcreator.far_out.block.GraphiteOreBlock;
import net.mcreator.far_out.block.GraphiteBlockBlock;
import net.mcreator.far_out.block.EtauosianGrainstalkBlock;
import net.mcreator.far_out.block.ElectrolyzerBlock;
import net.mcreator.far_out.block.DryWaterBlock;
import net.mcreator.far_out.block.DesktopComputerBlock;
import net.mcreator.far_out.block.DesigningWorkbenchBlock;
import net.mcreator.far_out.block.CrystalineExoskeletonBlock;
import net.mcreator.far_out.block.CrushedQuartzBlock;
import net.mcreator.far_out.block.CoffiniteOreBlock;
import net.mcreator.far_out.block.CoffiniteBlockBlock;
import net.mcreator.far_out.block.ChlorellaCultureBlock;
import net.mcreator.far_out.block.ChemosyntheticNodulesBlock;
import net.mcreator.far_out.block.ChemicalReactorBlock;
import net.mcreator.far_out.block.ChacoavinesBlock;
import net.mcreator.far_out.block.ChacoaBlock;
import net.mcreator.far_out.block.CargoPodBlock;
import net.mcreator.far_out.block.CardboardboxBlock;
import net.mcreator.far_out.block.CarborundumBlockBlock;
import net.mcreator.far_out.block.BoronBlockBlock;
import net.mcreator.far_out.block.BoraciteOreBlock;
import net.mcreator.far_out.block.BoraciteBlockBlock;
import net.mcreator.far_out.block.BlueTorcherBlock;
import net.mcreator.far_out.block.BioPlasticWindowBlock;
import net.mcreator.far_out.block.BauxiteBlock;
import net.mcreator.far_out.block.BasalticDirtBlock;
import net.mcreator.far_out.block.AsphaltBlock;
import net.mcreator.far_out.block.AqueousAmmoniaBlock;
import net.mcreator.far_out.block.AncientSedimentBlock;
import net.mcreator.far_out.block.AluminiumBlockBlock;
import net.mcreator.far_out.block.AlienReedsBlock;
import net.mcreator.far_out.block.AirtightHabitatWallBlock;
import net.mcreator.far_out.FaroutMod;

public class FaroutModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FaroutMod.MODID);
	public static final RegistryObject<Block> LITHIUM_BLOCK = REGISTRY.register("lithium_block", () -> new LithiumBlockBlock());
	public static final RegistryObject<Block> SUPER_ALLOY_BLOCK = REGISTRY.register("super_alloy_block", () -> new Super_AlloyBlockBlock());
	public static final RegistryObject<Block> BORON_BLOCK = REGISTRY.register("boron_block", () -> new BoronBlockBlock());
	public static final RegistryObject<Block> RHENIUM_BLOCK = REGISTRY.register("rhenium_block", () -> new RheniumBlockBlock());
	public static final RegistryObject<Block> OSMIUM_BLOCK = REGISTRY.register("osmium_block", () -> new OsmiumBlockBlock());
	public static final RegistryObject<Block> SULFUR_BLOCK = REGISTRY.register("sulfur_block", () -> new SulfurBlockBlock());
	public static final RegistryObject<Block> POTASSIUM_NITRATE_BLOCK = REGISTRY.register("potassium_nitrate_block", () -> new Potassium_nitrateBlockBlock());
	public static final RegistryObject<Block> GUNPOWDER_BLOCK = REGISTRY.register("gunpowder_block", () -> new GunpowderBlockBlock());
	public static final RegistryObject<Block> DESKTOP_COMPUTER = REGISTRY.register("desktop_computer", () -> new DesktopComputerBlock());
	public static final RegistryObject<Block> ELECTROLYZER = REGISTRY.register("electrolyzer", () -> new ElectrolyzerBlock());
	public static final RegistryObject<Block> SALTWATER = REGISTRY.register("saltwater", () -> new SaltwaterBlock());
	public static final RegistryObject<Block> TOKAMAKFUSIONREACTOR = REGISTRY.register("tokamakfusionreactor", () -> new TokamakfusionreactorBlock());
	public static final RegistryObject<Block> LARGE_SOLAR_PANELS = REGISTRY.register("large_solar_panels", () -> new LargeSolarPanelsBlock());
	public static final RegistryObject<Block> GRAPHITE_ORE = REGISTRY.register("graphite_ore", () -> new GraphiteOreBlock());
	public static final RegistryObject<Block> GRAPHITE_BLOCK = REGISTRY.register("graphite_block", () -> new GraphiteBlockBlock());
	public static final RegistryObject<Block> SILICON_BLOCK = REGISTRY.register("silicon_block", () -> new SiliconBlockBlock());
	public static final RegistryObject<Block> CARDBOARDBOX = REGISTRY.register("cardboardbox", () -> new CardboardboxBlock());
	public static final RegistryObject<Block> CHACOA = REGISTRY.register("chacoa", () -> new ChacoaBlock());
	public static final RegistryObject<Block> CHACOAVINES = REGISTRY.register("chacoavines", () -> new ChacoavinesBlock());
	public static final RegistryObject<Block> ALIEN_REEDS = REGISTRY.register("alien_reeds", () -> new AlienReedsBlock());
	public static final RegistryObject<Block> BIO_PLASTIC_WINDOW = REGISTRY.register("bio_plastic_window", () -> new BioPlasticWindowBlock());
	public static final RegistryObject<Block> INTEGRATED_CIRCUIT_FABRICATOR = REGISTRY.register("integrated_circuit_fabricator", () -> new IntegratedCircuitFabricatorBlock());
	public static final RegistryObject<Block> CHEMICAL_REACTOR = REGISTRY.register("chemical_reactor", () -> new ChemicalReactorBlock());
	public static final RegistryObject<Block> ALUMINIUM_BLOCK = REGISTRY.register("aluminium_block", () -> new AluminiumBlockBlock());
	public static final RegistryObject<Block> BAUXITE = REGISTRY.register("bauxite", () -> new BauxiteBlock());
	public static final RegistryObject<Block> CARBORUNDUM_BLOCK = REGISTRY.register("carborundum_block", () -> new CarborundumBlockBlock());
	public static final RegistryObject<Block> SPHALERITE_BLOCK = REGISTRY.register("sphalerite_block", () -> new SphaleriteBlockBlock());
	public static final RegistryObject<Block> BORACITE_ORE = REGISTRY.register("boracite_ore", () -> new BoraciteOreBlock());
	public static final RegistryObject<Block> BORACITE_BLOCK = REGISTRY.register("boracite_block", () -> new BoraciteBlockBlock());
	public static final RegistryObject<Block> SULFURIC_ACID = REGISTRY.register("sulfuric_acid", () -> new SulfuricAcidBlock());
	public static final RegistryObject<Block> CHEMOSYNTHETIC_NODULES = REGISTRY.register("chemosynthetic_nodules", () -> new ChemosyntheticNodulesBlock());
	public static final RegistryObject<Block> CRYSTALINE_EXOSKELETON = REGISTRY.register("crystaline_exoskeleton", () -> new CrystalineExoskeletonBlock());
	public static final RegistryObject<Block> GREEN_OIL = REGISTRY.register("green_oil", () -> new GreenOilBlock());
	public static final RegistryObject<Block> ASPHALT = REGISTRY.register("asphalt", () -> new AsphaltBlock());
	public static final RegistryObject<Block> LIQUID_AMMONIA = REGISTRY.register("liquid_ammonia", () -> new LiquidAmmoniaBlock());
	public static final RegistryObject<Block> CARGO_POD = REGISTRY.register("cargo_pod", () -> new CargoPodBlock());
	public static final RegistryObject<Block> AIRTIGHT_HABITAT_WALL = REGISTRY.register("airtight_habitat_wall", () -> new AirtightHabitatWallBlock());
	public static final RegistryObject<Block> Z_PINCH_FUSION_REACTOR = REGISTRY.register("z_pinch_fusion_reactor", () -> new ZPinchFusionReactorBlock());
	public static final RegistryObject<Block> COFFINITE_ORE = REGISTRY.register("coffinite_ore", () -> new CoffiniteOreBlock());
	public static final RegistryObject<Block> COFFINITE_BLOCK = REGISTRY.register("coffinite_block", () -> new CoffiniteBlockBlock());
	public static final RegistryObject<Block> SPODUMENE_ORE = REGISTRY.register("spodumene_ore", () -> new SpodumeneOreBlock());
	public static final RegistryObject<Block> SPODUMENE_BLOCK = REGISTRY.register("spodumene_block", () -> new SpodumeneBlockBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_WOOD = REGISTRY.register("lumiblossom_wood", () -> new LumiblossomWoodBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_LOG = REGISTRY.register("lumiblossom_log", () -> new LumiblossomLogBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_PLANKS = REGISTRY.register("lumiblossom_planks", () -> new LumiblossomPlanksBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_STAIRS = REGISTRY.register("lumiblossom_stairs", () -> new LumiblossomStairsBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_SLAB = REGISTRY.register("lumiblossom_slab", () -> new LumiblossomSlabBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_FENCE = REGISTRY.register("lumiblossom_fence", () -> new LumiblossomFenceBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_FENCE_GATE = REGISTRY.register("lumiblossom_fence_gate", () -> new LumiblossomFenceGateBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_PRESSURE_PLATE = REGISTRY.register("lumiblossom_pressure_plate", () -> new LumiblossomPressurePlateBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_BUTTON = REGISTRY.register("lumiblossom_button", () -> new LumiblossomButtonBlock());
	public static final RegistryObject<Block> QUARTZ_ORE = REGISTRY.register("quartz_ore", () -> new QuartzOreBlock());
	public static final RegistryObject<Block> SOLAR_VINES_CAP = REGISTRY.register("solar_vines_cap", () -> new SolarVinesCapBlock());
	public static final RegistryObject<Block> SOLAR_VINES = REGISTRY.register("solar_vines", () -> new SolarVinesBlock());
	public static final RegistryObject<Block> RED_TORCHER = REGISTRY.register("red_torcher", () -> new RedTorcherBlock());
	public static final RegistryObject<Block> YELLOW_TORCHER = REGISTRY.register("yellow_torcher", () -> new YellowTorcherBlock());
	public static final RegistryObject<Block> BLUE_TORCHER = REGISTRY.register("blue_torcher", () -> new BlueTorcherBlock());
	public static final RegistryObject<Block> CHLORELLA_CULTURE = REGISTRY.register("chlorella_culture", () -> new ChlorellaCultureBlock());
	public static final RegistryObject<Block> DRY_WATER = REGISTRY.register("dry_water", () -> new DryWaterBlock());
	public static final RegistryObject<Block> ANCIENT_SEDIMENT = REGISTRY.register("ancient_sediment", () -> new AncientSedimentBlock());
	public static final RegistryObject<Block> SALT_BLOCK = REGISTRY.register("salt_block", () -> new SaltBlockBlock());
	public static final RegistryObject<Block> LIQUID_SULFUR_DIOXIDE = REGISTRY.register("liquid_sulfur_dioxide", () -> new LiquidSulfurDioxideBlock());
	public static final RegistryObject<Block> LUMIBLOSSOM_LEAVES = REGISTRY.register("lumiblossom_leaves", () -> new LumiblossomLeavesBlock());
	public static final RegistryObject<Block> RUST = REGISTRY.register("rust", () -> new RustBlock());
	public static final RegistryObject<Block> CRUSHED_QUARTZ = REGISTRY.register("crushed_quartz", () -> new CrushedQuartzBlock());
	public static final RegistryObject<Block> AQUEOUS_AMMONIA = REGISTRY.register("aqueous_ammonia", () -> new AqueousAmmoniaBlock());
	public static final RegistryObject<Block> HYDROGEN_FUEL_CELL = REGISTRY.register("hydrogen_fuel_cell", () -> new HydrogenFuelCellBlock());
	public static final RegistryObject<Block> BASALTIC_DIRT = REGISTRY.register("basaltic_dirt", () -> new BasalticDirtBlock());
	public static final RegistryObject<Block> ETAUOSIAN_GRAINSTALK = REGISTRY.register("etauosian_grainstalk", () -> new EtauosianGrainstalkBlock());
	public static final RegistryObject<Block> STIRLING_ENGINE = REGISTRY.register("stirling_engine", () -> new StirlingEngineBlock());
	public static final RegistryObject<Block> IMMATURE_ETAUOSIAN_GRAINSTALK = REGISTRY.register("immature_etauosian_grainstalk", () -> new ImmatureEtauosianGrainstalkBlock());
	public static final RegistryObject<Block> MUSNIUS_TREE_TRUNK = REGISTRY.register("musnius_tree_trunk", () -> new MusniusTreeTrunkBlock());
	public static final RegistryObject<Block> MUSNIUS_WOOD = REGISTRY.register("musnius_wood", () -> new MusniusWoodBlock());
	public static final RegistryObject<Block> MUSNIUS_STAIRS = REGISTRY.register("musnius_stairs", () -> new MusniusStairsBlock());
	public static final RegistryObject<Block> MUSNIUS_SLAB = REGISTRY.register("musnius_slab", () -> new MusniusSlabBlock());
	public static final RegistryObject<Block> MUSNIUS_FENCE = REGISTRY.register("musnius_fence", () -> new MusniusFenceBlock());
	public static final RegistryObject<Block> MUSNIUS_FENCE_GATE = REGISTRY.register("musnius_fence_gate", () -> new MusniusFenceGateBlock());
	public static final RegistryObject<Block> MUSNIUS_PRESSURE_PLATE = REGISTRY.register("musnius_pressure_plate", () -> new MusniusPressurePlateBlock());
	public static final RegistryObject<Block> MUSNIUS_BUTTON = REGISTRY.register("musnius_button", () -> new MusniusButtonBlock());
	public static final RegistryObject<Block> MUSNIUS_PLANKS = REGISTRY.register("musnius_planks", () -> new MusniusPlanksBlock());
	public static final RegistryObject<Block> MUSNIUS_LEAVES = REGISTRY.register("musnius_leaves", () -> new MusniusLeavesBlock());
	public static final RegistryObject<Block> MUSNIUS_SAPLING = REGISTRY.register("musnius_sapling", () -> new MusniusSaplingBlock());
	public static final RegistryObject<Block> DESIGNING_WORKBENCH = REGISTRY.register("designing_workbench", () -> new DesigningWorkbenchBlock());
	public static final RegistryObject<Block> LAUNCHPAD_TILES = REGISTRY.register("launchpad_tiles", () -> new LaunchpadTilesBlock());
	public static final RegistryObject<Block> ROCKET_ASSEMBLY_MANAGER = REGISTRY.register("rocket_assembly_manager", () -> new RocketAssemblyManagerBlock());
	public static final RegistryObject<Block> ROCKET_ASSEMBLER = REGISTRY.register("rocket_assembler", () -> new RocketAssemblerBlock());
	public static final RegistryObject<Block> LIQUID_METHANE = REGISTRY.register("liquid_methane", () -> new LiquidMethaneBlock());
	public static final RegistryObject<Block> STRALAKITE = REGISTRY.register("stralakite", () -> new StralakiteBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			LargeSolarPanelsBlock.blockColorLoad(event);
			EtauosianGrainstalkBlock.blockColorLoad(event);
			ImmatureEtauosianGrainstalkBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			LargeSolarPanelsBlock.itemColorLoad(event);
			ImmatureEtauosianGrainstalkBlock.itemColorLoad(event);
		}
	}
}
