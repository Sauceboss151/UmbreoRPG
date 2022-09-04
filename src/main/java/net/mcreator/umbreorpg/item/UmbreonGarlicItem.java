
package net.mcreator.umbreorpg.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public class UmbreonGarlicItem extends Item {
	public UmbreonGarlicItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f)

						.build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
