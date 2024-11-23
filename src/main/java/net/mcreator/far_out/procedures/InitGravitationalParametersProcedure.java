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
public class InitGravitationalParametersProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("proxmai", IntTag.valueOf(7971));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("sandos", IntTag.valueOf(343725751));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("vulcan", IntTag.valueOf(123));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("oceanus", IntTag.valueOf(4464));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("etaui", IntTag.valueOf(3587));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("etauos", IntTag.valueOf(134));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("massivo", IntTag.valueOf(238138));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("varas", IntTag.valueOf(39));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("glacieo", IntTag.valueOf(274));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("silican", IntTag.valueOf(263));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("infinatos", IntTag.valueOf(1964));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("formalon", IntTag.valueOf(1227000000));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("carbos", IntTag.valueOf(8449));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("moja", IntTag.valueOf(4224));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("rejona", IntTag.valueOf(4982));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("melu", IntTag.valueOf(45));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("helus", IntTag.valueOf(1478));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("orax", IntTag.valueOf(41451));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("zev", IntTag.valueOf(136));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("tuqeg", IntTag.valueOf(1672179330));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("zanavos", IntTag.valueOf(11286251));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("venusion", IntTag.valueOf(856));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("quatu", IntTag.valueOf(6447476));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("neqion", IntTag.valueOf(781));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("lestas", IntTag.valueOf(825));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("raditos", IntTag.valueOf(1207));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("taukua", IntTag.valueOf(22041164));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("pryson", IntTag.valueOf(5779));
		FaroutModVariables.MapVariables.get(world).GravitationalParameters.put("kalasmos", IntTag.valueOf(3543));
	}
}
