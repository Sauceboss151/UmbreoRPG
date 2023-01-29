/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.mcreator.umbreorpg as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
package net.mcreator.umbreorpg;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import com.google.common.eventbus.Subscribe;
import org.spongepowered.asm.util.ITokenProvider;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.network.chat.TextComponent;

@Mod.EventBusSubscriber(modid = UmbreoRpgMod.MODID)
public class TestToolTip {

	@SubscribeEvent
	public static void addWoodenPickaxeToolTip(ItemTooltipEvent event){
		if(event.getItemStack().getItem() == Items.WOODEN_PICKAXE){
			event.getToolTip().add(new TextComponent("Testing"));
		}
	}
}