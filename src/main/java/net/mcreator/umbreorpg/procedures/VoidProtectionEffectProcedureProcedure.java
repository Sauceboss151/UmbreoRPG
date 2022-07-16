package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.umbreorpg.init.UmbreoRpgModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VoidProtectionEffectProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.getX(), event.player.getZ(), event.player);
		}
	}

	public static void execute(double x, double z, Entity entity) {
		execute(null, x, z, entity);
	}

	private static void execute(@Nullable Event event, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.level.dimension()) == (Level.END) && entity.getY() <= 0
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(UmbreoRpgModMobEffects.VOID_PROTECTION.get()) : false)) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, 150, z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, 150, z, _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0));
		}
	}
}
