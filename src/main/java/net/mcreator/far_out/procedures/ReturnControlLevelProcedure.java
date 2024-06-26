package net.mcreator.far_out.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class ReturnControlLevelProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("CompID") == 1
				? "Autonomous"
				: "Basic";
	}
}
