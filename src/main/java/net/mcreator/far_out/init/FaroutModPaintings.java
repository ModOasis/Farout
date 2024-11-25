
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.far_out.FaroutMod;

public class FaroutModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, FaroutMod.MODID);
	public static final RegistryObject<PaintingVariant> ELECTRONICS_AD = REGISTRY.register("electronics_ad", () -> new PaintingVariant(16, 16));
}
