package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class CoinPouchAddCoinsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double diamonds = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == UmbreoRpgModItems.GOLD_COIN.get()) {
			while (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() > 0 && !(itemstack
					.getOrCreateTag().getDouble("umbreoRpgPouchGoldAmount") == itemstack.getOrCreateTag().getDouble("umbreoRpgPouchGoldMax"))) {
				itemstack.getOrCreateTag().putDouble("umbreoRpgPouchGoldAmount",
						(itemstack.getOrCreateTag().getDouble("umbreoRpgPouchGoldAmount") + 1));
				((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))
						.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() - 1));
			}
		}
	}
}
