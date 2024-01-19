package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Mass;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModBlocks;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class CalculatePayloadPropertiesProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		boolean InterplanatryCapable = false;
		double Mass = 0;
		double FuelCapacity = 0;
		double FuelFraction = 0;
		double WetMass = 0;
		double DeltaV = 0;
		double ISP = 0;
		double TotalWatts = 0;
		double ExhaustVelocity = 0;
		double Watts = 0;
		double HabitationTime = 0;
		double PlanetaryDifficulty = 0;
		if (FaroutModItems.SOLAR_COLLECTOR.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
			Watts = 100;
		} else if (FaroutModBlocks.NUCLEAR_REACTOR.get().asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Watts = 500;
		} else if (FaroutModBlocks.Z_PINCH_FUSION_REACTOR.get()
				.asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
			Watts = 10000;
		} else if (FaroutModBlocks.TOKAMAKFUSIONREACTOR.get()
				.asItem() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem()) {
			Watts = 100000;
		}
		if (FaroutModItems.CHEMICAL_ROCKET_ENGINE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				&& FaroutModItems.CHEMICAL_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			ISP = 450;
			Mass = Mass + 4;
			FuelCapacity = new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(1) * 250;
			Mass = Mass + 4;
		} else if (FaroutModItems.SOLID_CORE_NUCLEAR_THERMAL_ROCKET
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				&& FaroutModItems.LIQUID_HYDROGEN_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			ISP = 950;
			Mass = Mass + 3;
			FuelCapacity = new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(1) * 200;
			Mass = Mass + 4;
		} else if (FaroutModItems.OPEN_CORE_NUCLEAR_THERMAL_ROCKET
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				&& FaroutModItems.LIQUID_HYDROGEN_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			ISP = 3000;
			Mass = Mass + 8;
			FuelCapacity = new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(1) * 200;
			Mass = Mass + 4;
		} else if (FaroutModItems.METALLIC_HYDROGEN_ENGINE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()
				&& FaroutModItems.LI_H_6_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()) {
			Mass = Mass + 10;
			ISP = 1700;
			FuelCapacity = new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(1) * 175;
			Mass = Mass + 4;
		} else if (FaroutModItems.VASMIR_ION_ENGINE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()
				&& FaroutModItems.ARGON_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			ISP = 5700;
			Watts = Watts - 2000;
			Mass = Mass + 12;
			FuelCapacity = new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(1) * 200;
			Mass = Mass + 4;
		} else if (FaroutModItems.NUCLEAR_SALT_WATER_ROCKET.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()
				&& FaroutModItems.NUCLEAR_SALT_WATER_FUEL_TANK
						.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()) {
			ISP = 6730;
			Mass = Mass + 12;
			FuelCapacity = new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(1) * 400;
			Mass = Mass + 4;
		} else if (FaroutModItems.MAGETO_INERTIAL_CONFINEMENT_FUSION_ENGINE
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				&& FaroutModItems.FUSION_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			ISP = 9500;
			Watts = Watts - 4000;
			Mass = Mass + 15;
			FuelCapacity = new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(1) * 200;
			Mass = Mass + 4;
		} else {
			FuelCapacity = 0;
			ISP = 0;
			Mass = Mass + 0;
			Watts = Watts - 0;
		}
		if (FaroutModItems.BASIC_HAB_MODULE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem()) {
			Mass = Mass + 8;
			HabitationTime = 5;
		} else if (FaroutModItems.INFLATABLE_HABITAT.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 3;
			HabitationTime = 50;
		} else if (FaroutModItems.INFLATABLE_HAB_RING.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 9;
			HabitationTime = 200;
		}
		if (FaroutModItems.BASIC_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem()) {
			Mass = Mass + 1;
			InterplanatryCapable = false;
		} else if (FaroutModItems.ADVANCED_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			InterplanatryCapable = true;
			Mass = Mass + 0.8;
		}
		if (FaroutModItems.SMALL_ATMOSPHERIC_LANDER.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 10;
		} else if (FaroutModItems.ADVANCED_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 20;
		} else if (FaroutModItems.ADVANCED_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 40;
		} else if (FaroutModItems.ADVANCED_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 80;
		}
		ExhaustVelocity = ISP * 9.8;
		WetMass = FuelCapacity + Mass;
		FuelFraction = WetMass / Mass;
		DeltaV = ExhaustVelocity * Math.log(FuelFraction);
		FaroutModVariables.MapVariables.get(world).Hab = HabitationTime;
		FaroutModVariables.MapVariables.get(world).syncData(world);
		TotalWatts = Watts + 0.5 * Mass;
		if (TotalWatts > 1) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(FaroutModItems.FAIRING.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("Delta-V", Math.round(DeltaV));
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("Watts", Watts);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("HabTime", HabitationTime);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("Mass", WetMass);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("InterplanetryCapable", InterplanatryCapable);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("Loaded", true);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("VesselName", (guistate.containsKey("text:VesselName") ? ((EditBox) guistate.get("text:VesselName")).getValue() : ""));
		}
	}
}
