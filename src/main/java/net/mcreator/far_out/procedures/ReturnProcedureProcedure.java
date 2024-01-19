package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.far_out.network.FaroutModVariables;

public class ReturnProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands()
						.performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("execute in " + (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).DepartureBody + " run tp @s ~ ~ ~"));
			}
		}
	}
}
