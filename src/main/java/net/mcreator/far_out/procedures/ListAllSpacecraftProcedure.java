package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.far_out.network.FaroutModVariables;

public class ListAllSpacecraftProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			CompoundTag _compoundTag = FaroutModVariables.WorldVariables.get(world).SpacecraftHab;
			for (String keyiterator : _compoundTag.getAllKeys()) {
				Tag dataelementiterator = _compoundTag.get(keyiterator);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(
							Component.literal(
									(keyiterator + " properties: Hab:" + FaroutModVariables.WorldVariables.get(world).SpacecraftHab.get(keyiterator) + " days, Dv:" + FaroutModVariables.WorldVariables.get(world).SpacecraftDeltav.get(keyiterator)
											+ " m/s" + FaroutModVariables.WorldVariables.get(world).SpacecraftDeparturePlanet.get(keyiterator) + " ->" + FaroutModVariables.WorldVariables.get(world).SpacecraftDestinationPlanet.get(keyiterator))),
							false);
			}
		}
	}
}
