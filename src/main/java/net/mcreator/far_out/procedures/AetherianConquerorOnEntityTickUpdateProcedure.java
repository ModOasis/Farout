package net.mcreator.far_out.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.far_out.entity.AetherianConquerorEntity;
import net.mcreator.far_out.FaroutMod;

import java.util.Comparator;

public class AetherianConquerorOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity Player = null;
		double X = 0;
		double Y = 0;
		double Z = 0;
		double LasingFactor = 0;
		double Ticks = 0;
		double dialognum = 0;
		if (entity instanceof AetherianConquerorEntity _datEntL0 && _datEntL0.getEntityData().get(AetherianConquerorEntity.DATA_Dialog)) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty()) {
				Player = (Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null);
				entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((Player.getX()), (Player.getY()), (Player.getZ())));
				if (entity instanceof AetherianConquerorEntity _datEntSetI)
					_datEntSetI.getEntityData().set(AetherianConquerorEntity.DATA_Age, (int) ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) + 1));
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 1) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal(("Aetherian Conquerer: Why are you here, " + Player.getDisplayName().getString() + "?")), false);
				}
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 80) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You: How do you know my name?"), false);
				}
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 160) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Aetherian Conquerer: Answer the question."), false);
				}
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 240) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You: I was exploring, and I found a random portal, so I decided to hop in."), false);
				}
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 320) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Aetherian Conquerer: Liar! You are trying to kill me."), false);
				}
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 400) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("You: Then why ask the question?"), false);
				}
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 480) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Aetherian Conquerer: And after 5 seconds, you will try to attack me. Don't try anything. "), false);
				}
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 560) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Aetherian Conquerer: I'm reading your thoughts, lying only proves your treachery."), false);
				}
				if ((entity instanceof AetherianConquerorEntity _datEntI ? _datEntI.getEntityData().get(AetherianConquerorEntity.DATA_Age) : 0) == 640) {
					if (Player instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Aetherian Conquerer: Traitors don't deserve existence, and I shall wash my wounds with the blood of the treacherous!"), false);
					if (entity instanceof AetherianConquerorEntity _datEntSetL)
						_datEntSetL.getEntityData().set(AetherianConquerorEntity.DATA_Dialog, false);
				}
			}
		} else {
			if (Mth.nextInt(RandomSource.create(), 1, 500) == 15) {
				if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().stop();
					X = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX();
					Y = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getBbHeight() * 0.75 - entity.getBbHeight() * 0.75;
					Z = (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ();
					LasingFactor = LasingFactor;
					for (int index0 = 0; index0 < 20; index0++) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.LAVA, ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() + X * LasingFactor), (entity.getY() + entity.getBbHeight() * 0.75 + Y * LasingFactor),
									((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() + Z * LasingFactor), 10, 0.05, 0.05, 0.05, 0);
						LasingFactor = LasingFactor - 0.05;
					}
					FaroutMod.queueServerWork(20, () -> {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
									((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), (float) 0.5, Level.ExplosionInteraction.TNT);
					});
					if (entity instanceof AetherianConquerorEntity) {
						((AetherianConquerorEntity) entity).setAnimation("animation.model.RangedAttack");
					}
				}
			}
		}
	}
}
