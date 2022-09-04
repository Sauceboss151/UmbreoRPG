
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public class GoldCoinItem extends Item {
	public GoldCoinItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}
}
