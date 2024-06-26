
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.far_out.client.gui.ZPinchFusionReactorGUIScreen;
import net.mcreator.far_out.client.gui.StartingLanderGUIScreen;
import net.mcreator.far_out.client.gui.StarshipControlGUIScreen;
import net.mcreator.far_out.client.gui.StarshipComponentsGUIScreen;
import net.mcreator.far_out.client.gui.SandosMapScreen;
import net.mcreator.far_out.client.gui.RocketAssemblyManagerGUIScreen;
import net.mcreator.far_out.client.gui.RejonaMapScreen;
import net.mcreator.far_out.client.gui.RegolithSifterGUIScreen;
import net.mcreator.far_out.client.gui.ProxmaiMapScreen;
import net.mcreator.far_out.client.gui.OreExtractorGUIScreen;
import net.mcreator.far_out.client.gui.OraxMapScreen;
import net.mcreator.far_out.client.gui.MissionControlGUIScreen;
import net.mcreator.far_out.client.gui.MassivoMapScreen;
import net.mcreator.far_out.client.gui.MainMapScreen;
import net.mcreator.far_out.client.gui.LanderGUIScreen;
import net.mcreator.far_out.client.gui.IntegratedCircuitFabricatorGUIScreen;
import net.mcreator.far_out.client.gui.HydrogenFuelCellGUIScreen;
import net.mcreator.far_out.client.gui.GravityChangerScreen;
import net.mcreator.far_out.client.gui.GeneticSequencerScreen;
import net.mcreator.far_out.client.gui.FusionreactorguiScreen;
import net.mcreator.far_out.client.gui.FormalonMapScreen;
import net.mcreator.far_out.client.gui.FissionFragmentStarshipGUIScreen;
import net.mcreator.far_out.client.gui.EtauiMapScreen;
import net.mcreator.far_out.client.gui.ElectrolyzerGUIScreen;
import net.mcreator.far_out.client.gui.DesktopComputerGUIScreen;
import net.mcreator.far_out.client.gui.DesigningWorkbenchGUIScreen;
import net.mcreator.far_out.client.gui.CrystalDriveGUIScreen;
import net.mcreator.far_out.client.gui.ChemicalReactorGUIScreen;
import net.mcreator.far_out.client.gui.CargoFairingGUIScreen;
import net.mcreator.far_out.client.gui.BeamInjectorGUIScreen;
import net.mcreator.far_out.client.gui.AmmeterGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FaroutModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FaroutModMenus.FUSIONREACTORGUI.get(), FusionreactorguiScreen::new);
			MenuScreens.register(FaroutModMenus.REGOLITH_SIFTER_GUI.get(), RegolithSifterGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ELECTROLYZER_GUI.get(), ElectrolyzerGUIScreen::new);
			MenuScreens.register(FaroutModMenus.GENETIC_SEQUENCER.get(), GeneticSequencerScreen::new);
			MenuScreens.register(FaroutModMenus.STARTING_LANDER_GUI.get(), StartingLanderGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CRYSTAL_DRIVE_GUI.get(), CrystalDriveGUIScreen::new);
			MenuScreens.register(FaroutModMenus.INTEGRATED_CIRCUIT_FABRICATOR_GUI.get(), IntegratedCircuitFabricatorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CHEMICAL_REACTOR_GUI.get(), ChemicalReactorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.BEAM_INJECTOR_GUI.get(), BeamInjectorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.SANDOS_MAP.get(), SandosMapScreen::new);
			MenuScreens.register(FaroutModMenus.ETAUI_MAP.get(), EtauiMapScreen::new);
			MenuScreens.register(FaroutModMenus.PROXMAI_MAP.get(), ProxmaiMapScreen::new);
			MenuScreens.register(FaroutModMenus.MASSIVO_MAP.get(), MassivoMapScreen::new);
			MenuScreens.register(FaroutModMenus.FISSION_FRAGMENT_STARSHIP_GUI.get(), FissionFragmentStarshipGUIScreen::new);
			MenuScreens.register(FaroutModMenus.Z_PINCH_FUSION_REACTOR_GUI.get(), ZPinchFusionReactorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.REJONA_MAP.get(), RejonaMapScreen::new);
			MenuScreens.register(FaroutModMenus.ORAX_MAP.get(), OraxMapScreen::new);
			MenuScreens.register(FaroutModMenus.MAIN_MAP.get(), MainMapScreen::new);
			MenuScreens.register(FaroutModMenus.DESKTOP_COMPUTER_GUI.get(), DesktopComputerGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CARGO_FAIRING_GUI.get(), CargoFairingGUIScreen::new);
			MenuScreens.register(FaroutModMenus.LANDER_GUI.get(), LanderGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ORE_EXTRACTOR_GUI.get(), OreExtractorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.STARSHIP_COMPONENTS_GUI.get(), StarshipComponentsGUIScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALON_MAP.get(), FormalonMapScreen::new);
			MenuScreens.register(FaroutModMenus.GRAVITY_CHANGER.get(), GravityChangerScreen::new);
			MenuScreens.register(FaroutModMenus.STARSHIP_CONTROL_GUI.get(), StarshipControlGUIScreen::new);
			MenuScreens.register(FaroutModMenus.MISSION_CONTROL_GUI.get(), MissionControlGUIScreen::new);
			MenuScreens.register(FaroutModMenus.HYDROGEN_FUEL_CELL_GUI.get(), HydrogenFuelCellGUIScreen::new);
			MenuScreens.register(FaroutModMenus.AMMETER_GUI.get(), AmmeterGUIScreen::new);
			MenuScreens.register(FaroutModMenus.DESIGNING_WORKBENCH_GUI.get(), DesigningWorkbenchGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ROCKET_ASSEMBLY_MANAGER_GUI.get(), RocketAssemblyManagerGUIScreen::new);
		});
	}
}
