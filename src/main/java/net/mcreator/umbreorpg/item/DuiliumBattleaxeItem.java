
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class DuiliumBattleaxeItem extends SwordItem {
	public DuiliumBattleaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5508;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.DUILIUM_INGOT.get()));
			}
		}, 3, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
