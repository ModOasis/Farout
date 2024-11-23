package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.entity.LanderEntity;

public class LanderFlightGUIDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isPassenger() ? (entity.getVehicle()) instanceof LanderEntity : false;
	}
}
