
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class FaroutModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == FaroutModBlocks.MUSNIUS_TREE_TRUNK.get().asItem())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == FaroutModItems.METHANE.get())
			event.setBurnTime(2400);
		else if (itemstack.getItem() == FaroutModItems.HYDROGEN.get())
			event.setBurnTime(3600);
		else if (itemstack.getItem() == FaroutModItems.METHANE.get())
			event.setBurnTime(2750);
	}
}
