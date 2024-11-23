package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

public class VerticalSpeedProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + Math.round((entity.getVehicle()).getDeltaMovement().y() * 10) / 10;
	}
}
