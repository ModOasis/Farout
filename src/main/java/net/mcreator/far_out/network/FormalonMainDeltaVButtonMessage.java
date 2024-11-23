
package net.mcreator.far_out.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.FormalonMainDeltaVMenu;
import net.mcreator.far_out.procedures.OpenedRejonaProcedure;
import net.mcreator.far_out.procedures.MojaTrajectoriesProcedure;
import net.mcreator.far_out.procedures.FormalonZoomOutProcedure;
import net.mcreator.far_out.procedures.CarbosTrajectoriesProcedure;
import net.mcreator.far_out.FaroutMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FormalonMainDeltaVButtonMessage {
	private final int buttonID, x, y, z;

	public FormalonMainDeltaVButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public FormalonMainDeltaVButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(FormalonMainDeltaVButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(FormalonMainDeltaVButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = FormalonMainDeltaVMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CarbosTrajectoriesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			MojaTrajectoriesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpenedRejonaProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			FormalonZoomOutProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			CarbosTrajectoriesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			MojaTrajectoriesProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpenedRejonaProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FaroutMod.addNetworkMessage(FormalonMainDeltaVButtonMessage.class, FormalonMainDeltaVButtonMessage::buffer, FormalonMainDeltaVButtonMessage::new, FormalonMainDeltaVButtonMessage::handler);
	}
}
