package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class LeavingAAirlessPlanetProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		String comparing = "";
		comparing = "" + entity.level().dimension();
		return ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev"))).equals(comparing);
	}
}
