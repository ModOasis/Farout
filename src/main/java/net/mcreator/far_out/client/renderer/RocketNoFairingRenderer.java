
package net.mcreator.far_out.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.far_out.entity.RocketNoFairingEntity;
import net.mcreator.far_out.client.model.ModelUnfittedLaunchVehicle;

public class RocketNoFairingRenderer extends MobRenderer<RocketNoFairingEntity, ModelUnfittedLaunchVehicle<RocketNoFairingEntity>> {
	public RocketNoFairingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUnfittedLaunchVehicle(context.bakeLayer(ModelUnfittedLaunchVehicle.LAYER_LOCATION)), 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(RocketNoFairingEntity entity) {
		return new ResourceLocation("farout:textures/entities/smallrockettex.png");
	}
}
