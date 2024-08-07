package net.mcreator.far_out.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.far_out.init.FaroutModBlockEntities;
import net.mcreator.far_out.block.renderer.StirlingEngineTileRenderer;
import net.mcreator.far_out.block.renderer.RocketAssemblerTileRenderer;
import net.mcreator.far_out.FaroutMod;

@Mod.EventBusSubscriber(modid = FaroutMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FaroutModBlockEntities.STIRLING_ENGINE.get(), context -> new StirlingEngineTileRenderer());
		event.registerBlockEntityRenderer(FaroutModBlockEntities.ROCKET_ASSEMBLER.get(), context -> new RocketAssemblerTileRenderer());
	}
}
