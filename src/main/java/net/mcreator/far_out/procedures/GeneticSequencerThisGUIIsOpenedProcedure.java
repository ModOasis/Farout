package net.mcreator.far_out.procedures;

import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class GeneticSequencerThisGUIIsOpenedProcedure {
	public static void execute(HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:Progress") instanceof EditBox _tf)
			_tf.setValue("Progress: Not Started");
	}
}
