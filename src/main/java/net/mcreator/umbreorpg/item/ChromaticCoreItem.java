
package net.mcreator.umbreorpg.item;


import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import java.util.List;

public class ChromaticCoreItem extends Item {
	public ChromaticCoreItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).durability(100).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		if(UmbreoRpgModVariables.WorldVariables.get(world).umbreoRpgWorldOfMagicEnabled == true){
			list.add(new TextComponent("Energy Beyond the Knowledge of the Gods"));
		}
		else{
			list.add(new TextComponent("\u00A7kEnergy Beyond the Knowledge of the Gods"));

		}
	}
}
