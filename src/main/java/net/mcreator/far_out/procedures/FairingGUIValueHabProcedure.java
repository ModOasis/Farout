package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class FairingGUIValueHabProcedure {
	public static String execute(LevelAccessor world) {
		return "Hab Time:" + FaroutModVariables.MapVariables.get(world).Hab;
	}
}
