package net.mcreator.far_out.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.entity.TrihassianSolderEntity;
import net.mcreator.far_out.entity.TrihassianEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CapitulationCounterProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player) {
			if (entity instanceof TrihassianEntity) {
				FaroutModVariables.WorldVariables.get(world).Capitualation = FaroutModVariables.WorldVariables.get(world).Capitualation + 2;
				FaroutModVariables.WorldVariables.get(world).syncData(world);
			} else if (entity instanceof TrihassianSolderEntity) {
				FaroutModVariables.WorldVariables.get(world).Capitualation = FaroutModVariables.WorldVariables.get(world).Capitualation + 1;
				FaroutModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
