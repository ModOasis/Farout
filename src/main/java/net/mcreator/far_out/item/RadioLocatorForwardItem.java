
package net.mcreator.far_out.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.procedures.FigureOutAngleProcedure;

public class RadioLocatorForwardItem extends Item {
	public RadioLocatorForwardItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			FigureOutAngleProcedure.execute(world, entity.getX(), entity.getZ(), entity);
	}
}
