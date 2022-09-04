
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class OsniumSwordItem extends SwordItem {
	public OsniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 5508;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.OSNIUM_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT));
	}
}
