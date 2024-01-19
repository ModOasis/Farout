
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

public abstract class DryWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FaroutModFluidTypes.DRY_WATER_TYPE.get(), () -> FaroutModFluids.DRY_WATER.get(), () -> FaroutModFluids.FLOWING_DRY_WATER.get())
			.explosionResistance(100f).tickRate(6).bucket(() -> FaroutModItems.DRY_WATER_BUCKET.get()).block(() -> (LiquidBlock) FaroutModBlocks.DRY_WATER.get());

	private DryWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends DryWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DryWaterFluid {
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
