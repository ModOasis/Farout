package net.mcreator.far_out.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
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
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.LaunchVehicleEntity;
import net.mcreator.far_out.FaroutMod;

import java.util.Comparator;

public class EtauiTrajectoriesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		boolean Interplanetry = false;
		Entity TargetEntity = null;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai")))) {
			DeltaV = 76;
			OrbitalPeriod = 15.5;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan")))) {
			DeltaV = 76;
			OrbitalPeriod = 15.5;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus")))) {
			DeltaV = 20;
			OrbitalPeriod = 25;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")))) {
			DeltaV = 0;
			OrbitalPeriod = 0;
			Interplanetry = false;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos")))) {
			DeltaV = 11;
			OrbitalPeriod = 1;
			Interplanetry = false;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas")))) {
			DeltaV = 40;
			OrbitalPeriod = 53;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo")))) {
			DeltaV = 40;
			OrbitalPeriod = 53;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican")))) {
			DeltaV = 40;
			OrbitalPeriod = 53;
			Interplanetry = true;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos")))) {
			DeltaV = 32;
			OrbitalPeriod = 82;
			Interplanetry = true;
		}
		if ((entity.getCapability(FaroutModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FaroutModVariables.PlayerVariables())).VehicleMode) {
			if (!world.getEntitiesOfClass(LaunchVehicleEntity.class,
					AABB.ofSize(new Vec3(FaroutModVariables.MapVariables.get(world).AccessLocationX, FaroutModVariables.MapVariables.get(world).AccessLocationY, FaroutModVariables.MapVariables.get(world).AccessLocationZ), 20, 20, 20), e -> true)
					.isEmpty()) {
				TargetEntity = (Entity) world.getEntitiesOfClass(LaunchVehicleEntity.class,
						AABB.ofSize(new Vec3(FaroutModVariables.MapVariables.get(world).AccessLocationX, FaroutModVariables.MapVariables.get(world).AccessLocationY, FaroutModVariables.MapVariables.get(world).AccessLocationZ), 20, 20, 20), e -> true)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(FaroutModVariables.MapVariables.get(world).AccessLocationX, FaroutModVariables.MapVariables.get(world).AccessLocationY, FaroutModVariables.MapVariables.get(world).AccessLocationZ)).findFirst().orElse(null);
				if (DeltaV / 2 < TargetEntity.getPersistentData().getDouble("Delta-V") && OrbitalPeriod <= TargetEntity.getPersistentData().getDouble("HabTime")
						&& !(!Interplanetry && TargetEntity.getPersistentData().getBoolean("InterplanetryCapable"))) {
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
				}
			}
		} else {
			FaroutModVariables.MapVariables.get(world).InTransit = FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress;
			FaroutModVariables.MapVariables.get(world).syncData(world);
			FaroutMod.queueServerWork((int) FaroutModVariables.MapVariables.get(world).TransportDelay, () -> {
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
				FaroutMod.queueServerWork((int) FaroutModVariables.MapVariables.get(world).ArrivalDelay, () -> {
					if (FaroutModVariables.MapVariables.get(world).InTransit.contains("F")) {
						FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.MapVariables.get(world).InTransit.replace("F", "H");
						FaroutModVariables.WorldVariables.get(world).syncData(world);
					} else if (FaroutModVariables.MapVariables.get(world).InTransit.contains("H")) {
						FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = "11111101F";
						FaroutModVariables.WorldVariables.get(world).syncData(world);
					}
				});
			});
		}
	}
}
