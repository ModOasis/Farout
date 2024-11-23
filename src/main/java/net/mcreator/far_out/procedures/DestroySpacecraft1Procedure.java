package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;

public class DestroySpacecraft1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String OperatingString = "";
		if (FaroutModVariables.WorldVariables.get(world).SpacecraftNames.size() > (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0) {
			FaroutModVariables.WorldVariables.get(world).SpacecraftNames.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0));
			FaroutModVariables.WorldVariables.get(world).SpacecraftHabitiationTime.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0));
			FaroutModVariables.WorldVariables.get(world).SpacecraftDeltaV.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0));
			FaroutModVariables.WorldVariables.get(world).SpacecraftDestination.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0));
			FaroutModVariables.WorldVariables.get(world).SpacecraftSource.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0));
			FaroutModVariables.WorldVariables.get(world).SpacecraftTransferDeltaV.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0));
			FaroutModVariables.WorldVariables.get(world).SpacecraftDirection.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0));
		}
	}
}
