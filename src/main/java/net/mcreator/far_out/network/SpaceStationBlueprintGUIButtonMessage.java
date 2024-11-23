
package net.mcreator.far_out.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.SpaceStationBlueprintGUIMenu;
import net.mcreator.far_out.procedures.SwitchToSpacecraftProcedure;
import net.mcreator.far_out.procedures.SwitchToSSTOProcedure;
import net.mcreator.far_out.procedures.IncrementProductionPointsProcedure;
import net.mcreator.far_out.procedures.IncrementEnergyPointsProcedure;
import net.mcreator.far_out.procedures.DecrementStoragePointsProcedure;
import net.mcreator.far_out.procedures.DecrementProductionPointsProcedure;
import net.mcreator.far_out.procedures.DecrementEnergyPointsProcedure;
import net.mcreator.far_out.procedures.CopyDataToBlueprintProcedure;
import net.mcreator.far_out.FaroutMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpaceStationBlueprintGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SpaceStationBlueprintGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SpaceStationBlueprintGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SpaceStationBlueprintGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SpaceStationBlueprintGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = SpaceStationBlueprintGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			IncrementProductionPointsProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			IncrementEnergyPointsProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			DecrementEnergyPointsProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			DecrementStoragePointsProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			DecrementProductionPointsProcedure.execute(world, x, y, z);
		}
		if (buttonID == 6) {

			SwitchToSpacecraftProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			CopyDataToBlueprintProcedure.execute(world, x, y, z, entity, guistate);
		}
		if (buttonID == 8) {

			SwitchToSSTOProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FaroutMod.addNetworkMessage(SpaceStationBlueprintGUIButtonMessage.class, SpaceStationBlueprintGUIButtonMessage::buffer, SpaceStationBlueprintGUIButtonMessage::new, SpaceStationBlueprintGUIButtonMessage::handler);
	}
}
