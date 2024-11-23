
package net.mcreator.far_out.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RelayItem extends Item {
	public RelayItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
