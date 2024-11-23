package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.init.FaroutModMobEffects;

public class RadiationPoisoningOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double MaxHealth = 0;
		double Amplifer = 0;
		MaxHealth = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(FaroutModMobEffects.RADIATION_POISONING.get()) ? _livEnt.getEffect(FaroutModMobEffects.RADIATION_POISONING.get()).getAmplifier() : 0) * 2;
		if (MaxHealth < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) MaxHealth);
		}
	}
}
