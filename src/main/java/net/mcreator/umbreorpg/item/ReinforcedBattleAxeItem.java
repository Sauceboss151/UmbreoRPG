
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class ReinforcedBattleAxeItem extends PickaxeItem {
	public ReinforcedBattleAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 552;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.REINFORCED_IRON_INGOT.get()));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT));
	}
}
