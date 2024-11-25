
package net.mcreator.far_out.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.DesigningWorkbenchGUIMenu;
import net.mcreator.far_out.procedures.OpenGUIsProcedure;
import net.mcreator.far_out.procedures.IncrementPropIDProcedure;
import net.mcreator.far_out.procedures.IncrementPowIDProcedure;
import net.mcreator.far_out.procedures.IncrementHabIDProcedure;
import net.mcreator.far_out.procedures.DeltaVSolverProcedure;
import net.mcreator.far_out.procedures.DecrementPropIDProcedure;
import net.mcreator.far_out.procedures.DecrementPowIDProcedure;
import net.mcreator.far_out.procedures.DecrementHabIDProcedure;
import net.mcreator.far_out.procedures.CopyDataToBlueprintProcedure;
import net.mcreator.far_out.FaroutMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DesigningWorkbenchGUIButtonMessage {
	private final int buttonID, x, y, z;

	public DesigningWorkbenchGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public DesigningWorkbenchGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(DesigningWorkbenchGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(DesigningWorkbenchGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = DesigningWorkbenchGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenGUIsProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			DeltaVSolverProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			IncrementHabIDProcedure.execute(world, x, y, z, entity, guistate);
		}
		if (buttonID == 3) {

			DecrementHabIDProcedure.execute(world, x, y, z, guistate);
		}
		if (buttonID == 4) {

			IncrementPropIDProcedure.execute(world, x, y, z, entity, guistate);
		}
		if (buttonID == 5) {

			DecrementPropIDProcedure.execute(world, x, y, z, guistate);
		}
		if (buttonID == 6) {

			IncrementPowIDProcedure.execute(world, x, y, z, entity, guistate);
		}
		if (buttonID == 7) {

			DecrementPowIDProcedure.execute(world, x, y, z, guistate);
		}
		if (buttonID == 8) {

			CopyDataToBlueprintProcedure.execute(world, x, y, z, entity, guistate);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FaroutMod.addNetworkMessage(DesigningWorkbenchGUIButtonMessage.class, DesigningWorkbenchGUIButtonMessage::buffer, DesigningWorkbenchGUIButtonMessage::new, DesigningWorkbenchGUIButtonMessage::handler);
	}
}
