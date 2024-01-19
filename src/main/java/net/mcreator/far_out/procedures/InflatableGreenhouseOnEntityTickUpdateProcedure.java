package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class InflatableGreenhouseOnEntityTickUpdateProcedure {
	public static void execute(double y, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getPersistentData().getDouble("X")), y, (entity.getPersistentData().getDouble("Z")));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("X")), y, (entity.getPersistentData().getDouble("Z")), _ent.getYRot(), _ent.getXRot());
		}
	}
}
