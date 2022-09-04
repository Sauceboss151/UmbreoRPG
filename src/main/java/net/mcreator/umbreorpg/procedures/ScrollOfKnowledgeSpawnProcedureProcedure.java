package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.Mth;

import java.util.Random;

public class ScrollOfKnowledgeSpawnProcedureProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 0) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgScrollType", (Mth.nextInt(new Random(), 1, 7)));
		}
	}
}
