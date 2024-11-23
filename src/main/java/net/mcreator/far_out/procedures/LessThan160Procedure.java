package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Angle;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;

public class LessThan160Procedure {
	public static boolean execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return false;
		double Angle = 0;
		double X = 0;
		double Z = 0;
		double Direct = 0;
		Angle = entity.getYRot() - (Math.atan((FaroutModVariables.MapVariables.get(world).GatewayZ - z) / (FaroutModVariables.MapVariables.get(world).GatewayX - x)) * (180 / 3.14) + 90);
		return Angle < 160;
	}
}
