package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.entity.AetherianConquerorEntity;

public class DoDialogProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity instanceof AetherianConquerorEntity _datEntL0 && _datEntL0.getEntityData().get(AetherianConquerorEntity.DATA_Dialog));
	}
}
