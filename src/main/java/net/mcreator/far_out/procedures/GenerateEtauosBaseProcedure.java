package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.FaroutMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GenerateEtauosBaseProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		execute(null, world, x, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos")))) {
				FaroutMod.queueServerWork(20, () -> {
					FaroutModVariables.MapVariables.get(world).EtauosBaseX = Mth.nextInt(RandomSource.create(), -20, 20) + x;
					FaroutModVariables.MapVariables.get(world).syncData(world);
					FaroutModVariables.MapVariables.get(world).EtauosBaseY = Mth.nextInt(RandomSource.create(), -20, 20) + z;
					FaroutModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("farout", "etauos_base"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(FaroutModVariables.MapVariables.get(world).EtauosBaseX,
											world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) FaroutModVariables.MapVariables.get(world).EtauosBaseX, (int) FaroutModVariables.MapVariables.get(world).EtauosBaseY),
											FaroutModVariables.MapVariables.get(world).EtauosBaseY),
									BlockPos.containing(FaroutModVariables.MapVariables.get(world).EtauosBaseX,
											world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) FaroutModVariables.MapVariables.get(world).EtauosBaseX, (int) FaroutModVariables.MapVariables.get(world).EtauosBaseY),
											FaroutModVariables.MapVariables.get(world).EtauosBaseY),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				});
			}
		}
	}
}
