package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LifeformOriginProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")) == (entity.level().dimension())) {
			entity.getPersistentData().putString("Origin", "Etaui");
		} else if (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus")) == (entity.level().dimension())) {
			entity.getPersistentData().putString("Origin", "Oceanus");
		} else if (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican")) == (entity.level().dimension())) {
			entity.getPersistentData().putString("Origin", "Silican");
		}
	}
}
