
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

public abstract class LiquidAmmoniaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FaroutModFluidTypes.LIQUID_AMMONIA_TYPE.get(), () -> FaroutModFluids.LIQUID_AMMONIA.get(), () -> FaroutModFluids.FLOWING_LIQUID_AMMONIA.get())
			.explosionResistance(100f).bucket(() -> FaroutModItems.LIQUID_AMMONIA_BUCKET.get()).block(() -> (LiquidBlock) FaroutModBlocks.LIQUID_AMMONIA.get());

	private LiquidAmmoniaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidAmmoniaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidAmmoniaFluid {
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
