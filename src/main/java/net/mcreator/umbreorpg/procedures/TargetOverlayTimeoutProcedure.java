package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TargetOverlayTimeoutProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double raytracing_distance = 0;
		boolean mobInSight = false;
		raytracing_distance = 0;
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (!world.getEntitiesOfClass(LivingEntity.class,
					AABB.ofSize(new Vec3(
							(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytracing_distance)), ClipContext.Block.OUTLINE,
									ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
							(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytracing_distance)), ClipContext.Block.OUTLINE,
									ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
							(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(raytracing_distance)), ClipContext.Block.OUTLINE,
									ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
							1, 1, 1),
					e -> true).isEmpty()) {
				mobInSight = true;
				break;
			} else {
				mobInSight = false;
			}
			raytracing_distance = raytracing_distance + 1;
		}
		if (mobInSight == false) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgOverlayTimeout + 1;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgOverlayTimeout = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgOverlayTimeout >= 100) {
				UmbreoRpgModVariables.MapVariables.get(world).umbreoRpgTargetOverlayDisplayStat = false;
				UmbreoRpgModVariables.MapVariables.get(world).syncData(world);
				{
					double _setval = 0;
					entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.umbreoRpgOverlayTimeout = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
