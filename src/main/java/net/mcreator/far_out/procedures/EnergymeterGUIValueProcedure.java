package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.far_out.network.FaroutModVariables;

import java.util.HashMap;

public class EnergymeterGUIValueProcedure {
	public static void execute(LevelAccessor world, HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:textFieldName") instanceof EditBox _tf)
			_tf.setValue((FaroutModVariables.WorldVariables.get(world).Energy + "/" + FaroutModVariables.WorldVariables.get(world).TotalCapacty));
	}
}
