package net.mcreator.far_out.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.far_out.init.FaroutModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CargoFairingLoadProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String NBT = "";
		NBT = ForgeRegistries.ITEMS.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()).toString();
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(0)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (entity instanceof LivingEntity _entity) {
			ItemStack _setstack = new ItemStack(FaroutModItems.CARGO_FAIRING.get());
			_setstack.setCount(1);
			_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
			if (_entity instanceof Player _player)
				_player.getInventory().setChanged();
		}
		(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("Payload", NBT);
	}
}
