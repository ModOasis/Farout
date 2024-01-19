
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

public abstract class ChlorellaCultureFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FaroutModFluidTypes.CHLORELLA_CULTURE_TYPE.get(), () -> FaroutModFluids.CHLORELLA_CULTURE.get(),
			() -> FaroutModFluids.FLOWING_CHLORELLA_CULTURE.get()).explosionResistance(100f).bucket(() -> FaroutModItems.CHLORELLA_CULTURE_BUCKET.get()).block(() -> (LiquidBlock) FaroutModBlocks.CHLORELLA_CULTURE.get());

	private ChlorellaCultureFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ChlorellaCultureFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ChlorellaCultureFluid {
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
