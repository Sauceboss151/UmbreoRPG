
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.umbreorpg.item.ZoraliumSwordItem;
import net.mcreator.umbreorpg.item.ZoraliumShovelItem;
import net.mcreator.umbreorpg.item.ZoraliumPickaxeItem;
import net.mcreator.umbreorpg.item.ZoraliumMaceItem;
import net.mcreator.umbreorpg.item.ZoraliumIngotItem;
import net.mcreator.umbreorpg.item.ZoraliumHoeItem;
import net.mcreator.umbreorpg.item.ZoraliumBowItem;
import net.mcreator.umbreorpg.item.ZoraliumBattleaxeItem;
import net.mcreator.umbreorpg.item.ZoraliumAxeItem;
import net.mcreator.umbreorpg.item.ZoraliumArmorItem;
import net.mcreator.umbreorpg.item.WorldlyShardItem;
import net.mcreator.umbreorpg.item.VulcorSwordItem;
import net.mcreator.umbreorpg.item.VulcorShovelItem;
import net.mcreator.umbreorpg.item.VulcorPickaxeItem;
import net.mcreator.umbreorpg.item.VulcorMaceItem;
import net.mcreator.umbreorpg.item.VulcorIngotItem;
import net.mcreator.umbreorpg.item.VulcorHoeItem;
import net.mcreator.umbreorpg.item.VulcorCrystalItem;
import net.mcreator.umbreorpg.item.VulcorBattleaxeItem;
import net.mcreator.umbreorpg.item.VulcorAxeItem;
import net.mcreator.umbreorpg.item.VulcorArmorItem;
import net.mcreator.umbreorpg.item.VorashianStuffedRabbitItem;
import net.mcreator.umbreorpg.item.VorashianQuinoaItem;
import net.mcreator.umbreorpg.item.VorashianDesertGreensItem;
import net.mcreator.umbreorpg.item.VoidCoreItem;
import net.mcreator.umbreorpg.item.VenomBeetleItemItem;
import net.mcreator.umbreorpg.item.UnactivatedRodOfStormsItem;
import net.mcreator.umbreorpg.item.UnactivatedRodOfRainItem;
import net.mcreator.umbreorpg.item.UnactivatedRodOfMoonlightItem;
import net.mcreator.umbreorpg.item.UnactivatedRodOfDaylightItem;
import net.mcreator.umbreorpg.item.UnactivatedRodOfClearSkiesItem;
import net.mcreator.umbreorpg.item.UmbreonNetheriteArmorItem;
import net.mcreator.umbreorpg.item.UmbreonLeatherArmorItem;
import net.mcreator.umbreorpg.item.UmbreonKnightsDelightItem;
import net.mcreator.umbreorpg.item.UmbreonIronArmorItem;
import net.mcreator.umbreorpg.item.UmbreonGoldArmorItem;
import net.mcreator.umbreorpg.item.UmbreonGarlicItem;
import net.mcreator.umbreorpg.item.UmbreonDiamondArmorItem;
import net.mcreator.umbreorpg.item.UmbreonChainmailArmorItem;
import net.mcreator.umbreorpg.item.UmbelliumSwordItem;
import net.mcreator.umbreorpg.item.UmbelliumShovelItem;
import net.mcreator.umbreorpg.item.UmbelliumPickaxeItem;
import net.mcreator.umbreorpg.item.UmbelliumMaceItem;
import net.mcreator.umbreorpg.item.UmbelliumIngotItem;
import net.mcreator.umbreorpg.item.UmbelliumHoeItem;
import net.mcreator.umbreorpg.item.UmbelliumBowItem;
import net.mcreator.umbreorpg.item.UmbelliumBattleaxeItem;
import net.mcreator.umbreorpg.item.UmbelliumAxeItem;
import net.mcreator.umbreorpg.item.UmbelliumArmorItem;
import net.mcreator.umbreorpg.item.UltriumSwordItem;
import net.mcreator.umbreorpg.item.UltriumShovelItem;
import net.mcreator.umbreorpg.item.UltriumPickaxeItem;
import net.mcreator.umbreorpg.item.UltriumMaceItem;
import net.mcreator.umbreorpg.item.UltriumIngotItem;
import net.mcreator.umbreorpg.item.UltriumHoeItem;
import net.mcreator.umbreorpg.item.UltriumBattleaxeItem;
import net.mcreator.umbreorpg.item.UltriumAxeItem;
import net.mcreator.umbreorpg.item.UltriumArmorItem;
import net.mcreator.umbreorpg.item.TwilightCoreItem;
import net.mcreator.umbreorpg.item.TreantRootItem;
import net.mcreator.umbreorpg.item.TetriumIngotItem;
import net.mcreator.umbreorpg.item.SweetPotatoSeedsItem;
import net.mcreator.umbreorpg.item.SweetPotatoPieItem;
import net.mcreator.umbreorpg.item.SweetBerryWineItem;
import net.mcreator.umbreorpg.item.SparklingFluidItem;
import net.mcreator.umbreorpg.item.SourCreamItem;
import net.mcreator.umbreorpg.item.SmallCoinPouchItem;
import net.mcreator.umbreorpg.item.SkoriumSwordItem;
import net.mcreator.umbreorpg.item.SkoriumShovelItem;
import net.mcreator.umbreorpg.item.SkoriumPickaxeItem;
import net.mcreator.umbreorpg.item.SkoriumMaceItem;
import net.mcreator.umbreorpg.item.SkoriumIngotItem;
import net.mcreator.umbreorpg.item.SkoriumHoeItem;
import net.mcreator.umbreorpg.item.SkoriumBowItem;
import net.mcreator.umbreorpg.item.SkoriumBattleaxeItem;
import net.mcreator.umbreorpg.item.SkoriumAxeItem;
import net.mcreator.umbreorpg.item.SkoriumArmorItem;
import net.mcreator.umbreorpg.item.ShepardsPieItem;
import net.mcreator.umbreorpg.item.SheepSaladItem;
import net.mcreator.umbreorpg.item.ScrollOfKnowledgeItem;
import net.mcreator.umbreorpg.item.RodOfStormsItem;
import net.mcreator.umbreorpg.item.RodOfRainItem;
import net.mcreator.umbreorpg.item.RodOfMoonlightItem;
import net.mcreator.umbreorpg.item.RodOfDaylightItem;
import net.mcreator.umbreorpg.item.RodOfClearSkiesItem;
import net.mcreator.umbreorpg.item.RoastedSeedsItem;
import net.mcreator.umbreorpg.item.RicePlantSeedsItem;
import net.mcreator.umbreorpg.item.ReinforcedMaceItem;
import net.mcreator.umbreorpg.item.ReinforcedIronSwordItem;
import net.mcreator.umbreorpg.item.ReinforcedIronShovelItem;
import net.mcreator.umbreorpg.item.ReinforcedIronPickaxeItem;
import net.mcreator.umbreorpg.item.ReinforcedIronIngotItem;
import net.mcreator.umbreorpg.item.ReinforcedIronHoeItem;
import net.mcreator.umbreorpg.item.ReinforcedIronBowItem;
import net.mcreator.umbreorpg.item.ReinforcedIronAxeItem;
import net.mcreator.umbreorpg.item.ReinforcedIronArmorItem;
import net.mcreator.umbreorpg.item.ReinforcedBattleAxeItem;
import net.mcreator.umbreorpg.item.RawZoraliumOreItem;
import net.mcreator.umbreorpg.item.RawUmbelliumOreItem;
import net.mcreator.umbreorpg.item.RawUltriumOreItem;
import net.mcreator.umbreorpg.item.RawTetriumOreItem;
import net.mcreator.umbreorpg.item.RawSkoriumOreItem;
import net.mcreator.umbreorpg.item.RawPureGoldOreItem;
import net.mcreator.umbreorpg.item.RawOsniumOreItem;
import net.mcreator.umbreorpg.item.RawNetheriteOreItem;
import net.mcreator.umbreorpg.item.RawMystaliumOreItem;
import net.mcreator.umbreorpg.item.RawLathiumOreItem;
import net.mcreator.umbreorpg.item.RawDuiliumOreItem;
import net.mcreator.umbreorpg.item.RawCobiumOreItem;
import net.mcreator.umbreorpg.item.PureGoldIngotItem;
import net.mcreator.umbreorpg.item.PumpkinCookiesItem;
import net.mcreator.umbreorpg.item.PlaceHolderItemItem;
import net.mcreator.umbreorpg.item.OsniumSwordItem;
import net.mcreator.umbreorpg.item.OsniumShovelItem;
import net.mcreator.umbreorpg.item.OsniumPickaxeItem;
import net.mcreator.umbreorpg.item.OsniumMaceItem;
import net.mcreator.umbreorpg.item.OsniumIngotItem;
import net.mcreator.umbreorpg.item.OsniumHoeItem;
import net.mcreator.umbreorpg.item.OsniumBattleaxeItem;
import net.mcreator.umbreorpg.item.OsniumAxeItem;
import net.mcreator.umbreorpg.item.OsniumArmorItem;
import net.mcreator.umbreorpg.item.OreAttunementArtifactItem;
import net.mcreator.umbreorpg.item.OilItem;
import net.mcreator.umbreorpg.item.NetheriteMaceItem;
import net.mcreator.umbreorpg.item.NetheriteBowItem;
import net.mcreator.umbreorpg.item.NetheriteBattleaxeItem;
import net.mcreator.umbreorpg.item.MystroCornItem;
import net.mcreator.umbreorpg.item.MystaliumSwordItem;
import net.mcreator.umbreorpg.item.MystaliumShovelItem;
import net.mcreator.umbreorpg.item.MystaliumPickaxeItem;
import net.mcreator.umbreorpg.item.MystaliumMaceItem;
import net.mcreator.umbreorpg.item.MystaliumIngotItem;
import net.mcreator.umbreorpg.item.MystaliumHoeItem;
import net.mcreator.umbreorpg.item.MystaliumBattleaxeItem;
import net.mcreator.umbreorpg.item.MystaliumAxeItem;
import net.mcreator.umbreorpg.item.MystaliumArmorItem;
import net.mcreator.umbreorpg.item.MediumCoinPouchItem;
import net.mcreator.umbreorpg.item.MarshlandRiceItem;
import net.mcreator.umbreorpg.item.LoadedBakedPotatoItem;
import net.mcreator.umbreorpg.item.LathiumSwordItem;
import net.mcreator.umbreorpg.item.LathiumShovelItem;
import net.mcreator.umbreorpg.item.LathiumPickaxeItem;
import net.mcreator.umbreorpg.item.LathiumMaceItem;
import net.mcreator.umbreorpg.item.LathiumIngotItem;
import net.mcreator.umbreorpg.item.LathiumHoeItem;
import net.mcreator.umbreorpg.item.LathiumBowItem;
import net.mcreator.umbreorpg.item.LathiumBattleaxeItem;
import net.mcreator.umbreorpg.item.LathiumAxeItem;
import net.mcreator.umbreorpg.item.LathiumArmorItem;
import net.mcreator.umbreorpg.item.LargeCoinPouchItem;
import net.mcreator.umbreorpg.item.JungleCoreItem;
import net.mcreator.umbreorpg.item.IronMaceItem;
import net.mcreator.umbreorpg.item.IronBowItem;
import net.mcreator.umbreorpg.item.IronBattleaxeItem;
import net.mcreator.umbreorpg.item.ImpDustItem;
import net.mcreator.umbreorpg.item.HashBrownsItem;
import net.mcreator.umbreorpg.item.HamAndCheeseSandwichItem;
import net.mcreator.umbreorpg.item.GreenSeedsItem;
import net.mcreator.umbreorpg.item.GreenSaladItem;
import net.mcreator.umbreorpg.item.GreenMeatWrapItem;
import net.mcreator.umbreorpg.item.GoldenMelonWineItem;
import net.mcreator.umbreorpg.item.GoldMaceItem;
import net.mcreator.umbreorpg.item.GoldCoinItem;
import net.mcreator.umbreorpg.item.GoldBattleaxeItem;
import net.mcreator.umbreorpg.item.GoddessFeatherItem;
import net.mcreator.umbreorpg.item.GarlicSeedsItem;
import net.mcreator.umbreorpg.item.GarlicFriedPotatoesItem;
import net.mcreator.umbreorpg.item.GarlicFishFryItem;
import net.mcreator.umbreorpg.item.GarlicBeetPorkItem;
import net.mcreator.umbreorpg.item.FruitSaladItem;
import net.mcreator.umbreorpg.item.FrozenCoreItem;
import net.mcreator.umbreorpg.item.FriedEggItem;
import net.mcreator.umbreorpg.item.FriedCornItem;
import net.mcreator.umbreorpg.item.FlourItem;
import net.mcreator.umbreorpg.item.FishChowderItem;
import net.mcreator.umbreorpg.item.FishAndRiceItem;
import net.mcreator.umbreorpg.item.FireflyItemItem;
import net.mcreator.umbreorpg.item.FillingItem;
import net.mcreator.umbreorpg.item.ExtraSweetJuiceItem;
import net.mcreator.umbreorpg.item.ExtraLargeCoinPouchItem;
import net.mcreator.umbreorpg.item.EnderDragonScaleItem;
import net.mcreator.umbreorpg.item.EnderArmorItem;
import net.mcreator.umbreorpg.item.EggAndRiceItem;
import net.mcreator.umbreorpg.item.DustmiteItemItem;
import net.mcreator.umbreorpg.item.DuiliumSwordItem;
import net.mcreator.umbreorpg.item.DuiliumShovelItem;
import net.mcreator.umbreorpg.item.DuiliumPickaxeItem;
import net.mcreator.umbreorpg.item.DuiliumMaceItem;
import net.mcreator.umbreorpg.item.DuiliumIngotItem;
import net.mcreator.umbreorpg.item.DuiliumHoeItem;
import net.mcreator.umbreorpg.item.DuiliumBattleaxeItem;
import net.mcreator.umbreorpg.item.DuiliumAxeItem;
import net.mcreator.umbreorpg.item.DuiliumArmorItem;
import net.mcreator.umbreorpg.item.DoughItem;
import net.mcreator.umbreorpg.item.DimensionalShardItem;
import net.mcreator.umbreorpg.item.DiamondMaceItem;
import net.mcreator.umbreorpg.item.DiamondBowItem;
import net.mcreator.umbreorpg.item.DiamondBattleaxeItem;
import net.mcreator.umbreorpg.item.DesertRevitalizerItem;
import net.mcreator.umbreorpg.item.DemonHornItem;
import net.mcreator.umbreorpg.item.CrystalBoneItem;
import net.mcreator.umbreorpg.item.CornSeedsItem;
import net.mcreator.umbreorpg.item.CoreOfManaItem;
import net.mcreator.umbreorpg.item.CoreOfLightItem;
import net.mcreator.umbreorpg.item.CookedRiceItem;
import net.mcreator.umbreorpg.item.CookedCarrotsItem;
import net.mcreator.umbreorpg.item.CookedBeefSandwichItem;
import net.mcreator.umbreorpg.item.CookBookItem;
import net.mcreator.umbreorpg.item.CobiumSwordItem;
import net.mcreator.umbreorpg.item.CobiumShovelItem;
import net.mcreator.umbreorpg.item.CobiumPickaxeItem;
import net.mcreator.umbreorpg.item.CobiumMaceItem;
import net.mcreator.umbreorpg.item.CobiumIngotItem;
import net.mcreator.umbreorpg.item.CobiumHoeItem;
import net.mcreator.umbreorpg.item.CobiumBowItem;
import net.mcreator.umbreorpg.item.CobiumBattleaxeItem;
import net.mcreator.umbreorpg.item.CobiumAxeItem;
import net.mcreator.umbreorpg.item.CobiumArmorItem;
import net.mcreator.umbreorpg.item.ChromaticCoreItem;
import net.mcreator.umbreorpg.item.ChickenPotPieItem;
import net.mcreator.umbreorpg.item.CheeseItem;
import net.mcreator.umbreorpg.item.BurningStarItem;
import net.mcreator.umbreorpg.item.BugNetItem;
import net.mcreator.umbreorpg.item.BorealSweetPotatoSoupItem;
import net.mcreator.umbreorpg.item.BorealSweetPotatoItem;
import net.mcreator.umbreorpg.item.BorealBeetrootSoupItem;
import net.mcreator.umbreorpg.item.BorealBakedPotatoItem;
import net.mcreator.umbreorpg.item.BlastCoreItem;
import net.mcreator.umbreorpg.item.BeetkinSoupItem;
import net.mcreator.umbreorpg.item.BeefAndCarrotsItem;
import net.mcreator.umbreorpg.item.BankersCoinPouchItem;
import net.mcreator.umbreorpg.item.BaconItem;
import net.mcreator.umbreorpg.item.AlchemyCodexItem;
import net.mcreator.umbreorpg.item.AdventurersStirFryItem;
import net.mcreator.umbreorpg.UmbreoRpgMod;

public class UmbreoRpgModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UmbreoRpgMod.MODID);
	public static final RegistryObject<Item> ALCHEMY_CODEX = REGISTRY.register("alchemy_codex", () -> new AlchemyCodexItem());
	public static final RegistryObject<Item> ALCHEMY_TABLE = block(UmbreoRpgModBlocks.ALCHEMY_TABLE, UmbreoRpgModTabs.TAB_UMBREO_ALCHEMY);
	public static final RegistryObject<Item> CORE_OF_LIGHT = REGISTRY.register("core_of_light", () -> new CoreOfLightItem());
	public static final RegistryObject<Item> JUNGLE_CORE = REGISTRY.register("jungle_core", () -> new JungleCoreItem());
	public static final RegistryObject<Item> FROZEN_CORE = REGISTRY.register("frozen_core", () -> new FrozenCoreItem());
	public static final RegistryObject<Item> BLAST_CORE = REGISTRY.register("blast_core", () -> new BlastCoreItem());
	public static final RegistryObject<Item> VOID_CORE = REGISTRY.register("void_core", () -> new VoidCoreItem());
	public static final RegistryObject<Item> TWILIGHT_CORE = REGISTRY.register("twilight_core", () -> new TwilightCoreItem());
	public static final RegistryObject<Item> WORLDLY_SHARD = REGISTRY.register("worldly_shard", () -> new WorldlyShardItem());
	public static final RegistryObject<Item> DIMENSIONAL_SHARD = REGISTRY.register("dimensional_shard", () -> new DimensionalShardItem());
	public static final RegistryObject<Item> IMP_DUST = REGISTRY.register("imp_dust", () -> new ImpDustItem());
	public static final RegistryObject<Item> TREANT_ROOT = REGISTRY.register("treant_root", () -> new TreantRootItem());
	public static final RegistryObject<Item> UNACTIVATED_ROD_OF_CLEAR_SKIES = REGISTRY.register("unactivated_rod_of_clear_skies",
			() -> new UnactivatedRodOfClearSkiesItem());
	public static final RegistryObject<Item> UNACTIVATED_ROD_OF_DAYLIGHT = REGISTRY.register("unactivated_rod_of_daylight",
			() -> new UnactivatedRodOfDaylightItem());
	public static final RegistryObject<Item> UNACTIVATED_ROD_OF_MOONLIGHT = REGISTRY.register("unactivated_rod_of_moonlight",
			() -> new UnactivatedRodOfMoonlightItem());
	public static final RegistryObject<Item> UNACTIVATED_ROD_OF_RAIN = REGISTRY.register("unactivated_rod_of_rain",
			() -> new UnactivatedRodOfRainItem());
	public static final RegistryObject<Item> UNACTIVATED_ROD_OF_STORMS = REGISTRY.register("unactivated_rod_of_storms",
			() -> new UnactivatedRodOfStormsItem());
	public static final RegistryObject<Item> TREANT = REGISTRY.register("treant_spawn_egg",
			() -> new ForgeSpawnEggItem(UmbreoRpgModEntities.TREANT, -9810159, -13531813, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> IMP = REGISTRY.register("imp_spawn_egg",
			() -> new ForgeSpawnEggItem(UmbreoRpgModEntities.IMP, -10066330, -65536, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MISC)));
	public static final RegistryObject<Item> CHROMATIC_CORE = REGISTRY.register("chromatic_core", () -> new ChromaticCoreItem());
	public static final RegistryObject<Item> SPARKLING_FLUID = REGISTRY.register("sparkling_fluid", () -> new SparklingFluidItem());
	public static final RegistryObject<Item> SMALL_COIN_POUCH = REGISTRY.register("small_coin_pouch", () -> new SmallCoinPouchItem());
	public static final RegistryObject<Item> MEDIUM_COIN_POUCH = REGISTRY.register("medium_coin_pouch", () -> new MediumCoinPouchItem());
	public static final RegistryObject<Item> LARGE_COIN_POUCH = REGISTRY.register("large_coin_pouch", () -> new LargeCoinPouchItem());
	public static final RegistryObject<Item> EXTRA_LARGE_COIN_POUCH = REGISTRY.register("extra_large_coin_pouch",
			() -> new ExtraLargeCoinPouchItem());
	public static final RegistryObject<Item> BANKERS_COIN_POUCH = REGISTRY.register("bankers_coin_pouch", () -> new BankersCoinPouchItem());
	public static final RegistryObject<Item> SCROLL_OF_KNOWLEDGE = REGISTRY.register("scroll_of_knowledge", () -> new ScrollOfKnowledgeItem());
	public static final RegistryObject<Item> TETRIUM_ORE = block(UmbreoRpgModBlocks.TETRIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> VULCOR_ORE = block(UmbreoRpgModBlocks.VULCOR_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> PURE_GOLD_ORE = block(UmbreoRpgModBlocks.PURE_GOLD_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> ZORALIUM_ORE = block(UmbreoRpgModBlocks.ZORALIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> LATHIUM_ORE = block(UmbreoRpgModBlocks.LATHIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> COBIUM_ORE = block(UmbreoRpgModBlocks.COBIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> MYSTALIUM_ORE = block(UmbreoRpgModBlocks.MYSTALIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> DUILIUM_ORE = block(UmbreoRpgModBlocks.DUILIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> OSNIUM_ORE = block(UmbreoRpgModBlocks.OSNIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> ULTRIUM_ORE = block(UmbreoRpgModBlocks.ULTRIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> TETRIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.TETRIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> PURE_GOLD_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.PURE_GOLD_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> ZORALIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.ZORALIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> LATHIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.LATHIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> COBIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.COBIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> SKORIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.SKORIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> UMBELLIUM_ORE = block(UmbreoRpgModBlocks.UMBELLIUM_ORE, UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> MYSTALIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.MYSTALIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> DUILIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.DUILIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> OSNIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.OSNIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> ULTRIUM_DEEPSLATE_ORE = block(UmbreoRpgModBlocks.ULTRIUM_DEEPSLATE_ORE,
			UmbreoRpgModTabs.TAB_UMBREO_MINING);
	public static final RegistryObject<Item> RAW_TETRIUM_ORE = REGISTRY.register("raw_tetrium_ore", () -> new RawTetriumOreItem());
	public static final RegistryObject<Item> VULCOR_CRYSTAL = REGISTRY.register("vulcor_crystal", () -> new VulcorCrystalItem());
	public static final RegistryObject<Item> RAW_PURE_GOLD_ORE = REGISTRY.register("raw_pure_gold_ore", () -> new RawPureGoldOreItem());
	public static final RegistryObject<Item> RAW_ZORALIUM_ORE = REGISTRY.register("raw_zoralium_ore", () -> new RawZoraliumOreItem());
	public static final RegistryObject<Item> RAW_LATHIUM_ORE = REGISTRY.register("raw_lathium_ore", () -> new RawLathiumOreItem());
	public static final RegistryObject<Item> RAW_COBIUM_ORE = REGISTRY.register("raw_cobium_ore", () -> new RawCobiumOreItem());
	public static final RegistryObject<Item> RAW_NETHERITE_ORE = REGISTRY.register("raw_netherite_ore", () -> new RawNetheriteOreItem());
	public static final RegistryObject<Item> RAW_SKORIUM_ORE = REGISTRY.register("raw_skorium_ore", () -> new RawSkoriumOreItem());
	public static final RegistryObject<Item> RAW_UMBELLIUM_ORE = REGISTRY.register("raw_umbellium_ore", () -> new RawUmbelliumOreItem());
	public static final RegistryObject<Item> RAW_MYSTALIUM_ORE = REGISTRY.register("raw_mystalium_ore", () -> new RawMystaliumOreItem());
	public static final RegistryObject<Item> RAW_DUILIUM_ORE = REGISTRY.register("raw_duilium_ore", () -> new RawDuiliumOreItem());
	public static final RegistryObject<Item> RAW_OSNIUM_ORE = REGISTRY.register("raw_osnium_ore", () -> new RawOsniumOreItem());
	public static final RegistryObject<Item> RAW_ULTRIUM_ORE = REGISTRY.register("raw_ultrium_ore", () -> new RawUltriumOreItem());
	public static final RegistryObject<Item> TETRIUM_INGOT = REGISTRY.register("tetrium_ingot", () -> new TetriumIngotItem());
	public static final RegistryObject<Item> REINFORCED_IRON_INGOT = REGISTRY.register("reinforced_iron_ingot", () -> new ReinforcedIronIngotItem());
	public static final RegistryObject<Item> VULCOR_INGOT = REGISTRY.register("vulcor_ingot", () -> new VulcorIngotItem());
	public static final RegistryObject<Item> PURE_GOLD_INGOT = REGISTRY.register("pure_gold_ingot", () -> new PureGoldIngotItem());
	public static final RegistryObject<Item> ZORALIUM_INGOT = REGISTRY.register("zoralium_ingot", () -> new ZoraliumIngotItem());
	public static final RegistryObject<Item> LATHIUM_INGOT = REGISTRY.register("lathium_ingot", () -> new LathiumIngotItem());
	public static final RegistryObject<Item> COBIUM_INGOT = REGISTRY.register("cobium_ingot", () -> new CobiumIngotItem());
	public static final RegistryObject<Item> SKORIUM_INGOT = REGISTRY.register("skorium_ingot", () -> new SkoriumIngotItem());
	public static final RegistryObject<Item> UMBELLIUM_INGOT = REGISTRY.register("umbellium_ingot", () -> new UmbelliumIngotItem());
	public static final RegistryObject<Item> MYSTALIUM_INGOT = REGISTRY.register("mystalium_ingot", () -> new MystaliumIngotItem());
	public static final RegistryObject<Item> DUILIUM_INGOT = REGISTRY.register("duilium_ingot", () -> new DuiliumIngotItem());
	public static final RegistryObject<Item> OSNIUM_INGOT = REGISTRY.register("osnium_ingot", () -> new OsniumIngotItem());
	public static final RegistryObject<Item> ULTRIUM_INGOT = REGISTRY.register("ultrium_ingot", () -> new UltriumIngotItem());
	public static final RegistryObject<Item> ORE_ATTUNEMENT_ARTIFACT = REGISTRY.register("ore_attunement_artifact",
			() -> new OreAttunementArtifactItem());
	public static final RegistryObject<Item> COOK_BOOK = REGISTRY.register("cook_book", () -> new CookBookItem());
	public static final RegistryObject<Item> SWEET_POTATO_SEEDS = REGISTRY.register("sweet_potato_seeds", () -> new SweetPotatoSeedsItem());
	public static final RegistryObject<Item> GREEN_SEEDS = REGISTRY.register("green_seeds", () -> new GreenSeedsItem());
	public static final RegistryObject<Item> GARLIC_SEEDS = REGISTRY.register("garlic_seeds", () -> new GarlicSeedsItem());
	public static final RegistryObject<Item> RICE_PLANT_SEEDS = REGISTRY.register("rice_plant_seeds", () -> new RicePlantSeedsItem());
	public static final RegistryObject<Item> CORN_SEEDS = REGISTRY.register("corn_seeds", () -> new CornSeedsItem());
	public static final RegistryObject<Item> BOREAL_SWEET_POTATO = REGISTRY.register("boreal_sweet_potato", () -> new BorealSweetPotatoItem());
	public static final RegistryObject<Item> VORASHIAN_DESERT_GREENS = REGISTRY.register("vorashian_desert_greens",
			() -> new VorashianDesertGreensItem());
	public static final RegistryObject<Item> UMBREON_GARLIC = REGISTRY.register("umbreon_garlic", () -> new UmbreonGarlicItem());
	public static final RegistryObject<Item> MARSHLAND_RICE = REGISTRY.register("marshland_rice", () -> new MarshlandRiceItem());
	public static final RegistryObject<Item> MYSTRO_CORN = REGISTRY.register("mystro_corn", () -> new MystroCornItem());
	public static final RegistryObject<Item> FLOUR = REGISTRY.register("flour", () -> new FlourItem());
	public static final RegistryObject<Item> DOUGH = REGISTRY.register("dough", () -> new DoughItem());
	public static final RegistryObject<Item> OIL = REGISTRY.register("oil", () -> new OilItem());
	public static final RegistryObject<Item> SOUR_CREAM = REGISTRY.register("sour_cream", () -> new SourCreamItem());
	public static final RegistryObject<Item> FILLING = REGISTRY.register("filling", () -> new FillingItem());
	public static final RegistryObject<Item> ROASTED_SEEDS = REGISTRY.register("roasted_seeds", () -> new RoastedSeedsItem());
	public static final RegistryObject<Item> COOKED_CARROTS = REGISTRY.register("cooked_carrots", () -> new CookedCarrotsItem());
	public static final RegistryObject<Item> BEEF_AND_CARROTS = REGISTRY.register("beef_and_carrots", () -> new BeefAndCarrotsItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> HAM_AND_CHEESE_SANDWICH = REGISTRY.register("ham_and_cheese_sandwich",
			() -> new HamAndCheeseSandwichItem());
	public static final RegistryObject<Item> FRIED_EGG = REGISTRY.register("fried_egg", () -> new FriedEggItem());
	public static final RegistryObject<Item> SHEPARDS_PIE = REGISTRY.register("shepards_pie", () -> new ShepardsPieItem());
	public static final RegistryObject<Item> FRUIT_SALAD = REGISTRY.register("fruit_salad", () -> new FruitSaladItem());
	public static final RegistryObject<Item> BOREAL_BEETROOT_SOUP = REGISTRY.register("boreal_beetroot_soup", () -> new BorealBeetrootSoupItem());
	public static final RegistryObject<Item> FISH_CHOWDER = REGISTRY.register("fish_chowder", () -> new FishChowderItem());
	public static final RegistryObject<Item> HASH_BROWNS = REGISTRY.register("hash_browns", () -> new HashBrownsItem());
	public static final RegistryObject<Item> PUMPKIN_COOKIES = REGISTRY.register("pumpkin_cookies", () -> new PumpkinCookiesItem());
	public static final RegistryObject<Item> BACON = REGISTRY.register("bacon", () -> new BaconItem());
	public static final RegistryObject<Item> BEETKIN_SOUP = REGISTRY.register("beetkin_soup", () -> new BeetkinSoupItem());
	public static final RegistryObject<Item> BOREAL_BAKED_POTATO = REGISTRY.register("boreal_baked_potato", () -> new BorealBakedPotatoItem());
	public static final RegistryObject<Item> LOADED_BAKED_POTATO = REGISTRY.register("loaded_baked_potato", () -> new LoadedBakedPotatoItem());
	public static final RegistryObject<Item> BOREAL_SWEET_POTATO_SOUP = REGISTRY.register("boreal_sweet_potato_soup",
			() -> new BorealSweetPotatoSoupItem());
	public static final RegistryObject<Item> SWEET_POTATO_PIE = REGISTRY.register("sweet_potato_pie", () -> new SweetPotatoPieItem());
	public static final RegistryObject<Item> SWEET_BERRY_WINE = REGISTRY.register("sweet_berry_wine", () -> new SweetBerryWineItem());
	public static final RegistryObject<Item> GREEN_SALAD = REGISTRY.register("green_salad", () -> new GreenSaladItem());
	public static final RegistryObject<Item> COOKED_BEEF_SANDWICH = REGISTRY.register("cooked_beef_sandwich", () -> new CookedBeefSandwichItem());
	public static final RegistryObject<Item> SHEEP_SALAD = REGISTRY.register("sheep_salad", () -> new SheepSaladItem());
	public static final RegistryObject<Item> VORASHIAN_STUFFED_RABBIT = REGISTRY.register("vorashian_stuffed_rabbit",
			() -> new VorashianStuffedRabbitItem());
	public static final RegistryObject<Item> DESERT_REVITALIZER = REGISTRY.register("desert_revitalizer", () -> new DesertRevitalizerItem());
	public static final RegistryObject<Item> GARLIC_FRIED_POTATOES = REGISTRY.register("garlic_fried_potatoes", () -> new GarlicFriedPotatoesItem());
	public static final RegistryObject<Item> GARLIC_BEET_PORK = REGISTRY.register("garlic_beet_pork", () -> new GarlicBeetPorkItem());
	public static final RegistryObject<Item> VORASHIAN_QUINOA = REGISTRY.register("vorashian_quinoa", () -> new VorashianQuinoaItem());
	public static final RegistryObject<Item> EXTRA_SWEET_JUICE = REGISTRY.register("extra_sweet_juice", () -> new ExtraSweetJuiceItem());
	public static final RegistryObject<Item> GARLIC_FISH_FRY = REGISTRY.register("garlic_fish_fry", () -> new GarlicFishFryItem());
	public static final RegistryObject<Item> UMBREON_KNIGHTS_DELIGHT = REGISTRY.register("umbreon_knights_delight",
			() -> new UmbreonKnightsDelightItem());
	public static final RegistryObject<Item> COOKED_RICE = REGISTRY.register("cooked_rice", () -> new CookedRiceItem());
	public static final RegistryObject<Item> FISH_AND_RICE = REGISTRY.register("fish_and_rice", () -> new FishAndRiceItem());
	public static final RegistryObject<Item> ADVENTURERS_STIR_FRY = REGISTRY.register("adventurers_stir_fry", () -> new AdventurersStirFryItem());
	public static final RegistryObject<Item> EGG_AND_RICE = REGISTRY.register("egg_and_rice", () -> new EggAndRiceItem());
	public static final RegistryObject<Item> GREEN_MEAT_WRAP = REGISTRY.register("green_meat_wrap", () -> new GreenMeatWrapItem());
	public static final RegistryObject<Item> GOLDEN_MELON_WINE = REGISTRY.register("golden_melon_wine", () -> new GoldenMelonWineItem());
	public static final RegistryObject<Item> FRIED_CORN = REGISTRY.register("fried_corn", () -> new FriedCornItem());
	public static final RegistryObject<Item> CHICKEN_POT_PIE = REGISTRY.register("chicken_pot_pie", () -> new ChickenPotPieItem());
	public static final RegistryObject<Item> REINFORCED_IRON_SWORD = REGISTRY.register("reinforced_iron_sword", () -> new ReinforcedIronSwordItem());
	public static final RegistryObject<Item> VULCOR_SWORD = REGISTRY.register("vulcor_sword", () -> new VulcorSwordItem());
	public static final RegistryObject<Item> ZORALIUM_SWORD = REGISTRY.register("zoralium_sword", () -> new ZoraliumSwordItem());
	public static final RegistryObject<Item> LATHIUM_SWORD = REGISTRY.register("lathium_sword", () -> new LathiumSwordItem());
	public static final RegistryObject<Item> COBIUM_SWORD = REGISTRY.register("cobium_sword", () -> new CobiumSwordItem());
	public static final RegistryObject<Item> SKORIUM_SWORD = REGISTRY.register("skorium_sword", () -> new SkoriumSwordItem());
	public static final RegistryObject<Item> UMBELLIUM_SWORD = REGISTRY.register("umbellium_sword", () -> new UmbelliumSwordItem());
	public static final RegistryObject<Item> MYSTALIUM_SWORD = REGISTRY.register("mystalium_sword", () -> new MystaliumSwordItem());
	public static final RegistryObject<Item> DUILIUM_SWORD = REGISTRY.register("duilium_sword", () -> new DuiliumSwordItem());
	public static final RegistryObject<Item> OSNIUM_SWORD = REGISTRY.register("osnium_sword", () -> new OsniumSwordItem());
	public static final RegistryObject<Item> ULTRIUM_SWORD = REGISTRY.register("ultrium_sword", () -> new UltriumSwordItem());
	public static final RegistryObject<Item> IRON_BATTLEAXE = REGISTRY.register("iron_battleaxe", () -> new IronBattleaxeItem());
	public static final RegistryObject<Item> GOLD_BATTLEAXE = REGISTRY.register("gold_battleaxe", () -> new GoldBattleaxeItem());
	public static final RegistryObject<Item> REINFORCED_BATTLE_AXE = REGISTRY.register("reinforced_battle_axe", () -> new ReinforcedBattleAxeItem());
	public static final RegistryObject<Item> VULCOR_BATTLEAXE = REGISTRY.register("vulcor_battleaxe", () -> new VulcorBattleaxeItem());
	public static final RegistryObject<Item> DIAMOND_BATTLEAXE = REGISTRY.register("diamond_battleaxe", () -> new DiamondBattleaxeItem());
	public static final RegistryObject<Item> ZORALIUM_BATTLEAXE = REGISTRY.register("zoralium_battleaxe", () -> new ZoraliumBattleaxeItem());
	public static final RegistryObject<Item> LATHIUM_BATTLEAXE = REGISTRY.register("lathium_battleaxe", () -> new LathiumBattleaxeItem());
	public static final RegistryObject<Item> COBIUM_BATTLEAXE = REGISTRY.register("cobium_battleaxe", () -> new CobiumBattleaxeItem());
	public static final RegistryObject<Item> NETHERITE_BATTLEAXE = REGISTRY.register("netherite_battleaxe", () -> new NetheriteBattleaxeItem());
	public static final RegistryObject<Item> SKORIUM_BATTLEAXE = REGISTRY.register("skorium_battleaxe", () -> new SkoriumBattleaxeItem());
	public static final RegistryObject<Item> UMBELLIUM_BATTLEAXE = REGISTRY.register("umbellium_battleaxe", () -> new UmbelliumBattleaxeItem());
	public static final RegistryObject<Item> MYSTALIUM_BATTLEAXE = REGISTRY.register("mystalium_battleaxe", () -> new MystaliumBattleaxeItem());
	public static final RegistryObject<Item> DUILIUM_BATTLEAXE = REGISTRY.register("duilium_battleaxe", () -> new DuiliumBattleaxeItem());
	public static final RegistryObject<Item> OSNIUM_BATTLEAXE = REGISTRY.register("osnium_battleaxe", () -> new OsniumBattleaxeItem());
	public static final RegistryObject<Item> ULTRIUM_BATTLEAXE = REGISTRY.register("ultrium_battleaxe", () -> new UltriumBattleaxeItem());
	public static final RegistryObject<Item> IRON_MACE = REGISTRY.register("iron_mace", () -> new IronMaceItem());
	public static final RegistryObject<Item> GOLD_MACE = REGISTRY.register("gold_mace", () -> new GoldMaceItem());
	public static final RegistryObject<Item> REINFORCED_MACE = REGISTRY.register("reinforced_mace", () -> new ReinforcedMaceItem());
	public static final RegistryObject<Item> VULCOR_MACE = REGISTRY.register("vulcor_mace", () -> new VulcorMaceItem());
	public static final RegistryObject<Item> DIAMOND_MACE = REGISTRY.register("diamond_mace", () -> new DiamondMaceItem());
	public static final RegistryObject<Item> ZORALIUM_MACE = REGISTRY.register("zoralium_mace", () -> new ZoraliumMaceItem());
	public static final RegistryObject<Item> LATHIUM_MACE = REGISTRY.register("lathium_mace", () -> new LathiumMaceItem());
	public static final RegistryObject<Item> COBIUM_MACE = REGISTRY.register("cobium_mace", () -> new CobiumMaceItem());
	public static final RegistryObject<Item> NETHERITE_MACE = REGISTRY.register("netherite_mace", () -> new NetheriteMaceItem());
	public static final RegistryObject<Item> SKORIUM_MACE = REGISTRY.register("skorium_mace", () -> new SkoriumMaceItem());
	public static final RegistryObject<Item> UMBELLIUM_MACE = REGISTRY.register("umbellium_mace", () -> new UmbelliumMaceItem());
	public static final RegistryObject<Item> MYSTALIUM_MACE = REGISTRY.register("mystalium_mace", () -> new MystaliumMaceItem());
	public static final RegistryObject<Item> OSNIUM_MACE = REGISTRY.register("osnium_mace", () -> new OsniumMaceItem());
	public static final RegistryObject<Item> DUILIUM_MACE = REGISTRY.register("duilium_mace", () -> new DuiliumMaceItem());
	public static final RegistryObject<Item> ULTRIUM_MACE = REGISTRY.register("ultrium_mace", () -> new UltriumMaceItem());
	public static final RegistryObject<Item> UMBREON_LEATHER_ARMOR_HELMET = REGISTRY.register("umbreon_leather_armor_helmet",
			() -> new UmbreonLeatherArmorItem.Helmet());
	public static final RegistryObject<Item> UMBREON_LEATHER_ARMOR_CHESTPLATE = REGISTRY.register("umbreon_leather_armor_chestplate",
			() -> new UmbreonLeatherArmorItem.Chestplate());
	public static final RegistryObject<Item> UMBREON_LEATHER_ARMOR_LEGGINGS = REGISTRY.register("umbreon_leather_armor_leggings",
			() -> new UmbreonLeatherArmorItem.Leggings());
	public static final RegistryObject<Item> UMBREON_LEATHER_ARMOR_BOOTS = REGISTRY.register("umbreon_leather_armor_boots",
			() -> new UmbreonLeatherArmorItem.Boots());
	public static final RegistryObject<Item> UMBREON_IRON_ARMOR_HELMET = REGISTRY.register("umbreon_iron_armor_helmet",
			() -> new UmbreonIronArmorItem.Helmet());
	public static final RegistryObject<Item> UMBREON_IRON_ARMOR_CHESTPLATE = REGISTRY.register("umbreon_iron_armor_chestplate",
			() -> new UmbreonIronArmorItem.Chestplate());
	public static final RegistryObject<Item> UMBREON_IRON_ARMOR_LEGGINGS = REGISTRY.register("umbreon_iron_armor_leggings",
			() -> new UmbreonIronArmorItem.Leggings());
	public static final RegistryObject<Item> UMBREON_IRON_ARMOR_BOOTS = REGISTRY.register("umbreon_iron_armor_boots",
			() -> new UmbreonIronArmorItem.Boots());
	public static final RegistryObject<Item> UMBREON_CHAINMAIL_ARMOR_HELMET = REGISTRY.register("umbreon_chainmail_armor_helmet",
			() -> new UmbreonChainmailArmorItem.Helmet());
	public static final RegistryObject<Item> UMBREON_CHAINMAIL_ARMOR_CHESTPLATE = REGISTRY.register("umbreon_chainmail_armor_chestplate",
			() -> new UmbreonChainmailArmorItem.Chestplate());
	public static final RegistryObject<Item> UMBREON_CHAINMAIL_ARMOR_LEGGINGS = REGISTRY.register("umbreon_chainmail_armor_leggings",
			() -> new UmbreonChainmailArmorItem.Leggings());
	public static final RegistryObject<Item> UMBREON_CHAINMAIL_ARMOR_BOOTS = REGISTRY.register("umbreon_chainmail_armor_boots",
			() -> new UmbreonChainmailArmorItem.Boots());
	public static final RegistryObject<Item> UMBREON_DIAMOND_ARMOR_HELMET = REGISTRY.register("umbreon_diamond_armor_helmet",
			() -> new UmbreonDiamondArmorItem.Helmet());
	public static final RegistryObject<Item> UMBREON_DIAMOND_ARMOR_CHESTPLATE = REGISTRY.register("umbreon_diamond_armor_chestplate",
			() -> new UmbreonDiamondArmorItem.Chestplate());
	public static final RegistryObject<Item> UMBREON_DIAMOND_ARMOR_LEGGINGS = REGISTRY.register("umbreon_diamond_armor_leggings",
			() -> new UmbreonDiamondArmorItem.Leggings());
	public static final RegistryObject<Item> UMBREON_DIAMOND_ARMOR_BOOTS = REGISTRY.register("umbreon_diamond_armor_boots",
			() -> new UmbreonDiamondArmorItem.Boots());
	public static final RegistryObject<Item> UMBREON_GOLD_ARMOR_HELMET = REGISTRY.register("umbreon_gold_armor_helmet",
			() -> new UmbreonGoldArmorItem.Helmet());
	public static final RegistryObject<Item> UMBREON_GOLD_ARMOR_CHESTPLATE = REGISTRY.register("umbreon_gold_armor_chestplate",
			() -> new UmbreonGoldArmorItem.Chestplate());
	public static final RegistryObject<Item> UMBREON_GOLD_ARMOR_LEGGINGS = REGISTRY.register("umbreon_gold_armor_leggings",
			() -> new UmbreonGoldArmorItem.Leggings());
	public static final RegistryObject<Item> UMBREON_GOLD_ARMOR_BOOTS = REGISTRY.register("umbreon_gold_armor_boots",
			() -> new UmbreonGoldArmorItem.Boots());
	public static final RegistryObject<Item> UMBREON_NETHERITE_ARMOR_HELMET = REGISTRY.register("umbreon_netherite_armor_helmet",
			() -> new UmbreonNetheriteArmorItem.Helmet());
	public static final RegistryObject<Item> UMBREON_NETHERITE_ARMOR_CHESTPLATE = REGISTRY.register("umbreon_netherite_armor_chestplate",
			() -> new UmbreonNetheriteArmorItem.Chestplate());
	public static final RegistryObject<Item> UMBREON_NETHERITE_ARMOR_LEGGINGS = REGISTRY.register("umbreon_netherite_armor_leggings",
			() -> new UmbreonNetheriteArmorItem.Leggings());
	public static final RegistryObject<Item> UMBREON_NETHERITE_ARMOR_BOOTS = REGISTRY.register("umbreon_netherite_armor_boots",
			() -> new UmbreonNetheriteArmorItem.Boots());
	public static final RegistryObject<Item> VULCOR_ARMOR_HELMET = REGISTRY.register("vulcor_armor_helmet", () -> new VulcorArmorItem.Helmet());
	public static final RegistryObject<Item> VULCOR_ARMOR_CHESTPLATE = REGISTRY.register("vulcor_armor_chestplate",
			() -> new VulcorArmorItem.Chestplate());
	public static final RegistryObject<Item> VULCOR_ARMOR_LEGGINGS = REGISTRY.register("vulcor_armor_leggings", () -> new VulcorArmorItem.Leggings());
	public static final RegistryObject<Item> VULCOR_ARMOR_BOOTS = REGISTRY.register("vulcor_armor_boots", () -> new VulcorArmorItem.Boots());
	public static final RegistryObject<Item> REINFORCED_IRON_ARMOR_HELMET = REGISTRY.register("reinforced_iron_armor_helmet",
			() -> new ReinforcedIronArmorItem.Helmet());
	public static final RegistryObject<Item> REINFORCED_IRON_ARMOR_CHESTPLATE = REGISTRY.register("reinforced_iron_armor_chestplate",
			() -> new ReinforcedIronArmorItem.Chestplate());
	public static final RegistryObject<Item> REINFORCED_IRON_ARMOR_LEGGINGS = REGISTRY.register("reinforced_iron_armor_leggings",
			() -> new ReinforcedIronArmorItem.Leggings());
	public static final RegistryObject<Item> REINFORCED_IRON_ARMOR_BOOTS = REGISTRY.register("reinforced_iron_armor_boots",
			() -> new ReinforcedIronArmorItem.Boots());
	public static final RegistryObject<Item> ENDER_ARMOR_HELMET = REGISTRY.register("ender_armor_helmet", () -> new EnderArmorItem.Helmet());
	public static final RegistryObject<Item> ENDER_ARMOR_CHESTPLATE = REGISTRY.register("ender_armor_chestplate",
			() -> new EnderArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDER_ARMOR_LEGGINGS = REGISTRY.register("ender_armor_leggings", () -> new EnderArmorItem.Leggings());
	public static final RegistryObject<Item> ENDER_ARMOR_BOOTS = REGISTRY.register("ender_armor_boots", () -> new EnderArmorItem.Boots());
	public static final RegistryObject<Item> ZORALIUM_ARMOR_HELMET = REGISTRY.register("zoralium_armor_helmet", () -> new ZoraliumArmorItem.Helmet());
	public static final RegistryObject<Item> ZORALIUM_ARMOR_CHESTPLATE = REGISTRY.register("zoralium_armor_chestplate",
			() -> new ZoraliumArmorItem.Chestplate());
	public static final RegistryObject<Item> ZORALIUM_ARMOR_LEGGINGS = REGISTRY.register("zoralium_armor_leggings",
			() -> new ZoraliumArmorItem.Leggings());
	public static final RegistryObject<Item> ZORALIUM_ARMOR_BOOTS = REGISTRY.register("zoralium_armor_boots", () -> new ZoraliumArmorItem.Boots());
	public static final RegistryObject<Item> LATHIUM_ARMOR_HELMET = REGISTRY.register("lathium_armor_helmet", () -> new LathiumArmorItem.Helmet());
	public static final RegistryObject<Item> LATHIUM_ARMOR_CHESTPLATE = REGISTRY.register("lathium_armor_chestplate",
			() -> new LathiumArmorItem.Chestplate());
	public static final RegistryObject<Item> LATHIUM_ARMOR_LEGGINGS = REGISTRY.register("lathium_armor_leggings",
			() -> new LathiumArmorItem.Leggings());
	public static final RegistryObject<Item> LATHIUM_ARMOR_BOOTS = REGISTRY.register("lathium_armor_boots", () -> new LathiumArmorItem.Boots());
	public static final RegistryObject<Item> COBIUM_ARMOR_HELMET = REGISTRY.register("cobium_armor_helmet", () -> new CobiumArmorItem.Helmet());
	public static final RegistryObject<Item> COBIUM_ARMOR_CHESTPLATE = REGISTRY.register("cobium_armor_chestplate",
			() -> new CobiumArmorItem.Chestplate());
	public static final RegistryObject<Item> COBIUM_ARMOR_LEGGINGS = REGISTRY.register("cobium_armor_leggings", () -> new CobiumArmorItem.Leggings());
	public static final RegistryObject<Item> COBIUM_ARMOR_BOOTS = REGISTRY.register("cobium_armor_boots", () -> new CobiumArmorItem.Boots());
	public static final RegistryObject<Item> SKORIUM_ARMOR_HELMET = REGISTRY.register("skorium_armor_helmet", () -> new SkoriumArmorItem.Helmet());
	public static final RegistryObject<Item> SKORIUM_ARMOR_CHESTPLATE = REGISTRY.register("skorium_armor_chestplate",
			() -> new SkoriumArmorItem.Chestplate());
	public static final RegistryObject<Item> SKORIUM_ARMOR_LEGGINGS = REGISTRY.register("skorium_armor_leggings",
			() -> new SkoriumArmorItem.Leggings());
	public static final RegistryObject<Item> SKORIUM_ARMOR_BOOTS = REGISTRY.register("skorium_armor_boots", () -> new SkoriumArmorItem.Boots());
	public static final RegistryObject<Item> UMBELLIUM_ARMOR_HELMET = REGISTRY.register("umbellium_armor_helmet",
			() -> new UmbelliumArmorItem.Helmet());
	public static final RegistryObject<Item> UMBELLIUM_ARMOR_CHESTPLATE = REGISTRY.register("umbellium_armor_chestplate",
			() -> new UmbelliumArmorItem.Chestplate());
	public static final RegistryObject<Item> UMBELLIUM_ARMOR_LEGGINGS = REGISTRY.register("umbellium_armor_leggings",
			() -> new UmbelliumArmorItem.Leggings());
	public static final RegistryObject<Item> UMBELLIUM_ARMOR_BOOTS = REGISTRY.register("umbellium_armor_boots", () -> new UmbelliumArmorItem.Boots());
	public static final RegistryObject<Item> MYSTALIUM_ARMOR_HELMET = REGISTRY.register("mystalium_armor_helmet",
			() -> new MystaliumArmorItem.Helmet());
	public static final RegistryObject<Item> MYSTALIUM_ARMOR_CHESTPLATE = REGISTRY.register("mystalium_armor_chestplate",
			() -> new MystaliumArmorItem.Chestplate());
	public static final RegistryObject<Item> MYSTALIUM_ARMOR_LEGGINGS = REGISTRY.register("mystalium_armor_leggings",
			() -> new MystaliumArmorItem.Leggings());
	public static final RegistryObject<Item> MYSTALIUM_ARMOR_BOOTS = REGISTRY.register("mystalium_armor_boots", () -> new MystaliumArmorItem.Boots());
	public static final RegistryObject<Item> DUILIUM_ARMOR_HELMET = REGISTRY.register("duilium_armor_helmet", () -> new DuiliumArmorItem.Helmet());
	public static final RegistryObject<Item> DUILIUM_ARMOR_CHESTPLATE = REGISTRY.register("duilium_armor_chestplate",
			() -> new DuiliumArmorItem.Chestplate());
	public static final RegistryObject<Item> DUILIUM_ARMOR_LEGGINGS = REGISTRY.register("duilium_armor_leggings",
			() -> new DuiliumArmorItem.Leggings());
	public static final RegistryObject<Item> DUILIUM_ARMOR_BOOTS = REGISTRY.register("duilium_armor_boots", () -> new DuiliumArmorItem.Boots());
	public static final RegistryObject<Item> OSNIUM_ARMOR_HELMET = REGISTRY.register("osnium_armor_helmet", () -> new OsniumArmorItem.Helmet());
	public static final RegistryObject<Item> OSNIUM_ARMOR_CHESTPLATE = REGISTRY.register("osnium_armor_chestplate",
			() -> new OsniumArmorItem.Chestplate());
	public static final RegistryObject<Item> OSNIUM_ARMOR_LEGGINGS = REGISTRY.register("osnium_armor_leggings", () -> new OsniumArmorItem.Leggings());
	public static final RegistryObject<Item> OSNIUM_ARMOR_BOOTS = REGISTRY.register("osnium_armor_boots", () -> new OsniumArmorItem.Boots());
	public static final RegistryObject<Item> ULTRIUM_ARMOR_HELMET = REGISTRY.register("ultrium_armor_helmet", () -> new UltriumArmorItem.Helmet());
	public static final RegistryObject<Item> ULTRIUM_ARMOR_CHESTPLATE = REGISTRY.register("ultrium_armor_chestplate",
			() -> new UltriumArmorItem.Chestplate());
	public static final RegistryObject<Item> ULTRIUM_ARMOR_LEGGINGS = REGISTRY.register("ultrium_armor_leggings",
			() -> new UltriumArmorItem.Leggings());
	public static final RegistryObject<Item> ULTRIUM_ARMOR_BOOTS = REGISTRY.register("ultrium_armor_boots", () -> new UltriumArmorItem.Boots());
	public static final RegistryObject<Item> IRON_BOW = REGISTRY.register("iron_bow", () -> new IronBowItem());
	public static final RegistryObject<Item> REINFORCED_IRON_BOW = REGISTRY.register("reinforced_iron_bow", () -> new ReinforcedIronBowItem());
	public static final RegistryObject<Item> DIAMOND_BOW = REGISTRY.register("diamond_bow", () -> new DiamondBowItem());
	public static final RegistryObject<Item> ZORALIUM_BOW = REGISTRY.register("zoralium_bow", () -> new ZoraliumBowItem());
	public static final RegistryObject<Item> LATHIUM_BOW = REGISTRY.register("lathium_bow", () -> new LathiumBowItem());
	public static final RegistryObject<Item> COBIUM_BOW = REGISTRY.register("cobium_bow", () -> new CobiumBowItem());
	public static final RegistryObject<Item> SKORIUM_BOW = REGISTRY.register("skorium_bow", () -> new SkoriumBowItem());
	public static final RegistryObject<Item> NETHERITE_BOW = REGISTRY.register("netherite_bow", () -> new NetheriteBowItem());
	public static final RegistryObject<Item> UMBELLIUM_BOW = REGISTRY.register("umbellium_bow", () -> new UmbelliumBowItem());
	public static final RegistryObject<Item> REINFORCED_IRON_PICKAXE = REGISTRY.register("reinforced_iron_pickaxe",
			() -> new ReinforcedIronPickaxeItem());
	public static final RegistryObject<Item> REINFORCED_IRON_AXE = REGISTRY.register("reinforced_iron_axe", () -> new ReinforcedIronAxeItem());
	public static final RegistryObject<Item> REINFORCED_IRON_SHOVEL = REGISTRY.register("reinforced_iron_shovel",
			() -> new ReinforcedIronShovelItem());
	public static final RegistryObject<Item> REINFORCED_IRON_HOE = REGISTRY.register("reinforced_iron_hoe", () -> new ReinforcedIronHoeItem());
	public static final RegistryObject<Item> VULCOR_PICKAXE = REGISTRY.register("vulcor_pickaxe", () -> new VulcorPickaxeItem());
	public static final RegistryObject<Item> VULCOR_AXE = REGISTRY.register("vulcor_axe", () -> new VulcorAxeItem());
	public static final RegistryObject<Item> VULCOR_SHOVEL = REGISTRY.register("vulcor_shovel", () -> new VulcorShovelItem());
	public static final RegistryObject<Item> VULCOR_HOE = REGISTRY.register("vulcor_hoe", () -> new VulcorHoeItem());
	public static final RegistryObject<Item> ZORALIUM_PICKAXE = REGISTRY.register("zoralium_pickaxe", () -> new ZoraliumPickaxeItem());
	public static final RegistryObject<Item> ZORALIUM_AXE = REGISTRY.register("zoralium_axe", () -> new ZoraliumAxeItem());
	public static final RegistryObject<Item> ZORALIUM_SHOVEL = REGISTRY.register("zoralium_shovel", () -> new ZoraliumShovelItem());
	public static final RegistryObject<Item> ZORALIUM_HOE = REGISTRY.register("zoralium_hoe", () -> new ZoraliumHoeItem());
	public static final RegistryObject<Item> LATHIUM_PICKAXE = REGISTRY.register("lathium_pickaxe", () -> new LathiumPickaxeItem());
	public static final RegistryObject<Item> LATHIUM_AXE = REGISTRY.register("lathium_axe", () -> new LathiumAxeItem());
	public static final RegistryObject<Item> LATHIUM_SHOVEL = REGISTRY.register("lathium_shovel", () -> new LathiumShovelItem());
	public static final RegistryObject<Item> LATHIUM_HOE = REGISTRY.register("lathium_hoe", () -> new LathiumHoeItem());
	public static final RegistryObject<Item> COBIUM_PICKAXE = REGISTRY.register("cobium_pickaxe", () -> new CobiumPickaxeItem());
	public static final RegistryObject<Item> COBIUM_AXE = REGISTRY.register("cobium_axe", () -> new CobiumAxeItem());
	public static final RegistryObject<Item> COBIUM_SHOVEL = REGISTRY.register("cobium_shovel", () -> new CobiumShovelItem());
	public static final RegistryObject<Item> COBIUM_HOE = REGISTRY.register("cobium_hoe", () -> new CobiumHoeItem());
	public static final RegistryObject<Item> SKORIUM_PICKAXE = REGISTRY.register("skorium_pickaxe", () -> new SkoriumPickaxeItem());
	public static final RegistryObject<Item> SKORIUM_AXE = REGISTRY.register("skorium_axe", () -> new SkoriumAxeItem());
	public static final RegistryObject<Item> SKORIUM_SHOVEL = REGISTRY.register("skorium_shovel", () -> new SkoriumShovelItem());
	public static final RegistryObject<Item> SKORIUM_HOE = REGISTRY.register("skorium_hoe", () -> new SkoriumHoeItem());
	public static final RegistryObject<Item> UMBELLIUM_PICKAXE = REGISTRY.register("umbellium_pickaxe", () -> new UmbelliumPickaxeItem());
	public static final RegistryObject<Item> UMBELLIUM_AXE = REGISTRY.register("umbellium_axe", () -> new UmbelliumAxeItem());
	public static final RegistryObject<Item> UMBELLIUM_SHOVEL = REGISTRY.register("umbellium_shovel", () -> new UmbelliumShovelItem());
	public static final RegistryObject<Item> UMBELLIUM_HOE = REGISTRY.register("umbellium_hoe", () -> new UmbelliumHoeItem());
	public static final RegistryObject<Item> MYSTALIUM_PICKAXE = REGISTRY.register("mystalium_pickaxe", () -> new MystaliumPickaxeItem());
	public static final RegistryObject<Item> MYSTALIUM_AXE = REGISTRY.register("mystalium_axe", () -> new MystaliumAxeItem());
	public static final RegistryObject<Item> MYSTALIUM_SHOVEL = REGISTRY.register("mystalium_shovel", () -> new MystaliumShovelItem());
	public static final RegistryObject<Item> MYSTALIUM_HOE = REGISTRY.register("mystalium_hoe", () -> new MystaliumHoeItem());
	public static final RegistryObject<Item> DUILIUM_PICKAXE = REGISTRY.register("duilium_pickaxe", () -> new DuiliumPickaxeItem());
	public static final RegistryObject<Item> DUILIUM_AXE = REGISTRY.register("duilium_axe", () -> new DuiliumAxeItem());
	public static final RegistryObject<Item> DUILIUM_SHOVEL = REGISTRY.register("duilium_shovel", () -> new DuiliumShovelItem());
	public static final RegistryObject<Item> DUILIUM_HOE = REGISTRY.register("duilium_hoe", () -> new DuiliumHoeItem());
	public static final RegistryObject<Item> OSNIUM_PICKAXE = REGISTRY.register("osnium_pickaxe", () -> new OsniumPickaxeItem());
	public static final RegistryObject<Item> OSNIUM_AXE = REGISTRY.register("osnium_axe", () -> new OsniumAxeItem());
	public static final RegistryObject<Item> OSNIUM_SHOVEL = REGISTRY.register("osnium_shovel", () -> new OsniumShovelItem());
	public static final RegistryObject<Item> OSNIUM_HOE = REGISTRY.register("osnium_hoe", () -> new OsniumHoeItem());
	public static final RegistryObject<Item> ULTRIUM_PICKAXE = REGISTRY.register("ultrium_pickaxe", () -> new UltriumPickaxeItem());
	public static final RegistryObject<Item> ULTRIUM_AXE = REGISTRY.register("ultrium_axe", () -> new UltriumAxeItem());
	public static final RegistryObject<Item> ULTRIUM_SHOVEL = REGISTRY.register("ultrium_shovel", () -> new UltriumShovelItem());
	public static final RegistryObject<Item> ULTRIUM_HOE = REGISTRY.register("ultrium_hoe", () -> new UltriumHoeItem());
	public static final RegistryObject<Item> ROD_OF_CLEAR_SKIES = REGISTRY.register("rod_of_clear_skies", () -> new RodOfClearSkiesItem());
	public static final RegistryObject<Item> ROD_OF_DAYLIGHT = REGISTRY.register("rod_of_daylight", () -> new RodOfDaylightItem());
	public static final RegistryObject<Item> ROD_OF_MOONLIGHT = REGISTRY.register("rod_of_moonlight", () -> new RodOfMoonlightItem());
	public static final RegistryObject<Item> ROD_OF_RAIN = REGISTRY.register("rod_of_rain", () -> new RodOfRainItem());
	public static final RegistryObject<Item> ROD_OF_STORMS = REGISTRY.register("rod_of_storms", () -> new RodOfStormsItem());
	public static final RegistryObject<Item> BUG_NET = REGISTRY.register("bug_net", () -> new BugNetItem());
	public static final RegistryObject<Item> ENDER_DRAGON_SCALE = REGISTRY.register("ender_dragon_scale", () -> new EnderDragonScaleItem());
	public static final RegistryObject<Item> GODDESS_FEATHER = REGISTRY.register("goddess_feather", () -> new GoddessFeatherItem());
	public static final RegistryObject<Item> BURNING_STAR = REGISTRY.register("burning_star", () -> new BurningStarItem());
	public static final RegistryObject<Item> GOLD_COIN = REGISTRY.register("gold_coin", () -> new GoldCoinItem());
	public static final RegistryObject<Item> FIREFLY_ITEM = REGISTRY.register("firefly_item", () -> new FireflyItemItem());
	public static final RegistryObject<Item> VENOM_BEETLE_ITEM = REGISTRY.register("venom_beetle_item", () -> new VenomBeetleItemItem());
	public static final RegistryObject<Item> DUSTMITE_ITEM = REGISTRY.register("dustmite_item", () -> new DustmiteItemItem());
	public static final RegistryObject<Item> DEMON_HORN = REGISTRY.register("demon_horn", () -> new DemonHornItem());
	public static final RegistryObject<Item> CORE_OF_MANA = REGISTRY.register("core_of_mana", () -> new CoreOfManaItem());
	public static final RegistryObject<Item> CRYSTAL_BONE = REGISTRY.register("crystal_bone", () -> new CrystalBoneItem());
	public static final RegistryObject<Item> BANKING_COUNTER = block(UmbreoRpgModBlocks.BANKING_COUNTER, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> TETRIUM_BLOCK = block(UmbreoRpgModBlocks.TETRIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> VULCOR_BLOCK = block(UmbreoRpgModBlocks.VULCOR_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> PURE_GOLD_BLOCK = block(UmbreoRpgModBlocks.PURE_GOLD_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> ZORALIUM_BLOCK = block(UmbreoRpgModBlocks.ZORALIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> LATHIUM_BLOCK = block(UmbreoRpgModBlocks.LATHIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> COBIUM_BLOCK = block(UmbreoRpgModBlocks.COBIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> SKORIUM_BLOCK = block(UmbreoRpgModBlocks.SKORIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> UMBELLIUM_BLOCK = block(UmbreoRpgModBlocks.UMBELLIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> MYSTALIUM_BLOCK = block(UmbreoRpgModBlocks.MYSTALIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> DUILIUM_BLOCK = block(UmbreoRpgModBlocks.DUILIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> OSNIUM_BLOCK = block(UmbreoRpgModBlocks.OSNIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> ULTRIUM_BLOCK = block(UmbreoRpgModBlocks.ULTRIUM_BLOCK, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> CHARRED_LOG = block(UmbreoRpgModBlocks.CHARRED_LOG, UmbreoRpgModTabs.TAB_UMBREO_BLOCKS);
	public static final RegistryObject<Item> ASH_BLOCK = block(UmbreoRpgModBlocks.ASH_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> COOKING_RANGE = block(UmbreoRpgModBlocks.COOKING_RANGE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BOREAL_SWEET_POTATO_STAGE_0 = block(UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_0, null);
	public static final RegistryObject<Item> BOREAL_SWEET_POTATO_STAGE_1 = block(UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_1, null);
	public static final RegistryObject<Item> BOREAL_SWEET_POTATO_STAGE_2 = block(UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_2, null);
	public static final RegistryObject<Item> BOREAL_SWEET_POTATO_STAGE_3 = block(UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_3, null);
	public static final RegistryObject<Item> BOREAL_SWEET_POTATO_STAGE_4 = block(UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_4, null);
	public static final RegistryObject<Item> BOREAL_SWEET_POTATO_STAGE_5 = block(UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_5, null);
	public static final RegistryObject<Item> VORASHIAN_GREENS_STAGE_0 = block(UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_0, null);
	public static final RegistryObject<Item> VORASHIAN_GREENS_STAGE_1 = block(UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_1, null);
	public static final RegistryObject<Item> VORASHIAN_GREENS_STAGE_2 = block(UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_2, null);
	public static final RegistryObject<Item> VORASHIAN_GREENS_STAGE_3 = block(UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_3, null);
	public static final RegistryObject<Item> VORASHIAN_GREENS_STAGE_4 = block(UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_4, null);
	public static final RegistryObject<Item> VORASHIAN_GREENS_STAGE_5 = block(UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_5, null);
	public static final RegistryObject<Item> GARLIC_STAGE_0 = block(UmbreoRpgModBlocks.GARLIC_STAGE_0, null);
	public static final RegistryObject<Item> GARLIC_STAGE_1 = block(UmbreoRpgModBlocks.GARLIC_STAGE_1, null);
	public static final RegistryObject<Item> GARLIC_STAGE_2 = block(UmbreoRpgModBlocks.GARLIC_STAGE_2, null);
	public static final RegistryObject<Item> GARLIC_STAGE_3 = block(UmbreoRpgModBlocks.GARLIC_STAGE_3, null);
	public static final RegistryObject<Item> GARLIC_STAGE_4 = block(UmbreoRpgModBlocks.GARLIC_STAGE_4, null);
	public static final RegistryObject<Item> GARLIC_STAGE_5 = block(UmbreoRpgModBlocks.GARLIC_STAGE_5, null);
	public static final RegistryObject<Item> RICE_STAGE_0 = block(UmbreoRpgModBlocks.RICE_STAGE_0, null);
	public static final RegistryObject<Item> RICE_STAGE_1 = block(UmbreoRpgModBlocks.RICE_STAGE_1, null);
	public static final RegistryObject<Item> RICE_STAGE_2 = block(UmbreoRpgModBlocks.RICE_STAGE_2, null);
	public static final RegistryObject<Item> RICE_STAGE_3 = block(UmbreoRpgModBlocks.RICE_STAGE_3, null);
	public static final RegistryObject<Item> RICE_STAGE_4 = block(UmbreoRpgModBlocks.RICE_STAGE_4, null);
	public static final RegistryObject<Item> RICE_STAGE_5 = block(UmbreoRpgModBlocks.RICE_STAGE_5, null);
	public static final RegistryObject<Item> CORN_STAGE_0 = block(UmbreoRpgModBlocks.CORN_STAGE_0, null);
	public static final RegistryObject<Item> CORN_STAGE_1 = block(UmbreoRpgModBlocks.CORN_STAGE_1, null);
	public static final RegistryObject<Item> CORN_STAGE_2 = block(UmbreoRpgModBlocks.CORN_STAGE_2, null);
	public static final RegistryObject<Item> CORN_STAGE_3 = block(UmbreoRpgModBlocks.CORN_STAGE_3, null);
	public static final RegistryObject<Item> CORN_STAGE_4 = block(UmbreoRpgModBlocks.CORN_STAGE_4, null);
	public static final RegistryObject<Item> CORN_STAGE_5 = block(UmbreoRpgModBlocks.CORN_STAGE_5, null);
	public static final RegistryObject<Item> CORN_STAGE_6 = block(UmbreoRpgModBlocks.CORN_STAGE_6, null);
	public static final RegistryObject<Item> CORN_STAGE_7 = block(UmbreoRpgModBlocks.CORN_STAGE_7, null);
	public static final RegistryObject<Item> CORN_STAGE_8 = block(UmbreoRpgModBlocks.CORN_STAGE_8, null);
	public static final RegistryObject<Item> CORN_STAGE_9 = block(UmbreoRpgModBlocks.CORN_STAGE_9, null);
	public static final RegistryObject<Item> CORN_STAGE_10 = block(UmbreoRpgModBlocks.CORN_STAGE_10, null);
	public static final RegistryObject<Item> GATES_OF_FATES_WALL_BLOCK = block(UmbreoRpgModBlocks.GATES_OF_FATES_WALL_BLOCK, null);
	public static final RegistryObject<Item> GATES_OF_FATES_FLOOR_1_BLOCK = block(UmbreoRpgModBlocks.GATES_OF_FATES_FLOOR_1_BLOCK, null);
	public static final RegistryObject<Item> GATES_OF_FATES_FLOOR_2_BLOCK = block(UmbreoRpgModBlocks.GATES_OF_FATES_FLOOR_2_BLOCK, null);
	public static final RegistryObject<Item> UMBREON_ALLIENCE_BLOCK = block(UmbreoRpgModBlocks.UMBREON_ALLIENCE_BLOCK, null);
	public static final RegistryObject<Item> BOREAL_ALLIENCE_BLOCK = block(UmbreoRpgModBlocks.BOREAL_ALLIENCE_BLOCK, null);
	public static final RegistryObject<Item> VORASH_ALLIENCE_BLOCK = block(UmbreoRpgModBlocks.VORASH_ALLIENCE_BLOCK, null);
	public static final RegistryObject<Item> RANDOM_ALLIANCE_BLOCK = block(UmbreoRpgModBlocks.RANDOM_ALLIANCE_BLOCK, null);
	public static final RegistryObject<Item> GATES_OF_FATES_PORTAL_BLOCK = block(UmbreoRpgModBlocks.GATES_OF_FATES_PORTAL_BLOCK, null);
	public static final RegistryObject<Item> PLACE_HOLDER_ITEM = REGISTRY.register("place_holder_item", () -> new PlaceHolderItemItem());
	public static final RegistryObject<Item> DUSTMITE = REGISTRY.register("dustmite_spawn_egg",
			() -> new ForgeSpawnEggItem(UmbreoRpgModEntities.DUSTMITE, -13027015, -9079435,
					new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MISC)));
	public static final RegistryObject<Item> FIREFLY = REGISTRY.register("firefly_spawn_egg",
			() -> new ForgeSpawnEggItem(UmbreoRpgModEntities.FIREFLY, -16777216, -256, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MISC)));
	public static final RegistryObject<Item> VENOM_BEETLE = REGISTRY.register("venom_beetle_spawn_egg",
			() -> new ForgeSpawnEggItem(UmbreoRpgModEntities.VENOM_BEETLE, -14713059, -14284227,
					new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_MISC)));
	public static final RegistryObject<Item> DEMON = REGISTRY.register("demon_spawn_egg",
			() -> new ForgeSpawnEggItem(UmbreoRpgModEntities.DEMON, -16777216, -13421773, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
