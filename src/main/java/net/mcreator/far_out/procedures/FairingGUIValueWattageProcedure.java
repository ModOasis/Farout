package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class FairingGUIValueWattageProcedure {
	public static String execute(LevelAccessor world) {
		return "Total Wattage:" + FaroutModVariables.MapVariables.get(world).SpacecraftWatts;
	}
}
