
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

public abstract class SulfuricAcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> FaroutModFluidTypes.SULFURIC_ACID_TYPE.get(), () -> FaroutModFluids.SULFURIC_ACID.get(), () -> FaroutModFluids.FLOWING_SULFURIC_ACID.get())
			.explosionResistance(100f).tickRate(4).bucket(() -> FaroutModItems.SULFURIC_ACID_BUCKET.get()).block(() -> (LiquidBlock) FaroutModBlocks.SULFURIC_ACID.get());

	private SulfuricAcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SulfuricAcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SulfuricAcidFluid {
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
