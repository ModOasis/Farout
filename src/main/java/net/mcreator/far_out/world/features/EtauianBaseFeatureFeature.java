
package net.mcreator.far_out.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.far_out.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.far_out.procedures.EtauianBaseAdditionalGenerationConditionProcedure;

public class EtauianBaseFeatureFeature extends StructureFeature {
	public EtauianBaseFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!EtauianBaseAdditionalGenerationConditionProcedure.execute(world, x, z))
			return false;
		return super.place(context);
	}
}
