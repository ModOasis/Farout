package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.far_out.network.FaroutModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ConstructStarshipProcedureProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if ((StringArgumentType.getString(arguments, "SelectedSystem")).equals("Sandos")) {
			FaroutModVariables.MapVariables.get(world).MathAns = DoubleArgumentType.getDouble(arguments, "PartsSent") + "S";
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
