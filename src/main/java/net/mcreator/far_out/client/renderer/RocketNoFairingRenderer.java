
package net.mcreator.far_out.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.far_out.entity.RocketNoFairingEntity;
import net.mcreator.far_out.client.model.ModelSmallRocketNoFairing;

public class RocketNoFairingRenderer extends MobRenderer<RocketNoFairingEntity, ModelSmallRocketNoFairing<RocketNoFairingEntity>> {
	public RocketNoFairingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSmallRocketNoFairing(context.bakeLayer(ModelSmallRocketNoFairing.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(RocketNoFairingEntity entity) {
		return new ResourceLocation("farout:textures/entities/smallrockettex.png");
	}
}
