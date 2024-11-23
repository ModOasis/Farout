
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

public class PolymerizationRecipeCategory implements IRecipeCategory<PolymerizationRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("farout", "polymerization");
	public final static ResourceLocation TEXTURE = new ResourceLocation("farout", "textures/screens/methane_polymerizer_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public PolymerizationRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 87);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(FaroutModBlocks.METHANE_POLYMERIZER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<PolymerizationRecipe> getRecipeType() {
		return FaroutModJeiPlugin.Polymerization_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Polymerization");
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
	public void setRecipe(IRecipeLayoutBuilder builder, PolymerizationRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 15, 34).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 132, 34).addItemStack(recipe.getResultItem(null));
	}
}
