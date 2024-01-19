package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.far_out.network.FaroutModVariables;

public class TestOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = "00000000S";
		FaroutModVariables.WorldVariables.get(world).syncData(world);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("Set interstellar vessel progress to: COMPLETE"), false);
	}
}
