package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class VotodIndoorsProcedure {
	public static boolean execute(LevelAccessor world) {
		boolean State = false;
		if (!(world instanceof Level _lvl0 && _lvl0.isDay())) {
			State = true;
		} else {
			State = false;
		}
		return State;
	}
}
