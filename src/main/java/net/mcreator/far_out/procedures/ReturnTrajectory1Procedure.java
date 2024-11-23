package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.IntTag;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnTrajectory1Procedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		double Offset = 0;
		Offset = 0;
		return FaroutModVariables.WorldVariables.get(world).SpacecraftNames.size() > (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0
				&& FaroutModVariables.WorldVariables.get(world).SpacecraftNames.size() > (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0
				&& FaroutModVariables.WorldVariables.get(world).SpacecraftNames.size() > (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0
						? "Route:"
								+ ((FaroutModVariables.WorldVariables.get(world).SpacecraftSource.get(
										(int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "")
								+ " <-> "
								+ ((FaroutModVariables.WorldVariables.get(world).SpacecraftDestination.get(
										(int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "")
								+ ", "
								+ ((FaroutModVariables.WorldVariables.get(world).SpacecraftTransferDeltaV
										.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 0))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0)
								+ " m/s Each way"
						: "";
	}
}
