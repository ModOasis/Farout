
package net.mcreator.far_out.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.far_out.jei_recipes.PolymerizationRecipeCategory;
import net.mcreator.far_out.jei_recipes.PolymerizationRecipe;
import net.mcreator.far_out.jei_recipes.NuclearIrradiationRecipeCategory;
import net.mcreator.far_out.jei_recipes.NuclearIrradiationRecipe;
import net.mcreator.far_out.jei_recipes.NuclearFusionJEIRecipeCategory;
import net.mcreator.far_out.jei_recipes.NuclearFusionJEIRecipe;
import net.mcreator.far_out.jei_recipes.NuclearFissionRecipeCategory;
import net.mcreator.far_out.jei_recipes.NuclearFissionRecipe;
import net.mcreator.far_out.jei_recipes.GraphiteModerationRecipeCategory;
import net.mcreator.far_out.jei_recipes.GraphiteModerationRecipe;
import net.mcreator.far_out.jei_recipes.GasificationRecipeCategory;
import net.mcreator.far_out.jei_recipes.GasificationRecipe;
import net.mcreator.far_out.jei_recipes.ElectrolysisRecipeCategory;
import net.mcreator.far_out.jei_recipes.ElectrolysisRecipe;
import net.mcreator.far_out.jei_recipes.CircuitFabricationRecipeCategory;
import net.mcreator.far_out.jei_recipes.CircuitFabricationRecipe;
import net.mcreator.far_out.jei_recipes.ChemicalReactionsRecipeCategory;
import net.mcreator.far_out.jei_recipes.ChemicalReactionsRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class FaroutModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<ElectrolysisRecipe> Electrolysis_Type = new mezz.jei.api.recipe.RecipeType<>(ElectrolysisRecipeCategory.UID, ElectrolysisRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<GraphiteModerationRecipe> GraphiteModeration_Type = new mezz.jei.api.recipe.RecipeType<>(GraphiteModerationRecipeCategory.UID, GraphiteModerationRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<GasificationRecipe> Gasification_Type = new mezz.jei.api.recipe.RecipeType<>(GasificationRecipeCategory.UID, GasificationRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<PolymerizationRecipe> Polymerization_Type = new mezz.jei.api.recipe.RecipeType<>(PolymerizationRecipeCategory.UID, PolymerizationRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<NuclearFissionRecipe> NuclearFission_Type = new mezz.jei.api.recipe.RecipeType<>(NuclearFissionRecipeCategory.UID, NuclearFissionRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<NuclearIrradiationRecipe> NuclearIrradiation_Type = new mezz.jei.api.recipe.RecipeType<>(NuclearIrradiationRecipeCategory.UID, NuclearIrradiationRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<NuclearFusionJEIRecipe> NuclearFusionJEI_Type = new mezz.jei.api.recipe.RecipeType<>(NuclearFusionJEIRecipeCategory.UID, NuclearFusionJEIRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CircuitFabricationRecipe> CircuitFabrication_Type = new mezz.jei.api.recipe.RecipeType<>(CircuitFabricationRecipeCategory.UID, CircuitFabricationRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<ChemicalReactionsRecipe> ChemicalReactions_Type = new mezz.jei.api.recipe.RecipeType<>(ChemicalReactionsRecipeCategory.UID, ChemicalReactionsRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("farout:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ElectrolysisRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new GraphiteModerationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new GasificationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new PolymerizationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new NuclearFissionRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new NuclearIrradiationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new NuclearFusionJEIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CircuitFabricationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new ChemicalReactionsRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<ElectrolysisRecipe> ElectrolysisRecipes = recipeManager.getAllRecipesFor(ElectrolysisRecipe.Type.INSTANCE);
		registration.addRecipes(Electrolysis_Type, ElectrolysisRecipes);
		List<GraphiteModerationRecipe> GraphiteModerationRecipes = recipeManager.getAllRecipesFor(GraphiteModerationRecipe.Type.INSTANCE);
		registration.addRecipes(GraphiteModeration_Type, GraphiteModerationRecipes);
		List<GasificationRecipe> GasificationRecipes = recipeManager.getAllRecipesFor(GasificationRecipe.Type.INSTANCE);
		registration.addRecipes(Gasification_Type, GasificationRecipes);
		List<PolymerizationRecipe> PolymerizationRecipes = recipeManager.getAllRecipesFor(PolymerizationRecipe.Type.INSTANCE);
		registration.addRecipes(Polymerization_Type, PolymerizationRecipes);
		List<NuclearFissionRecipe> NuclearFissionRecipes = recipeManager.getAllRecipesFor(NuclearFissionRecipe.Type.INSTANCE);
		registration.addRecipes(NuclearFission_Type, NuclearFissionRecipes);
		List<NuclearIrradiationRecipe> NuclearIrradiationRecipes = recipeManager.getAllRecipesFor(NuclearIrradiationRecipe.Type.INSTANCE);
		registration.addRecipes(NuclearIrradiation_Type, NuclearIrradiationRecipes);
		List<NuclearFusionJEIRecipe> NuclearFusionJEIRecipes = recipeManager.getAllRecipesFor(NuclearFusionJEIRecipe.Type.INSTANCE);
		registration.addRecipes(NuclearFusionJEI_Type, NuclearFusionJEIRecipes);
		List<CircuitFabricationRecipe> CircuitFabricationRecipes = recipeManager.getAllRecipesFor(CircuitFabricationRecipe.Type.INSTANCE);
		registration.addRecipes(CircuitFabrication_Type, CircuitFabricationRecipes);
		List<ChemicalReactionsRecipe> ChemicalReactionsRecipes = recipeManager.getAllRecipesFor(ChemicalReactionsRecipe.Type.INSTANCE);
		registration.addRecipes(ChemicalReactions_Type, ChemicalReactionsRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
	}
}
