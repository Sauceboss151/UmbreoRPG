
package net.mcreator.umbreorpg.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.umbreorpg.procedures.SetGoldPouchMaxCoinsProcedure;
import net.mcreator.umbreorpg.procedures.CoinPouchAddCoinsProcedure;

import java.util.List;

public class MediumCoinPouchItem extends Item {
	public MediumCoinPouchItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		
		String amount = Integer.toString((int)itemstack.getOrCreateTag().getDouble("umbreoRpgPouchGoldAmount"));
		String max = Integer.toString((int)itemstack.getOrCreateTag().getDouble("umbreoRpgPouchGoldMax"));
		
		list.add(new TextComponent("Right Click With Gold Coins in Off Hand to Add"));
		list.add(new TextComponent(amount+"/"+max));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CoinPouchAddCoinsProcedure.execute(entity, itemstack);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SetGoldPouchMaxCoinsProcedure.execute(itemstack);
	}
}
