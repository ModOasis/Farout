package net.mcreator.far_out.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

public class StarshipBlueprintRightclickedOnBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:fission_fragment_rocket_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:fission_fragment_fuel_tank_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:high_heat_load_graphene_radiators_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:starship_core_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:lander_bay_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:interstellar_habitation_module_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:fission_fragment_rocket_recipe")});
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("farout:spacecraft_construction_meterials_recipe")});
	}
}
