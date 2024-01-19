package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.far_out.network.FaroutModVariables;

import java.util.HashMap;

public class GravityChangerWhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, HashMap guistate) {
		if (guistate == null)
			return;
		FaroutModVariables.MapVariables.get(world).Gravity = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:Gravity") ? ((EditBox) guistate.get("text:Gravity")).getValue() : "");
		FaroutModVariables.MapVariables.get(world).syncData(world);
	}
}
