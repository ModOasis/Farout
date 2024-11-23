
package net.mcreator.far_out.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RibonixPlagueMobEffect extends MobEffect {
	public RibonixPlagueMobEffect() {
		super(MobEffectCategory.HARMFUL, -15266804);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
