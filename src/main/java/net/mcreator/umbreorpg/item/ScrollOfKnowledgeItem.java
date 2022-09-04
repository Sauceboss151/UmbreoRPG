
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

import net.mcreator.umbreorpg.procedures.ScrollOfKnowledgeSpawnProcedureProcedure;
import net.mcreator.umbreorpg.procedures.ScrollOfKnowledgeAddLevelProcedure;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

import java.util.List;

public class ScrollOfKnowledgeItem extends Item {
	public ScrollOfKnowledgeItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MISC).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		if(itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 1){
			list.add(new TextComponent("\u00A76Combat"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 2){
			list.add(new TextComponent("\u00A76Mining"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 3){
			list.add(new TextComponent("\u00A76Farming"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 4){
			list.add(new TextComponent("\u00A76Cooking"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 5){
			list.add(new TextComponent("\u00A76Alchemy"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 6){
			list.add(new TextComponent("\u00A76Smithing"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgScrollType") == 7){
			list.add(new TextComponent("\u00A76Fletching"));
		}
		else{
			list.add(new TextComponent("\u00A70Void"));
		}
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ScrollOfKnowledgeAddLevelProcedure.execute(entity, itemstack);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			ScrollOfKnowledgeSpawnProcedureProcedure.execute(itemstack);
		ScrollOfKnowledgeSpawnProcedureProcedure.execute(itemstack);
	}
}
