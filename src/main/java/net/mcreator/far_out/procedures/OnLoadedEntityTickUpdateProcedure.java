package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModMobEffects;
import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModBlocks;
import net.mcreator.far_out.entity.LanderEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnLoadedEntityTickUpdateProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity LanderEntity = null;
		double OverallSpeed = 0;
		double ModifedGravity = 0;
		double PitchRad = 0;
		double YawRad = 0;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double Normalization = 0;
		double KineticEnergy = 0;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 12.2;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 2.71;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus")))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 9.5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 9.5;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos")))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 2.71;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:massivo"))) == (entity.level().dimension())) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:massivo_land"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			FaroutModVariables.MapVariables.get(world).Gravity = 15;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 1.75;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 2.53;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 3.63;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 7.12;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 12.1;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 8.25;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 10.4;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 1.4;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus")))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			FaroutModVariables.MapVariables.get(world).Gravity = 4.98;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 25;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev")))) {
			FaroutModVariables.MapVariables.get(world).Gravity = 1.54;
			FaroutModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity instanceof Player && FaroutModItems.SPACE_SUIT_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()
				&& FaroutModItems.SPACE_SUIT_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()
				&& FaroutModItems.SPACE_SUIT_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
		}
		if (!(entity instanceof LivingEntity _livEnt63 && _livEnt63.hasEffect(FaroutModMobEffects.OXYGEN.get())) && !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("forge:machine_entity")))) {
			for (int index0 = 0; index0 < (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1); index0++) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("farout:asphyxiation")))), 1);
			}
		}
		if (FaroutModVariables.WorldVariables.get(world).Energy > 0) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:microchip_crafted"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		} else if (FaroutModVariables.WorldVariables.get(world).Energy >= 100000) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:extreme_voltage"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).InFormalonSystem) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:ad_astra"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (!((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))) || (entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")))
				|| (entity.level().dimension()) == Level.OVERWORLD)) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:the_other_worlds"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() instanceof LiquidBlock)) {
			entity.setNoGravity(true);
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - FaroutModVariables.MapVariables.get(world).Gravity / 100), (entity.getDeltaMovement().z())));
			if (entity.getY() == world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z) + 2 && !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("forge:machine_entity"))) && !(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
					}
					return false;
				}
			}.checkGamemode(entity))) {
				if (entity.getDeltaMovement().y() <= 40) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FALL)), (float) entity.getDeltaMovement().y());
				}
			}
		} else {
			entity.setNoGravity(false);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FaroutModBlocks.LIQUID_SULFUR_DIOXIDE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FaroutModBlocks.LIQUID_AMMONIA.get()) {
			entity.setTicksFrozen((int) (entity.getTicksFrozen() + 1));
		}
		if ((world.getBlockState(
				new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
						entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
						entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())))
				.getBlock() == FaroutModBlocks.MUSNIUS_SAPLING.get()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("" + (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world,
						new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(),
								entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
						"Age")))), false);
		}
	}
}
