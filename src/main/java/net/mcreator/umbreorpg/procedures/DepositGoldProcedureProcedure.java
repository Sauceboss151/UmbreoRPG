package net.mcreator.umbreorpg.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.umbreorpg.network.UmbreoRpgModVariables;
import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

import java.util.function.Supplier;
import java.util.Map;

public class DepositGoldProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == UmbreoRpgModItems.GOLD_COIN.get()) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgPlayerBankGoldTotal + new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0);
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgPlayerBankGoldTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0));
				_player.containerMenu.broadcastChanges();
			}
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == UmbreoRpgModItems.SMALL_COIN_POUCH.get()) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgPlayerBankGoldTotal
						+ (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("umbreoRpgPouchGoldAmount");
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgPlayerBankGoldTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getOrCreateTag().putDouble("umbreoRpgPouchGoldAmount", 0);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == UmbreoRpgModItems.MEDIUM_COIN_POUCH.get()) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgPlayerBankGoldTotal
						+ (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("umbreoRpgPouchGoldAmount");
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgPlayerBankGoldTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getOrCreateTag().putDouble("umbreoRpgPouchGoldAmount", 0);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == UmbreoRpgModItems.LARGE_COIN_POUCH.get()) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgPlayerBankGoldTotal
						+ (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("umbreoRpgPouchGoldAmount");
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgPlayerBankGoldTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getOrCreateTag().putDouble("umbreoRpgPouchGoldAmount", 0);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == UmbreoRpgModItems.EXTRA_LARGE_COIN_POUCH.get()) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgPlayerBankGoldTotal
						+ (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("umbreoRpgPouchGoldAmount");
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgPlayerBankGoldTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getOrCreateTag().putDouble("umbreoRpgPouchGoldAmount", 0);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == UmbreoRpgModItems.BANKERS_COIN_POUCH.get()) {
			{
				double _setval = (entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new UmbreoRpgModVariables.PlayerVariables())).umbreoRpgPlayerBankGoldTotal
						+ (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getOrCreateTag()
								.getDouble("umbreoRpgPouchGoldAmount");
				entity.getCapability(UmbreoRpgModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.umbreoRpgPlayerBankGoldTotal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getOrCreateTag().putDouble("umbreoRpgPouchGoldAmount", 0);
		}
	}
}
