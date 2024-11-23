
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
import net.mcreator.far_out.network.IncrementSpacecraftMessage;
import net.mcreator.far_out.network.DecrementSpacecraftIndexMessage;
import net.mcreator.far_out.network.ActivateLanderThrusterMessage;
import net.mcreator.far_out.FaroutMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FaroutModKeyMappings {
	public static final KeyMapping TEST = new KeyMapping("key.farout.test", GLFW.GLFW_KEY_END, "key.categories.creative") {
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
	public static final KeyMapping ACTIVATE_LANDER_THRUSTER = new KeyMapping("key.farout.activate_lander_thruster", GLFW.GLFW_KEY_Z, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new ActivateLanderThrusterMessage(0, 0));
				ActivateLanderThrusterMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ACTIVATE_LANDER_THRUSTER_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ACTIVATE_LANDER_THRUSTER_LASTPRESS);
				FaroutMod.PACKET_HANDLER.sendToServer(new ActivateLanderThrusterMessage(1, dt));
				ActivateLanderThrusterMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping INCREMENT_SPACECRAFT = new KeyMapping("key.farout.increment_spacecraft", GLFW.GLFW_KEY_RIGHT, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new IncrementSpacecraftMessage(0, 0));
				IncrementSpacecraftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DECREMENT_SPACECRAFT_INDEX = new KeyMapping("key.farout.decrement_spacecraft_index", GLFW.GLFW_KEY_LEFT, "key.categories.gameplay") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				FaroutMod.PACKET_HANDLER.sendToServer(new DecrementSpacecraftIndexMessage(0, 0));
				DecrementSpacecraftIndexMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long ACTIVATE_LANDER_THRUSTER_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TEST);
		event.register(TEST_KEY);
		event.register(YAW_INCREASE);
		event.register(YAW_DECREASE);
		event.register(ACTIVATE_LANDER_THRUSTER);
		event.register(INCREMENT_SPACECRAFT);
		event.register(DECREMENT_SPACECRAFT_INDEX);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TEST.consumeClick();
				TEST_KEY.consumeClick();
				YAW_INCREASE.consumeClick();
				YAW_DECREASE.consumeClick();
				ACTIVATE_LANDER_THRUSTER.consumeClick();
				INCREMENT_SPACECRAFT.consumeClick();
				DECREMENT_SPACECRAFT_INDEX.consumeClick();
			}
		}
	}
}
