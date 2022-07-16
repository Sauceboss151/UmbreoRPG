package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.umbreorpg.init.UmbreoRpgModBlocks;

public class BorealSweetPotatoBonemealProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		double randomChance = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				&& blockstate.getBlock() == UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_3.get()) {
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.1), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.9), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.1), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.9), 0, 0, 0);
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			randomChance = Math.random();
			if (randomChance <= 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_4.get().defaultBlockState(), 3);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				&& blockstate.getBlock() == UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_4.get()) {
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.1), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.9), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.1), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.9), 0, 0, 0);
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			randomChance = Math.random();
			if (randomChance <= 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_5.get().defaultBlockState(), 3);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				&& blockstate.getBlock() == UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_2.get()) {
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.1), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.9), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.1), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.9), 0, 0, 0);
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			randomChance = Math.random();
			if (randomChance <= 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_3.get().defaultBlockState(), 3);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				&& blockstate.getBlock() == UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_1.get()) {
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.1), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.9), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.1), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.9), 0, 0, 0);
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			randomChance = Math.random();
			if (randomChance <= 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_2.get().defaultBlockState(), 3);
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL
				&& blockstate.getBlock() == UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_0.get()) {
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.1), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.9), (y + 0.5), (z + 0.5), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.1), 0, 0, 0);
			world.addParticle(ParticleTypes.COMPOSTER, (x + 0.5), (y + 0.5), (z + 0.9), 0, 0, 0);
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
			randomChance = Math.random();
			if (randomChance <= 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y, z), UmbreoRpgModBlocks.BOREAL_SWEET_POTATO_STAGE_1.get().defaultBlockState(), 3);
			}
		}
	}
}
