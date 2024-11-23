
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FaroutModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> ECONOMY_SIZE = GameRules.register("economySize", GameRules.Category.MISC, GameRules.IntegerValue.create(1000));
	public static final GameRules.Key<GameRules.IntegerValue> AVERAGE_CAPITULATION_AMOUNT = GameRules.register("averageCapitulationAmount", GameRules.Category.MISC, GameRules.IntegerValue.create(1000));
}
