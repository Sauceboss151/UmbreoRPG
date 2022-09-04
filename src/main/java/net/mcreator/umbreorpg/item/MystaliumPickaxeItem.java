
package net.mcreator.umbreorpg.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.umbreorpg.init.UmbreoRpgModTabs;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

public class MystaliumPickaxeItem extends PickaxeItem {
	public MystaliumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4234;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 6f;
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
		}, 1, -2.8f, new Item.Properties().tab(UmbreoRpgModTabs.TAB_UMBREO_TOOLS));
	}
}
