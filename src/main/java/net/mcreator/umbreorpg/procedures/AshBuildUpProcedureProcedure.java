package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AshBuildUpProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((new ResourceLocation("umbreo_rpg:ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
				|| new ResourceLocation("umbreo_rpg:volcanic_ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName()))
				&& !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(UmbreoRpgModMobEffects.ASH_PROTECTION.get()) : false)
				&& (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp >= 2400) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp + 1;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgAshBuildUp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!new ResourceLocation("umbreo_rpg:ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
				&& !new ResourceLocation("umbreo_rpg:volcanic_ashlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())
				&& (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp > 0
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(UmbreoRpgModMobEffects.ASH_PROTECTION.get()) : false)
						&& (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp <= 0) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgAshBuildUp - 1;
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgAshBuildUp = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
