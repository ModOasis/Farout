package net.mcreator.far_out.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.far_out.init.FaroutModItems;

public class AncientDroneEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Prob = 0;
		ItemStack item = ItemStack.EMPTY;
		Prob = Mth.nextInt(RandomSource.create(), 1, 10);
		if (8 > Prob) {
			item = new ItemStack(FaroutModItems.COPPER_WIRE.get());
		} else if (6 >= Prob) {
			item = new ItemStack(Items.IRON_NUGGET);
		} else if (9 == Prob) {
			item = new ItemStack(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get());
		} else if (10 == Prob) {
			item = new ItemStack(FaroutModItems.LASER.get());
		}
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 5); index0++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, item);
				entityToSpawn.setPickUpDelay(5);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
