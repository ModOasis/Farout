
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.far_out.client.model.Modelsteve;
import net.mcreator.far_out.client.model.Modelcustom_model;
import net.mcreator.far_out.client.model.ModelVotodSuited;
import net.mcreator.far_out.client.model.ModelVotod;
import net.mcreator.far_out.client.model.ModelUnssembledLaunchVehicle;
import net.mcreator.far_out.client.model.ModelUnmanned_lander;
import net.mcreator.far_out.client.model.ModelUnfittedLaunchVehicle;
import net.mcreator.far_out.client.model.ModelStartingLander;
import net.mcreator.far_out.client.model.ModelSpaceSuitLeggings;
import net.mcreator.far_out.client.model.ModelSpaceSuitFixedHead;
import net.mcreator.far_out.client.model.ModelSpaceSuitFixed;
import net.mcreator.far_out.client.model.ModelSpaceSuitBody;
import net.mcreator.far_out.client.model.ModelSpaceSuit2;
import net.mcreator.far_out.client.model.ModelSpaceSuit;
import net.mcreator.far_out.client.model.ModelSpaceCapusle;
import net.mcreator.far_out.client.model.ModelSounding_Rocket;
import net.mcreator.far_out.client.model.ModelSmallRocketNoFairing;
import net.mcreator.far_out.client.model.ModelSmallRocket;
import net.mcreator.far_out.client.model.ModelSky_Hydrozoan;
import net.mcreator.far_out.client.model.ModelRocketNoFairing;
import net.mcreator.far_out.client.model.ModelPlane1;
import net.mcreator.far_out.client.model.ModelLauncher;
import net.mcreator.far_out.client.model.ModelLaunchVehicle;
import net.mcreator.far_out.client.model.ModelLatticeConfinementFusionReactor;
import net.mcreator.far_out.client.model.ModelLandingModule;
import net.mcreator.far_out.client.model.ModelLander;
import net.mcreator.far_out.client.model.ModelInflatableGreenHouse;
import net.mcreator.far_out.client.model.ModelFlutefish;
import net.mcreator.far_out.client.model.ModelFarOut_spacesuit_head;
import net.mcreator.far_out.client.model.ModelCargoPod;
import net.mcreator.far_out.client.model.ModelCapsule;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FaroutModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSmallRocket.LAYER_LOCATION, ModelSmallRocket::createBodyLayer);
		event.registerLayerDefinition(ModelUnmanned_lander.LAYER_LOCATION, ModelUnmanned_lander::createBodyLayer);
		event.registerLayerDefinition(ModelSpaceSuitLeggings.LAYER_LOCATION, ModelSpaceSuitLeggings::createBodyLayer);
		event.registerLayerDefinition(ModelUnssembledLaunchVehicle.LAYER_LOCATION, ModelUnssembledLaunchVehicle::createBodyLayer);
		event.registerLayerDefinition(ModelSpaceSuitBody.LAYER_LOCATION, ModelSpaceSuitBody::createBodyLayer);
		event.registerLayerDefinition(ModelSky_Hydrozoan.LAYER_LOCATION, ModelSky_Hydrozoan::createBodyLayer);
		event.registerLayerDefinition(ModelSpaceSuit.LAYER_LOCATION, ModelSpaceSuit::createBodyLayer);
		event.registerLayerDefinition(ModelVotodSuited.LAYER_LOCATION, ModelVotodSuited::createBodyLayer);
		event.registerLayerDefinition(ModelSpaceSuit2.LAYER_LOCATION, ModelSpaceSuit2::createBodyLayer);
		event.registerLayerDefinition(ModelStartingLander.LAYER_LOCATION, ModelStartingLander::createBodyLayer);
		event.registerLayerDefinition(ModelVotod.LAYER_LOCATION, ModelVotod::createBodyLayer);
		event.registerLayerDefinition(ModelLatticeConfinementFusionReactor.LAYER_LOCATION, ModelLatticeConfinementFusionReactor::createBodyLayer);
		event.registerLayerDefinition(ModelLaunchVehicle.LAYER_LOCATION, ModelLaunchVehicle::createBodyLayer);
		event.registerLayerDefinition(ModelSpaceSuitFixedHead.LAYER_LOCATION, ModelSpaceSuitFixedHead::createBodyLayer);
		event.registerLayerDefinition(ModelSpaceCapusle.LAYER_LOCATION, ModelSpaceCapusle::createBodyLayer);
		event.registerLayerDefinition(ModelSmallRocketNoFairing.LAYER_LOCATION, ModelSmallRocketNoFairing::createBodyLayer);
		event.registerLayerDefinition(ModelUnfittedLaunchVehicle.LAYER_LOCATION, ModelUnfittedLaunchVehicle::createBodyLayer);
		event.registerLayerDefinition(ModelCapsule.LAYER_LOCATION, ModelCapsule::createBodyLayer);
		event.registerLayerDefinition(Modelsteve.LAYER_LOCATION, Modelsteve::createBodyLayer);
		event.registerLayerDefinition(ModelPlane1.LAYER_LOCATION, ModelPlane1::createBodyLayer);
		event.registerLayerDefinition(ModelSounding_Rocket.LAYER_LOCATION, ModelSounding_Rocket::createBodyLayer);
		event.registerLayerDefinition(ModelFarOut_spacesuit_head.LAYER_LOCATION, ModelFarOut_spacesuit_head::createBodyLayer);
		event.registerLayerDefinition(ModelSpaceSuitFixed.LAYER_LOCATION, ModelSpaceSuitFixed::createBodyLayer);
		event.registerLayerDefinition(ModelLandingModule.LAYER_LOCATION, ModelLandingModule::createBodyLayer);
		event.registerLayerDefinition(ModelRocketNoFairing.LAYER_LOCATION, ModelRocketNoFairing::createBodyLayer);
		event.registerLayerDefinition(ModelLauncher.LAYER_LOCATION, ModelLauncher::createBodyLayer);
		event.registerLayerDefinition(ModelFlutefish.LAYER_LOCATION, ModelFlutefish::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(ModelCargoPod.LAYER_LOCATION, ModelCargoPod::createBodyLayer);
		event.registerLayerDefinition(ModelInflatableGreenHouse.LAYER_LOCATION, ModelInflatableGreenHouse::createBodyLayer);
		event.registerLayerDefinition(ModelLander.LAYER_LOCATION, ModelLander::createBodyLayer);
	}
}
