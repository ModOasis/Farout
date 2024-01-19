package net.mcreator.far_out.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;

public class EtauosianBaseSpawnerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FaroutModVariables.MapVariables.get(world).EtauianBaseSpawned = true;
		FaroutModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("farout", "etaui_base"));
			if (template != null) {
				template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z),
						BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
						_serverworld.random, 3);
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
