
package net.mcreator.umbreorpg.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public class FishChowderItem extends Item {
	public FishChowderItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(14).saturationMod(2.1f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 60;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
