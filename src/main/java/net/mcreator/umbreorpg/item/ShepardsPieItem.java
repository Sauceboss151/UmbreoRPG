
package net.mcreator.umbreorpg.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public class ShepardsPieItem extends Item {
	public ShepardsPieItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(15).saturationMod(2.2f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 68;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
