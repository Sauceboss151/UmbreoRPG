
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class UltriumPickaxeItem extends PickaxeItem {
	public UltriumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 8726;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 8f;
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
		}, 1, -2.7999999999999998f, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_TOOLS));
	}
}
