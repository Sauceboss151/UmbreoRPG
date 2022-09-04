
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class DuiliumAxeItem extends AxeItem {
	public DuiliumAxeItem() {
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
				return 7;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.DUILIUM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_TOOLS));
	}
}
