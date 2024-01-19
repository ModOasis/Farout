package net.mcreator.far_out.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.FaroutMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MaterialCraftedProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getEntity(), event.getCrafting());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		String CurrentMaterial = "";
		if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("Ingot")) {
			CurrentMaterial = (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace("ingot", "");
			FaroutMod.LOGGER.info((CurrentMaterial).toLowerCase() + "_ore_block_recipe");
			FaroutMod.LOGGER.info((CurrentMaterial).toLowerCase() + "_block_ore_recipe");
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FaroutModItems.BORON_INGOT.get())) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FaroutModItems.OSMIUM_INGOT.get())) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(FaroutModItems.RHENIUM_INGOT.get())) : false)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("superalloycraft")});
		}
	}
}
