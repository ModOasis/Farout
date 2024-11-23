package net.mcreator.far_out.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class CalculatorItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String Equation = "";
		String Working = "";
		double LeftIndex = 0;
		double RightIndex = 0;
		double i = 0;
		double Result = 0;
		Equation = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("Calculation")).strip();
		for (int index0 = 0; index0 < (int) ((Equation).length() / 2 - 0.5); index0++) {
			Working = Equation.substring(0, 3);
			if ((Working.substring(1, 2)).equals("+")) {
				Result = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(Working.substring(0, 1)) + new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(Working.substring(2, 3));
			} else if ((Working.substring(1, 2)).equals("-")) {
				Result = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(Working.substring(0, 1)) - new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(Working.substring(2, 3));
			} else if ((Working.substring(1, 2)).equals("*")) {
				Result = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(Working.substring(0, 1)) * new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(Working.substring(2, 3));
			} else if ((Working.substring(1, 2)).equals("/")) {
				Result = new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(Working.substring(0, 1)) / new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(Working.substring(2, 3));
			}
			Equation = Equation.replace(Working.substring(0, 3), "" + Result);
		}
	}
}
