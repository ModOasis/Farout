package net.mcreator.far_out.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import net.mcreator.far_out.init.FaroutModItems;

public class TelescopeBlueprintItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble((ForgeRegistries.ITEMS.getKey(FaroutModItems.ALUMINIUM_INGOT.get()).toString()), 32);
		itemstack.getOrCreateTag().putDouble((ForgeRegistries.ITEMS.getKey(Items.IRON_INGOT).toString()), 6);
		itemstack.getOrCreateTag().putDouble((ForgeRegistries.ITEMS.getKey(FaroutModItems.COPPER_WIRE.get()).toString()), 10);
		itemstack.getOrCreateTag().putDouble((ForgeRegistries.ITEMS.getKey(FaroutModItems.METHANE.get()).toString()), 32);
		itemstack.getOrCreateTag().putDouble((ForgeRegistries.ITEMS.getKey(FaroutModItems.OXYGEN_BOTTLE.get()).toString()), 64);
		itemstack.getOrCreateTag().putDouble((ForgeRegistries.ITEMS.getKey(FaroutModItems.LOW_FREQUENCY_INTEGRATED_CIRCUIT.get()).toString()), 4);
		itemstack.getOrCreateTag().putDouble((ForgeRegistries.ITEMS.getKey(Blocks.GLASS.asItem()).toString()), 1);
		itemstack.getOrCreateTag().putDouble((ForgeRegistries.ITEMS.getKey(FaroutModItems.BASIC_SOLAR_CELL.get()).toString()), 8);
	}
}
