
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.far_out.client.gui.ZanavosMapScreen;
import net.mcreator.far_out.client.gui.ZPinchFusionReactorGUIScreen;
import net.mcreator.far_out.client.gui.TuQegMapScreen;
import net.mcreator.far_out.client.gui.TradingGUIScreen;
import net.mcreator.far_out.client.gui.TaukuaMapScreen;
import net.mcreator.far_out.client.gui.TableOfContentsScreen;
import net.mcreator.far_out.client.gui.StationReadyForLaunchGUIScreen;
import net.mcreator.far_out.client.gui.StartingLanderGUIScreen;
import net.mcreator.far_out.client.gui.SpacecraftTrajectoriesScreen;
import net.mcreator.far_out.client.gui.SpacecraftPropertiesScreen;
import net.mcreator.far_out.client.gui.SpaceStationLaunchGUIScreen;
import net.mcreator.far_out.client.gui.SpaceStationGUIScreen;
import net.mcreator.far_out.client.gui.SpaceStationBlueprintGUIScreen;
import net.mcreator.far_out.client.gui.SandosProxmaiMapScreen;
import net.mcreator.far_out.client.gui.SandosMassivoMapScreen;
import net.mcreator.far_out.client.gui.SandosMapScreen;
import net.mcreator.far_out.client.gui.SandosEtauiMapScreen;
import net.mcreator.far_out.client.gui.RomProgrammingStartGUIScreen;
import net.mcreator.far_out.client.gui.RocketyPg4Screen;
import net.mcreator.far_out.client.gui.RocketryPg9Screen;
import net.mcreator.far_out.client.gui.RocketryPg8Screen;
import net.mcreator.far_out.client.gui.RocketryPg7Screen;
import net.mcreator.far_out.client.gui.RocketryPg6Screen;
import net.mcreator.far_out.client.gui.RocketryPg5Screen;
import net.mcreator.far_out.client.gui.RocketryPg3Screen;
import net.mcreator.far_out.client.gui.RocketryPg2Screen;
import net.mcreator.far_out.client.gui.RocketryPg1Screen;
import net.mcreator.far_out.client.gui.RocketAssemblyManagerGUIScreen;
import net.mcreator.far_out.client.gui.RejonaMapScreen;
import net.mcreator.far_out.client.gui.RejonaGUIScreen;
import net.mcreator.far_out.client.gui.RejonaGUIInterstellarScreen;
import net.mcreator.far_out.client.gui.RecipesGUIScreen;
import net.mcreator.far_out.client.gui.ReadyForLaunchGUIScreen;
import net.mcreator.far_out.client.gui.QuaTuMapScreen;
import net.mcreator.far_out.client.gui.OreExtractorGUIScreen;
import net.mcreator.far_out.client.gui.OraxMapScreen;
import net.mcreator.far_out.client.gui.OraxGUIScreen;
import net.mcreator.far_out.client.gui.OraxGUIInterstellarScreen;
import net.mcreator.far_out.client.gui.NuclearReactorGUIScreen;
import net.mcreator.far_out.client.gui.MissionControlGUIScreen;
import net.mcreator.far_out.client.gui.MethanePolymerizerRecipesScreen;
import net.mcreator.far_out.client.gui.MethanePolymerizerGUIScreen;
import net.mcreator.far_out.client.gui.MatterAntimatterCompressorGUIScreen;
import net.mcreator.far_out.client.gui.MainMapScreen;
import net.mcreator.far_out.client.gui.IntgratedCircuitFabricatorRecipesGUIScreen;
import net.mcreator.far_out.client.gui.IntegratedCircutFabricatorRecipesScreen;
import net.mcreator.far_out.client.gui.IntegratedCircuitFabricatorGUIScreen;
import net.mcreator.far_out.client.gui.HydrogenFuelCellRecipesScreen;
import net.mcreator.far_out.client.gui.HydrogenFuelCellGUIScreen;
import net.mcreator.far_out.client.gui.HelpGUIScreen;
import net.mcreator.far_out.client.gui.GravityChangerScreen;
import net.mcreator.far_out.client.gui.GlobularClusterMapScreen;
import net.mcreator.far_out.client.gui.GlobularClusterMapAfterDiscoveryScreen;
import net.mcreator.far_out.client.gui.GeneticSequencerScreen;
import net.mcreator.far_out.client.gui.FusionreactorguiScreen;
import net.mcreator.far_out.client.gui.FusionReactorRecipesGUIScreen;
import net.mcreator.far_out.client.gui.Formalonx2Screen;
import net.mcreator.far_out.client.gui.Formalonx2InterstellarScreen;
import net.mcreator.far_out.client.gui.Formalonx2DeltaVScreen;
import net.mcreator.far_out.client.gui.FormalonRejonaMapScreen;
import net.mcreator.far_out.client.gui.FormalonOraxMapScreen;
import net.mcreator.far_out.client.gui.FormalonMapScreen;
import net.mcreator.far_out.client.gui.FormalonMainScreen;
import net.mcreator.far_out.client.gui.FormalonMainInterstellarScreen;
import net.mcreator.far_out.client.gui.FormalonMainDeltaVScreen;
import net.mcreator.far_out.client.gui.ElectrolyzerGUIScreen;
import net.mcreator.far_out.client.gui.ElectrolyzerGUIRecipesScreen;
import net.mcreator.far_out.client.gui.DesktopComputerGUIScreen;
import net.mcreator.far_out.client.gui.DesigningWorkbenchGUIScreen;
import net.mcreator.far_out.client.gui.CrystalDriveGUIScreen;
import net.mcreator.far_out.client.gui.CoalGasificationReactorRecipesScreen;
import net.mcreator.far_out.client.gui.CoalGasificationReactorGUIScreen;
import net.mcreator.far_out.client.gui.ChemistryWorkbenchGUIScreen;
import net.mcreator.far_out.client.gui.CargoSSTOBlueprintGUIScreen;
import net.mcreator.far_out.client.gui.CalculatorGUIScreen;
import net.mcreator.far_out.client.gui.BlankPageScreen;
import net.mcreator.far_out.client.gui.BeamInjectorGUIScreen;
import net.mcreator.far_out.client.gui.AvionicsProgrammingGUIScreen;
import net.mcreator.far_out.client.gui.AtmosphericLiquidiferGUIScreen;
import net.mcreator.far_out.client.gui.AmmeterGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FaroutModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(FaroutModMenus.FUSIONREACTORGUI.get(), FusionreactorguiScreen::new);
			MenuScreens.register(FaroutModMenus.ELECTROLYZER_GUI.get(), ElectrolyzerGUIScreen::new);
			MenuScreens.register(FaroutModMenus.GENETIC_SEQUENCER.get(), GeneticSequencerScreen::new);
			MenuScreens.register(FaroutModMenus.STARTING_LANDER_GUI.get(), StartingLanderGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CRYSTAL_DRIVE_GUI.get(), CrystalDriveGUIScreen::new);
			MenuScreens.register(FaroutModMenus.INTEGRATED_CIRCUIT_FABRICATOR_GUI.get(), IntegratedCircuitFabricatorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.BEAM_INJECTOR_GUI.get(), BeamInjectorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.SANDOS_MAP.get(), SandosMapScreen::new);
			MenuScreens.register(FaroutModMenus.Z_PINCH_FUSION_REACTOR_GUI.get(), ZPinchFusionReactorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.REJONA_MAP.get(), RejonaMapScreen::new);
			MenuScreens.register(FaroutModMenus.ORAX_MAP.get(), OraxMapScreen::new);
			MenuScreens.register(FaroutModMenus.MAIN_MAP.get(), MainMapScreen::new);
			MenuScreens.register(FaroutModMenus.DESKTOP_COMPUTER_GUI.get(), DesktopComputerGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ORE_EXTRACTOR_GUI.get(), OreExtractorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.GRAVITY_CHANGER.get(), GravityChangerScreen::new);
			MenuScreens.register(FaroutModMenus.MISSION_CONTROL_GUI.get(), MissionControlGUIScreen::new);
			MenuScreens.register(FaroutModMenus.HYDROGEN_FUEL_CELL_GUI.get(), HydrogenFuelCellGUIScreen::new);
			MenuScreens.register(FaroutModMenus.AMMETER_GUI.get(), AmmeterGUIScreen::new);
			MenuScreens.register(FaroutModMenus.DESIGNING_WORKBENCH_GUI.get(), DesigningWorkbenchGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ROCKET_ASSEMBLY_MANAGER_GUI.get(), RocketAssemblyManagerGUIScreen::new);
			MenuScreens.register(FaroutModMenus.READY_FOR_LAUNCH_GUI.get(), ReadyForLaunchGUIScreen::new);
			MenuScreens.register(FaroutModMenus.COAL_GASIFICATION_REACTOR_GUI.get(), CoalGasificationReactorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.SPACE_STATION_BLUEPRINT_GUI.get(), SpaceStationBlueprintGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CARGO_SSTO_BLUEPRINT_GUI.get(), CargoSSTOBlueprintGUIScreen::new);
			MenuScreens.register(FaroutModMenus.STATION_READY_FOR_LAUNCH_GUI.get(), StationReadyForLaunchGUIScreen::new);
			MenuScreens.register(FaroutModMenus.SPACE_STATION_GUI.get(), SpaceStationGUIScreen::new);
			MenuScreens.register(FaroutModMenus.SPACE_STATION_LAUNCH_GUI.get(), SpaceStationLaunchGUIScreen::new);
			MenuScreens.register(FaroutModMenus.TABLE_OF_CONTENTS.get(), TableOfContentsScreen::new);
			MenuScreens.register(FaroutModMenus.ROCKETRY_PG_1.get(), RocketryPg1Screen::new);
			MenuScreens.register(FaroutModMenus.FORMALON_MAIN.get(), FormalonMainScreen::new);
			MenuScreens.register(FaroutModMenus.REJONA_GUI.get(), RejonaGUIScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALONX_2.get(), Formalonx2Screen::new);
			MenuScreens.register(FaroutModMenus.FORMALON_MAIN_INTERSTELLAR.get(), FormalonMainInterstellarScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALONX_2_INTERSTELLAR.get(), Formalonx2InterstellarScreen::new);
			MenuScreens.register(FaroutModMenus.REJONA_GUI_INTERSTELLAR.get(), RejonaGUIInterstellarScreen::new);
			MenuScreens.register(FaroutModMenus.ORAX_GUI.get(), OraxGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ORAX_GUI_INTERSTELLAR.get(), OraxGUIInterstellarScreen::new);
			MenuScreens.register(FaroutModMenus.ROCKETRY_PG_3.get(), RocketryPg3Screen::new);
			MenuScreens.register(FaroutModMenus.ROCKETY_PG_4.get(), RocketyPg4Screen::new);
			MenuScreens.register(FaroutModMenus.ROCKETRY_PG_5.get(), RocketryPg5Screen::new);
			MenuScreens.register(FaroutModMenus.METHANE_POLYMERIZER_GUI.get(), MethanePolymerizerGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ROCKETRY_PG_2.get(), RocketryPg2Screen::new);
			MenuScreens.register(FaroutModMenus.ROCKETRY_PG_6.get(), RocketryPg6Screen::new);
			MenuScreens.register(FaroutModMenus.ROCKETRY_PG_7.get(), RocketryPg7Screen::new);
			MenuScreens.register(FaroutModMenus.BLANK_PAGE.get(), BlankPageScreen::new);
			MenuScreens.register(FaroutModMenus.ROCKETRY_PG_8.get(), RocketryPg8Screen::new);
			MenuScreens.register(FaroutModMenus.ELECTROLYZER_GUI_RECIPES.get(), ElectrolyzerGUIRecipesScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALON_MAIN_DELTA_V.get(), FormalonMainDeltaVScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALONX_2_DELTA_V.get(), Formalonx2DeltaVScreen::new);
			MenuScreens.register(FaroutModMenus.NUCLEAR_REACTOR_GUI.get(), NuclearReactorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ROCKETRY_PG_9.get(), RocketryPg9Screen::new);
			MenuScreens.register(FaroutModMenus.FUSION_REACTOR_RECIPES_GUI.get(), FusionReactorRecipesGUIScreen::new);
			MenuScreens.register(FaroutModMenus.INTGRATED_CIRCUIT_FABRICATOR_RECIPES_GUI.get(), IntgratedCircuitFabricatorRecipesGUIScreen::new);
			MenuScreens.register(FaroutModMenus.HYDROGEN_FUEL_CELL_RECIPES.get(), HydrogenFuelCellRecipesScreen::new);
			MenuScreens.register(FaroutModMenus.COAL_GASIFICATION_REACTOR_RECIPES.get(), CoalGasificationReactorRecipesScreen::new);
			MenuScreens.register(FaroutModMenus.METHANE_POLYMERIZER_RECIPES.get(), MethanePolymerizerRecipesScreen::new);
			MenuScreens.register(FaroutModMenus.INTEGRATED_CIRCUT_FABRICATOR_RECIPES.get(), IntegratedCircutFabricatorRecipesScreen::new);
			MenuScreens.register(FaroutModMenus.RECIPES_GUI.get(), RecipesGUIScreen::new);
			MenuScreens.register(FaroutModMenus.SANDOS_ETAUI_MAP.get(), SandosEtauiMapScreen::new);
			MenuScreens.register(FaroutModMenus.SANDOS_PROXMAI_MAP.get(), SandosProxmaiMapScreen::new);
			MenuScreens.register(FaroutModMenus.SANDOS_MASSIVO_MAP.get(), SandosMassivoMapScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALON_MAP.get(), FormalonMapScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALON_ORAX_MAP.get(), FormalonOraxMapScreen::new);
			MenuScreens.register(FaroutModMenus.FORMALON_REJONA_MAP.get(), FormalonRejonaMapScreen::new);
			MenuScreens.register(FaroutModMenus.GLOBULAR_CLUSTER_MAP.get(), GlobularClusterMapScreen::new);
			MenuScreens.register(FaroutModMenus.TU_QEG_MAP.get(), TuQegMapScreen::new);
			MenuScreens.register(FaroutModMenus.ZANAVOS_MAP.get(), ZanavosMapScreen::new);
			MenuScreens.register(FaroutModMenus.QUA_TU_MAP.get(), QuaTuMapScreen::new);
			MenuScreens.register(FaroutModMenus.TAUKUA_MAP.get(), TaukuaMapScreen::new);
			MenuScreens.register(FaroutModMenus.SPACECRAFT_PROPERTIES.get(), SpacecraftPropertiesScreen::new);
			MenuScreens.register(FaroutModMenus.SPACECRAFT_TRAJECTORIES.get(), SpacecraftTrajectoriesScreen::new);
			MenuScreens.register(FaroutModMenus.TRADING_GUI.get(), TradingGUIScreen::new);
			MenuScreens.register(FaroutModMenus.MATTER_ANTIMATTER_COMPRESSOR_GUI.get(), MatterAntimatterCompressorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.ROM_PROGRAMMING_START_GUI.get(), RomProgrammingStartGUIScreen::new);
			MenuScreens.register(FaroutModMenus.AVIONICS_PROGRAMMING_GUI.get(), AvionicsProgrammingGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CALCULATOR_GUI.get(), CalculatorGUIScreen::new);
			MenuScreens.register(FaroutModMenus.GLOBULAR_CLUSTER_MAP_AFTER_DISCOVERY.get(), GlobularClusterMapAfterDiscoveryScreen::new);
			MenuScreens.register(FaroutModMenus.ATMOSPHERIC_LIQUIDIFER_GUI.get(), AtmosphericLiquidiferGUIScreen::new);
			MenuScreens.register(FaroutModMenus.HELP_GUI.get(), HelpGUIScreen::new);
			MenuScreens.register(FaroutModMenus.CHEMISTRY_WORKBENCH_GUI.get(), ChemistryWorkbenchGUIScreen::new);
		});
	}
}
