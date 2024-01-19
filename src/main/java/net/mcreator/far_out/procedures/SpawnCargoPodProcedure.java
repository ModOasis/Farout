package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnCargoPodProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (FaroutModVariables.MapVariables.get(world).StartupComplete) {
			if (world instanceof ServerLevel _origLevel) {
				LevelAccessor _worldorig = world;
				world = _origLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")));
				if (world != null) {
					world.setBlock(new BlockPos(world.getLevelData().getXSpawn(), 150, world.getLevelData().getZSpawn()), FaroutModBlocks.CARGO_POD.get().defaultBlockState(), 3);
					FaroutModVariables.MapVariables.get(world).StartupComplete = false;
					FaroutModVariables.MapVariables.get(world).syncData(world);
				}
				world = _worldorig;
			}
		}
	}
}
