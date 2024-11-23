package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityEnteringDimensionTestProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) {
			GiveNuclearThermalTechProcedure.execute(entity);
		} else if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus"))) {
			GiveGasCoreTechProcedure.execute(entity);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 12.2;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 2.71;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 9.5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 9.5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 2.71;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:massivo"))) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:deleted_mod_element"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			FaroutModVariables.MapVariables.get(world).Gravity = 15;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 1.75;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 2.53;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 3.63;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 7.12;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 12.1;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 8.25;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 10.4;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 1.4;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 4.98;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 25;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 1.54;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:venasion"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:lestas"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 7;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:neqion"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 7.5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:radiatos"))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 11.2;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:pryson"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 6.96;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:kalasmos"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 7.2;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == Level.OVERWORLD) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 9.8;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:lunon"))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 1.6;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
