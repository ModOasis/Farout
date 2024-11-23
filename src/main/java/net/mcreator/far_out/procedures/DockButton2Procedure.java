package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.IntTag;
import net.minecraft.nbt.ByteTag;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.FaroutMod;

import com.ibm.icu.util.Output;

public class DockButton2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean Deciding = false;
		String SelectedPlanet = "";
		String Output = "";
		String SourcePlanet = "";
		String WorkingString = "";
		double Offset = 0;
		double Second = 0;
		if (FaroutModVariables.WorldVariables.get(world).SpacecraftNames.size() >= (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1) {
			Deciding = (FaroutModVariables.WorldVariables.get(world).SpacecraftDirection
					.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof ByteTag _byteTag ? _byteTag.getAsByte() == 1 : false;
			if (((FaroutModVariables.WorldVariables.get(world).SpacecraftDeltaV
					.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof IntTag _intTag
							? _intTag.getAsInt()
							: 0) >= ((FaroutModVariables.WorldVariables.get(world).SpacecraftTransferDeltaV
									.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0)) {
				if (entity instanceof Player _player)
					_player.closeContainer();
				{
					String _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftNames
							.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitName = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				FaroutMod.LOGGER.debug(((FaroutModVariables.WorldVariables.get(world).SpacecraftNames
						.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof StringTag _stringTag ? _stringTag.getAsString() : ""));
				{
					double _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftHabitiationTime
							.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitHabitation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = ((FaroutModVariables.WorldVariables.get(world).SpacecraftDeltaV
							.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0)
							- ((FaroutModVariables.WorldVariables.get(world).SpacecraftTransferDeltaV
									.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0);
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitDeltaV = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftDestination
							.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitDestination = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftSource
							.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof StringTag _stringTag ? _stringTag.getAsString() : "";
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitSource = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (FaroutModVariables.WorldVariables.get(world).SpacecraftTransferDeltaV
							.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof IntTag _intTag ? _intTag.getAsInt() : 0;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitTransferDeltaV = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = !((FaroutModVariables.WorldVariables.get(world).SpacecraftDirection
							.get((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1))) instanceof ByteTag _byteTag ? _byteTag.getAsByte() == 1 : false);
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TransitDirection = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PlayerIndex = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				FaroutModVariables.WorldVariables.get(world).SpacecraftNames.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1));
				FaroutModVariables.WorldVariables.get(world).SpacecraftHabitiationTime.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1));
				FaroutModVariables.WorldVariables.get(world).SpacecraftDeltaV.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1));
				FaroutModVariables.WorldVariables.get(world).SpacecraftDestination.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1));
				FaroutModVariables.WorldVariables.get(world).SpacecraftSource.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1));
				FaroutModVariables.WorldVariables.get(world).SpacecraftTransferDeltaV.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1));
				FaroutModVariables.WorldVariables.get(world).SpacecraftDirection.remove((int) ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Index + 1));
				{
					boolean _setval = true;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GoingToSpace = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
