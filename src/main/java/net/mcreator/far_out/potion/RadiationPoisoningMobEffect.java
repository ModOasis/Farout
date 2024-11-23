
package net.mcreator.far_out.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.far_out.procedures.RadiationPoisoningOnEffectActiveTickProcedure;

public class RadiationPoisoningMobEffect extends MobEffect {
	public RadiationPoisoningMobEffect() {
		super(MobEffectCategory.HARMFUL, -2365113);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RadiationPoisoningOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
