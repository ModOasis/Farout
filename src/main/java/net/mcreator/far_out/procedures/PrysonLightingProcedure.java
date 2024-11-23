package net.mcreator.far_out.procedures;

import org.joml.Vector3f;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import java.util.regex.Pattern;
import java.util.function.Consumer;
import java.util.List;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class PrysonLightingProcedure {
	private static Pattern pattern = Pattern.compile(".*\\.procedures\\..*Procedure\\$CustomDimensionEffects");
	private static List<Consumer<Object[]>> customLights = null;
	private static Class<?> effects = null;
	private static float partialTick = 0.0F;
	private static float skyLevel = 0.0F;
	private static int pixelX = 0;
	private static int pixelY = 0;
	private static Vector3f defaultColor = null;
	private static Vector3f outputColor = null;
	private static Consumer<Object[]> consumer = params -> {
		Minecraft minecraft = Minecraft.getInstance();
		ClientLevel level = minecraft.level;
		Entity entity = minecraft.gameRenderer.getMainCamera().getEntity();
		if (entity != null) {
			partialTick = (Float) params[1];
			pixelX = (Integer) params[5];
			pixelY = (Integer) params[6];
			outputColor = (Vector3f) params[7];
			defaultColor = calculateDefaultColor();
			Vec3 pos = entity.getPosition(partialTick);
			execute(null, entity);
		}
	};

	private static Vector3f calculateDefaultColor() {
		Minecraft minecraft = Minecraft.getInstance();
		ClientLevel level = minecraft.level;
		float red = LightTexture.getBrightness(level.dimensionType(), pixelX) * 1.5F;
		float green = red * ((red * 0.6F + 0.4F) * 0.6F + 0.4F);
		float blue = red * (red * red * 0.6F + 0.4F);
		Vector3f color = new Vector3f(red, green, blue);
		if (level.effects().forceBrightLightmap()) {
			color.lerp(new Vector3f(0.99F, 1.12F, 1.0F), 0.25F);
			color.set(Mth.clamp(color.x, 0.0F, 1.0F), Mth.clamp(color.y, 0.0F, 1.0F), Mth.clamp(color.z, 0.0F, 1.0F));
		} else {
			if (pixelX == 0 && pixelY == 0)
				skyLevel = level.getSkyDarken(1.0F);
			float factor = level.getSkyFlashTime() > 0 ? 1.0F : skyLevel * 0.95F + 0.05F;
			Vector3f color2 = new Vector3f(skyLevel, skyLevel, 1.0F).lerp(new Vector3f(1.0F, 1.0F, 1.0F), 0.35F);
			color.add(color2.mul(LightTexture.getBrightness(level.dimensionType(), pixelY) * factor));
			color.lerp(new Vector3f(0.75F, 0.75F, 0.75F), 0.04F);
			if (minecraft.gameRenderer.getDarkenWorldAmount(partialTick) > 0.0F) {
				float darkAmount = minecraft.gameRenderer.getDarkenWorldAmount(partialTick);
				color.lerp(new Vector3f(color).mul(0.7F, 0.6F, 0.6F), darkAmount);
			}
		}
		return color;
	}

	public static void multiplyBlockColor(int blockColor) {
		float factor = (pixelX - pixelY) / 15.0F;
		factor = factor < 0.0F ? 0.0F : factor;
		factor = factor > 1.0F ? 1.0F : factor;
		float red = ((blockColor >> 16 & 255) / 255.0F) * factor;
		float green = ((blockColor >> 8 & 255) / 255.0F) * factor;
		float blue = ((blockColor & 255) / 255.0F) * factor;
		red = 1.0F + (red - 1.0F) * factor;
		green = 1.0F + (green - 1.0F) * factor;
		blue = 1.0F + (blue - 1.0F) * factor;
		outputColor.set(defaultColor.x * red, defaultColor.y * green, defaultColor.z * blue);
	}

	public static void multiplySkyColor(int skyColor) {
		float factor = (pixelY - pixelX) / 15.0F;
		factor = factor < 0.0F ? 0.0F : factor;
		factor = factor > 1.0F ? 1.0F : factor;
		float red = ((skyColor >> 16 & 255) / 255.0F) * factor;
		float green = ((skyColor >> 8 & 255) / 255.0F) * factor;
		float blue = ((skyColor & 255) / 255.0F) * factor;
		red = 1.0F + (red - 1.0F) * factor;
		green = 1.0F + (green - 1.0F) * factor;
		blue = 1.0F + (blue - 1.0F) * factor;
		outputColor.set(defaultColor.x * red, defaultColor.y * green, defaultColor.z * blue);
	}

	public static void setLightColor(int skyColor, int blockColor) {
		float u = pixelX / 15.0F;
		float v = pixelY / 15.0F;
		float w = Math.min(pixelX, pixelY) / 15.0F;
		float red = ((blockColor >> 16 & 255) / 255.0F) * u + ((skyColor >> 16 & 255) / 255.0F) * v + 1.0F * w;
		float green = ((blockColor >> 8 & 255) / 255.0F) * u + ((skyColor >> 8 & 255) / 255.0F) * v + 1.0F * w;
		float blue = ((blockColor & 255) / 255.0F) * u + ((skyColor & 255) / 255.0F) * v + 1.0F * w;
		red = red > 1.0F ? 1.0F : red;
		green = green > 1.0F ? 1.0F : green;
		blue = blue > 1.0F ? 1.0F : blue;
		outputColor.set(red, green, blue);
	}

	public static void setPixelColor(int x, int y, int pixelColor) {
		if (x == pixelX && y == pixelY)
			outputColor.set((pixelColor >> 16 & 255) / 255.0F, (pixelColor >> 8 & 255) / 255.0F, (pixelColor & 255) / 255.0F);
	}

	@SubscribeEvent
	public static void computeLightColor(TickEvent.RenderTickEvent event) {
		if (event.phase != TickEvent.Phase.START)
			return;
		try {
			Class<?> effects = Minecraft.getInstance().level.effects().getClass().getSuperclass();
			if (!pattern.matcher(effects.getName()).find())
				return;
			if (effects != PrysonLightingProcedure.effects) {
				PrysonLightingProcedure.effects = effects;
				PrysonLightingProcedure.customLights = (List<Consumer<Object[]>>) effects.getField("customLights").get(null);
			}
			PrysonLightingProcedure.customLights.add(consumer);
		} catch (Exception e) {
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("farout:pryson"))) {
			setLightColor(255 << 24 | 255 << 16 | 100 << 8 | 100, 255 << 24 | 255 << 16 | 100 << 8 | 100);
		}
	}
}
