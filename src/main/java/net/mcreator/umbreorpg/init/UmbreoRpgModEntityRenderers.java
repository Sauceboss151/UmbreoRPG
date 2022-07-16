
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.umbreorpg.client.renderer.TreantRenderer;
import net.mcreator.umbreorpg.client.renderer.ImpRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UmbreoRpgModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UmbreoRpgModEntities.TREANT.get(), TreantRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.IMP.get(), ImpRenderer::new);
	}
}
