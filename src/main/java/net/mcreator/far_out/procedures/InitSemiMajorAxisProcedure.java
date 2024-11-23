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
public class InitSemiMajorAxisProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("sandos", IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("proxmai", IntTag.valueOf(6360));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("vulcan", IntTag.valueOf(45));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("oceanus", IntTag.valueOf(12218));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("etaui", IntTag.valueOf(19370));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("etauos", IntTag.valueOf(75));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("massivo", IntTag.valueOf(38810));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("varas", IntTag.valueOf(165));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("glacieo", IntTag.valueOf(262));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("silican", IntTag.valueOf(416));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("infinatos", IntTag.valueOf(51583));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("formalon", IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("carbos", IntTag.valueOf(26124));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("moja", IntTag.valueOf(95880));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("rejona", IntTag.valueOf(141000));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("melu", IntTag.valueOf(59));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("helus", IntTag.valueOf(232000));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("orax", IntTag.valueOf(470000));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("zev", IntTag.valueOf(164));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("tuqeg", IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("zanavos", IntTag.valueOf(426));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("venusion", IntTag.valueOf(27));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("quatu", IntTag.valueOf(175000));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("neqion", IntTag.valueOf(685));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("lestas", IntTag.valueOf(1398));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("raditos", IntTag.valueOf(304000));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("taukua", IntTag.valueOf(838000));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("pryson", IntTag.valueOf(1441));
		FaroutModVariables.MapVariables.get(world).SemiMajorAxis.put("kalasmos", IntTag.valueOf(2137));
	}
}
