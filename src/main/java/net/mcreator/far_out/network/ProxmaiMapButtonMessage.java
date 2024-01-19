
package net.mcreator.far_out.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.ProxmaiMapMenu;
import net.mcreator.far_out.procedures.ZoomOutProcedure;
import net.mcreator.far_out.procedures.VulcanTrajectoriesProcedure;
import net.mcreator.far_out.procedures.ProxmaiTrajectoriesProcedure;
import net.mcreator.far_out.FaroutMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProxmaiMapButtonMessage {
	private final int buttonID, x, y, z;

	public ProxmaiMapButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ProxmaiMapButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ProxmaiMapButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ProxmaiMapButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ProxmaiMapMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ZoomOutProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			ProxmaiTrajectoriesProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			VulcanTrajectoriesProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FaroutMod.addNetworkMessage(ProxmaiMapButtonMessage.class, ProxmaiMapButtonMessage::buffer, ProxmaiMapButtonMessage::new, ProxmaiMapButtonMessage::handler);
	}
}
