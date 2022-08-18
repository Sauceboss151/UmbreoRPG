
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.umbreorpg.world.inventory.WorldStateBorderMenu;
import net.mcreator.umbreorpg.world.inventory.TargetOverlayBoxTextureMenu;
import net.mcreator.umbreorpg.world.inventory.SkillListSmithingGUIMenu;
import net.mcreator.umbreorpg.world.inventory.SkillListMiningGUIMenu;
import net.mcreator.umbreorpg.world.inventory.SkillListMagicGUIMenu;
import net.mcreator.umbreorpg.world.inventory.SkillListFletchingGUIMenu;
import net.mcreator.umbreorpg.world.inventory.SkillListFarmingGUIMenu;
import net.mcreator.umbreorpg.world.inventory.SkillListCookingGUIMenu;
import net.mcreator.umbreorpg.world.inventory.SkillListCombatGUIMenu;
import net.mcreator.umbreorpg.world.inventory.SkillListAlchemyGUIMenu;
import net.mcreator.umbreorpg.world.inventory.SkillList1GUIMenu;
import net.mcreator.umbreorpg.world.inventory.CookingRangeGUIMenu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage9Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage8Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage7Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage6Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage5Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage4Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage3Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage2Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage1Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage11Menu;
import net.mcreator.umbreorpg.world.inventory.CookBookPage10Menu;
import net.mcreator.umbreorpg.world.inventory.BankingGUIMenu;
import net.mcreator.umbreorpg.world.inventory.AlchemyTableGUIMenu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage9Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage8Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage7Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage6Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage5Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage4Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage3Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage2Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage1Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage11Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexPage10Menu;
import net.mcreator.umbreorpg.world.inventory.AlchemyCodexMainPageMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UmbreoRpgModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<AlchemyTableGUIMenu> ALCHEMY_TABLE_GUI = register("alchemy_table_gui",
			(id, inv, extraData) -> new AlchemyTableGUIMenu(id, inv, extraData));
	public static final MenuType<SkillList1GUIMenu> SKILL_LIST_1_GUI = register("skill_list_1_gui",
			(id, inv, extraData) -> new SkillList1GUIMenu(id, inv, extraData));
	public static final MenuType<SkillListCombatGUIMenu> SKILL_LIST_COMBAT_GUI = register("skill_list_combat_gui",
			(id, inv, extraData) -> new SkillListCombatGUIMenu(id, inv, extraData));
	public static final MenuType<SkillListMiningGUIMenu> SKILL_LIST_MINING_GUI = register("skill_list_mining_gui",
			(id, inv, extraData) -> new SkillListMiningGUIMenu(id, inv, extraData));
	public static final MenuType<SkillListFarmingGUIMenu> SKILL_LIST_FARMING_GUI = register("skill_list_farming_gui",
			(id, inv, extraData) -> new SkillListFarmingGUIMenu(id, inv, extraData));
	public static final MenuType<SkillListCookingGUIMenu> SKILL_LIST_COOKING_GUI = register("skill_list_cooking_gui",
			(id, inv, extraData) -> new SkillListCookingGUIMenu(id, inv, extraData));
	public static final MenuType<SkillListAlchemyGUIMenu> SKILL_LIST_ALCHEMY_GUI = register("skill_list_alchemy_gui",
			(id, inv, extraData) -> new SkillListAlchemyGUIMenu(id, inv, extraData));
	public static final MenuType<SkillListSmithingGUIMenu> SKILL_LIST_SMITHING_GUI = register("skill_list_smithing_gui",
			(id, inv, extraData) -> new SkillListSmithingGUIMenu(id, inv, extraData));
	public static final MenuType<SkillListFletchingGUIMenu> SKILL_LIST_FLETCHING_GUI = register("skill_list_fletching_gui",
			(id, inv, extraData) -> new SkillListFletchingGUIMenu(id, inv, extraData));
	public static final MenuType<SkillListMagicGUIMenu> SKILL_LIST_MAGIC_GUI = register("skill_list_magic_gui",
			(id, inv, extraData) -> new SkillListMagicGUIMenu(id, inv, extraData));
	public static final MenuType<TargetOverlayBoxTextureMenu> TARGET_OVERLAY_BOX_TEXTURE = register("target_overlay_box_texture",
			(id, inv, extraData) -> new TargetOverlayBoxTextureMenu(id, inv, extraData));
	public static final MenuType<CookingRangeGUIMenu> COOKING_RANGE_GUI = register("cooking_range_gui",
			(id, inv, extraData) -> new CookingRangeGUIMenu(id, inv, extraData));
	public static final MenuType<CookBookPage1Menu> COOK_BOOK_PAGE_1 = register("cook_book_page_1",
			(id, inv, extraData) -> new CookBookPage1Menu(id, inv, extraData));
	public static final MenuType<CookBookPage2Menu> COOK_BOOK_PAGE_2 = register("cook_book_page_2",
			(id, inv, extraData) -> new CookBookPage2Menu(id, inv, extraData));
	public static final MenuType<CookBookPage3Menu> COOK_BOOK_PAGE_3 = register("cook_book_page_3",
			(id, inv, extraData) -> new CookBookPage3Menu(id, inv, extraData));
	public static final MenuType<CookBookPage4Menu> COOK_BOOK_PAGE_4 = register("cook_book_page_4",
			(id, inv, extraData) -> new CookBookPage4Menu(id, inv, extraData));
	public static final MenuType<CookBookPage5Menu> COOK_BOOK_PAGE_5 = register("cook_book_page_5",
			(id, inv, extraData) -> new CookBookPage5Menu(id, inv, extraData));
	public static final MenuType<CookBookPage6Menu> COOK_BOOK_PAGE_6 = register("cook_book_page_6",
			(id, inv, extraData) -> new CookBookPage6Menu(id, inv, extraData));
	public static final MenuType<CookBookPage7Menu> COOK_BOOK_PAGE_7 = register("cook_book_page_7",
			(id, inv, extraData) -> new CookBookPage7Menu(id, inv, extraData));
	public static final MenuType<CookBookPage8Menu> COOK_BOOK_PAGE_8 = register("cook_book_page_8",
			(id, inv, extraData) -> new CookBookPage8Menu(id, inv, extraData));
	public static final MenuType<CookBookPage9Menu> COOK_BOOK_PAGE_9 = register("cook_book_page_9",
			(id, inv, extraData) -> new CookBookPage9Menu(id, inv, extraData));
	public static final MenuType<CookBookPage10Menu> COOK_BOOK_PAGE_10 = register("cook_book_page_10",
			(id, inv, extraData) -> new CookBookPage10Menu(id, inv, extraData));
	public static final MenuType<CookBookPage11Menu> COOK_BOOK_PAGE_11 = register("cook_book_page_11",
			(id, inv, extraData) -> new CookBookPage11Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexMainPageMenu> ALCHEMY_CODEX_MAIN_PAGE = register("alchemy_codex_main_page",
			(id, inv, extraData) -> new AlchemyCodexMainPageMenu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage1Menu> ALCHEMY_CODEX_PAGE_1 = register("alchemy_codex_page_1",
			(id, inv, extraData) -> new AlchemyCodexPage1Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage2Menu> ALCHEMY_CODEX_PAGE_2 = register("alchemy_codex_page_2",
			(id, inv, extraData) -> new AlchemyCodexPage2Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage3Menu> ALCHEMY_CODEX_PAGE_3 = register("alchemy_codex_page_3",
			(id, inv, extraData) -> new AlchemyCodexPage3Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage4Menu> ALCHEMY_CODEX_PAGE_4 = register("alchemy_codex_page_4",
			(id, inv, extraData) -> new AlchemyCodexPage4Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage5Menu> ALCHEMY_CODEX_PAGE_5 = register("alchemy_codex_page_5",
			(id, inv, extraData) -> new AlchemyCodexPage5Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage6Menu> ALCHEMY_CODEX_PAGE_6 = register("alchemy_codex_page_6",
			(id, inv, extraData) -> new AlchemyCodexPage6Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage7Menu> ALCHEMY_CODEX_PAGE_7 = register("alchemy_codex_page_7",
			(id, inv, extraData) -> new AlchemyCodexPage7Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage8Menu> ALCHEMY_CODEX_PAGE_8 = register("alchemy_codex_page_8",
			(id, inv, extraData) -> new AlchemyCodexPage8Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage9Menu> ALCHEMY_CODEX_PAGE_9 = register("alchemy_codex_page_9",
			(id, inv, extraData) -> new AlchemyCodexPage9Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage10Menu> ALCHEMY_CODEX_PAGE_10 = register("alchemy_codex_page_10",
			(id, inv, extraData) -> new AlchemyCodexPage10Menu(id, inv, extraData));
	public static final MenuType<AlchemyCodexPage11Menu> ALCHEMY_CODEX_PAGE_11 = register("alchemy_codex_page_11",
			(id, inv, extraData) -> new AlchemyCodexPage11Menu(id, inv, extraData));
	public static final MenuType<WorldStateBorderMenu> WORLD_STATE_BORDER = register("world_state_border",
			(id, inv, extraData) -> new WorldStateBorderMenu(id, inv, extraData));
	public static final MenuType<BankingGUIMenu> BANKING_GUI = register("banking_gui",
			(id, inv, extraData) -> new BankingGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
