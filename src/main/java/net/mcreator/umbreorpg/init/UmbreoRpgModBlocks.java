
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.umbreorpg.block.ZoraliumOreBlock;
import net.mcreator.umbreorpg.block.ZoraliumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.ZoraliumBlockBlock;
import net.mcreator.umbreorpg.block.VulcorOreBlock;
import net.mcreator.umbreorpg.block.VulcorBlockBlock;
import net.mcreator.umbreorpg.block.VorashianGreensStage5Block;
import net.mcreator.umbreorpg.block.VorashianGreensStage4Block;
import net.mcreator.umbreorpg.block.VorashianGreensStage3Block;
import net.mcreator.umbreorpg.block.VorashianGreensStage2Block;
import net.mcreator.umbreorpg.block.VorashianGreensStage1Block;
import net.mcreator.umbreorpg.block.VorashianGreensStage0Block;
import net.mcreator.umbreorpg.block.VorashAllienceBlockBlock;
import net.mcreator.umbreorpg.block.UmbreonAllienceBlockBlock;
import net.mcreator.umbreorpg.block.UmbelliumOreBlock;
import net.mcreator.umbreorpg.block.UmbelliumBlockBlock;
import net.mcreator.umbreorpg.block.UltriumOreBlock;
import net.mcreator.umbreorpg.block.UltriumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.UltriumBlockBlock;
import net.mcreator.umbreorpg.block.TetriumOreBlock;
import net.mcreator.umbreorpg.block.TetriumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.TetriumBlockBlock;
import net.mcreator.umbreorpg.block.SkoriumOreBlock;
import net.mcreator.umbreorpg.block.SkoriumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.SkoriumBlockBlock;
import net.mcreator.umbreorpg.block.RiceStage5Block;
import net.mcreator.umbreorpg.block.RiceStage4Block;
import net.mcreator.umbreorpg.block.RiceStage3Block;
import net.mcreator.umbreorpg.block.RiceStage2Block;
import net.mcreator.umbreorpg.block.RiceStage1Block;
import net.mcreator.umbreorpg.block.RiceStage0Block;
import net.mcreator.umbreorpg.block.RandomAllianceBlockBlock;
import net.mcreator.umbreorpg.block.PureGoldOreBlock;
import net.mcreator.umbreorpg.block.PureGoldDeepslateOreBlock;
import net.mcreator.umbreorpg.block.PureGoldBlockBlock;
import net.mcreator.umbreorpg.block.OsniumOreBlock;
import net.mcreator.umbreorpg.block.OsniumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.OsniumBlockBlock;
import net.mcreator.umbreorpg.block.MystaliumOreBlock;
import net.mcreator.umbreorpg.block.MystaliumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.MystaliumBlockBlock;
import net.mcreator.umbreorpg.block.LathiumOreBlock;
import net.mcreator.umbreorpg.block.LathiumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.LathiumBlockBlock;
import net.mcreator.umbreorpg.block.GatesOfFatesWallBlockBlock;
import net.mcreator.umbreorpg.block.GatesOfFatesPortalBlockBlock;
import net.mcreator.umbreorpg.block.GatesOfFatesFloor2BlockBlock;
import net.mcreator.umbreorpg.block.GatesOfFatesFloor1BlockBlock;
import net.mcreator.umbreorpg.block.GarlicStage5Block;
import net.mcreator.umbreorpg.block.GarlicStage4Block;
import net.mcreator.umbreorpg.block.GarlicStage3Block;
import net.mcreator.umbreorpg.block.GarlicStage2Block;
import net.mcreator.umbreorpg.block.GarlicStage1Block;
import net.mcreator.umbreorpg.block.GarlicStage0Block;
import net.mcreator.umbreorpg.block.DuiliumOreBlock;
import net.mcreator.umbreorpg.block.DuiliumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.DuiliumBlockBlock;
import net.mcreator.umbreorpg.block.DarksteelBlockBlock;
import net.mcreator.umbreorpg.block.DarkiumOreBlock;
import net.mcreator.umbreorpg.block.CornStage9Block;
import net.mcreator.umbreorpg.block.CornStage8Block;
import net.mcreator.umbreorpg.block.CornStage7Block;
import net.mcreator.umbreorpg.block.CornStage6Block;
import net.mcreator.umbreorpg.block.CornStage5Block;
import net.mcreator.umbreorpg.block.CornStage4Block;
import net.mcreator.umbreorpg.block.CornStage3Block;
import net.mcreator.umbreorpg.block.CornStage2Block;
import net.mcreator.umbreorpg.block.CornStage1Block;
import net.mcreator.umbreorpg.block.CornStage10Block;
import net.mcreator.umbreorpg.block.CornStage0Block;
import net.mcreator.umbreorpg.block.CookingRangeBlock;
import net.mcreator.umbreorpg.block.CobiumOreBlock;
import net.mcreator.umbreorpg.block.CobiumDeepslateOreBlock;
import net.mcreator.umbreorpg.block.CobiumBlockBlock;
import net.mcreator.umbreorpg.block.CharredLogBlock;
import net.mcreator.umbreorpg.block.BorealSweetPotatoStage5Block;
import net.mcreator.umbreorpg.block.BorealSweetPotatoStage4Block;
import net.mcreator.umbreorpg.block.BorealSweetPotatoStage3Block;
import net.mcreator.umbreorpg.block.BorealSweetPotatoStage2Block;
import net.mcreator.umbreorpg.block.BorealSweetPotatoStage1Block;
import net.mcreator.umbreorpg.block.BorealSweetPotatoStage0Block;
import net.mcreator.umbreorpg.block.BorealAllienceBlockBlock;
import net.mcreator.umbreorpg.block.BankingCounterBlock;
import net.mcreator.umbreorpg.block.AshBlockBlock;
import net.mcreator.umbreorpg.block.AlchemyTableBlock;
import net.mcreator.umbreorpg.UmbreoRpgMod;

public class UmbreoRpgModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UmbreoRpgMod.MODID);
	public static final RegistryObject<Block> ALCHEMY_TABLE = REGISTRY.register("alchemy_table", () -> new AlchemyTableBlock());
	public static final RegistryObject<Block> TETRIUM_ORE = REGISTRY.register("tetrium_ore", () -> new TetriumOreBlock());
	public static final RegistryObject<Block> VULCOR_ORE = REGISTRY.register("vulcor_ore", () -> new VulcorOreBlock());
	public static final RegistryObject<Block> PURE_GOLD_ORE = REGISTRY.register("pure_gold_ore", () -> new PureGoldOreBlock());
	public static final RegistryObject<Block> ZORALIUM_ORE = REGISTRY.register("zoralium_ore", () -> new ZoraliumOreBlock());
	public static final RegistryObject<Block> LATHIUM_ORE = REGISTRY.register("lathium_ore", () -> new LathiumOreBlock());
	public static final RegistryObject<Block> COBIUM_ORE = REGISTRY.register("cobium_ore", () -> new CobiumOreBlock());
	public static final RegistryObject<Block> MYSTALIUM_ORE = REGISTRY.register("mystalium_ore", () -> new MystaliumOreBlock());
	public static final RegistryObject<Block> DUILIUM_ORE = REGISTRY.register("duilium_ore", () -> new DuiliumOreBlock());
	public static final RegistryObject<Block> OSNIUM_ORE = REGISTRY.register("osnium_ore", () -> new OsniumOreBlock());
	public static final RegistryObject<Block> ULTRIUM_ORE = REGISTRY.register("ultrium_ore", () -> new UltriumOreBlock());
	public static final RegistryObject<Block> TETRIUM_DEEPSLATE_ORE = REGISTRY.register("tetrium_deepslate_ore",
			() -> new TetriumDeepslateOreBlock());
	public static final RegistryObject<Block> PURE_GOLD_DEEPSLATE_ORE = REGISTRY.register("pure_gold_deepslate_ore",
			() -> new PureGoldDeepslateOreBlock());
	public static final RegistryObject<Block> ZORALIUM_DEEPSLATE_ORE = REGISTRY.register("zoralium_deepslate_ore",
			() -> new ZoraliumDeepslateOreBlock());
	public static final RegistryObject<Block> LATHIUM_DEEPSLATE_ORE = REGISTRY.register("lathium_deepslate_ore",
			() -> new LathiumDeepslateOreBlock());
	public static final RegistryObject<Block> COBIUM_DEEPSLATE_ORE = REGISTRY.register("cobium_deepslate_ore", () -> new CobiumDeepslateOreBlock());
	public static final RegistryObject<Block> SKORIUM_DEEPSLATE_ORE = REGISTRY.register("skorium_deepslate_ore",
			() -> new SkoriumDeepslateOreBlock());
	public static final RegistryObject<Block> UMBELLIUM_ORE = REGISTRY.register("umbellium_ore", () -> new UmbelliumOreBlock());
	public static final RegistryObject<Block> MYSTALIUM_DEEPSLATE_ORE = REGISTRY.register("mystalium_deepslate_ore",
			() -> new MystaliumDeepslateOreBlock());
	public static final RegistryObject<Block> DUILIUM_DEEPSLATE_ORE = REGISTRY.register("duilium_deepslate_ore",
			() -> new DuiliumDeepslateOreBlock());
	public static final RegistryObject<Block> OSNIUM_DEEPSLATE_ORE = REGISTRY.register("osnium_deepslate_ore", () -> new OsniumDeepslateOreBlock());
	public static final RegistryObject<Block> ULTRIUM_DEEPSLATE_ORE = REGISTRY.register("ultrium_deepslate_ore",
			() -> new UltriumDeepslateOreBlock());
	public static final RegistryObject<Block> BANKING_COUNTER = REGISTRY.register("banking_counter", () -> new BankingCounterBlock());
	public static final RegistryObject<Block> TETRIUM_BLOCK = REGISTRY.register("tetrium_block", () -> new TetriumBlockBlock());
	public static final RegistryObject<Block> VULCOR_BLOCK = REGISTRY.register("vulcor_block", () -> new VulcorBlockBlock());
	public static final RegistryObject<Block> PURE_GOLD_BLOCK = REGISTRY.register("pure_gold_block", () -> new PureGoldBlockBlock());
	public static final RegistryObject<Block> ZORALIUM_BLOCK = REGISTRY.register("zoralium_block", () -> new ZoraliumBlockBlock());
	public static final RegistryObject<Block> LATHIUM_BLOCK = REGISTRY.register("lathium_block", () -> new LathiumBlockBlock());
	public static final RegistryObject<Block> COBIUM_BLOCK = REGISTRY.register("cobium_block", () -> new CobiumBlockBlock());
	public static final RegistryObject<Block> SKORIUM_BLOCK = REGISTRY.register("skorium_block", () -> new SkoriumBlockBlock());
	public static final RegistryObject<Block> UMBELLIUM_BLOCK = REGISTRY.register("umbellium_block", () -> new UmbelliumBlockBlock());
	public static final RegistryObject<Block> MYSTALIUM_BLOCK = REGISTRY.register("mystalium_block", () -> new MystaliumBlockBlock());
	public static final RegistryObject<Block> DUILIUM_BLOCK = REGISTRY.register("duilium_block", () -> new DuiliumBlockBlock());
	public static final RegistryObject<Block> OSNIUM_BLOCK = REGISTRY.register("osnium_block", () -> new OsniumBlockBlock());
	public static final RegistryObject<Block> ULTRIUM_BLOCK = REGISTRY.register("ultrium_block", () -> new UltriumBlockBlock());
	public static final RegistryObject<Block> CHARRED_LOG = REGISTRY.register("charred_log", () -> new CharredLogBlock());
	public static final RegistryObject<Block> ASH_BLOCK = REGISTRY.register("ash_block", () -> new AshBlockBlock());
	public static final RegistryObject<Block> COOKING_RANGE = REGISTRY.register("cooking_range", () -> new CookingRangeBlock());
	public static final RegistryObject<Block> BOREAL_SWEET_POTATO_STAGE_0 = REGISTRY.register("boreal_sweet_potato_stage_0",
			() -> new BorealSweetPotatoStage0Block());
	public static final RegistryObject<Block> BOREAL_SWEET_POTATO_STAGE_1 = REGISTRY.register("boreal_sweet_potato_stage_1",
			() -> new BorealSweetPotatoStage1Block());
	public static final RegistryObject<Block> BOREAL_SWEET_POTATO_STAGE_2 = REGISTRY.register("boreal_sweet_potato_stage_2",
			() -> new BorealSweetPotatoStage2Block());
	public static final RegistryObject<Block> BOREAL_SWEET_POTATO_STAGE_3 = REGISTRY.register("boreal_sweet_potato_stage_3",
			() -> new BorealSweetPotatoStage3Block());
	public static final RegistryObject<Block> BOREAL_SWEET_POTATO_STAGE_4 = REGISTRY.register("boreal_sweet_potato_stage_4",
			() -> new BorealSweetPotatoStage4Block());
	public static final RegistryObject<Block> BOREAL_SWEET_POTATO_STAGE_5 = REGISTRY.register("boreal_sweet_potato_stage_5",
			() -> new BorealSweetPotatoStage5Block());
	public static final RegistryObject<Block> VORASHIAN_GREENS_STAGE_0 = REGISTRY.register("vorashian_greens_stage_0",
			() -> new VorashianGreensStage0Block());
	public static final RegistryObject<Block> VORASHIAN_GREENS_STAGE_1 = REGISTRY.register("vorashian_greens_stage_1",
			() -> new VorashianGreensStage1Block());
	public static final RegistryObject<Block> VORASHIAN_GREENS_STAGE_2 = REGISTRY.register("vorashian_greens_stage_2",
			() -> new VorashianGreensStage2Block());
	public static final RegistryObject<Block> VORASHIAN_GREENS_STAGE_3 = REGISTRY.register("vorashian_greens_stage_3",
			() -> new VorashianGreensStage3Block());
	public static final RegistryObject<Block> VORASHIAN_GREENS_STAGE_4 = REGISTRY.register("vorashian_greens_stage_4",
			() -> new VorashianGreensStage4Block());
	public static final RegistryObject<Block> VORASHIAN_GREENS_STAGE_5 = REGISTRY.register("vorashian_greens_stage_5",
			() -> new VorashianGreensStage5Block());
	public static final RegistryObject<Block> GARLIC_STAGE_0 = REGISTRY.register("garlic_stage_0", () -> new GarlicStage0Block());
	public static final RegistryObject<Block> GARLIC_STAGE_1 = REGISTRY.register("garlic_stage_1", () -> new GarlicStage1Block());
	public static final RegistryObject<Block> GARLIC_STAGE_2 = REGISTRY.register("garlic_stage_2", () -> new GarlicStage2Block());
	public static final RegistryObject<Block> GARLIC_STAGE_3 = REGISTRY.register("garlic_stage_3", () -> new GarlicStage3Block());
	public static final RegistryObject<Block> GARLIC_STAGE_4 = REGISTRY.register("garlic_stage_4", () -> new GarlicStage4Block());
	public static final RegistryObject<Block> GARLIC_STAGE_5 = REGISTRY.register("garlic_stage_5", () -> new GarlicStage5Block());
	public static final RegistryObject<Block> RICE_STAGE_0 = REGISTRY.register("rice_stage_0", () -> new RiceStage0Block());
	public static final RegistryObject<Block> RICE_STAGE_1 = REGISTRY.register("rice_stage_1", () -> new RiceStage1Block());
	public static final RegistryObject<Block> RICE_STAGE_2 = REGISTRY.register("rice_stage_2", () -> new RiceStage2Block());
	public static final RegistryObject<Block> RICE_STAGE_3 = REGISTRY.register("rice_stage_3", () -> new RiceStage3Block());
	public static final RegistryObject<Block> RICE_STAGE_4 = REGISTRY.register("rice_stage_4", () -> new RiceStage4Block());
	public static final RegistryObject<Block> RICE_STAGE_5 = REGISTRY.register("rice_stage_5", () -> new RiceStage5Block());
	public static final RegistryObject<Block> CORN_STAGE_0 = REGISTRY.register("corn_stage_0", () -> new CornStage0Block());
	public static final RegistryObject<Block> CORN_STAGE_1 = REGISTRY.register("corn_stage_1", () -> new CornStage1Block());
	public static final RegistryObject<Block> CORN_STAGE_2 = REGISTRY.register("corn_stage_2", () -> new CornStage2Block());
	public static final RegistryObject<Block> CORN_STAGE_3 = REGISTRY.register("corn_stage_3", () -> new CornStage3Block());
	public static final RegistryObject<Block> CORN_STAGE_4 = REGISTRY.register("corn_stage_4", () -> new CornStage4Block());
	public static final RegistryObject<Block> CORN_STAGE_5 = REGISTRY.register("corn_stage_5", () -> new CornStage5Block());
	public static final RegistryObject<Block> CORN_STAGE_6 = REGISTRY.register("corn_stage_6", () -> new CornStage6Block());
	public static final RegistryObject<Block> CORN_STAGE_7 = REGISTRY.register("corn_stage_7", () -> new CornStage7Block());
	public static final RegistryObject<Block> CORN_STAGE_8 = REGISTRY.register("corn_stage_8", () -> new CornStage8Block());
	public static final RegistryObject<Block> CORN_STAGE_9 = REGISTRY.register("corn_stage_9", () -> new CornStage9Block());
	public static final RegistryObject<Block> CORN_STAGE_10 = REGISTRY.register("corn_stage_10", () -> new CornStage10Block());
	public static final RegistryObject<Block> GATES_OF_FATES_WALL_BLOCK = REGISTRY.register("gates_of_fates_wall_block",
			() -> new GatesOfFatesWallBlockBlock());
	public static final RegistryObject<Block> GATES_OF_FATES_FLOOR_1_BLOCK = REGISTRY.register("gates_of_fates_floor_1_block",
			() -> new GatesOfFatesFloor1BlockBlock());
	public static final RegistryObject<Block> GATES_OF_FATES_FLOOR_2_BLOCK = REGISTRY.register("gates_of_fates_floor_2_block",
			() -> new GatesOfFatesFloor2BlockBlock());
	public static final RegistryObject<Block> UMBREON_ALLIENCE_BLOCK = REGISTRY.register("umbreon_allience_block",
			() -> new UmbreonAllienceBlockBlock());
	public static final RegistryObject<Block> BOREAL_ALLIENCE_BLOCK = REGISTRY.register("boreal_allience_block",
			() -> new BorealAllienceBlockBlock());
	public static final RegistryObject<Block> VORASH_ALLIENCE_BLOCK = REGISTRY.register("vorash_allience_block",
			() -> new VorashAllienceBlockBlock());
	public static final RegistryObject<Block> RANDOM_ALLIANCE_BLOCK = REGISTRY.register("random_alliance_block",
			() -> new RandomAllianceBlockBlock());
	public static final RegistryObject<Block> GATES_OF_FATES_PORTAL_BLOCK = REGISTRY.register("gates_of_fates_portal_block",
			() -> new GatesOfFatesPortalBlockBlock());
	public static final RegistryObject<Block> SKORIUM_ORE = REGISTRY.register("skorium_ore", () -> new SkoriumOreBlock());
	public static final RegistryObject<Block> DARKIUM_ORE = REGISTRY.register("darkium_ore", () -> new DarkiumOreBlock());
	public static final RegistryObject<Block> DARKSTEEL_BLOCK = REGISTRY.register("darksteel_block", () -> new DarksteelBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ZoraliumOreBlock.registerRenderLayer();
			BorealSweetPotatoStage0Block.registerRenderLayer();
			BorealSweetPotatoStage1Block.registerRenderLayer();
			BorealSweetPotatoStage2Block.registerRenderLayer();
			BorealSweetPotatoStage3Block.registerRenderLayer();
			BorealSweetPotatoStage4Block.registerRenderLayer();
			BorealSweetPotatoStage5Block.registerRenderLayer();
			VorashianGreensStage0Block.registerRenderLayer();
			VorashianGreensStage1Block.registerRenderLayer();
			VorashianGreensStage2Block.registerRenderLayer();
			VorashianGreensStage3Block.registerRenderLayer();
			VorashianGreensStage4Block.registerRenderLayer();
			VorashianGreensStage5Block.registerRenderLayer();
			GarlicStage0Block.registerRenderLayer();
			GarlicStage1Block.registerRenderLayer();
			GarlicStage2Block.registerRenderLayer();
			GarlicStage3Block.registerRenderLayer();
			GarlicStage4Block.registerRenderLayer();
			GarlicStage5Block.registerRenderLayer();
			RiceStage0Block.registerRenderLayer();
			RiceStage1Block.registerRenderLayer();
			RiceStage2Block.registerRenderLayer();
			RiceStage3Block.registerRenderLayer();
			RiceStage4Block.registerRenderLayer();
			RiceStage5Block.registerRenderLayer();
			CornStage0Block.registerRenderLayer();
			CornStage1Block.registerRenderLayer();
			CornStage2Block.registerRenderLayer();
			CornStage3Block.registerRenderLayer();
			CornStage4Block.registerRenderLayer();
			CornStage5Block.registerRenderLayer();
			CornStage6Block.registerRenderLayer();
			CornStage7Block.registerRenderLayer();
			CornStage8Block.registerRenderLayer();
			CornStage9Block.registerRenderLayer();
			CornStage10Block.registerRenderLayer();
			UmbreonAllienceBlockBlock.registerRenderLayer();
			BorealAllienceBlockBlock.registerRenderLayer();
			VorashAllienceBlockBlock.registerRenderLayer();
			RandomAllianceBlockBlock.registerRenderLayer();
			GatesOfFatesPortalBlockBlock.registerRenderLayer();
		}
	}
}
