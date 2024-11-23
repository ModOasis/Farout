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
public class InitOrbitalPeriodProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("sandos", IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("proxmai", IntTag.valueOf(62));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("vulcan", IntTag.valueOf(8));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("oceanus", IntTag.valueOf(166));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("etaui", IntTag.valueOf(336));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("etauos", IntTag.valueOf(37));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("massivo", IntTag.valueOf(724));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("varas", IntTag.valueOf(7));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("glacieo", IntTag.valueOf(15));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("silican", IntTag.valueOf(30));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("infinatos", IntTag.valueOf(1450));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("formalon", IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("carbos", IntTag.valueOf(270));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("moja", IntTag.valueOf(1900));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("rejona", IntTag.valueOf(3410));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("melu", IntTag.valueOf(14));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("helus", IntTag.valueOf(7150));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("orax", IntTag.valueOf(20640));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("zev", IntTag.valueOf(23));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("tuqeg", IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("zanavos", IntTag.valueOf(253));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("venusion", IntTag.valueOf(6));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("quatu", IntTag.valueOf(4220));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("neqion", IntTag.valueOf(16));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("lestas", IntTag.valueOf(47));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("raditos", IntTag.valueOf(9040));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("taukua", IntTag.valueOf(41120));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("pryson", IntTag.valueOf(15));
		FaroutModVariables.MapVariables.get(world).OrbitalPeriods.put("kalasmos", IntTag.valueOf(27));
	}
}
