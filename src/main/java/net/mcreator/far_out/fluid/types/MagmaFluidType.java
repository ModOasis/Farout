
package net.mcreator.far_out.fluid.types;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class MagmaFluidType extends FluidType {
	public MagmaFluidType() {
		super(FluidType.Properties.create().canSwim(false).canDrown(false).pathType(BlockPathTypes.LAVA).adjacentPathType(null).motionScale(0.007D).density(5000).viscosity(10000).temperature(1500)
				.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@Override
	public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
		consumer.accept(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = new ResourceLocation("farout:block/magma"), FLOWING_TEXTURE = new ResourceLocation("farout:block/magma");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		});
	}
}
