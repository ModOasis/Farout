
package net.mcreator.far_out.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.far_out.entity.LaunchVehicleEntity;
import net.mcreator.far_out.client.model.ModelSmallRocket;

public class LaunchVehicleRenderer extends MobRenderer<LaunchVehicleEntity, ModelSmallRocket<LaunchVehicleEntity>> {
	public LaunchVehicleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSmallRocket(context.bakeLayer(ModelSmallRocket.LAYER_LOCATION)), 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(LaunchVehicleEntity entity) {
		return new ResourceLocation("farout:textures/entities/smallrockettex.png");
	}
}
