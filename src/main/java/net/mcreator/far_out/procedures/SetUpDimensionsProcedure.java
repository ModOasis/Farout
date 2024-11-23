package net.mcreator.far_out.procedures;

import org.joml.Vector3f;
import org.joml.Matrix4f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RegisterDimensionSpecialEffectsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Camera;

import javax.annotation.Nullable;

import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SetUpDimensionsProcedure {
	public static class CustomDimensionEffects extends DimensionSpecialEffects {
		public static List<Consumer<Object[]>> customClouds = new ArrayList<>();
		public static List<Consumer<Object[]>> customSky = new ArrayList<>();
		public static List<Consumer<Object[]>> customWeather = new ArrayList<>();
		public static List<Consumer<Object[]>> customEffects = new ArrayList<>();
		public static List<Consumer<Object[]>> customLights = new ArrayList<>();

		public CustomDimensionEffects(float cloudHeight, boolean hasGround, DimensionSpecialEffects.SkyType skyType, boolean forceBrightLightmap, boolean constantAmbientLight) {
			super(cloudHeight, hasGround, skyType, forceBrightLightmap, constantAmbientLight);
		}

		@Override
		public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
			return color;
		}

		@Override
		public boolean isFoggyAt(int x, int y) {
			return false;
		}

		@Override
		public boolean renderClouds(ClientLevel level, int ticks, float partialTick, PoseStack poseStack, double camX, double camY, double camZ, Matrix4f projectionMatrix) {
			if (customClouds != null && !customClouds.isEmpty()) {
				for (Consumer<Object[]> consumer : customClouds)
					consumer.accept(new Object[]{level, ticks, partialTick, poseStack, camX, camY, camZ, projectionMatrix});
				customClouds.clear();
			}
			return true;
		}

		@Override
		public boolean renderSky(ClientLevel level, int ticks, float partialTick, PoseStack poseStack, Camera camera, Matrix4f projectionMatrix, boolean isFoggy, Runnable setupFog) {
			if (customSky != null && !customSky.isEmpty()) {
				for (Consumer<Object[]> consumer : customSky)
					consumer.accept(new Object[]{level, ticks, partialTick, poseStack, camera, projectionMatrix, isFoggy, setupFog});
				customSky.clear();
			}
			return true;
		}

		@Override
		public boolean renderSnowAndRain(ClientLevel level, int ticks, float partialTick, LightTexture lightTexture, double camX, double camY, double camZ) {
			if (customWeather != null && !customWeather.isEmpty()) {
				for (Consumer<Object[]> consumer : customWeather)
					consumer.accept(new Object[]{level, ticks, partialTick, lightTexture, camX, camY, camZ});
				customWeather.clear();
			}
			return true;
		}

		@Override
		public boolean tickRain(ClientLevel level, int ticks, Camera camera) {
			if (customEffects != null && !customEffects.isEmpty()) {
				for (Consumer<Object[]> consumer : customEffects)
					consumer.accept(new Object[]{level, ticks, camera});
				customEffects.clear();
			}
			return true;
		}

		@Override
		public void adjustLightmapColors(ClientLevel level, float partialTick, float skyDarken, float blockLightRedFlicker, float skyLight, int pixelX, int pixelY, Vector3f colors) {
			if (customLights != null && !customLights.isEmpty()) {
				for (Consumer<Object[]> consumer : customLights)
					consumer.accept(new Object[]{level, partialTick, skyDarken, blockLightRedFlicker, skyLight, pixelX, pixelY, colors});
				if (pixelX == 15 && pixelY == 15)
					customLights.clear();
			}
		}
	}

	public static RegisterDimensionSpecialEffectsEvent provider = null;

	public static void register(ResourceKey<Level> dimension, DimensionSpecialEffects effects) {
		provider.register(dimension.location(), effects);
	}

	public static DimensionSpecialEffects createOverworldEffects(final boolean constantWhiteLight, final boolean constantAmbientLight, final boolean fog) {
		return new CustomDimensionEffects(192.0F, true, DimensionSpecialEffects.SkyType.NORMAL, constantWhiteLight, constantAmbientLight) {
			@Override
			public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
				return color.multiply(sunHeight * 0.94F + 0.06F, sunHeight * 0.94F + 0.06F, sunHeight * 0.91F + 0.09F);
			}

			@Override
			public boolean isFoggyAt(int x, int y) {
				return fog;
			}
		};
	}

	public static DimensionSpecialEffects createNetherEffects(final boolean constantWhiteLight, final boolean constantAmbientLight, final boolean fog) {
		return new CustomDimensionEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, constantWhiteLight, constantAmbientLight) {
			@Override
			public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
				return color;
			}

			@Override
			public boolean isFoggyAt(int x, int y) {
				return fog;
			}
		};
	}

	public static DimensionSpecialEffects createEndEffects(final boolean constantWhiteLight, final boolean constantAmbientLight, final boolean fog) {
		return new CustomDimensionEffects(Float.NaN, false, DimensionSpecialEffects.SkyType.END, constantWhiteLight, constantAmbientLight) {
			@Override
			public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
				return color.scale(0.15F);
			}

			@Override
			public boolean isFoggyAt(int x, int y) {
				return fog;
			}
		};
	}

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void setupDimensions(RegisterDimensionSpecialEffectsEvent event) {
		provider = event;
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:proxmai")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:vulcan")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etauos")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:silican")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:etaui")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:glacieo")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:varas")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:carbos")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:infinatos")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:moja")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:rejona")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:melu")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:helus")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:orax")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:zev")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:oceanus")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:lestas")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:radiatos")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:pryson")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:venasion")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:kalasmos")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:neqion")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:lunon")), createOverworldEffects(false, false, false));
		register(Level.OVERWORLD, createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:callistomede")), createOverworldEffects(false, false, false));
		register(ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:deleted_mod_element")), createOverworldEffects(false, false, false));
	}
}
