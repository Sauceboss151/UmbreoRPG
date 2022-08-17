
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class UltriumHoeItem extends HoeItem {
	public UltriumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 8726;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return -1f;
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
		}, 0, 4f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
