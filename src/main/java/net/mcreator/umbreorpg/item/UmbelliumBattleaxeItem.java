
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class UmbelliumBattleaxeItem extends SwordItem {
	public UmbelliumBattleaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3150;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.UMBELLIUM_INGOT.get()));
			}
		}, 3, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
