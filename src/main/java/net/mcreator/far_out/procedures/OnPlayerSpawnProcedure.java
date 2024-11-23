package net.mcreator.far_out.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.nbt.IntTag;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModBlocks;
import net.mcreator.far_out.FaroutMod;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber
public class OnPlayerSpawnProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		execute(null, world, x, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).Boot_Complete) {
			FaroutMod.queueServerWork(20, () -> {
				if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"));
					if (_player.level().dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 1), z, _ent.getYRot(), _ent.getXRot());
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(3, new ItemStack(FaroutModItems.SPACE_SUIT_HELMET.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(FaroutModItems.SPACE_SUIT_HELMET.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(2, new ItemStack(FaroutModItems.SPACE_SUIT_CHESTPLATE.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(FaroutModItems.SPACE_SUIT_CHESTPLATE.get()));
					}
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(1, new ItemStack(FaroutModItems.SPACE_SUIT_LEGGINGS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(FaroutModItems.SPACE_SUIT_LEGGINGS.get()));
					}
				}
				if (new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
						}
						return false;
					}
				}.checkGamemode(entity)) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SURVIVAL);
				} else if (new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(entity)) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.CREATIVE);
				} else if (new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
						}
						return false;
					}
				}.checkGamemode(entity)) {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.ADVENTURE);
				} else {
					if (entity instanceof ServerPlayer _player)
						_player.setGameMode(GameType.SPECTATOR);
				}
				{
					final int _slotid = 0;
					final ItemStack _setstack = new ItemStack(FaroutModBlocks.CARDBOARDBOX.get()).copy();
					_setstack.setCount(1);
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
							_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
					});
				}
				(new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, entity)).getOrCreateTag().putBoolean("Full", true);
				{
					boolean _setval = true;
					entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Boot_Complete = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.ALUMINIUM_INGOT.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(Items.IRON_INGOT).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.COPPER_WIRE.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.METHANE.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.OXYGEN_BOTTLE.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.GRAPHITEROD.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.PLUTONIUM_CARBIDE.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.HYDROGEN.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.GRAPHITE_INGOT.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(Items.QUARTZ).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.LOW_FREQUENCY_INTEGRATED_CIRCUIT.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.LOW_CAPACITY_MEMORY.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.XENON.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.ELECTRO_MAGNET.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(Items.WATER_BUCKET).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.HAFNIUM_CARBONITRIDE_INGOT.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.BORON_INGOT.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.DEUTERIUM.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.HELIUM_3.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.MEDIUM_FREQUENCY_INTEGRATED_CIRCUIT.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.MEDIUM_CAPACITY_MEMORY.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.SOLID_ANTIMATTER_PENNING_TRAP.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.BASIC_SOLAR_CELL.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.MOTOR.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.GALACTIC_CORE_TRACKER.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.INERTIAL_NAVIGATION_SYSTEM.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModBlocks.STIRLING_ENGINE.get().asItem()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(Blocks.WHITE_WOOL.asItem()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.POLYETHYLENE.get()).toString()), IntTag.valueOf(0));
		FaroutModVariables.MapVariables.get(world).RocketBuildingItems.put((ForgeRegistries.ITEMS.getKey(FaroutModItems.BLACK_HOLE_COMPUTER.get()).toString()), IntTag.valueOf(0));
	}
}
