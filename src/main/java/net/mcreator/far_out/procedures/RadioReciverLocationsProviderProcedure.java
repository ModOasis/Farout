package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class RadioReciverLocationsProviderProcedure {
	public static String execute(LevelAccessor world) {
		return "X: " + FaroutModVariables.MapVariables.get(world).EtauosBaseX + "Z :" + FaroutModVariables.MapVariables.get(world).EtauosBaseY;
	}
}
