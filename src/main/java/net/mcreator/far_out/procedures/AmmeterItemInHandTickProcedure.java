package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import net.mcreator.far_out.network.FaroutModVariables;

public class AmmeterItemInHandTickProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("" + FaroutModVariables.WorldVariables.get(world).Energy)), false);
	}
}
