package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.FaroutMod;

public class PrintDimensionProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		FaroutMod.LOGGER.debug((("" + entity.level().dimension()).substring(34, (int) (("" + entity.level().dimension()).length() - 1))));
	}
}
