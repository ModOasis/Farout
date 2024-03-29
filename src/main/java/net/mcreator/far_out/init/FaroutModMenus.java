
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.far_out.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.far_out.world.inventory.ZPinchFusionReactorGUIMenu;
import net.mcreator.far_out.world.inventory.VoltmeterguiMenu;
import net.mcreator.far_out.world.inventory.StartingLanderGUIMenu;
import net.mcreator.far_out.world.inventory.StarshipControlGUIMenu;
import net.mcreator.far_out.world.inventory.StarshipComponentsGUIMenu;
import net.mcreator.far_out.world.inventory.SandosMapMenu;
import net.mcreator.far_out.world.inventory.RejonaMapMenu;
import net.mcreator.far_out.world.inventory.RegolithSifterGUIMenu;
import net.mcreator.far_out.world.inventory.ProxmaiMapMenu;
import net.mcreator.far_out.world.inventory.Page3Menu;
import net.mcreator.far_out.world.inventory.Page2Menu;
import net.mcreator.far_out.world.inventory.Page1Menu;
import net.mcreator.far_out.world.inventory.OreExtractorGUIMenu;
import net.mcreator.far_out.world.inventory.OraxMapMenu;
import net.mcreator.far_out.world.inventory.NuclearReactorGUIMenu;
import net.mcreator.far_out.world.inventory.MissionControlGUIMenu;
import net.mcreator.far_out.world.inventory.MassivoMapMenu;
import net.mcreator.far_out.world.inventory.MainMapMenu;
import net.mcreator.far_out.world.inventory.LanderGUIMenu;
import net.mcreator.far_out.world.inventory.IntegratedCircuitFabricatorGUIMenu;
import net.mcreator.far_out.world.inventory.HydrogenFuelCellGUIMenu;
import net.mcreator.far_out.world.inventory.GreenHouseGUIMenu;
import net.mcreator.far_out.world.inventory.GravityChangerMenu;
import net.mcreator.far_out.world.inventory.GenomeModiferGUIMenu;
import net.mcreator.far_out.world.inventory.GeneticSequencerMenu;
import net.mcreator.far_out.world.inventory.FusionreactorguiMenu;
import net.mcreator.far_out.world.inventory.FormalonMapMenu;
import net.mcreator.far_out.world.inventory.FissionFragmentStarshipGUIMenu;
import net.mcreator.far_out.world.inventory.FairingGUIMenu;
import net.mcreator.far_out.world.inventory.EtauiMapMenu;
import net.mcreator.far_out.world.inventory.EnergymeterGUIMenu;
import net.mcreator.far_out.world.inventory.ElectrolyzerGUIMenu;
import net.mcreator.far_out.world.inventory.DropPodGUIMenu;
import net.mcreator.far_out.world.inventory.DesktopComputerGUIMenu;
import net.mcreator.far_out.world.inventory.CrystalDriveGUIMenu;
import net.mcreator.far_out.world.inventory.ChemicalReactorGUIMenu;
import net.mcreator.far_out.world.inventory.CentrifugalseparatorGUIMenu;
import net.mcreator.far_out.world.inventory.CargoFairingGUIMenu;
import net.mcreator.far_out.world.inventory.CardboardboxguiMenu;
import net.mcreator.far_out.world.inventory.BiomassburnerguiMenu;
import net.mcreator.far_out.world.inventory.BiologicalIncubatorGUIMenu;
import net.mcreator.far_out.world.inventory.BeamInjectorGUIMenu;
import net.mcreator.far_out.world.inventory.AirPurifierGUIMenu;
import net.mcreator.far_out.FaroutMod;

public class FaroutModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FaroutMod.MODID);
	public static final RegistryObject<MenuType<NuclearReactorGUIMenu>> NUCLEAR_REACTOR_GUI = REGISTRY.register("nuclear_reactor_gui", () -> IForgeMenuType.create(NuclearReactorGUIMenu::new));
	public static final RegistryObject<MenuType<FusionreactorguiMenu>> FUSIONREACTORGUI = REGISTRY.register("fusionreactorgui", () -> IForgeMenuType.create(FusionreactorguiMenu::new));
	public static final RegistryObject<MenuType<VoltmeterguiMenu>> VOLTMETERGUI = REGISTRY.register("voltmetergui", () -> IForgeMenuType.create(VoltmeterguiMenu::new));
	public static final RegistryObject<MenuType<CentrifugalseparatorGUIMenu>> CENTRIFUGALSEPARATOR_GUI = REGISTRY.register("centrifugalseparator_gui", () -> IForgeMenuType.create(CentrifugalseparatorGUIMenu::new));
	public static final RegistryObject<MenuType<EnergymeterGUIMenu>> ENERGYMETER_GUI = REGISTRY.register("energymeter_gui", () -> IForgeMenuType.create(EnergymeterGUIMenu::new));
	public static final RegistryObject<MenuType<DropPodGUIMenu>> DROP_POD_GUI = REGISTRY.register("drop_pod_gui", () -> IForgeMenuType.create(DropPodGUIMenu::new));
	public static final RegistryObject<MenuType<BiomassburnerguiMenu>> BIOMASSBURNERGUI = REGISTRY.register("biomassburnergui", () -> IForgeMenuType.create(BiomassburnerguiMenu::new));
	public static final RegistryObject<MenuType<CardboardboxguiMenu>> CARDBOARDBOXGUI = REGISTRY.register("cardboardboxgui", () -> IForgeMenuType.create(CardboardboxguiMenu::new));
	public static final RegistryObject<MenuType<RegolithSifterGUIMenu>> REGOLITH_SIFTER_GUI = REGISTRY.register("regolith_sifter_gui", () -> IForgeMenuType.create(RegolithSifterGUIMenu::new));
	public static final RegistryObject<MenuType<AirPurifierGUIMenu>> AIR_PURIFIER_GUI = REGISTRY.register("air_purifier_gui", () -> IForgeMenuType.create(AirPurifierGUIMenu::new));
	public static final RegistryObject<MenuType<ElectrolyzerGUIMenu>> ELECTROLYZER_GUI = REGISTRY.register("electrolyzer_gui", () -> IForgeMenuType.create(ElectrolyzerGUIMenu::new));
	public static final RegistryObject<MenuType<GeneticSequencerMenu>> GENETIC_SEQUENCER = REGISTRY.register("genetic_sequencer", () -> IForgeMenuType.create(GeneticSequencerMenu::new));
	public static final RegistryObject<MenuType<StartingLanderGUIMenu>> STARTING_LANDER_GUI = REGISTRY.register("starting_lander_gui", () -> IForgeMenuType.create(StartingLanderGUIMenu::new));
	public static final RegistryObject<MenuType<CrystalDriveGUIMenu>> CRYSTAL_DRIVE_GUI = REGISTRY.register("crystal_drive_gui", () -> IForgeMenuType.create(CrystalDriveGUIMenu::new));
	public static final RegistryObject<MenuType<FairingGUIMenu>> FAIRING_GUI = REGISTRY.register("fairing_gui", () -> IForgeMenuType.create(FairingGUIMenu::new));
	public static final RegistryObject<MenuType<GreenHouseGUIMenu>> GREEN_HOUSE_GUI = REGISTRY.register("green_house_gui", () -> IForgeMenuType.create(GreenHouseGUIMenu::new));
	public static final RegistryObject<MenuType<IntegratedCircuitFabricatorGUIMenu>> INTEGRATED_CIRCUIT_FABRICATOR_GUI = REGISTRY.register("integrated_circuit_fabricator_gui", () -> IForgeMenuType.create(IntegratedCircuitFabricatorGUIMenu::new));
	public static final RegistryObject<MenuType<ChemicalReactorGUIMenu>> CHEMICAL_REACTOR_GUI = REGISTRY.register("chemical_reactor_gui", () -> IForgeMenuType.create(ChemicalReactorGUIMenu::new));
	public static final RegistryObject<MenuType<BeamInjectorGUIMenu>> BEAM_INJECTOR_GUI = REGISTRY.register("beam_injector_gui", () -> IForgeMenuType.create(BeamInjectorGUIMenu::new));
	public static final RegistryObject<MenuType<SandosMapMenu>> SANDOS_MAP = REGISTRY.register("sandos_map", () -> IForgeMenuType.create(SandosMapMenu::new));
	public static final RegistryObject<MenuType<EtauiMapMenu>> ETAUI_MAP = REGISTRY.register("etaui_map", () -> IForgeMenuType.create(EtauiMapMenu::new));
	public static final RegistryObject<MenuType<ProxmaiMapMenu>> PROXMAI_MAP = REGISTRY.register("proxmai_map", () -> IForgeMenuType.create(ProxmaiMapMenu::new));
	public static final RegistryObject<MenuType<MassivoMapMenu>> MASSIVO_MAP = REGISTRY.register("massivo_map", () -> IForgeMenuType.create(MassivoMapMenu::new));
	public static final RegistryObject<MenuType<FissionFragmentStarshipGUIMenu>> FISSION_FRAGMENT_STARSHIP_GUI = REGISTRY.register("fission_fragment_starship_gui", () -> IForgeMenuType.create(FissionFragmentStarshipGUIMenu::new));
	public static final RegistryObject<MenuType<GenomeModiferGUIMenu>> GENOME_MODIFER_GUI = REGISTRY.register("genome_modifer_gui", () -> IForgeMenuType.create(GenomeModiferGUIMenu::new));
	public static final RegistryObject<MenuType<BiologicalIncubatorGUIMenu>> BIOLOGICAL_INCUBATOR_GUI = REGISTRY.register("biological_incubator_gui", () -> IForgeMenuType.create(BiologicalIncubatorGUIMenu::new));
	public static final RegistryObject<MenuType<ZPinchFusionReactorGUIMenu>> Z_PINCH_FUSION_REACTOR_GUI = REGISTRY.register("z_pinch_fusion_reactor_gui", () -> IForgeMenuType.create(ZPinchFusionReactorGUIMenu::new));
	public static final RegistryObject<MenuType<RejonaMapMenu>> REJONA_MAP = REGISTRY.register("rejona_map", () -> IForgeMenuType.create(RejonaMapMenu::new));
	public static final RegistryObject<MenuType<OraxMapMenu>> ORAX_MAP = REGISTRY.register("orax_map", () -> IForgeMenuType.create(OraxMapMenu::new));
	public static final RegistryObject<MenuType<MainMapMenu>> MAIN_MAP = REGISTRY.register("main_map", () -> IForgeMenuType.create(MainMapMenu::new));
	public static final RegistryObject<MenuType<DesktopComputerGUIMenu>> DESKTOP_COMPUTER_GUI = REGISTRY.register("desktop_computer_gui", () -> IForgeMenuType.create(DesktopComputerGUIMenu::new));
	public static final RegistryObject<MenuType<CargoFairingGUIMenu>> CARGO_FAIRING_GUI = REGISTRY.register("cargo_fairing_gui", () -> IForgeMenuType.create(CargoFairingGUIMenu::new));
	public static final RegistryObject<MenuType<LanderGUIMenu>> LANDER_GUI = REGISTRY.register("lander_gui", () -> IForgeMenuType.create(LanderGUIMenu::new));
	public static final RegistryObject<MenuType<OreExtractorGUIMenu>> ORE_EXTRACTOR_GUI = REGISTRY.register("ore_extractor_gui", () -> IForgeMenuType.create(OreExtractorGUIMenu::new));
	public static final RegistryObject<MenuType<Page1Menu>> PAGE_1 = REGISTRY.register("page_1", () -> IForgeMenuType.create(Page1Menu::new));
	public static final RegistryObject<MenuType<Page2Menu>> PAGE_2 = REGISTRY.register("page_2", () -> IForgeMenuType.create(Page2Menu::new));
	public static final RegistryObject<MenuType<Page3Menu>> PAGE_3 = REGISTRY.register("page_3", () -> IForgeMenuType.create(Page3Menu::new));
	public static final RegistryObject<MenuType<StarshipComponentsGUIMenu>> STARSHIP_COMPONENTS_GUI = REGISTRY.register("starship_components_gui", () -> IForgeMenuType.create(StarshipComponentsGUIMenu::new));
	public static final RegistryObject<MenuType<FormalonMapMenu>> FORMALON_MAP = REGISTRY.register("formalon_map", () -> IForgeMenuType.create(FormalonMapMenu::new));
	public static final RegistryObject<MenuType<GravityChangerMenu>> GRAVITY_CHANGER = REGISTRY.register("gravity_changer", () -> IForgeMenuType.create(GravityChangerMenu::new));
	public static final RegistryObject<MenuType<StarshipControlGUIMenu>> STARSHIP_CONTROL_GUI = REGISTRY.register("starship_control_gui", () -> IForgeMenuType.create(StarshipControlGUIMenu::new));
	public static final RegistryObject<MenuType<MissionControlGUIMenu>> MISSION_CONTROL_GUI = REGISTRY.register("mission_control_gui", () -> IForgeMenuType.create(MissionControlGUIMenu::new));
	public static final RegistryObject<MenuType<HydrogenFuelCellGUIMenu>> HYDROGEN_FUEL_CELL_GUI = REGISTRY.register("hydrogen_fuel_cell_gui", () -> IForgeMenuType.create(HydrogenFuelCellGUIMenu::new));
}
