
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

public abstract class LiquidMethaneFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FaroutModFluidTypes.LIQUID_METHANE_TYPE.get(), () -> FaroutModFluids.LIQUID_METHANE.get(), () -> FaroutModFluids.FLOWING_LIQUID_METHANE.get())
			.explosionResistance(0f).tickRate(2).slopeFindDistance(3).bucket(() -> FaroutModItems.LIQUID_METHANE_BUCKET.get()).block(() -> (LiquidBlock) FaroutModBlocks.LIQUID_METHANE.get());

	private LiquidMethaneFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidMethaneFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidMethaneFluid {
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
