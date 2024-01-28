package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.Mass;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.far_out.network.FaroutModVariables;
import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class RocketPrinterGui2WhileThisGUIIsOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean InterplanatryCapable = false;
		String dV = "";
		String hab = "";
		double ISP = 0;
		double Mass = 0;
		double DeltaV = 0;
		double FuelCapacity = 0;
		double FuelTaken = 0;
		double ExhaustVelocity = 0;
		double FuelFraction = 0;
		double Watts = 0;
		double HabitationTime = 0;
		double WetMass = 0;
		double TotalWatts = 0;
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
		if (FaroutModItems.CHEMICAL_ROCKET_ENGINE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			ISP = 450;
			Mass = Mass + 0.1;
		} else if (FaroutModItems.SOLID_CORE_NUCLEAR_THERMAL_ROCKET
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
			ISP = 950;
			Mass = Mass + 1;
		} else if (FaroutModItems.OPEN_CORE_NUCLEAR_THERMAL_ROCKET
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
			ISP = 1500;
			Mass = Mass + 8;
		} else if (FaroutModItems.MAGNETOPLASMADYNAMIC_THRUSTER
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
			Mass = Mass + 1;
			ISP = 3200;
		} else if (FaroutModItems.VASMIR_ION_ENGINE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			ISP = 5700;
			Watts = Watts - 2000;
			Mass = Mass + 0.5;
		} else if (FaroutModItems.NUCLEAR_SALT_WATER_ROCKET.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			ISP = 6730;
			Mass = Mass + 5;
		} else if (FaroutModItems.MAGETO_INERTIAL_CONFINEMENT_FUSION_ENGINE
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
			ISP = 9500;
			Watts = Watts - 4000;
			Mass = Mass + 1.5;
		}
		if (FaroutModItems.CHEMICAL_ROCKET_ENGINE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				&& FaroutModItems.CHEMICAL_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			FuelCapacity = 5;
			Mass = Mass + 4;
		} else if ((FaroutModItems.OPEN_CORE_NUCLEAR_THERMAL_ROCKET
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				|| FaroutModItems.SOLID_CORE_NUCLEAR_THERMAL_ROCKET
						.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem())
				&& FaroutModItems.LIQUID_HYDROGEN_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			FuelCapacity = 1.5;
			Mass = Mass + 4;
		} else if (FaroutModItems.MAGNETOPLASMADYNAMIC_THRUSTER
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				&& FaroutModItems.LITHIUM_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			FuelCapacity = 1;
			Mass = Mass + 4;
		} else if (FaroutModItems.VASMIR_ION_ENGINE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()
				&& FaroutModItems.ARGON_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			FuelCapacity = 1;
			Mass = Mass + 4;
		} else if (FaroutModItems.NUCLEAR_SALT_WATER_ROCKET.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()
				&& FaroutModItems.NUCLEAR_SALT_WATER_FUEL_TANK
						.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem()) {
			FuelCapacity = 15;
			Mass = Mass + 4;
		} else if (FaroutModItems.MAGETO_INERTIAL_CONFINEMENT_FUSION_ENGINE
				.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
				&& FaroutModItems.FUSION_FUEL_TANK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem()) {
			FuelCapacity = 10;
			Mass = Mass + 4;
		} else {
			FuelCapacity = 0;
		}
		if (FaroutModItems.BASIC_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem()) {
			Mass = Mass + 0.1;
			InterplanatryCapable = false;
		} else if (FaroutModItems.ADVANCED_COMMAND_DISK.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			InterplanatryCapable = true;
			Mass = Mass + 0.08;
		}
		if (FaroutModItems.BASIC_HAB_MODULE.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem()) {
			Mass = Mass + 0.5;
			HabitationTime = 5;
		} else if (FaroutModItems.INFLATABLE_HABITAT.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 1.5;
			HabitationTime = 25;
		} else if (FaroutModItems.INFLATABLE_HAB_RING.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			Mass = Mass + 6.5;
			HabitationTime = 90;
		}
		ExhaustVelocity = ISP * 9.8;
		WetMass = FuelCapacity + Mass;
		FuelFraction = WetMass / Mass;
		FaroutModVariables.MapVariables.get(world).DV = DeltaV / 1000;
		FaroutModVariables.MapVariables.get(world).syncData(world);
		FaroutModVariables.MapVariables.get(world).Hab = HabitationTime;
		FaroutModVariables.MapVariables.get(world).syncData(world);
		TotalWatts = Watts + 0.5 * Mass;
		FaroutModVariables.MapVariables.get(world).SpacecraftWatts = TotalWatts;
		FaroutModVariables.MapVariables.get(world).syncData(world);
		FaroutModVariables.MapVariables.get(world).SpacecraftMass = Mass;
		FaroutModVariables.MapVariables.get(world).syncData(world);
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
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("Delta-V", (ExhaustVelocity * Math.log(FuelFraction)));
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("Watts", Watts);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("HabTime", HabitationTime);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("Mass", WetMass);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("InterplanetryCapable", InterplanatryCapable);
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putBoolean("Loaded", true);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList()
						.broadcastSystemMessage(Component.literal((" Delta V:" + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("Delta-V")) + "Watts"
								+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("Watts")) + "Hab:"
								+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("HabTime")) + "Interplanatry:"
								+ ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("InterplanetryCapable")) + "Fuel Fraction:" + FuelFraction)), false);
		}
	}
}
