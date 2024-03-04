
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.far_out.item.WrenchItem;
import net.mcreator.far_out.item.VodkaItem;
import net.mcreator.far_out.item.VasmirIonEngineItem;
import net.mcreator.far_out.item.UraniumCarbideItem;
import net.mcreator.far_out.item.UnetchedSiliconWaferItem;
import net.mcreator.far_out.item.UnetchedGrapheneWaferItem;
import net.mcreator.far_out.item.UnequippedRocketItem;
import net.mcreator.far_out.item.UnactivatedGlowstoneDustItem;
import net.mcreator.far_out.item.TritiumItem;
import net.mcreator.far_out.item.TheFaroutGuideItem;
import net.mcreator.far_out.item.SyntheticMeatItem;
import net.mcreator.far_out.item.Super_AlloySwordItem;
import net.mcreator.far_out.item.Super_AlloyShovelItem;
import net.mcreator.far_out.item.Super_AlloyPickaxeItem;
import net.mcreator.far_out.item.Super_AlloyIngotItem;
import net.mcreator.far_out.item.Super_AlloyHoeItem;
import net.mcreator.far_out.item.Super_AlloyAxeItem;
import net.mcreator.far_out.item.SuperCapacitorsItem;
import net.mcreator.far_out.item.SulfuricAcidItem;
import net.mcreator.far_out.item.SulfurDustItem;
import net.mcreator.far_out.item.StarshipCoreItem;
import net.mcreator.far_out.item.SporeBerriesItem;
import net.mcreator.far_out.item.SpodumeneItem;
import net.mcreator.far_out.item.SphaleriteItem;
import net.mcreator.far_out.item.SpacecraftConstructionMeterialsItem;
import net.mcreator.far_out.item.SpaceSuitItem;
import net.mcreator.far_out.item.SolidCoreNuclearThermalRocketItem;
import net.mcreator.far_out.item.SolarCollectorItem;
import net.mcreator.far_out.item.SodiumItem;
import net.mcreator.far_out.item.SodiumHydroxideItem;
import net.mcreator.far_out.item.SmallAtmosphericLanderItem;
import net.mcreator.far_out.item.SiliconDustItem;
import net.mcreator.far_out.item.SaltwaterItem;
import net.mcreator.far_out.item.SaltDustItem;
import net.mcreator.far_out.item.RheniumIngotItem;
import net.mcreator.far_out.item.RawMolybdenumItem;
import net.mcreator.far_out.item.RadiatorItem;
import net.mcreator.far_out.item.PropaneItem;
import net.mcreator.far_out.item.Potassium_nitrateDustItem;
import net.mcreator.far_out.item.PlutoniumCarbideItem;
import net.mcreator.far_out.item.PipeItem;
import net.mcreator.far_out.item.PhotovoltaicWaferItem;
import net.mcreator.far_out.item.OxygenBottleItem;
import net.mcreator.far_out.item.OsmiumIngotItem;
import net.mcreator.far_out.item.OrganicMoleculesItem;
import net.mcreator.far_out.item.OpenFairingItem;
import net.mcreator.far_out.item.OpenCoreNuclearThermalRocketItem;
import net.mcreator.far_out.item.OpenCargoFairingItem;
import net.mcreator.far_out.item.OceanusEmblemItem;
import net.mcreator.far_out.item.NuclearSaltWaterRocketItem;
import net.mcreator.far_out.item.NuclearSaltWaterFuelTankItem;
import net.mcreator.far_out.item.NuclearRodsItem;
import net.mcreator.far_out.item.NozzleItem;
import net.mcreator.far_out.item.MotorItem;
import net.mcreator.far_out.item.MoonshineItem;
import net.mcreator.far_out.item.MolybdenumIngotItem;
import net.mcreator.far_out.item.MediumFrequencyIntegratedCircuitItem;
import net.mcreator.far_out.item.MediumCapacityMemoryItem;
import net.mcreator.far_out.item.MeatProteinGeneItem;
import net.mcreator.far_out.item.MagnetoplasmadynamicThrusterItem;
import net.mcreator.far_out.item.MagetoInertialConfinementFusionEngineItem;
import net.mcreator.far_out.item.LowFrequencyIntegratedCircuitPhotomaskItem;
import net.mcreator.far_out.item.LowFrequencyIntegratedCircuitItem;
import net.mcreator.far_out.item.LowCapacityMemoryPhotomaskItem;
import net.mcreator.far_out.item.LowCapacityMemoryItem;
import net.mcreator.far_out.item.LithiumIngotItem;
import net.mcreator.far_out.item.LithiumFuelTankItem;
import net.mcreator.far_out.item.LithiumDeuterideItem;
import net.mcreator.far_out.item.LiquidSulfurDioxideItem;
import net.mcreator.far_out.item.LiquidHydrogenFuelTankItem;
import net.mcreator.far_out.item.LiquidCrystalItem;
import net.mcreator.far_out.item.LiquidAmmoniaItem;
import net.mcreator.far_out.item.LimestoneDustItem;
import net.mcreator.far_out.item.LightIsotopesItem;
import net.mcreator.far_out.item.LaserItem;
import net.mcreator.far_out.item.LanderBayItem;
import net.mcreator.far_out.item.IronplateItem;
import net.mcreator.far_out.item.InterstellarHabitationModuleItem;
import net.mcreator.far_out.item.InflatableSegmentItem;
import net.mcreator.far_out.item.InflatableModuleItem;
import net.mcreator.far_out.item.InflatableHabitatItem;
import net.mcreator.far_out.item.InflatableHabRingItem;
import net.mcreator.far_out.item.InertialNavigationSystemItem;
import net.mcreator.far_out.item.HydrogenItem;
import net.mcreator.far_out.item.HighHeatLoadGraphineRadiatorsItem;
import net.mcreator.far_out.item.HighFrequencyIntegratedCircuitItem;
import net.mcreator.far_out.item.HighCapacityMemoryItem;
import net.mcreator.far_out.item.HexuraningotItem;
import net.mcreator.far_out.item.HexuranSwordItem;
import net.mcreator.far_out.item.HexuranShovelItem;
import net.mcreator.far_out.item.HexuranPickaxeItem;
import net.mcreator.far_out.item.HexuranHoeItem;
import net.mcreator.far_out.item.HexuranAxeItem;
import net.mcreator.far_out.item.HeliumItem;
import net.mcreator.far_out.item.Helium3Item;
import net.mcreator.far_out.item.GreenOilItem;
import net.mcreator.far_out.item.GraphiterodItem;
import net.mcreator.far_out.item.GraphiteIngotItem;
import net.mcreator.far_out.item.GrapheneItem;
import net.mcreator.far_out.item.GeneratorItem;
import net.mcreator.far_out.item.GalacticCoreTrackerItem;
import net.mcreator.far_out.item.FusionFuelTankItem;
import net.mcreator.far_out.item.FusionChamberItem;
import net.mcreator.far_out.item.FissionFragmentFuelTankItem;
import net.mcreator.far_out.item.FissionFragmentEngineItem;
import net.mcreator.far_out.item.FanItem;
import net.mcreator.far_out.item.FairingSegmentsItem;
import net.mcreator.far_out.item.FairingItem;
import net.mcreator.far_out.item.EtauosianGrainStalkSeedsItem;
import net.mcreator.far_out.item.ErbiumItem;
import net.mcreator.far_out.item.EnergyMeterItem;
import net.mcreator.far_out.item.EmptyFuelTankItem;
import net.mcreator.far_out.item.EmergencyRationsItem;
import net.mcreator.far_out.item.ElectroMagnetItem;
import net.mcreator.far_out.item.DryWaterItem;
import net.mcreator.far_out.item.DriedChlorellaItem;
import net.mcreator.far_out.item.DisplayItem;
import net.mcreator.far_out.item.DeuteriumItem;
import net.mcreator.far_out.item.DepletedUraniumItem;
import net.mcreator.far_out.item.DebugItemItem;
import net.mcreator.far_out.item.DataDisk1Item;
import net.mcreator.far_out.item.CryogenicStasisChamberItem;
import net.mcreator.far_out.item.CopperWireItem;
import net.mcreator.far_out.item.CookedSyntheticMeatItem;
import net.mcreator.far_out.item.CoffiniteItem;
import net.mcreator.far_out.item.ChlorellaCultureItem;
import net.mcreator.far_out.item.ChemicalsItem;
import net.mcreator.far_out.item.ChemicalRocketEngineItem;
import net.mcreator.far_out.item.ChemicalFuelTankItem;
import net.mcreator.far_out.item.CargoFairingItem;
import net.mcreator.far_out.item.CargoContainerItem;
import net.mcreator.far_out.item.CarborundumIngotItem;
import net.mcreator.far_out.item.BoronIngotItem;
import net.mcreator.far_out.item.BoratedSteelIngotItem;
import net.mcreator.far_out.item.BoraciteItem;
import net.mcreator.far_out.item.BioPlasticItem;
import net.mcreator.far_out.item.BerylliumIngotItem;
import net.mcreator.far_out.item.BenzeneItem;
import net.mcreator.far_out.item.BasicHabModuleItem;
import net.mcreator.far_out.item.BasicCommandDiskItem;
import net.mcreator.far_out.item.BacterialCultureItem;
import net.mcreator.far_out.item.AtmosphericAnalyzerItem;
import net.mcreator.far_out.item.AshItem;
import net.mcreator.far_out.item.ArgonItem;
import net.mcreator.far_out.item.ArgonFuelTankItem;
import net.mcreator.far_out.item.AqueousAmmoniaItem;
import net.mcreator.far_out.item.AmmoniaItem;
import net.mcreator.far_out.item.AluminiumIngotItem;
import net.mcreator.far_out.item.AlgaeBarItem;
import net.mcreator.far_out.item.AirtightFabricItem;
import net.mcreator.far_out.item.AdvancedCommandDiskItem;
import net.mcreator.far_out.block.display.StirlingEngineDisplayItem;
import net.mcreator.far_out.FaroutMod;

public class FaroutModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FaroutMod.MODID);
	public static final RegistryObject<Item> FUNGUSTRUNK = block(FaroutModBlocks.FUNGUSTRUNK);
	public static final RegistryObject<Item> FUNGUS_CAP = block(FaroutModBlocks.FUNGUS_CAP);
	public static final RegistryObject<Item> LITHIUM_BLOCK = block(FaroutModBlocks.LITHIUM_BLOCK);
	public static final RegistryObject<Item> FUNGUS_PLANKS = block(FaroutModBlocks.FUNGUS_PLANKS);
	public static final RegistryObject<Item> FUNGUS_STAIRS = block(FaroutModBlocks.FUNGUS_STAIRS);
	public static final RegistryObject<Item> FUNGUS_SLAB = block(FaroutModBlocks.FUNGUS_SLAB);
	public static final RegistryObject<Item> FUNGUS_BUTTON = block(FaroutModBlocks.FUNGUS_BUTTON);
	public static final RegistryObject<Item> SUPER_ALLOY_BLOCK = block(FaroutModBlocks.SUPER_ALLOY_BLOCK);
	public static final RegistryObject<Item> BORON_BLOCK = block(FaroutModBlocks.BORON_BLOCK);
	public static final RegistryObject<Item> RHENIUM_BLOCK = block(FaroutModBlocks.RHENIUM_BLOCK);
	public static final RegistryObject<Item> OSMIUM_BLOCK = block(FaroutModBlocks.OSMIUM_BLOCK);
	public static final RegistryObject<Item> SULFUR_BLOCK = block(FaroutModBlocks.SULFUR_BLOCK);
	public static final RegistryObject<Item> POTASSIUM_NITRATE_BLOCK = block(FaroutModBlocks.POTASSIUM_NITRATE_BLOCK);
	public static final RegistryObject<Item> GUNPOWDER_BLOCK = block(FaroutModBlocks.GUNPOWDER_BLOCK);
	public static final RegistryObject<Item> DESKTOP_COMPUTER = block(FaroutModBlocks.DESKTOP_COMPUTER);
	public static final RegistryObject<Item> AIR_PURIFIER = block(FaroutModBlocks.AIR_PURIFIER);
	public static final RegistryObject<Item> LIMESTONE_BLOCK = block(FaroutModBlocks.LIMESTONE_BLOCK);
	public static final RegistryObject<Item> TRUSS = block(FaroutModBlocks.TRUSS);
	public static final RegistryObject<Item> ELECTROLYZER = block(FaroutModBlocks.ELECTROLYZER);
	public static final RegistryObject<Item> DISPLAY = REGISTRY.register("display", () -> new DisplayItem());
	public static final RegistryObject<Item> LITHIUM_INGOT = REGISTRY.register("lithium_ingot", () -> new LithiumIngotItem());
	public static final RegistryObject<Item> DEPLETED_URANIUM = REGISTRY.register("depleted_uranium", () -> new DepletedUraniumItem());
	public static final RegistryObject<Item> SUPER_ALLOY_INGOT = REGISTRY.register("super_alloy_ingot", () -> new Super_AlloyIngotItem());
	public static final RegistryObject<Item> BORON_INGOT = REGISTRY.register("boron_ingot", () -> new BoronIngotItem());
	public static final RegistryObject<Item> RHENIUM_INGOT = REGISTRY.register("rhenium_ingot", () -> new RheniumIngotItem());
	public static final RegistryObject<Item> OSMIUM_INGOT = REGISTRY.register("osmium_ingot", () -> new OsmiumIngotItem());
	public static final RegistryObject<Item> DEUTERIUM = REGISTRY.register("deuterium", () -> new DeuteriumItem());
	public static final RegistryObject<Item> HELIUM_3 = REGISTRY.register("helium_3", () -> new Helium3Item());
	public static final RegistryObject<Item> TRITIUM = REGISTRY.register("tritium", () -> new TritiumItem());
	public static final RegistryObject<Item> HELIUM = REGISTRY.register("helium", () -> new HeliumItem());
	public static final RegistryObject<Item> IRONPLATE = REGISTRY.register("ironplate", () -> new IronplateItem());
	public static final RegistryObject<Item> RADIATOR = REGISTRY.register("radiator", () -> new RadiatorItem());
	public static final RegistryObject<Item> HEXURANINGOT = REGISTRY.register("hexuraningot", () -> new HexuraningotItem());
	public static final RegistryObject<Item> SULFUR_DUST = REGISTRY.register("sulfur_dust", () -> new SulfurDustItem());
	public static final RegistryObject<Item> POTASSIUM_NITRATE_DUST = REGISTRY.register("potassium_nitrate_dust", () -> new Potassium_nitrateDustItem());
	public static final RegistryObject<Item> ASH = REGISTRY.register("ash", () -> new AshItem());
	public static final RegistryObject<Item> MOTOR = REGISTRY.register("motor", () -> new MotorItem());
	public static final RegistryObject<Item> PIPE = REGISTRY.register("pipe", () -> new PipeItem());
	public static final RegistryObject<Item> GENERATOR = REGISTRY.register("generator", () -> new GeneratorItem());
	public static final RegistryObject<Item> FAN = REGISTRY.register("fan", () -> new FanItem());
	public static final RegistryObject<Item> LIMESTONE_DUST = REGISTRY.register("limestone_dust", () -> new LimestoneDustItem());
	public static final RegistryObject<Item> GRAPHITE_INGOT = REGISTRY.register("graphite_ingot", () -> new GraphiteIngotItem());
	public static final RegistryObject<Item> COPPER_WIRE = REGISTRY.register("copper_wire", () -> new CopperWireItem());
	public static final RegistryObject<Item> ELECTRO_MAGNET = REGISTRY.register("electro_magnet", () -> new ElectroMagnetItem());
	public static final RegistryObject<Item> SILICON_DUST = REGISTRY.register("silicon_dust", () -> new SiliconDustItem());
	public static final RegistryObject<Item> PROPANE = REGISTRY.register("propane", () -> new PropaneItem());
	public static final RegistryObject<Item> AMMONIA = REGISTRY.register("ammonia", () -> new AmmoniaItem());
	public static final RegistryObject<Item> SALTWATER_BUCKET = REGISTRY.register("saltwater_bucket", () -> new SaltwaterItem());
	public static final RegistryObject<Item> SPORE_BERRIE_BLOCK = block(FaroutModBlocks.SPORE_BERRIE_BLOCK);
	public static final RegistryObject<Item> SPORE_BERRIES = REGISTRY.register("spore_berries", () -> new SporeBerriesItem());
	public static final RegistryObject<Item> VODKA = REGISTRY.register("vodka", () -> new VodkaItem());
	public static final RegistryObject<Item> SPACE_SUIT_HELMET = REGISTRY.register("space_suit_helmet", () -> new SpaceSuitItem.Helmet());
	public static final RegistryObject<Item> SPACE_SUIT_CHESTPLATE = REGISTRY.register("space_suit_chestplate", () -> new SpaceSuitItem.Chestplate());
	public static final RegistryObject<Item> SPACE_SUIT_LEGGINGS = REGISTRY.register("space_suit_leggings", () -> new SpaceSuitItem.Leggings());
	public static final RegistryObject<Item> SUPER_ALLOY_SWORD = REGISTRY.register("super_alloy_sword", () -> new Super_AlloySwordItem());
	public static final RegistryObject<Item> HEXURAN_SWORD = REGISTRY.register("hexuran_sword", () -> new HexuranSwordItem());
	public static final RegistryObject<Item> SUPER_ALLOY_PICKAXE = REGISTRY.register("super_alloy_pickaxe", () -> new Super_AlloyPickaxeItem());
	public static final RegistryObject<Item> SUPER_ALLOY_AXE = REGISTRY.register("super_alloy_axe", () -> new Super_AlloyAxeItem());
	public static final RegistryObject<Item> SUPER_ALLOY_SHOVEL = REGISTRY.register("super_alloy_shovel", () -> new Super_AlloyShovelItem());
	public static final RegistryObject<Item> SUPER_ALLOY_HOE = REGISTRY.register("super_alloy_hoe", () -> new Super_AlloyHoeItem());
	public static final RegistryObject<Item> HEXURAN_PICKAXE = REGISTRY.register("hexuran_pickaxe", () -> new HexuranPickaxeItem());
	public static final RegistryObject<Item> HEXURAN_AXE = REGISTRY.register("hexuran_axe", () -> new HexuranAxeItem());
	public static final RegistryObject<Item> HEXURAN_SHOVEL = REGISTRY.register("hexuran_shovel", () -> new HexuranShovelItem());
	public static final RegistryObject<Item> HEXURAN_HOE = REGISTRY.register("hexuran_hoe", () -> new HexuranHoeItem());
	public static final RegistryObject<Item> GRAPHITEROD = REGISTRY.register("graphiterod", () -> new GraphiterodItem());
	public static final RegistryObject<Item> NUCLEAR_REACTOR = block(FaroutModBlocks.NUCLEAR_REACTOR);
	public static final RegistryObject<Item> TOKAMAKFUSIONREACTOR = block(FaroutModBlocks.TOKAMAKFUSIONREACTOR);
	public static final RegistryObject<Item> LARGE_SOLAR_PANELS = block(FaroutModBlocks.LARGE_SOLAR_PANELS);
	public static final RegistryObject<Item> ENERGY_METER = REGISTRY.register("energy_meter", () -> new EnergyMeterItem());
	public static final RegistryObject<Item> BIOMASS_BURNER = block(FaroutModBlocks.BIOMASS_BURNER);
	public static final RegistryObject<Item> GRAPHITE_ORE = block(FaroutModBlocks.GRAPHITE_ORE);
	public static final RegistryObject<Item> GRAPHITE_BLOCK = block(FaroutModBlocks.GRAPHITE_BLOCK);
	public static final RegistryObject<Item> SILICON_BLOCK = block(FaroutModBlocks.SILICON_BLOCK);
	public static final RegistryObject<Item> FUNGUS_FENCE = block(FaroutModBlocks.FUNGUS_FENCE);
	public static final RegistryObject<Item> CARDBOARDBOX = block(FaroutModBlocks.CARDBOARDBOX);
	public static final RegistryObject<Item> CHACOA = block(FaroutModBlocks.CHACOA);
	public static final RegistryObject<Item> CHACOAVINES = block(FaroutModBlocks.CHACOAVINES);
	public static final RegistryObject<Item> AILEN_MOSS = block(FaroutModBlocks.AILEN_MOSS);
	public static final RegistryObject<Item> FUNGUS_FENCE_GATE = block(FaroutModBlocks.FUNGUS_FENCE_GATE);
	public static final RegistryObject<Item> FUNGUS_PRESSURE_PLATE = block(FaroutModBlocks.FUNGUS_PRESSURE_PLATE);
	public static final RegistryObject<Item> CHEMICAL_ROCKET_ENGINE = REGISTRY.register("chemical_rocket_engine", () -> new ChemicalRocketEngineItem());
	public static final RegistryObject<Item> OPEN_CORE_NUCLEAR_THERMAL_ROCKET = REGISTRY.register("open_core_nuclear_thermal_rocket", () -> new OpenCoreNuclearThermalRocketItem());
	public static final RegistryObject<Item> SOLID_CORE_NUCLEAR_THERMAL_ROCKET = REGISTRY.register("solid_core_nuclear_thermal_rocket", () -> new SolidCoreNuclearThermalRocketItem());
	public static final RegistryObject<Item> VASMIR_ION_ENGINE = REGISTRY.register("vasmir_ion_engine", () -> new VasmirIonEngineItem());
	public static final RegistryObject<Item> NUCLEAR_SALT_WATER_ROCKET = REGISTRY.register("nuclear_salt_water_rocket", () -> new NuclearSaltWaterRocketItem());
	public static final RegistryObject<Item> NOZZLE = REGISTRY.register("nozzle", () -> new NozzleItem());
	public static final RegistryObject<Item> AIRTIGHT_FABRIC = REGISTRY.register("airtight_fabric", () -> new AirtightFabricItem());
	public static final RegistryObject<Item> GEOTHERMAL_GENERATOR = block(FaroutModBlocks.GEOTHERMAL_GENERATOR);
	public static final RegistryObject<Item> ALIEN_REEDS = block(FaroutModBlocks.ALIEN_REEDS);
	public static final RegistryObject<Item> ARGON = REGISTRY.register("argon", () -> new ArgonItem());
	public static final RegistryObject<Item> INFLATABLE_HAB_RING = REGISTRY.register("inflatable_hab_ring", () -> new InflatableHabRingItem());
	public static final RegistryObject<Item> INFLATABLE_SEGMENT = REGISTRY.register("inflatable_segment", () -> new InflatableSegmentItem());
	public static final RegistryObject<Item> BIO_PLASTIC = REGISTRY.register("bio_plastic", () -> new BioPlasticItem());
	public static final RegistryObject<Item> BIO_PLASTIC_WINDOW = block(FaroutModBlocks.BIO_PLASTIC_WINDOW);
	public static final RegistryObject<Item> INFLATABLE_HABITAT = REGISTRY.register("inflatable_habitat", () -> new InflatableHabitatItem());
	public static final RegistryObject<Item> INFLATABLE_MODULE = REGISTRY.register("inflatable_module", () -> new InflatableModuleItem());
	public static final RegistryObject<Item> BASIC_HAB_MODULE = REGISTRY.register("basic_hab_module", () -> new BasicHabModuleItem());
	public static final RegistryObject<Item> BENZENE = REGISTRY.register("benzene", () -> new BenzeneItem());
	public static final RegistryObject<Item> SODIUM_HYDROXIDE = REGISTRY.register("sodium_hydroxide", () -> new SodiumHydroxideItem());
	public static final RegistryObject<Item> SODIUM = REGISTRY.register("sodium", () -> new SodiumItem());
	public static final RegistryObject<Item> SPORE_EMITTER = block(FaroutModBlocks.SPORE_EMITTER);
	public static final RegistryObject<Item> UNEQUIPPED_ROCKET = REGISTRY.register("unequipped_rocket", () -> new UnequippedRocketItem());
	public static final RegistryObject<Item> FAIRING = REGISTRY.register("fairing", () -> new FairingItem());
	public static final RegistryObject<Item> FAIRING_SEGMENTS = REGISTRY.register("fairing_segments", () -> new FairingSegmentsItem());
	public static final RegistryObject<Item> CHEMICAL_FUEL_TANK = REGISTRY.register("chemical_fuel_tank", () -> new ChemicalFuelTankItem());
	public static final RegistryObject<Item> LIQUID_HYDROGEN_FUEL_TANK = REGISTRY.register("liquid_hydrogen_fuel_tank", () -> new LiquidHydrogenFuelTankItem());
	public static final RegistryObject<Item> ARGON_FUEL_TANK = REGISTRY.register("argon_fuel_tank", () -> new ArgonFuelTankItem());
	public static final RegistryObject<Item> NUCLEAR_SALT_WATER_FUEL_TANK = REGISTRY.register("nuclear_salt_water_fuel_tank", () -> new NuclearSaltWaterFuelTankItem());
	public static final RegistryObject<Item> FUSION_FUEL_TANK = REGISTRY.register("fusion_fuel_tank", () -> new FusionFuelTankItem());
	public static final RegistryObject<Item> OPEN_FAIRING = REGISTRY.register("open_fairing", () -> new OpenFairingItem());
	public static final RegistryObject<Item> BORATED_STEEL_INGOT = REGISTRY.register("borated_steel_ingot", () -> new BoratedSteelIngotItem());
	public static final RegistryObject<Item> MOONSHINE = REGISTRY.register("moonshine", () -> new MoonshineItem());
	public static final RegistryObject<Item> EMPTY_FUEL_TANK = REGISTRY.register("empty_fuel_tank", () -> new EmptyFuelTankItem());
	public static final RegistryObject<Item> LITHIUM_DEUTERIDE = REGISTRY.register("lithium_deuteride", () -> new LithiumDeuterideItem());
	public static final RegistryObject<Item> LIGHT_ISOTOPES = REGISTRY.register("light_isotopes", () -> new LightIsotopesItem());
	public static final RegistryObject<Item> MAGETO_INERTIAL_CONFINEMENT_FUSION_ENGINE = REGISTRY.register("mageto_inertial_confinement_fusion_engine", () -> new MagetoInertialConfinementFusionEngineItem());
	public static final RegistryObject<Item> SUPER_CAPACITORS = REGISTRY.register("super_capacitors", () -> new SuperCapacitorsItem());
	public static final RegistryObject<Item> SUPERCONDUCTING_MAGNETIC_BATTERY = block(FaroutModBlocks.SUPERCONDUCTING_MAGNETIC_BATTERY);
	public static final RegistryObject<Item> WRENCH = REGISTRY.register("wrench", () -> new WrenchItem());
	public static final RegistryObject<Item> LOW_FREQUENCY_INTEGRATED_CIRCUIT = REGISTRY.register("low_frequency_integrated_circuit", () -> new LowFrequencyIntegratedCircuitItem());
	public static final RegistryObject<Item> MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT = REGISTRY.register("medium_frequency_integrated_circuit", () -> new MediumFrequencyIntegratedCircuitItem());
	public static final RegistryObject<Item> HIGH_FREQUENCY_INTEGRATED_CIRCUIT = REGISTRY.register("high_frequency_integrated_circuit", () -> new HighFrequencyIntegratedCircuitItem());
	public static final RegistryObject<Item> GRAPHENE = REGISTRY.register("graphene", () -> new GrapheneItem());
	public static final RegistryObject<Item> INTEGRATED_CIRCUIT_FABRICATOR = block(FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR);
	public static final RegistryObject<Item> ORGANIC_MOLECULES = REGISTRY.register("organic_molecules", () -> new OrganicMoleculesItem());
	public static final RegistryObject<Item> CHEMICALS = REGISTRY.register("chemicals", () -> new ChemicalsItem());
	public static final RegistryObject<Item> CHEMICAL_REACTOR = block(FaroutModBlocks.CHEMICAL_REACTOR);
	public static final RegistryObject<Item> ALUMINIUM_INGOT = REGISTRY.register("aluminium_ingot", () -> new AluminiumIngotItem());
	public static final RegistryObject<Item> ALUMINIUM_BLOCK = block(FaroutModBlocks.ALUMINIUM_BLOCK);
	public static final RegistryObject<Item> BAUXITE = block(FaroutModBlocks.BAUXITE);
	public static final RegistryObject<Item> CARBORUNDUM_INGOT = REGISTRY.register("carborundum_ingot", () -> new CarborundumIngotItem());
	public static final RegistryObject<Item> CARBORUNDUM_BLOCK = block(FaroutModBlocks.CARBORUNDUM_BLOCK);
	public static final RegistryObject<Item> UNACTIVATED_GLOWSTONE_DUST = REGISTRY.register("unactivated_glowstone_dust", () -> new UnactivatedGlowstoneDustItem());
	public static final RegistryObject<Item> SPHALERITE_ORE = block(FaroutModBlocks.SPHALERITE_ORE);
	public static final RegistryObject<Item> SPHALERITE_BLOCK = block(FaroutModBlocks.SPHALERITE_BLOCK);
	public static final RegistryObject<Item> SPHALERITE = REGISTRY.register("sphalerite", () -> new SphaleriteItem());
	public static final RegistryObject<Item> BORACITE_ORE = block(FaroutModBlocks.BORACITE_ORE);
	public static final RegistryObject<Item> BORACITE_BLOCK = block(FaroutModBlocks.BORACITE_BLOCK);
	public static final RegistryObject<Item> BORACITE = REGISTRY.register("boracite", () -> new BoraciteItem());
	public static final RegistryObject<Item> MOLYBDENITE = block(FaroutModBlocks.MOLYBDENITE);
	public static final RegistryObject<Item> MOLYBDENUM_BLOCK = block(FaroutModBlocks.MOLYBDENUM_BLOCK);
	public static final RegistryObject<Item> MOLYBDENUM_INGOT = REGISTRY.register("molybdenum_ingot", () -> new MolybdenumIngotItem());
	public static final RegistryObject<Item> RAW_MOLYBDENUM = REGISTRY.register("raw_molybdenum", () -> new RawMolybdenumItem());
	public static final RegistryObject<Item> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenItem());
	public static final RegistryObject<Item> BASIC_COMMAND_DISK = REGISTRY.register("basic_command_disk", () -> new BasicCommandDiskItem());
	public static final RegistryObject<Item> ADVANCED_COMMAND_DISK = REGISTRY.register("advanced_command_disk", () -> new AdvancedCommandDiskItem());
	public static final RegistryObject<Item> SULFURIC_ACID_BUCKET = REGISTRY.register("sulfuric_acid_bucket", () -> new SulfuricAcidItem());
	public static final RegistryObject<Item> CHEMOSYNTHETIC_NODULES = block(FaroutModBlocks.CHEMOSYNTHETIC_NODULES);
	public static final RegistryObject<Item> CRYSTALINE_EXOSKELETON = block(FaroutModBlocks.CRYSTALINE_EXOSKELETON);
	public static final RegistryObject<Item> ERBIUM_BLOCK = block(FaroutModBlocks.ERBIUM_BLOCK);
	public static final RegistryObject<Item> ERBIUM = REGISTRY.register("erbium", () -> new ErbiumItem());
	public static final RegistryObject<Item> MONAZITE = block(FaroutModBlocks.MONAZITE);
	public static final RegistryObject<Item> GREEN_OIL_BUCKET = REGISTRY.register("green_oil_bucket", () -> new GreenOilItem());
	public static final RegistryObject<Item> ASPHALT = block(FaroutModBlocks.ASPHALT);
	public static final RegistryObject<Item> LIQUID_AMMONIA_BUCKET = REGISTRY.register("liquid_ammonia_bucket", () -> new LiquidAmmoniaItem());
	public static final RegistryObject<Item> FISSION_FRAGMENT_ENGINE = REGISTRY.register("fission_fragment_engine", () -> new FissionFragmentEngineItem());
	public static final RegistryObject<Item> EMERGENCY_RATIONS = REGISTRY.register("emergency_rations", () -> new EmergencyRationsItem());
	public static final RegistryObject<Item> CARGO_POD = block(FaroutModBlocks.CARGO_POD);
	public static final RegistryObject<Item> UNETCHED_SILICON_WAFER = REGISTRY.register("unetched_silicon_wafer", () -> new UnetchedSiliconWaferItem());
	public static final RegistryObject<Item> HIGH_CAPACITY_MEMORY = REGISTRY.register("high_capacity_memory", () -> new HighCapacityMemoryItem());
	public static final RegistryObject<Item> MEDIUM_CAPACITY_MEMORY = REGISTRY.register("medium_capacity_memory", () -> new MediumCapacityMemoryItem());
	public static final RegistryObject<Item> LOW_FREQUENCY_INTEGRATED_CIRCUIT_FABRICATOR = block(FaroutModBlocks.LOW_FREQUENCY_INTEGRATED_CIRCUIT_FABRICATOR);
	public static final RegistryObject<Item> LOW_CAPACITY_MEMORY = REGISTRY.register("low_capacity_memory", () -> new LowCapacityMemoryItem());
	public static final RegistryObject<Item> AIRTIGHT_HABITAT_WALL = block(FaroutModBlocks.AIRTIGHT_HABITAT_WALL);
	public static final RegistryObject<Item> BACTERIAL_CULTURE = REGISTRY.register("bacterial_culture", () -> new BacterialCultureItem());
	public static final RegistryObject<Item> SYNTHETIC_MEAT = REGISTRY.register("synthetic_meat", () -> new SyntheticMeatItem());
	public static final RegistryObject<Item> COOKED_SYNTHETIC_MEAT = REGISTRY.register("cooked_synthetic_meat", () -> new CookedSyntheticMeatItem());
	public static final RegistryObject<Item> SMALL_ATMOSPHERIC_LANDER = REGISTRY.register("small_atmospheric_lander", () -> new SmallAtmosphericLanderItem());
	public static final RegistryObject<Item> MEAT_PROTEIN_GENE = REGISTRY.register("meat_protein_gene", () -> new MeatProteinGeneItem());
	public static final RegistryObject<Item> NUCLEAR_RODS = REGISTRY.register("nuclear_rods", () -> new NuclearRodsItem());
	public static final RegistryObject<Item> Z_PINCH_FUSION_REACTOR = block(FaroutModBlocks.Z_PINCH_FUSION_REACTOR);
	public static final RegistryObject<Item> FUSION_CHAMBER = REGISTRY.register("fusion_chamber", () -> new FusionChamberItem());
	public static final RegistryObject<Item> COFFINITE_ORE = block(FaroutModBlocks.COFFINITE_ORE);
	public static final RegistryObject<Item> COFFINITE_BLOCK = block(FaroutModBlocks.COFFINITE_BLOCK);
	public static final RegistryObject<Item> COFFINITE = REGISTRY.register("coffinite", () -> new CoffiniteItem());
	public static final RegistryObject<Item> OXYGEN_BOTTLE = REGISTRY.register("oxygen_bottle", () -> new OxygenBottleItem());
	public static final RegistryObject<Item> SPODUMENE_ORE = block(FaroutModBlocks.SPODUMENE_ORE);
	public static final RegistryObject<Item> SPODUMENE_BLOCK = block(FaroutModBlocks.SPODUMENE_BLOCK);
	public static final RegistryObject<Item> SPODUMENE = REGISTRY.register("spodumene", () -> new SpodumeneItem());
	public static final RegistryObject<Item> INERTIAL_NAVIGATION_SYSTEM = REGISTRY.register("inertial_navigation_system", () -> new InertialNavigationSystemItem());
	public static final RegistryObject<Item> HIGH_FREQUENCY_INTERGRATED_CIRCUT_FABRICATOR = block(FaroutModBlocks.HIGH_FREQUENCY_INTERGRATED_CIRCUT_FABRICATOR);
	public static final RegistryObject<Item> LASER = REGISTRY.register("laser", () -> new LaserItem());
	public static final RegistryObject<Item> UNETCHED_GRAPHENE_WAFER = REGISTRY.register("unetched_graphene_wafer", () -> new UnetchedGrapheneWaferItem());
	public static final RegistryObject<Item> GALACTIC_CORE_TRACKER = REGISTRY.register("galactic_core_tracker", () -> new GalacticCoreTrackerItem());
	public static final RegistryObject<Item> HIGH_HEAT_LOAD_GRAPHINE_RADIATORS = REGISTRY.register("high_heat_load_graphine_radiators", () -> new HighHeatLoadGraphineRadiatorsItem());
	public static final RegistryObject<Item> LUMIBLOSSOM_WOOD = block(FaroutModBlocks.LUMIBLOSSOM_WOOD);
	public static final RegistryObject<Item> LUMIBLOSSOM_LOG = block(FaroutModBlocks.LUMIBLOSSOM_LOG);
	public static final RegistryObject<Item> LUMIBLOSSOM_PLANKS = block(FaroutModBlocks.LUMIBLOSSOM_PLANKS);
	public static final RegistryObject<Item> LUMIBLOSSOM_STAIRS = block(FaroutModBlocks.LUMIBLOSSOM_STAIRS);
	public static final RegistryObject<Item> LUMIBLOSSOM_SLAB = block(FaroutModBlocks.LUMIBLOSSOM_SLAB);
	public static final RegistryObject<Item> LUMIBLOSSOM_FENCE = block(FaroutModBlocks.LUMIBLOSSOM_FENCE);
	public static final RegistryObject<Item> LUMIBLOSSOM_FENCE_GATE = block(FaroutModBlocks.LUMIBLOSSOM_FENCE_GATE);
	public static final RegistryObject<Item> LUMIBLOSSOM_PRESSURE_PLATE = block(FaroutModBlocks.LUMIBLOSSOM_PRESSURE_PLATE);
	public static final RegistryObject<Item> LUMIBLOSSOM_BUTTON = block(FaroutModBlocks.LUMIBLOSSOM_BUTTON);
	public static final RegistryObject<Item> QUARTZ_ORE = block(FaroutModBlocks.QUARTZ_ORE);
	public static final RegistryObject<Item> SOLAR_COLLECTOR = REGISTRY.register("solar_collector", () -> new SolarCollectorItem());
	public static final RegistryObject<Item> INTERSTELLAR_HABITATION_MODULE = REGISTRY.register("interstellar_habitation_module", () -> new InterstellarHabitationModuleItem());
	public static final RegistryObject<Item> PHOTOVOLTAIC_WAFER = REGISTRY.register("photovoltaic_wafer", () -> new PhotovoltaicWaferItem());
	public static final RegistryObject<Item> AIRLOCK_DOOR = doubleBlock(FaroutModBlocks.AIRLOCK_DOOR);
	public static final RegistryObject<Item> FISSION_FRAGMENT_FUEL_TANK = REGISTRY.register("fission_fragment_fuel_tank", () -> new FissionFragmentFuelTankItem());
	public static final RegistryObject<Item> STARSHIP_CORE = REGISTRY.register("starship_core", () -> new StarshipCoreItem());
	public static final RegistryObject<Item> LANDER_BAY = REGISTRY.register("lander_bay", () -> new LanderBayItem());
	public static final RegistryObject<Item> CARGO_CONTAINER = REGISTRY.register("cargo_container", () -> new CargoContainerItem());
	public static final RegistryObject<Item> CARGO_FAIRING = REGISTRY.register("cargo_fairing", () -> new CargoFairingItem());
	public static final RegistryObject<Item> SPACECRAFT_CONSTRUCTION_METERIALS = REGISTRY.register("spacecraft_construction_meterials", () -> new SpacecraftConstructionMeterialsItem());
	public static final RegistryObject<Item> OPEN_CARGO_FAIRING = REGISTRY.register("open_cargo_fairing", () -> new OpenCargoFairingItem());
	public static final RegistryObject<Item> LIQUID_CRYSTAL = REGISTRY.register("liquid_crystal", () -> new LiquidCrystalItem());
	public static final RegistryObject<Item> THE_FAROUT_GUIDE = REGISTRY.register("the_farout_guide", () -> new TheFaroutGuideItem());
	public static final RegistryObject<Item> CRYOGENIC_STASIS_CHAMBER = REGISTRY.register("cryogenic_stasis_chamber", () -> new CryogenicStasisChamberItem());
	public static final RegistryObject<Item> SOLAR_VINES_CAP = block(FaroutModBlocks.SOLAR_VINES_CAP);
	public static final RegistryObject<Item> SOLAR_VINES = block(FaroutModBlocks.SOLAR_VINES);
	public static final RegistryObject<Item> ORE_EXTRACTOR = block(FaroutModBlocks.ORE_EXTRACTOR);
	public static final RegistryObject<Item> RED_TORCHER = block(FaroutModBlocks.RED_TORCHER);
	public static final RegistryObject<Item> YELLOW_TORCHER = block(FaroutModBlocks.YELLOW_TORCHER);
	public static final RegistryObject<Item> BLUE_TORCHER = block(FaroutModBlocks.BLUE_TORCHER);
	public static final RegistryObject<Item> CHLORELLA_CULTURE_BUCKET = REGISTRY.register("chlorella_culture_bucket", () -> new ChlorellaCultureItem());
	public static final RegistryObject<Item> DRIED_CHLORELLA = REGISTRY.register("dried_chlorella", () -> new DriedChlorellaItem());
	public static final RegistryObject<Item> ALGAE_BAR = REGISTRY.register("algae_bar", () -> new AlgaeBarItem());
	public static final RegistryObject<Item> DATA_DISK_1 = REGISTRY.register("data_disk_1", () -> new DataDisk1Item());
	public static final RegistryObject<Item> ATMOSPHERIC_ANALYZER = REGISTRY.register("atmospheric_analyzer", () -> new AtmosphericAnalyzerItem());
	public static final RegistryObject<Item> OCEANUS_EMBLEM = REGISTRY.register("oceanus_emblem", () -> new OceanusEmblemItem());
	public static final RegistryObject<Item> CRYSTALITE_SOIL = block(FaroutModBlocks.CRYSTALITE_SOIL);
	public static final RegistryObject<Item> DRY_WATER_BUCKET = REGISTRY.register("dry_water_bucket", () -> new DryWaterItem());
	public static final RegistryObject<Item> DEBUG_ITEM = REGISTRY.register("debug_item", () -> new DebugItemItem());
	public static final RegistryObject<Item> ETAUIAN_BASE_SPAWNER = block(FaroutModBlocks.ETAUIAN_BASE_SPAWNER);
	public static final RegistryObject<Item> ETAUOSIAN_BASE_SPAWNER = block(FaroutModBlocks.ETAUOSIAN_BASE_SPAWNER);
	public static final RegistryObject<Item> NUCLEAR_BOMB = block(FaroutModBlocks.NUCLEAR_BOMB);
	public static final RegistryObject<Item> ANCIENT_SEDIMENT = block(FaroutModBlocks.ANCIENT_SEDIMENT);
	public static final RegistryObject<Item> GREENSTONE = block(FaroutModBlocks.GREENSTONE);
	public static final RegistryObject<Item> SALT_BLOCK = block(FaroutModBlocks.SALT_BLOCK);
	public static final RegistryObject<Item> SALT_DUST = REGISTRY.register("salt_dust", () -> new SaltDustItem());
	public static final RegistryObject<Item> LIQUID_SULFUR_DIOXIDE_BUCKET = REGISTRY.register("liquid_sulfur_dioxide_bucket", () -> new LiquidSulfurDioxideItem());
	public static final RegistryObject<Item> LUMIBLOSSOM_LEAVES = block(FaroutModBlocks.LUMIBLOSSOM_LEAVES);
	public static final RegistryObject<Item> LOW_FREQUENCY_INTEGRATED_CIRCUIT_PHOTOMASK = REGISTRY.register("low_frequency_integrated_circuit_photomask", () -> new LowFrequencyIntegratedCircuitPhotomaskItem());
	public static final RegistryObject<Item> LOW_CAPACITY_MEMORY_PHOTOMASK = REGISTRY.register("low_capacity_memory_photomask", () -> new LowCapacityMemoryPhotomaskItem());
	public static final RegistryObject<Item> RUST = block(FaroutModBlocks.RUST);
	public static final RegistryObject<Item> CRUSHED_QUARTZ = block(FaroutModBlocks.CRUSHED_QUARTZ);
	public static final RegistryObject<Item> URANIUM_CARBIDE = REGISTRY.register("uranium_carbide", () -> new UraniumCarbideItem());
	public static final RegistryObject<Item> AQUEOUS_AMMONIA_BUCKET = REGISTRY.register("aqueous_ammonia_bucket", () -> new AqueousAmmoniaItem());
	public static final RegistryObject<Item> PLUTONIUM_CARBIDE = REGISTRY.register("plutonium_carbide", () -> new PlutoniumCarbideItem());
	public static final RegistryObject<Item> BERYLLIUM_INGOT = REGISTRY.register("beryllium_ingot", () -> new BerylliumIngotItem());
	public static final RegistryObject<Item> LINEAR_PARTICLE_ACCELERATOR = block(FaroutModBlocks.LINEAR_PARTICLE_ACCELERATOR);
	public static final RegistryObject<Item> PARTICLE_IONIZER = block(FaroutModBlocks.PARTICLE_IONIZER);
	public static final RegistryObject<Item> MAGNETOPLASMADYNAMIC_THRUSTER = REGISTRY.register("magnetoplasmadynamic_thruster", () -> new MagnetoplasmadynamicThrusterItem());
	public static final RegistryObject<Item> LITHIUM_FUEL_TANK = REGISTRY.register("lithium_fuel_tank", () -> new LithiumFuelTankItem());
	public static final RegistryObject<Item> HYDROGEN_FUEL_CELL = block(FaroutModBlocks.HYDROGEN_FUEL_CELL);
	public static final RegistryObject<Item> BASALTIC_DIRT = block(FaroutModBlocks.BASALTIC_DIRT);
	public static final RegistryObject<Item> ETAUOSIAN_GRAINSTALK = block(FaroutModBlocks.ETAUOSIAN_GRAINSTALK);
	public static final RegistryObject<Item> ETAUOSIAN_GRAIN_STALK_SEEDS = REGISTRY.register("etauosian_grain_stalk_seeds", () -> new EtauosianGrainStalkSeedsItem());
	public static final RegistryObject<Item> STIRLING_ENGINE = REGISTRY.register(FaroutModBlocks.STIRLING_ENGINE.getId().getPath(), () -> new StirlingEngineDisplayItem(FaroutModBlocks.STIRLING_ENGINE.get(), new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
