package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

public class SpelunkerEffectProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean foundiron = false;
		boolean founddiamond = false;
		boolean foundhigh = false;
		boolean foundultra = false;
		boolean foundgod = false;
		boolean foundother = false;
		sx = -5;
		foundiron = false;
		founddiamond = false;
		foundhigh = false;
		foundultra = false;
		foundgod = false;
		foundother = false;
		for (int index0 = 0; index0 < (int) (10); index0++) {
			sy = -5;
			for (int index1 = 0; index1 < (int) (10); index1++) {
				sz = -5;
				for (int index2 = 0; index2 < (int) (10); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)))
							.is(BlockTags.create(new ResourceLocation("forge:iron_tier_tag")))) {
						foundiron = true;
					}
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)))
							.is(BlockTags.create(new ResourceLocation("forge:diamond_tier_tag")))) {
						founddiamond = true;
					}
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)))
							.is(BlockTags.create(new ResourceLocation("forge:high_tier_tag")))) {
						foundhigh = true;
					}
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)))
							.is(BlockTags.create(new ResourceLocation("forge:ultra_tier_tag")))) {
						foundultra = true;
					}
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)))
							.is(BlockTags.create(new ResourceLocation("forge:god_tier_tag")))) {
						foundgod = true;
					}
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)))
							.is(BlockTags.create(new ResourceLocation("forge:other_tier_found")))) {
						foundother = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (foundiron == true) {
			{
				boolean _setval = true;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundIronTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundIronTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (founddiamond == true) {
			{
				boolean _setval = true;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundDiamondTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundDiamondTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (foundhigh == true) {
			{
				boolean _setval = true;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundHighTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundHighTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (foundultra == true) {
			{
				boolean _setval = true;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundUltraTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundUltraTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (foundgod == true) {
			{
				boolean _setval = true;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundGodTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundGodTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (foundother == true) {
			{
				boolean _setval = true;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundOtherTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				boolean _setval = false;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgFoundOtherTier = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
