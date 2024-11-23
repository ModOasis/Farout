
package net.mcreator.far_out.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.far_out.init.FaroutModJeiPlugin;
import net.mcreator.far_out.init.FaroutModItems;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class NuclearIrradiationRecipeCategory implements IRecipeCategory<NuclearIrradiationRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("farout", "nuclear_irradiation");
	public final static ResourceLocation TEXTURE = new ResourceLocation("farout", "textures/screens/irradiation.png");
	private final IDrawable background;
	private final IDrawable icon;

	public NuclearIrradiationRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(FaroutModItems.DEUTERIUM.get()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<NuclearIrradiationRecipe> getRecipeType() {
		return FaroutModJeiPlugin.NuclearIrradiation_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Nuclear Irradiation");
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
	public void setRecipe(IRecipeLayoutBuilder builder, NuclearIrradiationRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 42, 61).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 114, 61).addItemStack(recipe.getResultItem(null));
	}
}
