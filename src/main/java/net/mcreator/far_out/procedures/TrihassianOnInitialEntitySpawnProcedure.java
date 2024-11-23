package net.mcreator.far_out.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.far_out.init.FaroutModItems;
import net.mcreator.far_out.init.FaroutModBlocks;
import net.mcreator.far_out.entity.TrihassianEntity;

public class TrihassianOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack ChosenItem = ItemStack.EMPTY;
		double i = 0;
		double Rand = 0;
		Rand = Mth.nextInt(RandomSource.create(), 0, 4);
		if (Rand == 0) {
			if (entity instanceof TrihassianEntity _datEntSetS)
				_datEntSetS.getEntityData().set(TrihassianEntity.DATA_Profession, "Chemist");
			if (true) {
				Rand = Mth.nextInt(RandomSource.create(), 0, 6);
				for (int index0 = 0; index0 < 3; index0++) {
					if (Rand == 0) {
						ChosenItem = new ItemStack(FaroutModItems.HYDROGEN.get());
					} else if (Rand == 1) {
						ChosenItem = new ItemStack(FaroutModItems.SODIUM_HYDROXIDE.get());
					} else if (Rand == 2) {
						ChosenItem = new ItemStack(FaroutModItems.OXYGEN_BOTTLE.get());
					} else if (Rand == 3) {
						ChosenItem = new ItemStack(FaroutModItems.METHANE.get());
					} else if (Rand == 4) {
						ChosenItem = new ItemStack(FaroutModItems.POLYETHYLENE.get());
					} else if (Rand == 5) {
						ChosenItem = new ItemStack(FaroutModItems.SODIUM_INGOT.get());
					} else if (Rand == 6) {
						ChosenItem = new ItemStack(FaroutModItems.BORIC_ACID.get());
					}
					{
						final int _slotid = (int) i;
						final ItemStack _setstack = ChosenItem.copy();
						_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 64));
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
								_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
						});
					}
					i = i + 1;
				}
			}
		} else if (Rand == 1) {
			if (entity instanceof TrihassianEntity _datEntSetS)
				_datEntSetS.getEntityData().set(TrihassianEntity.DATA_Profession, "Electrician");
			if (true) {
				Rand = Mth.nextInt(RandomSource.create(), 0, 6);
				for (int index1 = 0; index1 < 3; index1++) {
					if (Rand == 0) {
						ChosenItem = new ItemStack(FaroutModItems.COPPER_WIRE.get());
					} else if (Rand == 1) {
						ChosenItem = new ItemStack(FaroutModItems.CAPACITOR.get());
					} else if (Rand == 2) {
						ChosenItem = new ItemStack(FaroutModItems.RELAY.get());
					} else if (Rand == 3) {
						ChosenItem = new ItemStack(FaroutModItems.AMMETER.get());
					} else if (Rand == 4) {
						ChosenItem = new ItemStack(FaroutModBlocks.UNACTIVATED_LAMP.get());
					} else if (Rand == 5) {
						ChosenItem = new ItemStack(FaroutModItems.ELECTRO_MAGNET.get());
					} else if (Rand == 6) {
						ChosenItem = new ItemStack(FaroutModItems.BASIC_SOLAR_CELL.get());
					}
					{
						final int _slotid = (int) i;
						final ItemStack _setstack = ChosenItem.copy();
						_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 64));
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
								_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
						});
					}
					i = i + 1;
				}
			}
		} else if (Rand == 2) {
			if (entity instanceof TrihassianEntity _datEntSetS)
				_datEntSetS.getEntityData().set(TrihassianEntity.DATA_Profession, "Farmer");
			if (true) {
				Rand = Mth.nextInt(RandomSource.create(), 0, 6);
				for (int index2 = 0; index2 < 3; index2++) {
					if (Rand == 0) {
						ChosenItem = new ItemStack(Blocks.WHEAT);
					} else if (Rand == 1) {
						ChosenItem = new ItemStack(Items.BREAD);
					} else if (Rand == 2) {
						ChosenItem = new ItemStack(Items.BEEF);
					} else if (Rand == 3) {
						ChosenItem = new ItemStack(FaroutModItems.AMMETER.get());
					} else if (Rand == 4) {
						ChosenItem = new ItemStack(FaroutModBlocks.UNACTIVATED_LAMP.get());
					} else if (Rand == 5) {
						ChosenItem = new ItemStack(FaroutModItems.ELECTRO_MAGNET.get());
					} else if (Rand == 6) {
						ChosenItem = new ItemStack(FaroutModItems.BASIC_SOLAR_CELL.get());
					}
					{
						final int _slotid = (int) i;
						final ItemStack _setstack = ChosenItem.copy();
						_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 64));
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
								_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
						});
					}
					i = i + 1;
				}
			}
		} else if (Rand == 3) {
			if (entity instanceof TrihassianEntity _datEntSetS)
				_datEntSetS.getEntityData().set(TrihassianEntity.DATA_Profession, "Arms dealer");
			if (true) {
				Rand = Mth.nextInt(RandomSource.create(), 0, 2);
				for (int index3 = 0; index3 < 3; index3++) {
					if (Rand == 0) {
						ChosenItem = new ItemStack(Items.GUNPOWDER);
					} else if (Rand == 1) {
						ChosenItem = new ItemStack(FaroutModItems.AUTOMATIC_RIFLE.get());
					} else if (Rand == 2) {
						ChosenItem = new ItemStack(FaroutModItems.BULLET_ITEM.get());
					}
					{
						final int _slotid = (int) i;
						final ItemStack _setstack = ChosenItem.copy();
						_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 64));
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
								_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
						});
					}
					i = i + 1;
				}
			}
		} else if (Rand == 4) {
			if (entity instanceof TrihassianEntity _datEntSetS)
				_datEntSetS.getEntityData().set(TrihassianEntity.DATA_Profession, "Miner");
			if (true) {
				Rand = Mth.nextInt(RandomSource.create(), 0, 6);
				for (int index4 = 0; index4 < 5; index4++) {
					if (Rand == 0) {
						ChosenItem = new ItemStack(Items.IRON_INGOT);
					} else if (Rand == 1) {
						ChosenItem = new ItemStack(Items.GOLD_INGOT);
					} else if (Rand == 2) {
						ChosenItem = new ItemStack(Items.COPPER_INGOT);
					} else if (Rand == 3) {
						ChosenItem = new ItemStack(Items.DIAMOND);
					} else if (Rand == 4) {
						ChosenItem = new ItemStack(FaroutModItems.BORAX.get());
					} else if (Rand == 5) {
						ChosenItem = new ItemStack(Items.QUARTZ);
					} else if (Rand == 6) {
						ChosenItem = new ItemStack(FaroutModItems.BAUXITE_NUGGET.get());
					}
					{
						final int _slotid = (int) i;
						final ItemStack _setstack = ChosenItem.copy();
						_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 64));
						entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
								_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
						});
					}
					i = i + 1;
				}
			}
		}
		{
			final int _slotid = 5;
			final ItemStack _setstack = new ItemStack(FaroutModItems.TRIHASSIAN_CURRENCY.get()).copy();
			_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 64));
			entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable _modHandlerEntSetSlot)
					_modHandlerEntSetSlot.setStackInSlot(_slotid, _setstack);
			});
		}
	}
}
