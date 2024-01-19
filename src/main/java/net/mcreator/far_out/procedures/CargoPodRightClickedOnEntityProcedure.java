package net.mcreator.far_out.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.far_out.init.FaroutModItems;

public class CargoPodRightClickedOnEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			final int _slotid = 0;
			final ItemStack _setstack = new ItemStack(FaroutModItems.EMERGENCY_RATIONS.get());
			_setstack.setCount(16);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 1;
			final ItemStack _setstack = new ItemStack(FaroutModItems.EMERGENCY_RATIONS.get());
			_setstack.setCount(16);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 2;
			final ItemStack _setstack = new ItemStack(FaroutModItems.CHEMICALS.get());
			_setstack.setCount(5);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		{
			final int _slotid = 3;
			final ItemStack _setstack = new ItemStack(FaroutModItems.ORGANIC_MOLECULES.get());
			_setstack.setCount(5);
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandler)
					_modHandler.setStackInSlot(_slotid, _setstack);
			});
		}
		if (entity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:supplies_intact"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
	}
}
