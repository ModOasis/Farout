package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.client.Minecraft;

public class ConstratiumSpecialInformationProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		String TheThoughtsOfTheNanobots = "";
		if (Mth.nextInt(RandomSource.create(), 0, 5) == 0) {
			TheThoughtsOfTheNanobots = "We have seen multiple worlds outside of your own.";
		} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
			TheThoughtsOfTheNanobots = "It looks like you are ERROR: INSTANCE \"" + "" + ("" + Minecraft.getInstance().gameDirectory.getAbsolutePath()) + "\" IS REPORTING REALITY EXCEPTION 666";
		} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 2) {
			TheThoughtsOfTheNanobots = "You must embrace your mission, " + entity.getDisplayName().getString();
		} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
			TheThoughtsOfTheNanobots = "The collective is greater than it first seems";
		} else {
			TheThoughtsOfTheNanobots = "Your fate is at the center of the cluster";
		}
		return TheThoughtsOfTheNanobots;
	}
}
