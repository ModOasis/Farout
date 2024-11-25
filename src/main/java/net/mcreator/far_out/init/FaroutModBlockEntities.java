
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.far_out.block.entity.ZPinchFusionReactorBlockEntity;
import net.mcreator.far_out.block.entity.TokamakfusionreactorBlockEntity;
import net.mcreator.far_out.block.entity.StirlingEngineTileEntity;
import net.mcreator.far_out.block.entity.SteamGeneratorBlockEntity;
import net.mcreator.far_out.block.entity.SolarPanelsBlockEntity;
import net.mcreator.far_out.block.entity.RocketAssemblyManagerBlockEntity;
import net.mcreator.far_out.block.entity.RocketAssemblerTileEntity;
import net.mcreator.far_out.block.entity.RadioisotopeThermoelectricGeneratorBlockEntity;
import net.mcreator.far_out.block.entity.ROMProgrammerBlockEntity;
import net.mcreator.far_out.block.entity.PlutoniumFuelRodBundleBlockEntity;
import net.mcreator.far_out.block.entity.NuclearReactorBlockEntity;
import net.mcreator.far_out.block.entity.MusniusSaplingBlockEntity;
import net.mcreator.far_out.block.entity.MethanePolymerizerBlockEntity;
import net.mcreator.far_out.block.entity.MatterAntimatterCompressorBlockEntity;
import net.mcreator.far_out.block.entity.LightWaterModerationTanksBlockEntity;
import net.mcreator.far_out.block.entity.KempatSaplingBlockEntity;
import net.mcreator.far_out.block.entity.IntegratedCircuitFabricatorBlockEntity;
import net.mcreator.far_out.block.entity.HydrogenFuelCellBlockEntity;
import net.mcreator.far_out.block.entity.HeatPipeBlockEntity;
import net.mcreator.far_out.block.entity.HeatPipeBentBlockEntity;
import net.mcreator.far_out.block.entity.ElectrolyzerBlockEntity;
import net.mcreator.far_out.block.entity.DesktopComputerBlockEntity;
import net.mcreator.far_out.block.entity.DesigningWorkbenchBlockEntity;
import net.mcreator.far_out.block.entity.CrudeSeebeckGeneratorBlockEntity;
import net.mcreator.far_out.block.entity.CopperCableBlockEntity;
import net.mcreator.far_out.block.entity.ChemistryWorkbenchBlockEntity;
import net.mcreator.far_out.block.entity.ChacoavinesBlockEntity;
import net.mcreator.far_out.block.entity.ChacoaBlockEntity;
import net.mcreator.far_out.block.entity.CardboardboxBlockEntity;
import net.mcreator.far_out.block.entity.BreathableAirBlockEntity;
import net.mcreator.far_out.block.entity.AtmosphericLiquidfierBlockEntity;
import net.mcreator.far_out.FaroutMod;

public class FaroutModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FaroutMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TOKAMAKFUSIONREACTOR = register("tokamakfusionreactor", FaroutModBlocks.TOKAMAKFUSIONREACTOR, TokamakfusionreactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CARDBOARDBOX = register("cardboardbox", FaroutModBlocks.CARDBOARDBOX, CardboardboxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHACOA = register("chacoa", FaroutModBlocks.CHACOA, ChacoaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHACOAVINES = register("chacoavines", FaroutModBlocks.CHACOAVINES, ChacoavinesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESKTOP_COMPUTER = register("desktop_computer", FaroutModBlocks.DESKTOP_COMPUTER, DesktopComputerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTROLYZER = register("electrolyzer", FaroutModBlocks.ELECTROLYZER, ElectrolyzerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INTEGRATED_CIRCUIT_FABRICATOR = register("integrated_circuit_fabricator", FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR, IntegratedCircuitFabricatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> Z_PINCH_FUSION_REACTOR = register("z_pinch_fusion_reactor", FaroutModBlocks.Z_PINCH_FUSION_REACTOR, ZPinchFusionReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HYDROGEN_FUEL_CELL = register("hydrogen_fuel_cell", FaroutModBlocks.HYDROGEN_FUEL_CELL, HydrogenFuelCellBlockEntity::new);
	public static final RegistryObject<BlockEntityType<StirlingEngineTileEntity>> STIRLING_ENGINE = REGISTRY.register("stirling_engine",
			() -> BlockEntityType.Builder.of(StirlingEngineTileEntity::new, FaroutModBlocks.STIRLING_ENGINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> MUSNIUS_SAPLING = register("musnius_sapling", FaroutModBlocks.MUSNIUS_SAPLING, MusniusSaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESIGNING_WORKBENCH = register("designing_workbench", FaroutModBlocks.DESIGNING_WORKBENCH, DesigningWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROCKET_ASSEMBLY_MANAGER = register("rocket_assembly_manager", FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER, RocketAssemblyManagerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<RocketAssemblerTileEntity>> ROCKET_ASSEMBLER = REGISTRY.register("rocket_assembler",
			() -> BlockEntityType.Builder.of(RocketAssemblerTileEntity::new, FaroutModBlocks.ROCKET_ASSEMBLER.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANELS = register("solar_panels", FaroutModBlocks.SOLAR_PANELS, SolarPanelsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METHANE_POLYMERIZER = register("methane_polymerizer", FaroutModBlocks.METHANE_POLYMERIZER, MethanePolymerizerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NUCLEAR_REACTOR = register("nuclear_reactor", FaroutModBlocks.NUCLEAR_REACTOR, NuclearReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> KEMPAT_SAPLING = register("kempat_sapling", FaroutModBlocks.KEMPAT_SAPLING, KempatSaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MATTER_ANTIMATTER_COMPRESSOR = register("matter_antimatter_compressor", FaroutModBlocks.MATTER_ANTIMATTER_COMPRESSOR, MatterAntimatterCompressorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROM_PROGRAMMER = register("rom_programmer", FaroutModBlocks.ROM_PROGRAMMER, ROMProgrammerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HEAT_PIPE = register("heat_pipe", FaroutModBlocks.HEAT_PIPE, HeatPipeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUTONIUM_FUEL_ROD_BUNDLE = register("plutonium_fuel_rod_bundle", FaroutModBlocks.PLUTONIUM_FUEL_ROD_BUNDLE, PlutoniumFuelRodBundleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HEAT_PIPE_BENT = register("heat_pipe_bent", FaroutModBlocks.HEAT_PIPE_BENT, HeatPipeBentBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BREATHABLE_AIR = register("breathable_air", FaroutModBlocks.BREATHABLE_AIR, BreathableAirBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LIGHT_WATER_MODERATION_TANKS = register("light_water_moderation_tanks", FaroutModBlocks.LIGHT_WATER_MODERATION_TANKS, LightWaterModerationTanksBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STEAM_GENERATOR = register("steam_generator", FaroutModBlocks.STEAM_GENERATOR, SteamGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COPPER_CABLE = register("copper_cable", FaroutModBlocks.COPPER_CABLE, CopperCableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RADIOISOTOPE_THERMOELECTRIC_GENERATOR = register("radioisotope_thermoelectric_generator", FaroutModBlocks.RADIOISOTOPE_THERMOELECTRIC_GENERATOR,
			RadioisotopeThermoelectricGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRUDE_SEEBECK_GENERATOR = register("crude_seebeck_generator", FaroutModBlocks.CRUDE_SEEBECK_GENERATOR, CrudeSeebeckGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ATMOSPHERIC_LIQUIDFIER = register("atmospheric_liquidfier", FaroutModBlocks.ATMOSPHERIC_LIQUIDFIER, AtmosphericLiquidfierBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHEMISTRY_WORKBENCH = register("chemistry_workbench", FaroutModBlocks.CHEMISTRY_WORKBENCH, ChemistryWorkbenchBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
