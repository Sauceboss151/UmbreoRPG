
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.umbreorpg.procedures.PlantRiceSeedsProcedureProcedure;
import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public class RicePlantSeedsItem extends Item {
	public RicePlantSeedsItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_FOOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		PlantRiceSeedsProcedureProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return retval;
	}
}
