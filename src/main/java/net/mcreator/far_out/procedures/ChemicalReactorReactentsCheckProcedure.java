package net.mcreator.far_out.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.far_out.init.FaroutModItems;

public class ChemicalReactorReactentsCheckProcedure {
	public static boolean execute(ItemStack itemstack) {
		if (FaroutModItems.CHEMICALS.get() == itemstack.getItem() && FaroutModItems.ORGANIC_MOLECULES.get() == itemstack.getItem()) {
			return true;
		}
		return false;
	}
}
