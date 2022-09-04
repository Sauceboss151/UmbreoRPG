
package net.mcreator.umbreorpg.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.umbreorpg.procedures.OpenCodexProcedureProcedure;
import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public class AlchemyCodexItem extends Item {
	public AlchemyCodexItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_ALCHEMY).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		OpenCodexProcedureProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
