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

public class MeluTrajectoriesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double DeltaV = 0;
		double OrbitalPeriod = 0;
		boolean Interplanetry = false;
		Entity TargetEntity = null;
		if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos")))) {
			Interplanetry = true;
			DeltaV = 176;
			OrbitalPeriod = 40;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja")))) {
			Interplanetry = true;
			DeltaV = 69;
			OrbitalPeriod = 26;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu")))) {
			Interplanetry = false;
			DeltaV = 0;
			OrbitalPeriod = 0;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona")))) {
			Interplanetry = false;
			DeltaV = 12;
			OrbitalPeriod = 1.25;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus")))) {
			Interplanetry = true;
			DeltaV = 24;
			OrbitalPeriod = 138;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax")))) {
			Interplanetry = true;
			DeltaV = 52;
			OrbitalPeriod = 300;
		} else if ((entity.level().dimension()) == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev")))) {
			Interplanetry = true;
			DeltaV = 52;
			OrbitalPeriod = 300;
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
						ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu"));
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
					ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu"));
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
					} else if (FaroutModVariables.MapVariables.get(world).InTransit.contains("M")) {
						FaroutModVariables.WorldVariables.get(world).InterstellarVesselProgress = FaroutModVariables.MapVariables.get(world).InTransit.replace("H", "E");
						FaroutModVariables.WorldVariables.get(world).syncData(world);
					}
				});
			});
		}
	}
}
