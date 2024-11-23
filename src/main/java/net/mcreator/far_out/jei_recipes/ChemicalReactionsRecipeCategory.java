
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

public class ChemicalReactionsRecipeCategory implements IRecipeCategory<ChemicalReactionsRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("farout", "chemical_reactions");
	public final static ResourceLocation TEXTURE = new ResourceLocation("farout", "textures/screens/chemistry_workbench_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public ChemicalReactionsRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 166);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(FaroutModBlocks.CHEMISTRY_WORKBENCH.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<ChemicalReactionsRecipe> getRecipeType() {
		return FaroutModJeiPlugin.ChemicalReactions_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Chemistry");
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
	public void setRecipe(IRecipeLayoutBuilder builder, ChemicalReactionsRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 24, 0).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 24, 33).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 141, 16).addItemStack(recipe.getResultItem(null));
	}
}