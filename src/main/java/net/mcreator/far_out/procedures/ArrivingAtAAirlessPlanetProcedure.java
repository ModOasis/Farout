package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class ArrivingAtAAirlessPlanetProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		String comparing = "";
		comparing = "ResourceKey[minecraft:dimension / farout:" + (new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, BlockPos.containing(x, y, z), "Destination")).toLowerCase() + "]";
		return ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev"))).equals(comparing);
	}
}
