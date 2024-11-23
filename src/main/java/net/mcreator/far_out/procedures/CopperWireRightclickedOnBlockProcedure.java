package net.mcreator.far_out.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class CopperWireRightclickedOnBlockProcedure {
	public static void execute(double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!itemstack.getOrCreateTag().getBoolean("Started")) {
			itemstack.getOrCreateTag().putDouble("x", x);
			itemstack.getOrCreateTag().putDouble("y", y);
			itemstack.getOrCreateTag().putDouble("z", z);
			itemstack.getOrCreateTag().putBoolean("Started", true);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Right click on another block to establish electrical connection"), true);
		} else {
			itemstack.getOrCreateTag().putDouble("x1", x);
			itemstack.getOrCreateTag().putDouble("y1", y);
			itemstack.getOrCreateTag().putDouble("z1", z);
		}
	}
}
