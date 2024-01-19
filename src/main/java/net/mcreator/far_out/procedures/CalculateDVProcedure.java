package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Mass;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CalculateDVProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean InterplanatryCapable = false;
		double Watts = 0;
		double Mass = 0;
		double FuelCapacity = 0;
		double FuelFraction = 0;
		double WetMass = 0;
		double DeltaV = 0;
		double ISP = 0;
		double TotalWatts = 0;
		double ExhaustVelocity = 0;
		double HabitationTime = 0;
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
			ISP = 1500;
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
			}.getAmount(1) * 150;
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
		} else if (FaroutModItems.INFLATABLE_HABITAT.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 3;
		} else if (FaroutModItems.INFLATABLE_HAB_RING.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 9;
		}
		if (FaroutModItems.BASIC_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem()) {
			Mass = Mass + 0.5;
		} else if (FaroutModItems.ADVANCED_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 1;
		}
		ExhaustVelocity = ISP * 9.8;
		WetMass = FuelCapacity + Mass;
		FuelFraction = WetMass / Mass;
		FaroutModVariables.MapVariables.get(world).DV = ExhaustVelocity * Math.log(FuelFraction);
		FaroutModVariables.MapVariables.get(world).syncData(world);
	}
}
