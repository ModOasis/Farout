
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
import net.mcreator.far_out.client.gui.VoltmeterguiScreen;
import net.mcreator.far_out.client.gui.StartingLanderGUIScreen;
import net.mcreator.far_out.client.gui.StarshipControlGUIScreen;
import net.mcreator.far_out.client.gui.StarshipComponentsGUIScreen;
import net.mcreator.far_out.client.gui.SandosMapScreen;
import net.mcreator.far_out.client.gui.RejonaMapScreen;
import net.mcreator.far_out.client.gui.RegolithSifterGUIScreen;
import net.mcreator.far_out.client.gui.ProxmaiMapScreen;
import net.mcreator.far_out.client.gui.Page3Screen;
import net.mcreator.far_out.client.gui.Page2Screen;
import net.mcreator.far_out.client.gui.Page1Screen;
import net.mcreator.far_out.client.gui.OreExtractorGUIScreen;
import net.mcreator.far_out.client.gui.OraxMapScreen;
import net.mcreator.far_out.client.gui.NuclearReactorGUIScreen;
import net.mcreator.far_out.client.gui.MissionControlGUIScreen;
import net.mcreator.far_out.client.gui.MassivoMapScreen;
import net.mcreator.far_out.client.gui.MainMapScreen;
import net.mcreator.far_out.client.gui.LowFreqIntegratedCircuitFabGUIScreen;
import net.mcreator.far_out.client.gui.LanderGUIScreen;
import net.mcreator.far_out.client.gui.IntegratedCircuitFabricatorGUIScreen;
import net.mcreator.far_out.client.gui.HydrogenFuelCellGUIScreen;
import net.mcreator.far_out.client.gui.GreenHouseGUIScreen;
import net.mcreator.far_out.client.gui.GravityChangerScreen;
import net.mcreator.far_out.client.gui.GenomeModiferGUIScreen;
import net.mcreator.far_out.client.gui.GeneticSequencerScreen;
import net.mcreator.far_out.client.gui.FusionreactorguiScreen;
import net.mcreator.far_out.client.gui.FormalonMapScreen;
import net.mcreator.far_out.client.gui.FissionFragmentStarshipGUIScreen;
import net.mcreator.far_out.client.gui.FairingGUIScreen;
import net.mcreator.far_out.client.gui.EtauiMapScreen;
import net.mcreator.far_out.client.gui.EnergymeterGUIScreen;
import net.mcreator.far_out.client.gui.ElectrolyzerGUIScreen;
import net.mcreator.far_out.client.gui.DropPodGUIScreen;
import net.mcreator.far_out.client.gui.DesktopComputerGUIScreen;
import net.mcreator.far_out.client.gui.CrystalDriveGUIScreen;
import net.mcreator.far_out.client.gui.ChemicalReactorGUIScreen;
import net.mcreator.far_out.client.gui.CentrifugalseparatorGUIScreen;
import net.mcreator.far_out.client.gui.CargoFairingGUIScreen;
import net.mcreator.far_out.client.gui.CardboardboxguiScreen;
import net.mcreator.far_out.client.gui.BiomassburnerguiScreen;
import net.mcreator.far_out.client.gui.BiologicalIncubatorGUIScreen;
import net.mcreator.far_out.client.gui.BeamInjectorGUIScreen;
import net.mcreator.far_out.client.gui.AirPurifierGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FaroutModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FaroutModMenus.NUCLEAR_REACTOR_GUI.get(), NuclearReactorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.FUSIONREACTORGUI.get(), FusionreactorguiScreen::new);
			MenuScreens.register(FaroutModMenus.VOLTMETERGUI.get(), VoltmeterguiScreen::new);
			MenuScreens.register(FaroutModMenus.CENTRIFUGALSEPARATOR_GUI.get(), CentrifugalseparatorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ENERGYMETER_GUI.get(), EnergymeterGUIScreen::new);
			MenuScreens.register(FaroutModMenus.DROP_POD_GUI.get(), DropPodGUIScreen::new);
			MenuScreens.register(FaroutModMenus.BIOMASSBURNERGUI.get(), BiomassburnerguiScreen::new);
			MenuScreens.register(FaroutModMenus.CARDBOARDBOXGUI.get(), CardboardboxguiScreen::new);
			MenuScreens.register(FaroutModMenus.REGOLITH_SIFTER_GUI.get(), RegolithSifterGUIScreen::new);
			MenuScreens.register(FaroutModMenus.AIR_PURIFIER_GUI.get(), AirPurifierGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ELECTROLYZER_GUI.get(), ElectrolyzerGUIScreen::new);
			MenuScreens.register(FaroutModMenus.GENETIC_SEQUENCER.get(), GeneticSequencerScreen::new);
			MenuScreens.register(FaroutModMenus.STARTING_LANDER_GUI.get(), StartingLanderGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CRYSTAL_DRIVE_GUI.get(), CrystalDriveGUIScreen::new);
			MenuScreens.register(FaroutModMenus.FAIRING_GUI.get(), FairingGUIScreen::new);
			MenuScreens.register(FaroutModMenus.GREEN_HOUSE_GUI.get(), GreenHouseGUIScreen::new);
			MenuScreens.register(FaroutModMenus.INTEGRATED_CIRCUIT_FABRICATOR_GUI.get(), IntegratedCircuitFabricatorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CHEMICAL_REACTOR_GUI.get(), ChemicalReactorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.BEAM_INJECTOR_GUI.get(), BeamInjectorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.SANDOS_MAP.get(), SandosMapScreen::new);
			MenuScreens.register(FaroutModMenus.ETAUI_MAP.get(), EtauiMapScreen::new);
			MenuScreens.register(FaroutModMenus.PROXMAI_MAP.get(), ProxmaiMapScreen::new);
			MenuScreens.register(FaroutModMenus.MASSIVO_MAP.get(), MassivoMapScreen::new);
			MenuScreens.register(FaroutModMenus.LOW_FREQ_INTEGRATED_CIRCUIT_FAB_GUI.get(), LowFreqIntegratedCircuitFabGUIScreen::new);
			MenuScreens.register(FaroutModMenus.FISSION_FRAGMENT_STARSHIP_GUI.get(), FissionFragmentStarshipGUIScreen::new);
			MenuScreens.register(FaroutModMenus.GENOME_MODIFER_GUI.get(), GenomeModiferGUIScreen::new);
			MenuScreens.register(FaroutModMenus.BIOLOGICAL_INCUBATOR_GUI.get(), BiologicalIncubatorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.Z_PINCH_FUSION_REACTOR_GUI.get(), ZPinchFusionReactorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.REJONA_MAP.get(), RejonaMapScreen::new);
			MenuScreens.register(FaroutModMenus.ORAX_MAP.get(), OraxMapScreen::new);
			MenuScreens.register(FaroutModMenus.MAIN_MAP.get(), MainMapScreen::new);
			MenuScreens.register(FaroutModMenus.DESKTOP_COMPUTER_GUI.get(), DesktopComputerGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CARGO_FAIRING_GUI.get(), CargoFairingGUIScreen::new);
			MenuScreens.register(FaroutModMenus.LANDER_GUI.get(), LanderGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ORE_EXTRACTOR_GUI.get(), OreExtractorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.PAGE_1.get(), Page1Screen::new);
			MenuScreens.register(FaroutModMenus.PAGE_2.get(), Page2Screen::new);
			MenuScreens.register(FaroutModMenus.PAGE_3.get(), Page3Screen::new);
			MenuScreens.register(FaroutModMenus.STARSHIP_COMPONENTS_GUI.get(), StarshipComponentsGUIScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALON_MAP.get(), FormalonMapScreen::new);
			MenuScreens.register(FaroutModMenus.GRAVITY_CHANGER.get(), GravityChangerScreen::new);
			MenuScreens.register(FaroutModMenus.STARSHIP_CONTROL_GUI.get(), StarshipControlGUIScreen::new);
			MenuScreens.register(FaroutModMenus.MISSION_CONTROL_GUI.get(), MissionControlGUIScreen::new);
			MenuScreens.register(FaroutModMenus.HYDROGEN_FUEL_CELL_GUI.get(), HydrogenFuelCellGUIScreen::new);
		});
	}
}
