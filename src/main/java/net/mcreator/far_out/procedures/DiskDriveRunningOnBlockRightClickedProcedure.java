package net.mcreator.far_out.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.far_out.world.inventory.Page1Menu;
import net.mcreator.far_out.network.FaroutModVariables;

import io.netty.buffer.Unpooled;

public class DiskDriveRunningOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _ent) {
			BlockPos _bpos = BlockPos.containing(x, y, z);
			NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Page1");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new Page1Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
				}
			}, _bpos);
		}
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:airtight_fabric_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:inflatable_module_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:inflatable_habitat_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:integrated_circuit_fabricator_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:laser_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:galactic_core_tracker_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:advanced_command_disk_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:solid_core_nuclear_thermal_rocket_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:liquid_hydrogen_fuel_tank_recipe")});
		FaroutModVariables.MapVariables.get(world).OtherPlanetsKnown = true;
		FaroutModVariables.MapVariables.get(world).syncData(world);
	}
}
