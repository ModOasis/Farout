package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Mass;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CalculateHabTimeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Mass = 0;
		double HabitationTime = 0;
		if (FaroutModItems.BASIC_HAB_MODULE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem()) {
			FaroutModVariables.MapVariables.get(world).Hab = 5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		} else if (FaroutModItems.INFLATABLE_HABITAT.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			FaroutModVariables.MapVariables.get(world).Hab = 50;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		} else if (FaroutModItems.INFLATABLE_HAB_RING.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			FaroutModVariables.MapVariables.get(world).Hab = 200;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
