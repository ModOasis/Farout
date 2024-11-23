
package net.mcreator.far_out.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.CalculatorGUIMenu;
import net.mcreator.far_out.procedures.SubProcedure;
import net.mcreator.far_out.procedures.Press9Procedure;
import net.mcreator.far_out.procedures.Press8Procedure;
import net.mcreator.far_out.procedures.Press7Procedure;
import net.mcreator.far_out.procedures.Press6Procedure;
import net.mcreator.far_out.procedures.Press5Procedure;
import net.mcreator.far_out.procedures.Press4Procedure;
import net.mcreator.far_out.procedures.Press3Procedure;
import net.mcreator.far_out.procedures.Press2Procedure;
import net.mcreator.far_out.procedures.Press1Procedure;
import net.mcreator.far_out.procedures.Press0Procedure;
import net.mcreator.far_out.procedures.MulProcedure;
import net.mcreator.far_out.procedures.DivProcedure;
import net.mcreator.far_out.procedures.ClearProcedure;
import net.mcreator.far_out.procedures.CalculatorItemInInventoryTickProcedure;
import net.mcreator.far_out.procedures.AddProcedure;
import net.mcreator.far_out.FaroutMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CalculatorGUIButtonMessage {
	private final int buttonID, x, y, z;

	public CalculatorGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CalculatorGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CalculatorGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CalculatorGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CalculatorGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Press1Procedure.execute(entity);
		}
		if (buttonID == 1) {

			Press2Procedure.execute(entity);
		}
		if (buttonID == 2) {

			Press3Procedure.execute(entity);
		}
		if (buttonID == 3) {

			Press4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			Press5Procedure.execute(entity);
		}
		if (buttonID == 5) {

			Press6Procedure.execute(entity);
		}
		if (buttonID == 6) {

			Press7Procedure.execute(entity);
		}
		if (buttonID == 7) {

			Press8Procedure.execute(entity);
		}
		if (buttonID == 8) {

			Press9Procedure.execute(entity);
		}
		if (buttonID == 9) {

			Press0Procedure.execute(entity);
		}
		if (buttonID == 10) {

			AddProcedure.execute(entity);
		}
		if (buttonID == 11) {

			SubProcedure.execute(entity);
		}
		if (buttonID == 12) {

			MulProcedure.execute(entity);
		}
		if (buttonID == 13) {

			DivProcedure.execute(entity);
		}
		if (buttonID == 14) {

			CalculatorItemInInventoryTickProcedure.execute(entity);
		}
		if (buttonID == 15) {

			ClearProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FaroutMod.addNetworkMessage(CalculatorGUIButtonMessage.class, CalculatorGUIButtonMessage::buffer, CalculatorGUIButtonMessage::new, CalculatorGUIButtonMessage::handler);
	}
}
