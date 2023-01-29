
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.umbreorpg.client.renderer.ZoraliumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.VenomBeetleRenderer;
import net.mcreator.umbreorpg.client.renderer.UmbelliumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.TwilightGolemRenderer;
import net.mcreator.umbreorpg.client.renderer.TreantRenderer;
import net.mcreator.umbreorpg.client.renderer.StoneGolemRenderer;
import net.mcreator.umbreorpg.client.renderer.SkoriumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.ShopkeeperRenderer;
import net.mcreator.umbreorpg.client.renderer.ReinforcedIronBowRenderer;
import net.mcreator.umbreorpg.client.renderer.NetheriteBowRenderer;
import net.mcreator.umbreorpg.client.renderer.MossyGolemRenderer;
import net.mcreator.umbreorpg.client.renderer.ManaGolemRenderer;
import net.mcreator.umbreorpg.client.renderer.LathiumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.IronBowRenderer;
import net.mcreator.umbreorpg.client.renderer.ImpRenderer;
import net.mcreator.umbreorpg.client.renderer.FrostGolemRenderer;
import net.mcreator.umbreorpg.client.renderer.FireflyRenderer;
import net.mcreator.umbreorpg.client.renderer.DustmiteRenderer;
import net.mcreator.umbreorpg.client.renderer.DiamondBowRenderer;
import net.mcreator.umbreorpg.client.renderer.DemonRenderer;
import net.mcreator.umbreorpg.client.renderer.CobiumBowRenderer;
import net.mcreator.umbreorpg.client.renderer.BlastGolemRenderer;
import net.mcreator.umbreorpg.client.renderer.BankerRenderer;
import net.mcreator.umbreorpg.client.renderer.BanditLeaderRenderer;
import net.mcreator.umbreorpg.client.renderer.BanditBrownRenderer;
import net.mcreator.umbreorpg.client.renderer.BanditBlondeRenderer;
import net.mcreator.umbreorpg.client.renderer.BanditBlackRenderer;
import net.mcreator.umbreorpg.client.renderer.BakerRenderer;

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
		event.registerEntityRenderer(UmbreoRpgModEntities.DUSTMITE.get(), DustmiteRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.FIREFLY.get(), FireflyRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.VENOM_BEETLE.get(), VenomBeetleRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.DEMON.get(), DemonRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.STONE_GOLEM.get(), StoneGolemRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.MANA_GOLEM.get(), ManaGolemRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.MOSSY_GOLEM.get(), MossyGolemRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.FROST_GOLEM.get(), FrostGolemRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.TWILIGHT_GOLEM.get(), TwilightGolemRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.BLAST_GOLEM.get(), BlastGolemRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.BANDIT_BLACK.get(), BanditBlackRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.BANDIT_BROWN.get(), BanditBrownRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.BANDIT_BLONDE.get(), BanditBlondeRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.BANDIT_LEADER.get(), BanditLeaderRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.BANKER.get(), BankerRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.BAKER.get(), BakerRenderer::new);
		event.registerEntityRenderer(UmbreoRpgModEntities.SHOPKEEPER.get(), ShopkeeperRenderer::new);
	}
}
