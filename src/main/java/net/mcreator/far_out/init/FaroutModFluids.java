
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.far_out.fluid.SulfuricAcidFluid;
import net.mcreator.far_out.fluid.SaltwaterFluid;
import net.mcreator.far_out.fluid.LiquidSulfurDioxideFluid;
import net.mcreator.far_out.fluid.LiquidAmmoniaFluid;
import net.mcreator.far_out.fluid.GreenOilFluid;
import net.mcreator.far_out.fluid.DryWaterFluid;
import net.mcreator.far_out.fluid.ChlorellaCultureFluid;
import net.mcreator.far_out.fluid.AqueousAmmoniaFluid;
import net.mcreator.far_out.FaroutMod;

public class FaroutModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, FaroutMod.MODID);
	public static final RegistryObject<FlowingFluid> SALTWATER = REGISTRY.register("saltwater", () -> new SaltwaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SALTWATER = REGISTRY.register("flowing_saltwater", () -> new SaltwaterFluid.Flowing());
	public static final RegistryObject<FlowingFluid> SULFURIC_ACID = REGISTRY.register("sulfuric_acid", () -> new SulfuricAcidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SULFURIC_ACID = REGISTRY.register("flowing_sulfuric_acid", () -> new SulfuricAcidFluid.Flowing());
	public static final RegistryObject<FlowingFluid> GREEN_OIL = REGISTRY.register("green_oil", () -> new GreenOilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_GREEN_OIL = REGISTRY.register("flowing_green_oil", () -> new GreenOilFluid.Flowing());
	public static final RegistryObject<FlowingFluid> LIQUID_AMMONIA = REGISTRY.register("liquid_ammonia", () -> new LiquidAmmoniaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_AMMONIA = REGISTRY.register("flowing_liquid_ammonia", () -> new LiquidAmmoniaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CHLORELLA_CULTURE = REGISTRY.register("chlorella_culture", () -> new ChlorellaCultureFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CHLORELLA_CULTURE = REGISTRY.register("flowing_chlorella_culture", () -> new ChlorellaCultureFluid.Flowing());
	public static final RegistryObject<FlowingFluid> DRY_WATER = REGISTRY.register("dry_water", () -> new DryWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_DRY_WATER = REGISTRY.register("flowing_dry_water", () -> new DryWaterFluid.Flowing());
	public static final RegistryObject<FlowingFluid> LIQUID_SULFUR_DIOXIDE = REGISTRY.register("liquid_sulfur_dioxide", () -> new LiquidSulfurDioxideFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_SULFUR_DIOXIDE = REGISTRY.register("flowing_liquid_sulfur_dioxide", () -> new LiquidSulfurDioxideFluid.Flowing());
	public static final RegistryObject<FlowingFluid> AQUEOUS_AMMONIA = REGISTRY.register("aqueous_ammonia", () -> new AqueousAmmoniaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_AQUEOUS_AMMONIA = REGISTRY.register("flowing_aqueous_ammonia", () -> new AqueousAmmoniaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SALTWATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SALTWATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SULFURIC_ACID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SULFURIC_ACID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GREEN_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GREEN_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIQUID_AMMONIA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_AMMONIA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CHLORELLA_CULTURE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHLORELLA_CULTURE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(DRY_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DRY_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LIQUID_SULFUR_DIOXIDE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_SULFUR_DIOXIDE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(AQUEOUS_AMMONIA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_AQUEOUS_AMMONIA.get(), RenderType.translucent());
		}
	}
}
