
package net.mcreator.far_out.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.far_out.procedures.SmallAtmosphericLanderRightclickedOnBlockProcedure;

public class SmallAtmosphericLanderItem extends Item {
	public SmallAtmosphericLanderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SmallAtmosphericLanderRightclickedOnBlockProcedure.execute(context.getLevel(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
