
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.FaroutMod;

public class FaroutModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FaroutMod.MODID);
	public static final RegistryObject<SoundEvent> ETAUI_MUSIC = REGISTRY.register("etaui_music", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "etaui_music")));
	public static final RegistryObject<SoundEvent> SKY_HYDROZOAN_DEATH = REGISTRY.register("sky_hydrozoan_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "sky_hydrozoan_death")));
	public static final RegistryObject<SoundEvent> SKY_HYDROZOAN_LIVE = REGISTRY.register("sky_hydrozoan_live", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "sky_hydrozoan_live")));
	public static final RegistryObject<SoundEvent> SKY_HYDROZOAN_HURT = REGISTRY.register("sky_hydrozoan_hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "sky_hydrozoan_hurt")));
	public static final RegistryObject<SoundEvent> ELECTRIC_HUM = REGISTRY.register("electric_hum", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "electric_hum")));
	public static final RegistryObject<SoundEvent> ROBOT_ARM_MOVE = REGISTRY.register("robot_arm_move", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "robot_arm_move")));
	public static final RegistryObject<SoundEvent> GUN_FIRE = REGISTRY.register("gun_fire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "gun_fire")));
	public static final RegistryObject<SoundEvent> RICKROLL = REGISTRY.register("rickroll", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "rickroll")));
}
