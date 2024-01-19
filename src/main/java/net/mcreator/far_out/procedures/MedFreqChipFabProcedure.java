package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

public class MedFreqChipFabProcedure {
	public static void execute(LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).SelectedMicrochipRecipe = 3;
		FaroutModVariables.MapVariables.get(world).syncData(world);
	}
}
