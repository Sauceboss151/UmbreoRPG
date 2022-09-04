package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.umbreorpg.init.UmbreoRpgModBlocks;

public class GetDeepslateOreOreScannedProcedure {
	public static BlockState execute(Entity entity) {
		if (entity == null)
			return Blocks.AIR.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 0) {
			return Blocks.DEEPSLATE_COAL_ORE.defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 1) {
			return Blocks.DEEPSLATE_COPPER_ORE.defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 2) {
			return Blocks.DEEPSLATE_IRON_ORE.defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 3) {
			return Blocks.DEEPSLATE_GOLD_ORE.defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 4) {
			return Blocks.DEEPSLATE_LAPIS_ORE.defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 5) {
			return Blocks.DEEPSLATE_DIAMOND_ORE.defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 6) {
			return UmbreoRpgModBlocks.GATES_OF_FATES_WALL_BLOCK.get().defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 7) {
			return UmbreoRpgModBlocks.GATES_OF_FATES_WALL_BLOCK.get().defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 8) {
			return UmbreoRpgModBlocks.TETRIUM_DEEPSLATE_ORE.get().defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 9) {
			return UmbreoRpgModBlocks.ZORALIUM_DEEPSLATE_ORE.get().defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 10) {
			return UmbreoRpgModBlocks.LATHIUM_DEEPSLATE_ORE.get().defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 11) {
			return UmbreoRpgModBlocks.COBIUM_DEEPSLATE_ORE.get().defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 12) {
			return UmbreoRpgModBlocks.SKORIUM_DEEPSLATE_ORE.get().defaultBlockState();
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getDouble("umbreoRpgOreScanned") == 13) {
			return UmbreoRpgModBlocks.UMBELLIUM_ORE.get().defaultBlockState();
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("This Artifact is Not Attuned to Any Ore"), (true));
		}
		return UmbreoRpgModBlocks.GATES_OF_FATES_WALL_BLOCK.get().defaultBlockState();
	}
}
