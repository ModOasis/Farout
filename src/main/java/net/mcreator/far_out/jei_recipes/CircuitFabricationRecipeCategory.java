
package net.mcreator.far_out.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.far_out.init.FaroutModJeiPlugin;
import net.mcreator.far_out.init.FaroutModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class CircuitFabricationRecipeCategory implements IRecipeCategory<CircuitFabricationRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("farout", "circuit_fabrication");
	public final static ResourceLocation TEXTURE = new ResourceLocation("farout", "textures/screens/circuit_fabrication_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public CircuitFabricationRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 208, 85);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(FaroutModBlocks.INTEGRATED_CIRCUIT_FABRICATOR.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<CircuitFabricationRecipe> getRecipeType() {
		return FaroutModJeiPlugin.CircuitFabrication_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Circuit Fabrication");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, CircuitFabricationRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 41, 26).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 41, 53).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 140, 35).addItemStack(recipe.getResultItem(null));
	}
}
