
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.umbreorpg.client.model.Modelvenom_beetle;
import net.mcreator.umbreorpg.client.model.Modelumbreorpg_arrow;
import net.mcreator.umbreorpg.client.model.Modelumbellium_armor_layer_1;
import net.mcreator.umbreorpg.client.model.Modelultrium_armor_model;
import net.mcreator.umbreorpg.client.model.Modelskorium_armor_model;
import net.mcreator.umbreorpg.client.model.Modelreinforced_iron_armor_layer_1;
import net.mcreator.umbreorpg.client.model.Modelosnium_armor_model;
import net.mcreator.umbreorpg.client.model.Modelnetherite_armor_layer_1;
import net.mcreator.umbreorpg.client.model.Modelmodelgolem;
import net.mcreator.umbreorpg.client.model.Modelimpmodel;
import net.mcreator.umbreorpg.client.model.Modelfirefly;
import net.mcreator.umbreorpg.client.model.Modeldustmite;
import net.mcreator.umbreorpg.client.model.Modeldulium_armor_mode;
import net.mcreator.umbreorpg.client.model.Modeldiamond_armor_layer_1;
import net.mcreator.umbreorpg.client.model.Modeldemonmodel;
import net.mcreator.umbreorpg.client.model.Modelcobium_armor_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UmbreoRpgModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldemonmodel.LAYER_LOCATION, Modeldemonmodel::createBodyLayer);
		event.registerLayerDefinition(Modelultrium_armor_model.LAYER_LOCATION, Modelultrium_armor_model::createBodyLayer);
		event.registerLayerDefinition(Modelumbellium_armor_layer_1.LAYER_LOCATION, Modelumbellium_armor_layer_1::createBodyLayer);
		event.registerLayerDefinition(Modeldiamond_armor_layer_1.LAYER_LOCATION, Modeldiamond_armor_layer_1::createBodyLayer);
		event.registerLayerDefinition(Modeldulium_armor_mode.LAYER_LOCATION, Modeldulium_armor_mode::createBodyLayer);
		event.registerLayerDefinition(Modelumbreorpg_arrow.LAYER_LOCATION, Modelumbreorpg_arrow::createBodyLayer);
		event.registerLayerDefinition(Modelskorium_armor_model.LAYER_LOCATION, Modelskorium_armor_model::createBodyLayer);
		event.registerLayerDefinition(Modelmodelgolem.LAYER_LOCATION, Modelmodelgolem::createBodyLayer);
		event.registerLayerDefinition(Modelcobium_armor_model.LAYER_LOCATION, Modelcobium_armor_model::createBodyLayer);
		event.registerLayerDefinition(Modeldustmite.LAYER_LOCATION, Modeldustmite::createBodyLayer);
		event.registerLayerDefinition(Modelosnium_armor_model.LAYER_LOCATION, Modelosnium_armor_model::createBodyLayer);
		event.registerLayerDefinition(Modelvenom_beetle.LAYER_LOCATION, Modelvenom_beetle::createBodyLayer);
		event.registerLayerDefinition(Modelfirefly.LAYER_LOCATION, Modelfirefly::createBodyLayer);
		event.registerLayerDefinition(Modelimpmodel.LAYER_LOCATION, Modelimpmodel::createBodyLayer);
		event.registerLayerDefinition(Modelreinforced_iron_armor_layer_1.LAYER_LOCATION, Modelreinforced_iron_armor_layer_1::createBodyLayer);
		event.registerLayerDefinition(Modelnetherite_armor_layer_1.LAYER_LOCATION, Modelnetherite_armor_layer_1::createBodyLayer);
	}
}
