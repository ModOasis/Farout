package net.mcreator.far_out.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;

import com.ibm.icu.util.Output;

public class VarasBasePlaceholderAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double z) {
		boolean Output = false;
		double Zpos = 0;
		double Xpos = 0;
		double ExpectedY = 0;
		Zpos = z;
		Xpos = x;
		ExpectedY = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z);
		Output = true;
		if (!(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) == 62)) {
			for (int index0 = 0; index0 < (int) Xpos; index0++) {
				if (ExpectedY == world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) Xpos, (int) Zpos)) {
					Xpos = Xpos + 1;
				} else {
					Output = false;
				}
				for (int index1 = 0; index1 < (int) Zpos; index1++) {
					if (ExpectedY == world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) Xpos, (int) Zpos)) {
						Zpos = Zpos + 1;
					} else {
						Output = false;
					}
				}
				Zpos = 0;
			}
		} else {
			Output = false;
		}
		return Output;
	}
}
