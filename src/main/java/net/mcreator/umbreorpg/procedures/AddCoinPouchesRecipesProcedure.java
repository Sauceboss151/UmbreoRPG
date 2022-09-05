package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.LocalPlayer;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AddCoinPouchesRecipesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.SMALL_COIN_POUCH.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:medium_coin_pouch_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:medium_coin_pouch_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.MEDIUM_COIN_POUCH.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:large_coin_pouch_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:large_coin_pouch_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.LARGE_COIN_POUCH.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:extra_large_coin_pouch_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:extra_large_coin_pouch_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.EXTRA_LARGE_COIN_POUCH.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:bankers_coin_pouch_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:bankers_coin_pouch_recipe")});
		}
	}
}
