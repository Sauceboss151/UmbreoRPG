
package net.mcreator.umbreorpg.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.umbreorpg.procedures.OreAttunementScanOreProcedure;
import net.mcreator.umbreorpg.procedures.OreAttunementArtifactCheckOreProcedure;
import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

import java.util.List;

public class OreAttunementArtifactItem extends Item {
	public OreAttunementArtifactItem() {
		super(new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MINING).durability(1000).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 0){
			list.add(new TextComponent("\u00A70Coal"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 1){
			list.add(new TextComponent("\u00A7aCopper"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 2){
			list.add(new TextComponent("\u00A77Iron"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 3){
			list.add(new TextComponent("\u00A76Gold"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 4){
			list.add(new TextComponent("\u00A71Lapis Lazuli"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 5){
			list.add(new TextComponent("\u00A7bDiamond"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 6){
			list.add(new TextComponent("\u00A74Ancient Debris"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 7){
			list.add(new TextComponent("\u00A7cVulcor"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 8){
			list.add(new TextComponent("\u00A78Tetrium"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 9){
			list.add(new TextComponent("\u00A72Zoralium"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 10){
			list.add(new TextComponent("Lathium"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 11){
			list.add(new TextComponent("\u00a79Cobium"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 12){
			list.add(new TextComponent("\u00A7eSkorium"));
		}
		else if(itemstack.getOrCreateTag().getDouble("umbreoRpgOreScanned") == 13){
			list.add(new TextComponent("\u00A75Umbellium"));
		}
		else{
			list.add(new TextComponent("Nothing Is Scanned"));
		}
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		OreAttunementArtifactCheckOreProcedure.execute(world, x, y, z, entity, itemstack);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		OreAttunementScanOreProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return retval;
	}
}
