package net.mcreator.far_out.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.far_out.init.FaroutModItems;

public class CargoFairingWhitelistProcedure {
	public static boolean execute(ItemStack itemstack) {
		return !(itemstack.getItem() == FaroutModItems.STARSHIP_CORE.get() || itemstack.getItem() == FaroutModItems.SPACECRAFT_CONSTRUCTION_METERIALS.get() || itemstack.getItem() == FaroutModItems.HIGH_HEAT_LOAD_GRAPHINE_RADIATORS.get()
				|| itemstack.getItem() == FaroutModItems.LANDER_BAY.get() || itemstack.getItem() == FaroutModItems.CARGO_CONTAINER.get() || itemstack.getItem() == FaroutModItems.INTERSTELLAR_HABITATION_MODULE.get()
				|| itemstack.getItem() == FaroutModItems.FISSION_FRAGMENT_FUEL_TANK.get() || itemstack.getItem() == FaroutModItems.FISSION_FRAGMENT_ENGINE.get());
	}
}
