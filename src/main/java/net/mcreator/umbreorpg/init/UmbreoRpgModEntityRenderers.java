
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.umbreorpg.client.renderer.ZoraliumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.UmbelliumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.TreantRenderer;
import net.mcreator.umbreorpg.client.renderer.SkoriumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.ReinforcedIronBowRenderer;
import net.mcreator.umbreorpg.client.renderer.NetheriteBowRenderer;
import net.mcreator.umbreorpg.client.renderer.LathiumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.IronBowRenderer;
import net.mcreator.umbreorpg.client.renderer.ImpRenderer;
import net.mcreator.umbreorpg.client.renderer.DiamondBowRenderer;
import net.mcreator.umbreorpg.client.renderer.CobiumBowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UmbreoRpgModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UmbreoRpgModEntities.TREANT.get(), TreantRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.IMP.get(), ImpRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.IRON_BOW.get(), IronBowRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.REINFORCED_IRON_BOW.get(), ReinforcedIronBowRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.DIAMOND_BOW.get(), DiamondBowRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.ZORALIUM_BOW.get(), ZoraliumBowRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.LATHIUM_BOW.get(), LathiumBowRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.COBIUM_BOW.get(), CobiumBowRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.SKORIUM_BOW.get(), SkoriumBowRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.NETHERITE_BOW.get(), NetheriteBowRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.UMBELLIUM_BOW.get(), UmbelliumBowRenderer::new);
	}
}
