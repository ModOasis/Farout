package net.mcreator.far_out.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.mcreator.far_out.jei_recipes.PolymerizationRecipe;
import net.mcreator.far_out.jei_recipes.NuclearIrradiationRecipe;
import net.mcreator.far_out.jei_recipes.NuclearFusionJEIRecipe;
import net.mcreator.far_out.jei_recipes.NuclearFissionRecipe;
import net.mcreator.far_out.jei_recipes.GraphiteModerationRecipe;
import net.mcreator.far_out.jei_recipes.GasificationRecipe;
import net.mcreator.far_out.jei_recipes.ElectrolysisRecipe;
import net.mcreator.far_out.jei_recipes.CircuitFabricationRecipe;
import net.mcreator.far_out.jei_recipes.ChemicalReactionsRecipe;
import net.mcreator.far_out.FaroutMod;

@Mod.EventBusSubscriber(modid = FaroutMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FaroutModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "farout");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("electrolysis", () -> ElectrolysisRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("graphite_moderation", () -> GraphiteModerationRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("gasification", () -> GasificationRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("polymerization", () -> PolymerizationRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("nuclear_fission", () -> NuclearFissionRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("nuclear_irradiation", () -> NuclearIrradiationRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("nuclear_fusion_jei", () -> NuclearFusionJEIRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("circuit_fabrication", () -> CircuitFabricationRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("chemical_reactions", () -> ChemicalReactionsRecipe.Serializer.INSTANCE);
		});
	}
}
