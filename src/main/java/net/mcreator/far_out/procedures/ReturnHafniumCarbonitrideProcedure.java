package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnHafniumCarbonitrideProcedure {
	public static String execute(LevelAccessor world) {
		return "Hafnium carbonitride: " + FaroutModVariables.MapVariables.get(world).HafniumCarbonitrideNumber;
	}
}
