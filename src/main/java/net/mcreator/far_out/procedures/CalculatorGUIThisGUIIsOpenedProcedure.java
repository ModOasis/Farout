package net.mcreator.far_out.procedures;

import net.minecraft.world.item.ItemStack;

public class CalculatorGUIThisGUIIsOpenedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putString("Calculation", "");
	}
}
