package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class RocketOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double AccY = 0;
		double AccX = 0;
		double AccNormal = 0;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((" Delta V:" + entity.getPersistentData().getDouble("Delta-V") + " Orbit Capable:" + entity.getPersistentData().getBoolean("OrbitCapable"))), false);
	}
}
