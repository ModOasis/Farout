package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class FairingGUIValueDeltaVProcedure {
	public static String execute(LevelAccessor world) {
		return "Delta-V:" + FaroutModVariables.MapVariables.get(world).DV;
	}
}
