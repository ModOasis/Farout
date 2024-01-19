package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class FairingDeltaVProcedure {
	public static String execute(LevelAccessor world) {
		return "\u0394V:" + FaroutModVariables.MapVariables.get(world).FairingDeltaV;
	}
}
