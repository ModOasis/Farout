package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Time;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.far_out.network.FaroutModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FireTimeProcedure {
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
		double Time = 0;
		if (Time == 20) {
			Time = 0;
			FaroutModVariables.MapVariables.get(world).FireTime = true;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		} else {
			Time = Time + 1;
			FaroutModVariables.MapVariables.get(world).FireTime = false;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
