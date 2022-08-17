
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.umbreorpg.block.entity.VorashianGreensStage5BlockEntity;
import net.mcreator.umbreorpg.block.entity.VorashianGreensStage4BlockEntity;
import net.mcreator.umbreorpg.block.entity.VorashianGreensStage3BlockEntity;
import net.mcreator.umbreorpg.block.entity.VorashianGreensStage2BlockEntity;
import net.mcreator.umbreorpg.block.entity.VorashianGreensStage1BlockEntity;
import net.mcreator.umbreorpg.block.entity.VorashianGreensStage0BlockEntity;
import net.mcreator.umbreorpg.block.entity.RiceStage5BlockEntity;
import net.mcreator.umbreorpg.block.entity.RiceStage4BlockEntity;
import net.mcreator.umbreorpg.block.entity.RiceStage3BlockEntity;
import net.mcreator.umbreorpg.block.entity.RiceStage2BlockEntity;
import net.mcreator.umbreorpg.block.entity.RiceStage1BlockEntity;
import net.mcreator.umbreorpg.block.entity.RiceStage0BlockEntity;
import net.mcreator.umbreorpg.block.entity.GarlicStage5BlockEntity;
import net.mcreator.umbreorpg.block.entity.GarlicStage4BlockEntity;
import net.mcreator.umbreorpg.block.entity.GarlicStage3BlockEntity;
import net.mcreator.umbreorpg.block.entity.GarlicStage2BlockEntity;
import net.mcreator.umbreorpg.block.entity.GarlicStage1BlockEntity;
import net.mcreator.umbreorpg.block.entity.GarlicStage0BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage9BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage8BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage7BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage6BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage5BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage4BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage3BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage2BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage1BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage10BlockEntity;
import net.mcreator.umbreorpg.block.entity.CornStage0BlockEntity;
import net.mcreator.umbreorpg.block.entity.CookingRangeBlockEntity;
import net.mcreator.umbreorpg.block.entity.BorealSweetPotatoStage5BlockEntity;
import net.mcreator.umbreorpg.block.entity.BorealSweetPotatoStage4BlockEntity;
import net.mcreator.umbreorpg.block.entity.BorealSweetPotatoStage3BlockEntity;
import net.mcreator.umbreorpg.block.entity.BorealSweetPotatoStage2BlockEntity;
import net.mcreator.umbreorpg.block.entity.BorealSweetPotatoStage1BlockEntity;
import net.mcreator.umbreorpg.block.entity.BorealSweetPotatoStage0BlockEntity;
import net.mcreator.umbreorpg.block.entity.BankingCounterBlockEntity;
import net.mcreator.umbreorpg.block.entity.AlchemyTableBlockEntity;
import net.mcreator.umbreorpg.UmbreoRpgMod;

public class UmbreoRpgModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, UmbreoRpgMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ALCHEMY_TABLE = register("alchemy_table", UmbreoRpgModBlocks.ALCHEMY_TABLE,
			AlchemyTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOREAL_SWEET_POTATO_STAGE_0 = register("boreal_sweet_potato_stage_0",
			UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_0, BorealSweetPotatoStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOREAL_SWEET_POTATO_STAGE_1 = register("boreal_sweet_potato_stage_1",
			UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_1, BorealSweetPotatoStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOREAL_SWEET_POTATO_STAGE_2 = register("boreal_sweet_potato_stage_2",
			UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_2, BorealSweetPotatoStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOREAL_SWEET_POTATO_STAGE_3 = register("boreal_sweet_potato_stage_3",
			UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_3, BorealSweetPotatoStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOREAL_SWEET_POTATO_STAGE_4 = register("boreal_sweet_potato_stage_4",
			UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_4, BorealSweetPotatoStage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOREAL_SWEET_POTATO_STAGE_5 = register("boreal_sweet_potato_stage_5",
			UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_5, BorealSweetPotatoStage5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VORASHIAN_GREENS_STAGE_0 = register("vorashian_greens_stage_0",
			UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_0, VorashianGreensStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VORASHIAN_GREENS_STAGE_1 = register("vorashian_greens_stage_1",
			UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_1, VorashianGreensStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VORASHIAN_GREENS_STAGE_2 = register("vorashian_greens_stage_2",
			UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_2, VorashianGreensStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VORASHIAN_GREENS_STAGE_3 = register("vorashian_greens_stage_3",
			UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_3, VorashianGreensStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VORASHIAN_GREENS_STAGE_4 = register("vorashian_greens_stage_4",
			UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_4, VorashianGreensStage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VORASHIAN_GREENS_STAGE_5 = register("vorashian_greens_stage_5",
			UmbreoRpgModBlocks.VORASHIAN_GREENS_STAGE_5, VorashianGreensStage5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GARLIC_STAGE_0 = register("garlic_stage_0", UmbreoRpgModBlocks.GARLIC_STAGE_0,
			GarlicStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GARLIC_STAGE_1 = register("garlic_stage_1", UmbreoRpgModBlocks.GARLIC_STAGE_1,
			GarlicStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GARLIC_STAGE_2 = register("garlic_stage_2", UmbreoRpgModBlocks.GARLIC_STAGE_2,
			GarlicStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GARLIC_STAGE_3 = register("garlic_stage_3", UmbreoRpgModBlocks.GARLIC_STAGE_3,
			GarlicStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GARLIC_STAGE_4 = register("garlic_stage_4", UmbreoRpgModBlocks.GARLIC_STAGE_4,
			GarlicStage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GARLIC_STAGE_5 = register("garlic_stage_5", UmbreoRpgModBlocks.GARLIC_STAGE_5,
			GarlicStage5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_STAGE_0 = register("rice_stage_0", UmbreoRpgModBlocks.RICE_STAGE_0,
			RiceStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_STAGE_1 = register("rice_stage_1", UmbreoRpgModBlocks.RICE_STAGE_1,
			RiceStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_STAGE_2 = register("rice_stage_2", UmbreoRpgModBlocks.RICE_STAGE_2,
			RiceStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_STAGE_3 = register("rice_stage_3", UmbreoRpgModBlocks.RICE_STAGE_3,
			RiceStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_STAGE_4 = register("rice_stage_4", UmbreoRpgModBlocks.RICE_STAGE_4,
			RiceStage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RICE_STAGE_5 = register("rice_stage_5", UmbreoRpgModBlocks.RICE_STAGE_5,
			RiceStage5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_0 = register("corn_stage_0", UmbreoRpgModBlocks.CORN_STAGE_0,
			CornStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_1 = register("corn_stage_1", UmbreoRpgModBlocks.CORN_STAGE_1,
			CornStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_2 = register("corn_stage_2", UmbreoRpgModBlocks.CORN_STAGE_2,
			CornStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_3 = register("corn_stage_3", UmbreoRpgModBlocks.CORN_STAGE_3,
			CornStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_4 = register("corn_stage_4", UmbreoRpgModBlocks.CORN_STAGE_4,
			CornStage4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_5 = register("corn_stage_5", UmbreoRpgModBlocks.CORN_STAGE_5,
			CornStage5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_6 = register("corn_stage_6", UmbreoRpgModBlocks.CORN_STAGE_6,
			CornStage6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_7 = register("corn_stage_7", UmbreoRpgModBlocks.CORN_STAGE_7,
			CornStage7BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_8 = register("corn_stage_8", UmbreoRpgModBlocks.CORN_STAGE_8,
			CornStage8BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_9 = register("corn_stage_9", UmbreoRpgModBlocks.CORN_STAGE_9,
			CornStage9BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CORN_STAGE_10 = register("corn_stage_10", UmbreoRpgModBlocks.CORN_STAGE_10,
			CornStage10BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COOKING_RANGE = register("cooking_range", UmbreoRpgModBlocks.COOKING_RANGE,
			CookingRangeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BANKING_COUNTER = register("banking_counter", UmbreoRpgModBlocks.BANKING_COUNTER,
			BankingCounterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
