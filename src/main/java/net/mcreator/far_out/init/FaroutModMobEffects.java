
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.far_out.potion.OxygenMobEffect;
import net.mcreator.far_out.FaroutMod;

public class FaroutModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FaroutMod.MODID);
	public static final RegistryObject<MobEffect> OXYGEN = REGISTRY.register("oxygen", () -> new OxygenMobEffect());
}
