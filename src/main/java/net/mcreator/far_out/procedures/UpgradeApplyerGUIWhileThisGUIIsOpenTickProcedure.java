package net.mcreator.far_out.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.CompoundTag;

import java.util.function.Supplier;
import java.util.Map;

public class UpgradeApplyerGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			CompoundTag _nbtTag = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getTag();
			if (_nbtTag != null)
				(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).setTag(_nbtTag.copy());
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(0)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
	}
}
