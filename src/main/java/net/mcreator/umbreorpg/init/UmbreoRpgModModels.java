
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.umbreorpg.client.model.Modelumbellium_armor_layer_1;
import net.mcreator.umbreorpg.client.model.Modelskorium_armor_model;
import net.mcreator.umbreorpg.client.model.Modelreinforced_iron_armor_layer_1;
import net.mcreator.umbreorpg.client.model.Modelnetherite_armor_layer_1;
import net.mcreator.umbreorpg.client.model.Modeldiamond_armor_layer_1;
import net.mcreator.umbreorpg.client.model.Modelcobium_armor_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UmbreoRpgModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelumbellium_armor_layer_1.LAYER_LOCATION, Modelumbellium_armor_layer_1::createBodyLayer);
		event.registerLayerDefinition(Modeldiamond_armor_layer_1.LAYER_LOCATION, Modeldiamond_armor_layer_1::createBodyLayer);
		event.registerLayerDefinition(Modelcobium_armor_model.LAYER_LOCATION, Modelcobium_armor_model::createBodyLayer);
		event.registerLayerDefinition(Modelreinforced_iron_armor_layer_1.LAYER_LOCATION, Modelreinforced_iron_armor_layer_1::createBodyLayer);
		event.registerLayerDefinition(Modelnetherite_armor_layer_1.LAYER_LOCATION, Modelnetherite_armor_layer_1::createBodyLayer);
		event.registerLayerDefinition(Modelskorium_armor_model.LAYER_LOCATION, Modelskorium_armor_model::createBodyLayer);
	}
}
