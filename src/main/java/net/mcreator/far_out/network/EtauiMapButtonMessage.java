
package net.mcreator.far_out.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.EtauiMapMenu;
import net.mcreator.far_out.procedures.ZoomOutProcedure;
import net.mcreator.far_out.procedures.EtauosTrajectoriesProcedure;
import net.mcreator.far_out.procedures.EtauiTrajectoriesProcedure;
import net.mcreator.far_out.FaroutMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EtauiMapButtonMessage {
	private final int buttonID, x, y, z;

	public EtauiMapButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public EtauiMapButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(EtauiMapButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(EtauiMapButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = EtauiMapMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ZoomOutProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			EtauiTrajectoriesProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			EtauosTrajectoriesProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FaroutMod.addNetworkMessage(EtauiMapButtonMessage.class, EtauiMapButtonMessage::buffer, EtauiMapButtonMessage::new, EtauiMapButtonMessage::handler);
	}
}
