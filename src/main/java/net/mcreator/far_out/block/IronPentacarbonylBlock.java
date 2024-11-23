
package net.mcreator.far_out.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.far_out.init.FaroutModFluids;

public class IronPentacarbonylBlock extends LiquidBlock {
	public IronPentacarbonylBlock() {
		super(() -> FaroutModFluids.IRON_PENTACARBONYL.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
