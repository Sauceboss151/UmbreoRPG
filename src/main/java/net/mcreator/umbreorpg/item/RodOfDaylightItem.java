
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public class RodOfDaylightItem extends Item {
	public RodOfDaylightItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_TOOLS).durability(256).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
