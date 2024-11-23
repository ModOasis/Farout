
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
	public static final RegistryObject<SoundEvent> MALFUNCTION = REGISTRY.register("malfunction", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "malfunction")));
	public static final RegistryObject<SoundEvent> AUTOMATIC_RIFLE_FIRE = REGISTRY.register("automatic_rifle_fire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "automatic_rifle_fire")));
	public static final RegistryObject<SoundEvent> BUTTON_PRESS = REGISTRY.register("button_press", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "button_press")));
	public static final RegistryObject<SoundEvent> BEEP = REGISTRY.register("beep", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "beep")));
	public static final RegistryObject<SoundEvent> ROCKET_ENGINE_NOISE = REGISTRY.register("rocket_engine_noise", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("farout", "rocket_engine_noise")));
}
