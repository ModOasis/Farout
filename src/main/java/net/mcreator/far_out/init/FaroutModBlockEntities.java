
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
import net.mcreator.far_out.block.entity.SporeBerrieBlockBlockEntity;
import net.mcreator.far_out.block.entity.ParticleIonizerBlockEntity;
import net.mcreator.far_out.block.entity.NuclearReactorBlockEntity;
import net.mcreator.far_out.block.entity.LowFrequencyIntegratedCircuitFabricatorBlockEntity;
import net.mcreator.far_out.block.entity.LinearParticleAcceleratorBlockEntity;
import net.mcreator.far_out.block.entity.LargeSolarPanelsBlockEntity;
import net.mcreator.far_out.block.entity.IntegratedCircuitFabricatorBlockEntity;
import net.mcreator.far_out.block.entity.HydrogenFuelCellBlockEntity;
import net.mcreator.far_out.block.entity.HighFrequencyIntergratedCircutFabricatorBlockEntity;
import net.mcreator.far_out.block.entity.FungustrunkBlockEntity;
import net.mcreator.far_out.block.entity.FungusCapBlockEntity;
import net.mcreator.far_out.block.entity.ElectrolyzerBlockEntity;
import net.mcreator.far_out.block.entity.ChemicalReactorBlockEntity;
import net.mcreator.far_out.block.entity.ChacoavinesBlockEntity;
import net.mcreator.far_out.block.entity.ChacoaBlockEntity;
import net.mcreator.far_out.block.entity.CardboardboxBlockEntity;
import net.mcreator.far_out.block.entity.BiomassBurnerBlockEntity;
import net.mcreator.far_out.FaroutMod;

public class FaroutModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FaroutMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FUNGUSTRUNK = register("fungustrunk", FaroutModBlocks.FUNGUSTRUNK, FungustrunkBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FUNGUS_CAP = register("fungus_cap", FaroutModBlocks.FUNGUS_CAP, FungusCapBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTROLYZER = register("electrolyzer", FaroutModBlocks.ELECTROLYZER, ElectrolyzerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPORE_BERRIE_BLOCK = register("spore_berrie_block", FaroutModBlocks.SPORE_BERRIE_BLOCK, SporeBerrieBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NUCLEAR_REACTOR = register("nuclear_reactor", FaroutModBlocks.NUCLEAR_REACTOR, NuclearReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOKAMAKFUSIONREACTOR = register("tokamakfusionreactor", FaroutModBlocks.TOKAMAKFUSIONREACTOR, TokamakfusionreactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_SOLAR_PANELS = register("large_solar_panels", FaroutModBlocks.LARGE_SOLAR_PANELS, LargeSolarPanelsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIOMASS_BURNER = register("biomass_burner", FaroutModBlocks.BIOMASS_BURNER, BiomassBurnerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CARDBOARDBOX = register("cardboardbox", FaroutModBlocks.CARDBOARDBOX, CardboardboxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHACOA = register("chacoa", FaroutModBlocks.CHACOA, ChacoaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHACOAVINES = register("chacoavines", FaroutModBlocks.CHACOAVINES, ChacoavinesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INTEGRATED_CIRCUIT_FABRICATOR = register("integrated_circuit_fabricator", FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR, IntegratedCircuitFabricatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHEMICAL_REACTOR = register("chemical_reactor", FaroutModBlocks.CHEMICAL_REACTOR, ChemicalReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LOW_FREQUENCY_INTEGRATED_CIRCUIT_FABRICATOR = register("low_frequency_integrated_circuit_fabricator", FaroutModBlocks.LOW_FREQUENCY_INTEGRATED_CIRCUIT_FABRICATOR,
			LowFrequencyIntegratedCircuitFabricatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> Z_PINCH_FUSION_REACTOR = register("z_pinch_fusion_reactor", FaroutModBlocks.Z_PINCH_FUSION_REACTOR, ZPinchFusionReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HIGH_FREQUENCY_INTERGRATED_CIRCUT_FABRICATOR = register("high_frequency_intergrated_circut_fabricator", FaroutModBlocks.HIGH_FREQUENCY_INTERGRATED_CIRCUT_FABRICATOR,
			HighFrequencyIntergratedCircutFabricatorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LINEAR_PARTICLE_ACCELERATOR = register("linear_particle_accelerator", FaroutModBlocks.LINEAR_PARTICLE_ACCELERATOR, LinearParticleAcceleratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PARTICLE_IONIZER = register("particle_ionizer", FaroutModBlocks.PARTICLE_IONIZER, ParticleIonizerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HYDROGEN_FUEL_CELL = register("hydrogen_fuel_cell", FaroutModBlocks.HYDROGEN_FUEL_CELL, HydrogenFuelCellBlockEntity::new);
	public static final RegistryObject<BlockEntityType<StirlingEngineTileEntity>> STIRLING_ENGINE = REGISTRY.register("stirling_engine",
			() -> BlockEntityType.Builder.of(StirlingEngineTileEntity::new, FaroutModBlocks.STIRLING_ENGINE.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
