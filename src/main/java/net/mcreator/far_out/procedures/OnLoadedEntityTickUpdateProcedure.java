package net.mcreator.far_out.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModMobEffects;
import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModBlocks;
import net.mcreator.far_out.entity.LaunchVehicleEntity;
import net.mcreator.far_out.entity.LanderEntity;
import net.mcreator.far_out.entity.AtomicBombEntity;

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
		double bruh = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(FaroutModMobEffects.OXYGEN.get())) && !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("forge:machine_entity")))
				&& !((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")) && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("farout:etaui_natives"))))) {
			for (int index0 = 0; index0 < (int) (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1); index0++) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("farout:asphyxiation")))), 1);
			}
		}
		if (entity instanceof Player) {
			if (entity instanceof Player && FaroutModItems.IRON_REINFORCED_SPACE_SUIT_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()
					&& FaroutModItems.IRON_REINFORCED_SPACE_SUIT_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()
					&& FaroutModItems.IRON_REINFORCED_SPACE_SUIT_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()
					|| entity instanceof Player && FaroutModItems.SPACE_SUIT_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()
							&& FaroutModItems.SPACE_SUIT_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()
							&& FaroutModItems.SPACE_SUIT_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()
					|| entity instanceof Player && FaroutModItems.DIAMOND_REINFOCED_SPACE_SUIT_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()
							&& FaroutModItems.DIAMOND_REINFOCED_SPACE_SUIT_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()
							&& FaroutModItems.DIAMOND_REINFOCED_SPACE_SUIT_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(FaroutModMobEffects.OXYGEN.get(), 5, 2, false, false));
			}
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican"))) {
			if (100 > Math.sqrt(Math.pow(FaroutModVariables.MapVariables.get(world).GatewayX - x, 2) + Math.pow(FaroutModVariables.MapVariables.get(world).GatewayZ - z, 2))) {
				assert Boolean.TRUE; //#dbg:OnLoadedEntityTickUpdate:Within_radius
				if (!FaroutModVariables.MapVariables.get(world).PlacedSandosArenaPortal) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("farout", "sandos_arena_entrence"));
						if (template != null) {
							template.placeInWorld(_serverworld,
									BlockPos.containing(FaroutModVariables.MapVariables.get(world).GatewayX,
											world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) FaroutModVariables.MapVariables.get(world).GatewayX, (int) FaroutModVariables.MapVariables.get(world).GatewayZ),
											FaroutModVariables.MapVariables.get(world).GatewayZ),
									BlockPos.containing(FaroutModVariables.MapVariables.get(world).GatewayX,
											world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) FaroutModVariables.MapVariables.get(world).GatewayX, (int) FaroutModVariables.MapVariables.get(world).GatewayZ),
											FaroutModVariables.MapVariables.get(world).GatewayZ),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					FaroutModVariables.MapVariables.get(world).PlacedSandosArenaPortal = true;
					FaroutModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:gateway"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FaroutModItems.LOW_CAPACITY_MEMORY.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FaroutModItems.LOW_FREQUENCY_INTEGRATED_CIRCUIT.get())) : false)) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:homemade_computers"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FaroutModItems.MEDIUM_CAPACITY_MEMORY.get())) : false)
				|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get())) : false)) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:microscopic_switches"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() instanceof LiquidBlock || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (!(entity instanceof LaunchVehicleEntity _datEntL48 && _datEntL48.getEntityData().get(LaunchVehicleEntity.DATA_Launching))) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - FaroutModVariables.MapVariables.get(world).Gravity / 100), (entity.getDeltaMovement().z())));
			}
			entity.setNoGravity(true);
		} else {
			entity.setNoGravity(false);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FaroutModBlocks.LIQUID_SULFUR_DIOXIDE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FaroutModBlocks.LIQUID_AMMONIA.get()) {
			entity.setTicksFrozen((int) (entity.getTicksFrozen() + 1));
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == FaroutModBlocks.BREATHABLE_AIR.get()) {
			entity.setTicksFrozen((int) (entity.getTicksFrozen() + 1));
		}
		if (!((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).InTransit).equals("\"\"")) {
			FaroutModVariables.WorldVariables.get(world).LaunchedCrafts = (entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).InTransit + ""
					+ FaroutModVariables.WorldVariables.get(world).LaunchedCrafts;
			FaroutModVariables.WorldVariables.get(world).syncData(world);
			{
				String _setval = "\"\"";
				entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InTransit = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FaroutModItems.MAGMA_BUCKET.get())) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FaroutModItems.MAGMA_BUCKET.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.LAVA_BUCKET).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (entity instanceof ServerPlayer _plr68 && _plr68.level() instanceof ServerLevel && _plr68.getAdvancements().getOrStartProgress(_plr68.server.getAdvancements().getAdvancement(new ResourceLocation("farout:primes_in_the_night"))).isDone()) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("farout:homecoming"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
		}
		if (!(("" + entity.level().dimension()).equals((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).CompareDimension)
				&& ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).TransitName).equals(""))) {
			EntityEnteringDimensionTestProcedure.execute(world, entity);
			{
				String _setval = "" + entity.level().dimension();
				entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CompareDimension = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!world.getEntitiesOfClass(AtomicBombEntity.class, AABB.ofSize(new Vec3(x, y, z), 75, 75, 75), e -> true).isEmpty()) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("farout:incineration")))),
					entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
		}
	}
}
