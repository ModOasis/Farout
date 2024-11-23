package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.nbt.StringTag;

import net.mcreator.far_out.network.FaroutModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InitOrbitalParentProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		FaroutModVariables.MapVariables.get(world).ParentBody.put("sandos", StringTag.valueOf("???"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("proxmai", StringTag.valueOf("sandos"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("vulcan", StringTag.valueOf("proxmai"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("oceanus", StringTag.valueOf("sandos"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("etaui", StringTag.valueOf("sandos"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("etauos", StringTag.valueOf("etaui"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("massivo", StringTag.valueOf("sandos"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("varas", StringTag.valueOf("massivo"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("glacieo", StringTag.valueOf("massivo"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("silican", StringTag.valueOf("massivo"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("infinatos", StringTag.valueOf("sandos"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("formalon", StringTag.valueOf("???"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("carbos", StringTag.valueOf("formalon"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("moja", StringTag.valueOf("formalon"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("rejona", StringTag.valueOf("formalon"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("melu", StringTag.valueOf("rejona"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("helus", StringTag.valueOf("formalon"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("orax", StringTag.valueOf("formalon"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("zev", StringTag.valueOf("orax"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("tuqeg", StringTag.valueOf("???"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("zanavos", StringTag.valueOf("tuqeg1"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("venusion", StringTag.valueOf("zanavos2"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("neqion", StringTag.valueOf("quatu2"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("quatu", StringTag.valueOf("tuqeg1"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("lestas", StringTag.valueOf("quatu2"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("raditos", StringTag.valueOf("tuqeg1"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("taukua", StringTag.valueOf("tuqeg1"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("pryson", StringTag.valueOf("taukua2"));
		FaroutModVariables.MapVariables.get(world).ParentBody.put("kalasmos", StringTag.valueOf("taukua2"));
	}
}
