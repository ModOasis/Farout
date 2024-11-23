package net.mcreator.far_out.procedures;

import net.minecraft.world.scores.criteria.ObjectiveCriteria;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.far_out.network.FaroutModVariables;

public class TrihassianEntityDiesProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			FaroutModVariables.WorldVariables.get(world).Capitualation = FaroutModVariables.WorldVariables.get(world).Capitualation + 1;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				Scoreboard _sc = _ent.level().getScoreboard();
				Objective _so = _sc.getObjective("Capitulation percentage");
				if (_so == null)
					_so = _sc.addObjective("Capitulation percentage", ObjectiveCriteria.DUMMY, Component.literal("Capitulation percentage"), ObjectiveCriteria.RenderType.INTEGER);
				_sc.getOrCreatePlayerScore(_ent.getScoreboardName(), _so).setScore((int) FaroutModVariables.WorldVariables.get(world).Capitualation);
			}
		}
	}
}
