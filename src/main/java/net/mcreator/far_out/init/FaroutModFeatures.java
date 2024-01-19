
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.far_out.world.features.EtauosianBaseFeatureFeature;
import net.mcreator.far_out.world.features.EtauianBaseFeatureFeature;
import net.mcreator.far_out.FaroutMod;

@Mod.EventBusSubscriber
public class FaroutModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FaroutMod.MODID);
	public static final RegistryObject<Feature<?>> ETAUIAN_BASE_FEATURE = REGISTRY.register("etauian_base_feature", EtauianBaseFeatureFeature::new);
	public static final RegistryObject<Feature<?>> ETAUOSIAN_BASE_FEATURE = REGISTRY.register("etauosian_base_feature", EtauosianBaseFeatureFeature::new);
}
