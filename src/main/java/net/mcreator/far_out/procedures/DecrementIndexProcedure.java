package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;

public class DecrementIndexProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (0 < FaroutModVariables.WorldVariables.get(world).SpacecraftNames.size()) {
			{
				double _setval = (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index - 3;
				entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Index = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
