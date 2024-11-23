package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.IntTag;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModGameRules;

import java.util.function.Supplier;
import java.util.Map;

public class OnTradeEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String ItemAmount = "";
		String ItemPrice = "";
		double InitalSupply = 0;
		ItemAmount = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY) + "_Amount";
		ItemPrice = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY) + "_Price";
		if (FaroutModVariables.MapVariables.get(world).Economy.contains(ItemAmount) && FaroutModVariables.MapVariables.get(world).Economy.contains(ItemPrice)) {
			FaroutModVariables.MapVariables.get(world).Economy.put(ItemAmount, IntTag.valueOf((world.getLevelData().getGameRules().getInt(FaroutModGameRules.ECONOMY_SIZE))));
			FaroutModVariables.MapVariables.get(world).Economy.put(ItemPrice, IntTag.valueOf(10));
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY).getItem() == FaroutModItems.TRIHASSIAN_CURRENCY.get()) {
			FaroutModVariables.MapVariables.get(world).Economy.put(ItemPrice, IntTag.valueOf((int) PriceFunctionProcedure.execute()));
			FaroutModVariables.MapVariables.get(world).Economy.put(ItemAmount, IntTag.valueOf((int) (((FaroutModVariables.MapVariables.get(world).Economy.get(ItemAmount)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0) + new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(8) / ((FaroutModVariables.MapVariables.get(world).Economy.get(ItemPrice)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0))));
		} else {
			FaroutModVariables.MapVariables.get(world).Economy.put(ItemPrice, IntTag.valueOf((int) PriceFunctionProcedure.execute()));
			FaroutModVariables.MapVariables.get(world).Economy.put(ItemAmount, IntTag.valueOf((int) (((FaroutModVariables.MapVariables.get(world).Economy.get(ItemAmount)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0) - new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(8) / ((FaroutModVariables.MapVariables.get(world).Economy.get(ItemPrice)) instanceof IntTag _intTag ? _intTag.getAsInt() : 0))));
		}
	}
}
