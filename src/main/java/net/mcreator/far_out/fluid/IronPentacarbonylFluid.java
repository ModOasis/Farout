
package net.mcreator.far_out.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModFluids;
import net.mcreator.far_out.init.FaroutModFluidTypes;
import net.mcreator.far_out.init.FaroutModBlocks;

public abstract class IronPentacarbonylFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FaroutModFluidTypes.IRON_PENTACARBONYL_TYPE.get(), () -> FaroutModFluids.IRON_PENTACARBONYL.get(),
			() -> FaroutModFluids.FLOWING_IRON_PENTACARBONYL.get()).explosionResistance(100f).tickRate(7).bucket(() -> FaroutModItems.IRON_PENTACARBONYL_BUCKET.get()).block(() -> (LiquidBlock) FaroutModBlocks.IRON_PENTACARBONYL.get());

	private IronPentacarbonylFluid() {
		super(PROPERTIES);
	}

	public static class Source extends IronPentacarbonylFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends IronPentacarbonylFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
