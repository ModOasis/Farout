
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
import net.mcreator.far_out.block.entity.RocketAssemblyManagerBlockEntity;
import net.mcreator.far_out.block.entity.RocketAssemblerTileEntity;
import net.mcreator.far_out.block.entity.MusniusSaplingBlockEntity;
import net.mcreator.far_out.block.entity.LargeSolarPanelsBlockEntity;
import net.mcreator.far_out.block.entity.IntegratedCircuitFabricatorBlockEntity;
import net.mcreator.far_out.block.entity.HydrogenFuelCellBlockEntity;
import net.mcreator.far_out.block.entity.ElectrolyzerBlockEntity;
import net.mcreator.far_out.block.entity.DesktopComputerBlockEntity;
import net.mcreator.far_out.block.entity.DesigningWorkbenchBlockEntity;
import net.mcreator.far_out.block.entity.ChemicalReactorBlockEntity;
import net.mcreator.far_out.block.entity.ChacoavinesBlockEntity;
import net.mcreator.far_out.block.entity.ChacoaBlockEntity;
import net.mcreator.far_out.block.entity.CardboardboxBlockEntity;
import net.mcreator.far_out.FaroutMod;

public class FaroutModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FaroutMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DESKTOP_COMPUTER = register("desktop_computer", FaroutModBlocks.DESKTOP_COMPUTER, DesktopComputerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTROLYZER = register("electrolyzer", FaroutModBlocks.ELECTROLYZER, ElectrolyzerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOKAMAKFUSIONREACTOR = register("tokamakfusionreactor", FaroutModBlocks.TOKAMAKFUSIONREACTOR, TokamakfusionreactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_SOLAR_PANELS = register("large_solar_panels", FaroutModBlocks.LARGE_SOLAR_PANELS, LargeSolarPanelsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CARDBOARDBOX = register("cardboardbox", FaroutModBlocks.CARDBOARDBOX, CardboardboxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHACOA = register("chacoa", FaroutModBlocks.CHACOA, ChacoaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHACOAVINES = register("chacoavines", FaroutModBlocks.CHACOAVINES, ChacoavinesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INTEGRATED_CIRCUIT_FABRICATOR = register("integrated_circuit_fabricator", FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR, IntegratedCircuitFabricatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHEMICAL_REACTOR = register("chemical_reactor", FaroutModBlocks.CHEMICAL_REACTOR, ChemicalReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> Z_PINCH_FUSION_REACTOR = register("z_pinch_fusion_reactor", FaroutModBlocks.Z_PINCH_FUSION_REACTOR, ZPinchFusionReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HYDROGEN_FUEL_CELL = register("hydrogen_fuel_cell", FaroutModBlocks.HYDROGEN_FUEL_CELL, HydrogenFuelCellBlockEntity::new);
	public static final RegistryObject<BlockEntityType<StirlingEngineTileEntity>> STIRLING_ENGINE = REGISTRY.register("stirling_engine",
			() -> BlockEntityType.Builder.of(StirlingEngineTileEntity::new, FaroutModBlocks.STIRLING_ENGINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> MUSNIUS_SAPLING = register("musnius_sapling", FaroutModBlocks.MUSNIUS_SAPLING, MusniusSaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESIGNING_WORKBENCH = register("designing_workbench", FaroutModBlocks.DESIGNING_WORKBENCH, DesigningWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROCKET_ASSEMBLY_MANAGER = register("rocket_assembly_manager", FaroutModBlocks.ROCKET_ASSEMBLY_MANAGER, RocketAssemblyManagerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<RocketAssemblerTileEntity>> ROCKET_ASSEMBLER = REGISTRY.register("rocket_assembler",
			() -> BlockEntityType.Builder.of(RocketAssemblerTileEntity::new, FaroutModBlocks.ROCKET_ASSEMBLER.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
