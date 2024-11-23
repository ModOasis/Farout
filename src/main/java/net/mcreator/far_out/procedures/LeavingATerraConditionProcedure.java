package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class LeavingATerraConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		String comparing = "";
		comparing = "" + entity.level().dimension();
		return ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:lestas"))).equals(comparing)
				|| ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas"))).equals(comparing) || ("" + ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:radiatos"))).equals(comparing);
	}
}
