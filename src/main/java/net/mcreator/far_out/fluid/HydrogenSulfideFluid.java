
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

public abstract class HydrogenSulfideFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FaroutModFluidTypes.HYDROGEN_SULFIDE_TYPE.get(), () -> FaroutModFluids.HYDROGEN_SULFIDE.get(),
			() -> FaroutModFluids.FLOWING_HYDROGEN_SULFIDE.get()).explosionResistance(100f).bucket(() -> FaroutModItems.HYDROGEN_SULFIDE_BUCKET.get()).block(() -> (LiquidBlock) FaroutModBlocks.HYDROGEN_SULFIDE.get());

	private HydrogenSulfideFluid() {
		super(PROPERTIES);
	}

	public static class Source extends HydrogenSulfideFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends HydrogenSulfideFluid {
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
