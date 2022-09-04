
package net.mcreator.umbreorpg.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.procedures.NetheriteArmorEffectProcedureProcedure;
import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.client.model.Modelnetherite_armor_layer_1;

import java.util.Map;
import java.util.Collections;

public abstract class UmbreonNetheriteArmorItem extends ArmorItem {
	public UmbreonNetheriteArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 6, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
			}

			@Override
			public String getName() {
				return "umbreon_netherite_armor";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends UmbreonNetheriteArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT).fireResistant());
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("head",
									new Modelnetherite_armor_layer_1(
											Minecraft.getInstance().getEntityModels().bakeLayer(Modelnetherite_armor_layer_1.LAYER_LOCATION)).Head,
									"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "umbreo_rpg:textures/models/armor/netherite_armor__layer_1.png";
		}
	}

	public static class Chestplate extends UmbreonNetheriteArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT).fireResistant());
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body",
							new Modelnetherite_armor_layer_1(
									Minecraft.getInstance().getEntityModels().bakeLayer(Modelnetherite_armor_layer_1.LAYER_LOCATION)).Body,
							"left_arm",
							new Modelnetherite_armor_layer_1(
									Minecraft.getInstance().getEntityModels().bakeLayer(Modelnetherite_armor_layer_1.LAYER_LOCATION)).LeftArm,
							"right_arm",
							new Modelnetherite_armor_layer_1(
									Minecraft.getInstance().getEntityModels().bakeLayer(Modelnetherite_armor_layer_1.LAYER_LOCATION)).RightArm,
							"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "umbreo_rpg:textures/models/armor/netherite_armor__layer_1.png";
		}
	}

	public static class Leggings extends UmbreonNetheriteArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT).fireResistant());
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("left_leg",
							new Modelnetherite_armor_layer_1(
									Minecraft.getInstance().getEntityModels().bakeLayer(Modelnetherite_armor_layer_1.LAYER_LOCATION)).LeftLeg,
							"right_leg",
							new Modelnetherite_armor_layer_1(
									Minecraft.getInstance().getEntityModels().bakeLayer(Modelnetherite_armor_layer_1.LAYER_LOCATION)).RightLeg,
							"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "umbreo_rpg:textures/models/armor/netherite_armor__layer_2.png";
		}
	}

	public static class Boots extends UmbreonNetheriteArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT).fireResistant());
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("left_leg",
							new Modelnetherite_armor_layer_1(
									Minecraft.getInstance().getEntityModels().bakeLayer(Modelnetherite_armor_layer_1.LAYER_LOCATION)).LeftLeg,
							"right_leg",
							new Modelnetherite_armor_layer_1(
									Minecraft.getInstance().getEntityModels().bakeLayer(Modelnetherite_armor_layer_1.LAYER_LOCATION)).RightLeg,
							"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "umbreo_rpg:textures/models/armor/netherite_armor__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NetheriteArmorEffectProcedureProcedure.execute(world, entity);
		}
	}
}
