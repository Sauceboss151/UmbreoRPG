package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class SetGoldPouchMaxCoinsProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() == UmbreoRpgModItems.SMALL_COIN_POUCH.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgPouchGoldMax", 200);
		}
		if (itemstack.getItem() == UmbreoRpgModItems.MEDIUM_COIN_POUCH.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgPouchGoldMax", 750);
		}
		if (itemstack.getItem() == UmbreoRpgModItems.LARGE_COIN_POUCH.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgPouchGoldMax", 2500);
		}
		if (itemstack.getItem() == UmbreoRpgModItems.EXTRA_LARGE_COIN_POUCH.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgPouchGoldMax", 10000);
		}
		if (itemstack.getItem() == UmbreoRpgModItems.BANKERS_COIN_POUCH.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgPouchGoldMax", 50000);
		}
	}
}
