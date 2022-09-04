
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class VulcorBattleaxeItem extends SwordItem {
	public VulcorBattleaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UmbreoRpgModItems.VULCOR_INGOT.get()));
			}
		}, 3, -2.8f, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_COMBAT).fireResistant());
	}
}
