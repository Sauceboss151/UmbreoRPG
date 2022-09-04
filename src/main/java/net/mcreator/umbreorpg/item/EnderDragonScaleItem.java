
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public class EnderDragonScaleItem extends Item {
	public EnderDragonScaleItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MISC).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
