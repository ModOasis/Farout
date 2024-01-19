package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;

public class LanderPlayReturnedAnimationProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		if (0 < entity.getDeltaMovement().y()) {
			return "animation.lander.Liftoff";
		} else if (0 >= entity.getDeltaMovement().y()) {
			return "animation.lander.Landing";
		} else if ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch == 1) {
			return "animation.lander.RotateWest";
		} else if (false) {
			return "animation.lander.RotateToCenterWest";
		} else if ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch == -1) {
			return "animation.lander.RotateEast";
		} else if (false) {
			return "animation.lander.RotateToCenterEast";
		} else if ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch == 1) {
			return "animation.lander.RotateNorth";
		} else if (false) {
			return "animation.lander.RotateToCenterNorth";
		} else if ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Pitch == -1) {
			return "animation.lander.RotateSouth";
		} else if (false) {
			return "animation.lander.RotateToCenterSouth";
		}
		return "empty";
	}
}
