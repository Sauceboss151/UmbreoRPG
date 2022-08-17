
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class MystaliumHoeItem extends HoeItem {
	public MystaliumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 4234;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.MYSTALIUM_INGOT.get()));
			}
		}, 0, 2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
