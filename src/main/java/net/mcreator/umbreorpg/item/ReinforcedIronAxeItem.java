
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class ReinforcedIronAxeItem extends AxeItem {
	public ReinforcedIronAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 552;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.REINFORCED_IRON_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_TOOLS));
	}
}
