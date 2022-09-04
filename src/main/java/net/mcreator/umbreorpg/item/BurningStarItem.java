
package net.mcreator.umbreorpg.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

import java.util.List;

public class BurningStarItem extends Item {
	public BurningStarItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MISC).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Scorching Hot Energy From the Depth of the Hydra"));
	}
}
