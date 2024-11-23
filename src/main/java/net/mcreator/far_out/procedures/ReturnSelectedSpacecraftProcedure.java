package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

public class ReturnSelectedSpacecraftProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.isPassenger() ? (entity.getVehicle()).getPersistentData().getString("SpacecraftName") : "";
	}
}
