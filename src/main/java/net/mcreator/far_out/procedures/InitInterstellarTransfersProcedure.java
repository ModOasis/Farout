package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.nbt.IntTag;

import net.mcreator.far_out.network.FaroutModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InitInterstellarTransfersProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("sandos", IntTag.valueOf(0));
	}
}
