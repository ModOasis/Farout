package net.mcreator.far_out.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.SandosMapMenu;
import net.mcreator.far_out.world.inventory.FormalonMapMenu;
import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.LaunchVehicleEntity;

import io.netty.buffer.Unpooled;

public class LaunchOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			if ((entity.getVehicle()) instanceof LaunchVehicleEntity) {
				FaroutModVariables.MapVariables.get(world).AccessLocationX = x;
				FaroutModVariables.MapVariables.get(world).syncData(world);
				FaroutModVariables.MapVariables.get(world).AccessLocationY = y;
				FaroutModVariables.MapVariables.get(world).syncData(world);
				FaroutModVariables.MapVariables.get(world).AccessLocationZ = z;
				FaroutModVariables.MapVariables.get(world).syncData(world);
				if ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).InFormalonSystem) {
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = BlockPos.containing(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("FormalonMap");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new FormalonMapMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				} else {
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = BlockPos.containing(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("SandosMap");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new SandosMapMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
				if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai")))) {
					{
						String _setval = "Proxmai";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan")))) {
					{
						String _setval = "Vulcan";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus")))) {
					{
						String _setval = "Oceanus";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")))) {
					{
						String _setval = "Etaui";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos")))) {
					{
						String _setval = "Etauos";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas")))) {
					{
						String _setval = "Varas";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo")))) {
					{
						String _setval = "Glacieo";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican")))) {
					{
						String _setval = "Silican";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos")))) {
					{
						String _setval = "Infinatos";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos")))) {
					{
						String _setval = "Carbos";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja")))) {
					{
						String _setval = "Moja";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona")))) {
					{
						String _setval = "Rejona";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu")))) {
					{
						String _setval = "Melu";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus")))) {
					{
						String _setval = "Helus";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax")))) {
					{
						String _setval = "Orax";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev")))) {
					{
						String _setval = "Zev";
						entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.DepartureBody = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
