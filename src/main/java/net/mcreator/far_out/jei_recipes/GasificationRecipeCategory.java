
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

public class GasificationRecipeCategory implements IRecipeCategory<GasificationRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("farout", "gasification");
	public final static ResourceLocation TEXTURE = new ResourceLocation("farout", "textures/screens/coal_gasification_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public GasificationRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 87);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(FaroutModBlocks.COAL_GASIFICATION_REACTOR.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<GasificationRecipe> getRecipeType() {
		return FaroutModJeiPlugin.Gasification_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Gasification");
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
	public void setRecipe(IRecipeLayoutBuilder builder, GasificationRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 15, 16).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 15, 52).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 132, 16).addItemStack(recipe.getResultItem(null));
	}
}
