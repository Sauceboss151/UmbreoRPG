package net.mcreator.umbreorpg.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.player.LocalPlayer;

import net.mcreator.umbreorpg.init.UmbreoRpgModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AddAlchemyTableRecipeProcedureProcedure {
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
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.CORE_OF_LIGHT.get()))
				: false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:alchemy_table_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.JUNGLE_CORE.get()))
				: false)
				|| (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.FROZEN_CORE.get()))
						: false)
				|| (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.TWILIGHT_CORE.get()))
						: false)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:worldly_shard_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.BLAST_CORE.get()))
				: false)
				|| (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.VOID_CORE.get()))
						: false)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:dimensional_shard_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.WORLDLY_SHARD.get()))
				: false)
				|| (entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.DIMENSIONAL_SHARD.get()))
						: false)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:chromatic_core_recipe")});
		}
		if (!(new Object() {
			public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
				if (_ent instanceof ServerPlayer _player)
					return _player.getRecipeBook().contains(recipe);
				else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
					return _player.getRecipeBook().contains(recipe);
				return false;
			}
		}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:alchemy_codex_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:alchemy_codex_recipe")});
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.RABBIT_HIDE)) : false)
				&& !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:bundle_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:bundle_recipe")});
		}
	}
}
