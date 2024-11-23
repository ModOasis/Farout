package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.far_out.network.FaroutModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class SetWattagesProcedureProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		FaroutModVariables.WorldVariables.get(world).WattageProduced = DoubleArgumentType.getDouble(arguments, "Producing");
		FaroutModVariables.WorldVariables.get(world).syncData(world);
		FaroutModVariables.WorldVariables.get(world).WattageUsed = DoubleArgumentType.getDouble(arguments, "Usage");
		FaroutModVariables.WorldVariables.get(world).syncData(world);
	}
}
