package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Angle;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.far_out.network.FaroutModVariables;

public class FigureOutAngleProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		double Angle = 0;
		double X = 0;
		double Z = 0;
		double Direct = 0;
		double returnAngle = 0;
		Angle = entity.getYRot() - (Math.atan((FaroutModVariables.MapVariables.get(world).GatewayZ - z) / (FaroutModVariables.MapVariables.get(world).GatewayX - x)) * (180 / 3.14) + 180);
		if (entity.getYRot() - (Math.atan((FaroutModVariables.MapVariables.get(world).GatewayZ - z) / (FaroutModVariables.MapVariables.get(world).GatewayX - x)) * (180 / 3.14) + 180) >= 200) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("<" + " " + FaroutModVariables.MapVariables.get(world).GatewayX + " " + FaroutModVariables.MapVariables.get(world).GatewayZ)), true);
		} else if (entity.getYRot() - (Math.atan((FaroutModVariables.MapVariables.get(world).GatewayZ - z) / (FaroutModVariables.MapVariables.get(world).GatewayX - x)) * (180 / 3.14) + 180) <= 160) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal((">" + " " + FaroutModVariables.MapVariables.get(world).GatewayX + " " + FaroutModVariables.MapVariables.get(world).GatewayZ)), true);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("^" + " " + FaroutModVariables.MapVariables.get(world).GatewayX + " " + FaroutModVariables.MapVariables.get(world).GatewayZ)), true);
		}
	}
}
