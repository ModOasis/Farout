
package net.mcreator.far_out.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.far_out.entity.SpaceStationRocketEntity;
import net.mcreator.far_out.client.model.ModelLauncher;

public class SpaceStationRocketRenderer extends MobRenderer<SpaceStationRocketEntity, ModelLauncher<SpaceStationRocketEntity>> {
	public SpaceStationRocketRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelLauncher(context.bakeLayer(ModelLauncher.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpaceStationRocketEntity entity) {
		return new ResourceLocation("farout:textures/entities/launcher.png");
	}
}
