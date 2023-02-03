
package net.mcreator.umbreorpg.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.umbreorpg.entity.TwelveEyesMaleCitizenEntity;

public class TwelveEyesMaleCitizenRenderer extends HumanoidMobRenderer<TwelveEyesMaleCitizenEntity, HumanoidModel<TwelveEyesMaleCitizenEntity>> {
	public TwelveEyesMaleCitizenRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(TwelveEyesMaleCitizenEntity entity) {
		return new ResourceLocation("umbreo_rpg:textures/entities/twelve_eyes_male_citizen.png");
	}
}
