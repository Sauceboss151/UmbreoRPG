
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class UmbreoRpgModTabs {
	public static CreativeModeTab TAB_UMBREO_COMBAT;
	public static CreativeModeTab TAB_UMBREO_TOOLS;
	public static CreativeModeTab TAB_UMBREO_FOOD;
	public static CreativeModeTab TAB_UMBREO_BREWING;
	public static CreativeModeTab TAB_UMBREO_ALCHEMY;
	public static CreativeModeTab TAB_UMBREO_BLOCKS;
	public static CreativeModeTab TAB_UMBREO_MINING;
	public static CreativeModeTab TAB_UMBREO_MISC;

	public static void load() {
		TAB_UMBREO_COMBAT = new CreativeModeTab("tabumbreo_combat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmbreoRpgModItems.UMBELLIUM_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMBREO_TOOLS = new CreativeModeTab("tabumbreo_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmbreoRpgModItems.UMBELLIUM_PICKAXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMBREO_FOOD = new CreativeModeTab("tabumbreo_food") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmbreoRpgModItems.GOLDEN_MELON_WINE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMBREO_BREWING = new CreativeModeTab("tabumbreo_brewing") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmbreoRpgModItems.DEMON_HORN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMBREO_ALCHEMY = new CreativeModeTab("tabumbreo_alchemy") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmbreoRpgModItems.CORE_OF_LIGHT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMBREO_BLOCKS = new CreativeModeTab("tabumbreo_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmbreoRpgModBlocks.UMBELLIUM_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMBREO_MINING = new CreativeModeTab("tabumbreo_mining") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmbreoRpgModItems.UMBELLIUM_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_UMBREO_MISC = new CreativeModeTab("tabumbreo_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UmbreoRpgModItems.PLACE_HOLDER_ITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
