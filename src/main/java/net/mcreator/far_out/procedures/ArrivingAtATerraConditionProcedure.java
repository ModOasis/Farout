package net.mcreator.far_out.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class ArrivingAtATerraConditionProcedure {
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
		return ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:lestas"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:radiatos"))).equals(comparing);
	}
}
