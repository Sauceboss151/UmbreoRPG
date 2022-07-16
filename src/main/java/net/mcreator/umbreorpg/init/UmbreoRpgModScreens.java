
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.umbreorpg.client.gui.TargetOverlayBoxTextureScreen;
import net.mcreator.umbreorpg.client.gui.SkillListSmithingGUIScreen;
import net.mcreator.umbreorpg.client.gui.SkillListMiningGUIScreen;
import net.mcreator.umbreorpg.client.gui.SkillListMagicGUIScreen;
import net.mcreator.umbreorpg.client.gui.SkillListFletchingGUIScreen;
import net.mcreator.umbreorpg.client.gui.SkillListFarmingGUIScreen;
import net.mcreator.umbreorpg.client.gui.SkillListCookingGUIScreen;
import net.mcreator.umbreorpg.client.gui.SkillListCombatGUIScreen;
import net.mcreator.umbreorpg.client.gui.SkillListAlchemyGUIScreen;
import net.mcreator.umbreorpg.client.gui.SkillList1GUIScreen;
import net.mcreator.umbreorpg.client.gui.CookingRangeGUIScreen;
import net.mcreator.umbreorpg.client.gui.CookBookPage9Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage8Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage7Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage6Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage5Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage4Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage3Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage2Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage1Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage11Screen;
import net.mcreator.umbreorpg.client.gui.CookBookPage10Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyTableGUIScreen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage9Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage8Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage7Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage6Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage5Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage4Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage3Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage2Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage1Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage11Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexPage10Screen;
import net.mcreator.umbreorpg.client.gui.AlchemyCodexMainPageScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UmbreoRpgModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_TABLE_GUI, AlchemyTableGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_1_GUI, SkillList1GUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_COMBAT_GUI, SkillListCombatGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_MINING_GUI, SkillListMiningGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_FARMING_GUI, SkillListFarmingGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_COOKING_GUI, SkillListCookingGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_ALCHEMY_GUI, SkillListAlchemyGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_SMITHING_GUI, SkillListSmithingGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_FLETCHING_GUI, SkillListFletchingGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.SKILL_LIST_MAGIC_GUI, SkillListMagicGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.TARGET_OVERLAY_BOX_TEXTURE, TargetOverlayBoxTextureScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOKING_RANGE_GUI, CookingRangeGUIScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_1, CookBookPage1Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_2, CookBookPage2Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_3, CookBookPage3Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_4, CookBookPage4Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_5, CookBookPage5Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_6, CookBookPage6Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_7, CookBookPage7Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_8, CookBookPage8Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_9, CookBookPage9Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_10, CookBookPage10Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.COOK_BOOK_PAGE_11, CookBookPage11Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_MAIN_PAGE, AlchemyCodexMainPageScreen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_1, AlchemyCodexPage1Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_2, AlchemyCodexPage2Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_3, AlchemyCodexPage3Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_4, AlchemyCodexPage4Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_5, AlchemyCodexPage5Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_6, AlchemyCodexPage6Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_7, AlchemyCodexPage7Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_8, AlchemyCodexPage8Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_9, AlchemyCodexPage9Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_10, AlchemyCodexPage10Screen::new);
			MenuScreens.register(UmbreoRpgModMenus.ALCHEMY_CODEX_PAGE_11, AlchemyCodexPage11Screen::new);
		});
	}
}
