
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.far_out.fluid.types.SulfuricAcidFluidType;
import net.mcreator.far_out.fluid.types.SaltwaterFluidType;
import net.mcreator.far_out.fluid.types.LiquidSulfurDioxideFluidType;
import net.mcreator.far_out.fluid.types.LiquidMethaneFluidType;
import net.mcreator.far_out.fluid.types.LiquidAmmoniaFluidType;
import net.mcreator.far_out.fluid.types.GreenOilFluidType;
import net.mcreator.far_out.fluid.types.DryWaterFluidType;
import net.mcreator.far_out.fluid.types.ChlorellaCultureFluidType;
import net.mcreator.far_out.fluid.types.AqueousAmmoniaFluidType;
import net.mcreator.far_out.FaroutMod;

public class FaroutModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, FaroutMod.MODID);
	public static final RegistryObject<FluidType> SALTWATER_TYPE = REGISTRY.register("saltwater", () -> new SaltwaterFluidType());
	public static final RegistryObject<FluidType> SULFURIC_ACID_TYPE = REGISTRY.register("sulfuric_acid", () -> new SulfuricAcidFluidType());
	public static final RegistryObject<FluidType> GREEN_OIL_TYPE = REGISTRY.register("green_oil", () -> new GreenOilFluidType());
	public static final RegistryObject<FluidType> LIQUID_AMMONIA_TYPE = REGISTRY.register("liquid_ammonia", () -> new LiquidAmmoniaFluidType());
	public static final RegistryObject<FluidType> CHLORELLA_CULTURE_TYPE = REGISTRY.register("chlorella_culture", () -> new ChlorellaCultureFluidType());
	public static final RegistryObject<FluidType> DRY_WATER_TYPE = REGISTRY.register("dry_water", () -> new DryWaterFluidType());
	public static final RegistryObject<FluidType> LIQUID_SULFUR_DIOXIDE_TYPE = REGISTRY.register("liquid_sulfur_dioxide", () -> new LiquidSulfurDioxideFluidType());
	public static final RegistryObject<FluidType> AQUEOUS_AMMONIA_TYPE = REGISTRY.register("aqueous_ammonia", () -> new AqueousAmmoniaFluidType());
	public static final RegistryObject<FluidType> LIQUID_METHANE_TYPE = REGISTRY.register("liquid_methane", () -> new LiquidMethaneFluidType());
}
