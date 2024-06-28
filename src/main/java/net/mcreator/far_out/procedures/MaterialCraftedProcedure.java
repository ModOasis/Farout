package net.mcreator.far_out.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;

import net.mcreator.far_out.FaroutMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MaterialCraftedProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getCrafting());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		String CurrentMaterial = "";
		if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("Ingot")) {
			CurrentMaterial = (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace("ingot", "");
			FaroutMod.LOGGER.info((CurrentMaterial).toLowerCase() + "_ore_block_recipe");
			FaroutMod.LOGGER.info((CurrentMaterial).toLowerCase() + "_block_ore_recipe");
		}
	}
}
