
package net.mcreator.far_out.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.far_out.init.FaroutModFluids;

public class AqueousAmmoniaItem extends BucketItem {
	public AqueousAmmoniaItem() {
		super(FaroutModFluids.AQUEOUS_AMMONIA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
