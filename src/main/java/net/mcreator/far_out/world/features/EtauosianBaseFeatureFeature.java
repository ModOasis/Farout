
package net.mcreator.far_out.world.features;

import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.WorldGenLevel;

import net.mcreator.far_out.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.far_out.procedures.EtauosianBaseAdditionalGenerationConditionProcedure;

public class EtauosianBaseFeatureFeature extends StructureFeature {
	public EtauosianBaseFeatureFeature() {
		super(StructureFeatureConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<StructureFeatureConfiguration> context) {
		WorldGenLevel world = context.level();
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!EtauosianBaseAdditionalGenerationConditionProcedure.execute(world))
			return false;
		return super.place(context);
	}
}
