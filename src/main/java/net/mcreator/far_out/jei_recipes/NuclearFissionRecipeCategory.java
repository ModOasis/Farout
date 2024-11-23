
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

public class NuclearFissionRecipeCategory implements IRecipeCategory<NuclearFissionRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("farout", "nuclear_fission");
	public final static ResourceLocation TEXTURE = new ResourceLocation("farout", "textures/screens/nuclear_reactor_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public NuclearFissionRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 86);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(FaroutModBlocks.NUCLEAR_REACTOR.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<NuclearFissionRecipe> getRecipeType() {
		return FaroutModJeiPlugin.NuclearFission_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Nuclear Fission");
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
	public void setRecipe(IRecipeLayoutBuilder builder, NuclearFissionRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 42, 25).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 114, 25).addItemStack(recipe.getResultItem(null));
	}
}
