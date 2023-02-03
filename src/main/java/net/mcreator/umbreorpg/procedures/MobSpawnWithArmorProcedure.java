package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

import java.util.Random;

public class MobSpawnWithArmorProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double rand = 0;
		double randpiece = 0;
		double randtype = 0;
		if (!(entity instanceof Player)) {
			rand = Mth.nextInt(new Random(), 0, 100);
			if (rand <= 15) {
				randtype = Mth.nextInt(new Random(), 0, 10000);
				if (randtype <= 4 && !(entity.getType()
						.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:piglin_type_mob")))
						|| entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:citizen_type_mob"))))) {
					randpiece = Mth.nextInt(new Random(), 0, 100);
					if (randpiece <= 25) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_BOOTS.get()));
							}
						}
					} else if (randpiece <= 50) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_LEGGINGS.get()));
							}
						}
					} else if (randpiece <= 75) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_CHESTPLATE.get()));
							}
						}
					} else {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_CHESTPLATE.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(3, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_HELMET.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(UmbreoRpgModItems.UMBREON_DIAMOND_ARMOR_HELMET.get()));
							}
						}
					}
				} else if (randtype <= 131 && !(entity.getType()
						.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:piglin_type_mob")))
						|| entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:citizen_type_mob"))))) {
					randpiece = Mth.nextInt(new Random(), 0, 100);
					if (randpiece <= 25) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_BOOTS.get()));
							}
						}
					} else if (randpiece <= 50) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_LEGGINGS.get()));
							}
						}
					} else if (randpiece <= 75) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_CHESTPLATE.get()));
							}
						}
					} else {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_CHESTPLATE.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(3, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_HELMET.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(UmbreoRpgModItems.UMBREON_IRON_ARMOR_HELMET.get()));
							}
						}
					}
				} else if (randtype <= 1421 && !(entity.getType()
						.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:piglin_type_mob")))
						|| entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:citizen_type_mob"))))) {
					randpiece = Mth.nextInt(new Random(), 0, 100);
					if (randpiece <= 25) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_BOOTS.get()));
							}
						}
					} else if (randpiece <= 50) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_LEGGINGS.get()));
							}
						}
					} else if (randpiece <= 75) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_CHESTPLATE.get()));
							}
						}
					} else {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_CHESTPLATE.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(3, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_HELMET.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(UmbreoRpgModItems.UMBREON_CHAINMAIL_ARMOR_HELMET.get()));
							}
						}
					}
				} else if (randtype <= 6294
						&& !entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:citizen_type_mob")))) {
					randpiece = Mth.nextInt(new Random(), 0, 100);
					if (randpiece <= 25) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_BOOTS.get()));
							}
						}
					} else if (randpiece <= 50) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_LEGGINGS.get()));
							}
						}
					} else if (randpiece <= 75) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_CHESTPLATE.get()));
							}
						}
					} else {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_CHESTPLATE.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(3, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_HELMET.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(UmbreoRpgModItems.UMBREON_GOLD_ARMOR_HELMET.get()));
							}
						}
					}
				} else {
					randpiece = Mth.nextInt(new Random(), 0, 100);
					if (randpiece <= 25) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_BOOTS.get()));
							}
						}
					} else if (randpiece <= 50) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_LEGGINGS.get()));
							}
						}
					} else if (randpiece <= 75) {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_CHESTPLATE.get()));
							}
						}
					} else {
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(0, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_BOOTS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_BOOTS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_LEGGINGS.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_CHESTPLATE.get()));
							}
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(3, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_HELMET.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(UmbreoRpgModItems.UMBREON_LEATHER_ARMOR_HELMET.get()));
							}
						}
					}
				}
			}
		}
	}
}
