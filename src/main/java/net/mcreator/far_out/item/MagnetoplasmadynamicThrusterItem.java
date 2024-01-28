
package net.mcreator.far_out.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MagnetoplasmadynamicThrusterItem extends Item {
	public MagnetoplasmadynamicThrusterItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Fuel source: Lithium"));
		list.add(Component.literal("Exhaust velocity: 31,000 m/s"));
		list.add(Component.literal("Power needed: 2000 kW"));
	}
}
