package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class OreAttunementArtifactCheckOreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double yaddPos = 0;
		yaddPos = 0;
		for (int index0 = 0; index0 < (int) (384); index0++) {
			if ((world.getBlockState(new BlockPos(x, y - yaddPos, z))).getBlock() == GetNormalOreOreAttunementProcedure.execute(entity).getBlock()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("The Selected Ore is Below You"), (false));
				break;
			}
			if ((world.getBlockState(new BlockPos(x, y - yaddPos, z))).getBlock() == GetDeepslateOreOreScannedProcedure.execute(entity).getBlock()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("The Selected Ore is Below You"), (false));
				break;
			}
			yaddPos = yaddPos + 1;
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
