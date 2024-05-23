package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class CalculateWattageProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Watts = 0;
		if (FaroutModBlocks.HYDROGEN_FUEL_CELL.get().asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			FaroutModVariables.MapVariables.get(world).SpacecraftWatts = 100;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		} else if (FaroutModBlocks.NUCLEAR_REACTOR.get().asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			FaroutModVariables.MapVariables.get(world).SpacecraftWatts = 500;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		} else if (FaroutModBlocks.Z_PINCH_FUSION_REACTOR.get()
				.asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
			FaroutModVariables.MapVariables.get(world).SpacecraftWatts = 10000;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		} else if (FaroutModBlocks.TOKAMAKFUSIONREACTOR.get()
				.asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
			FaroutModVariables.MapVariables.get(world).SpacecraftWatts = 100000;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
