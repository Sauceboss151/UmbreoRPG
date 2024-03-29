
package net.mcreator.umbreorpg.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.umbreorpg.procedures.IronArmorEffectProcedureProcedure;
import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;

public abstract class UmbreonIronArmorItem extends ArmorItem {
	public UmbreonIronArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
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
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}

			@Override
			public String getName() {
				return "umbreon_iron_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends UmbreonIronArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "umbreo_rpg:textures/models/armor/iron_armor__layer_1.png";
		}
	}

	public static class Chestplate extends UmbreonIronArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "umbreo_rpg:textures/models/armor/iron_armor__layer_1.png";
		}
	}

	public static class Leggings extends UmbreonIronArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "umbreo_rpg:textures/models/armor/iron_armor__layer_2.png";
		}
	}

	public static class Boots extends UmbreonIronArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "umbreo_rpg:textures/models/armor/iron_armor__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			IronArmorEffectProcedureProcedure.execute(entity);
		}
	}
}
