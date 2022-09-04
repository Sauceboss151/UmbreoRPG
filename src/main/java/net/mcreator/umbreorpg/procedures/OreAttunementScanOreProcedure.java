package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.umbreorpg.init.UmbreoRpgModBlocks;

public class OreAttunementScanOreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COAL_ORE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 0);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Coal Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COPPER_ORE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 1);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Copper Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.IRON_ORE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 2);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Iron Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GOLD_ORE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 3);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Gold Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LAPIS_ORE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 4);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Lapis Lazuli Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIAMOND_ORE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 5);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Diamond Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ANCIENT_DEBRIS) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 6);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Ancient Debris Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.VULCOR_ORE.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 7);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Vulcor Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.TETRIUM_ORE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.TETRIUM_DEEPSLATE_ORE.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 8);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Tetrium Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.ZORALIUM_ORE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.ZORALIUM_DEEPSLATE_ORE.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 9);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Zoralium Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.LATHIUM_ORE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.LATHIUM_DEEPSLATE_ORE.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 10);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Lathium Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.COBIUM_ORE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.COBIUM_DEEPSLATE_ORE.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 11);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Cobium Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.SKORIUM_DEEPSLATE_ORE.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 12);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Skorium Has Been Scanned Into the Artifact"), (true));
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UmbreoRpgModBlocks.UMBELLIUM_ORE.get()) {
			itemstack.getOrCreateTag().putDouble("umbreoRpgOreScanned", 13);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Umbellium Has Been Scanned Into the Artifact"), (true));
		}
	}
}
