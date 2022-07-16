package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GetCookingRangePositionProcedureProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getWorld().getBlockState(event.getPos()),
				event.getPlayer());
	}

	public static void execute(double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (blockstate.getBlock() == UmbreoRpgModBlocks.COOKING_RANGE.get()) {
			{
				double _setval = x;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgCookingRangeXPos = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = y;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgCookingRangeYPos = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = z;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgCookingRangeZPos = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
