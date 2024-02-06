
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.far_out.network.YawIncreaseMessage;
import net.mcreator.far_out.network.YawDecreaseMessage;
import net.mcreator.far_out.network.TestMessage;
import net.mcreator.far_out.network.TestKeyMessage;
import net.mcreator.far_out.network.PitchIncreaseMessage;
import net.mcreator.far_out.network.PitchDecreaseMessage;
import net.mcreator.far_out.network.LaunchMessage;
import net.mcreator.far_out.network.EngineIgniteMessage;
import net.mcreator.far_out.FaroutMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FaroutModKeyMappings {
	public static final KeyMapping TEST = new KeyMapping("key.farout.test", GLFW.GLFW_KEY_KP_ADD, "key.categories.creative") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new TestMessage(0, 0));
				TestMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping TEST_KEY = new KeyMapping("key.farout.test_key", GLFW.GLFW_KEY_RIGHT_SHIFT, "key.categories.creative") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new TestKeyMessage(0, 0));
				TestKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LAUNCH = new KeyMapping("key.farout.launch", GLFW.GLFW_KEY_ENTER, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new LaunchMessage(0, 0));
				LaunchMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PITCH_DECREASE = new KeyMapping("key.farout.pitch_decrease", GLFW.GLFW_KEY_DOWN, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new PitchDecreaseMessage(0, 0));
				PitchDecreaseMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping PITCH_INCREASE = new KeyMapping("key.farout.pitch_increase", GLFW.GLFW_KEY_UP, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new PitchIncreaseMessage(0, 0));
				PitchIncreaseMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping YAW_INCREASE = new KeyMapping("key.farout.yaw_increase", GLFW.GLFW_KEY_RIGHT, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new YawIncreaseMessage(0, 0));
				YawIncreaseMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping YAW_DECREASE = new KeyMapping("key.farout.yaw_decrease", GLFW.GLFW_KEY_LEFT, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new YawDecreaseMessage(0, 0));
				YawDecreaseMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ENGINE_IGNITE = new KeyMapping("key.farout.engine_ignite", GLFW.GLFW_KEY_Z, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new EngineIgniteMessage(0, 0));
				EngineIgniteMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ENGINE_IGNITE_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ENGINE_IGNITE_LASTPRESS);
				FaroutMod.PACKET_HANDLER.sendToServer(new EngineIgniteMessage(1, dt));
				EngineIgniteMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long ENGINE_IGNITE_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TEST);
		event.register(TEST_KEY);
		event.register(LAUNCH);
		event.register(PITCH_DECREASE);
		event.register(PITCH_INCREASE);
		event.register(YAW_INCREASE);
		event.register(YAW_DECREASE);
		event.register(ENGINE_IGNITE);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TEST.consumeClick();
				TEST_KEY.consumeClick();
				LAUNCH.consumeClick();
				PITCH_DECREASE.consumeClick();
				PITCH_INCREASE.consumeClick();
				YAW_INCREASE.consumeClick();
				YAW_DECREASE.consumeClick();
				ENGINE_IGNITE.consumeClick();
			}
		}
	}
}
