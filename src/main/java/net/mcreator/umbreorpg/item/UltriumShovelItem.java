
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class UltriumShovelItem extends ShovelItem {
	public UltriumShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 8726;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 2.75f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.ULTRIUM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_TOOLS));
	}
}
