
package net.mcreator.far_out.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterCollectorBlueprintItem extends Item {
	public AntimatterCollectorBlueprintItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
