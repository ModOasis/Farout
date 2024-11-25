package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.DoubleTag;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.FaroutMod;

public class SendItProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftHab.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof DoubleTag _doubleTag ? _doubleTag.getAsDouble() : 0.0D;
			(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TransitHabitation = _setval;
				capability.syncPlayerVariables((entity.getFirstPassenger()));
			});
		}
		{
			double _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftRequiredDeltaV.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof DoubleTag _doubleTag ? _doubleTag.getAsDouble() : 0.0D;
			(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TransitTransferDeltaV = _setval;
				capability.syncPlayerVariables((entity.getFirstPassenger()));
			});
		}
		{
			double _setval = ((FaroutModVariables.WorldVariables.get(world).SpacecraftDeltav.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof DoubleTag _doubleTag ? _doubleTag.getAsDouble() : 0.0D)
					- (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).TransitTransferDeltaV;
			(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TransitDeltaV = _setval;
				capability.syncPlayerVariables((entity.getFirstPassenger()));
			});
		}
		{
			String _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftDestinationPlanet.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
			(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TransitDestination = _setval;
				capability.syncPlayerVariables((entity.getFirstPassenger()));
			});
		}
		{
			String _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftDeparturePlanet.get((entity.getPersistentData().getString("SpacecraftName")))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
			(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TransitSource = _setval;
				capability.syncPlayerVariables((entity.getFirstPassenger()));
			});
		}
		{
			String _setval = entity.getPersistentData().getString("SpacecraftName");
			(entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.TransitName = _setval;
				capability.syncPlayerVariables((entity.getFirstPassenger()));
			});
		}
		FaroutModVariables.WorldVariables.get(world).SpacecraftHab.remove((entity.getPersistentData().getString("SpacecraftName")));
		FaroutModVariables.WorldVariables.get(world).SpacecraftDeltav.remove((entity.getPersistentData().getString("SpacecraftName")));
		FaroutModVariables.WorldVariables.get(world).SpacecraftRequiredDeltaV.remove((entity.getPersistentData().getString("SpacecraftName")));
		FaroutModVariables.WorldVariables.get(world).SpacecraftDestinationPlanet.remove((entity.getPersistentData().getString("SpacecraftName")));
		FaroutModVariables.WorldVariables.get(world).SpacecraftDeparturePlanet.remove((entity.getPersistentData().getString("SpacecraftName")));
		FaroutMod.LOGGER.info(((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).TransitDestination);
		{
			Entity _ent = (entity.getFirstPassenger());
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						("execute in farout:" + ((entity.getFirstPassenger()).getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).TransitDestination + " run tp ~ 1000 ~"));
			}
		}
	}
}
