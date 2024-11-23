
package net.mcreator.far_out.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpaceshipBlueprintItem extends Item {
	public SpaceshipBlueprintItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
