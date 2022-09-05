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
public class AddOreBlockRecipesProcedure {
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
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.TETRIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:tetrium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:tetrium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:tetrium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.VULCOR_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:vulcor_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:vulcor_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:vulcor_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.PURE_GOLD_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:pure_gold_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:pure_gold_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:pure_gold_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.ZORALIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:zoralium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:zoralium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:zoralium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.LATHIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:lathium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:lathium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:lathium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.COBIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:cobium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:cobium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:cobium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.SKORIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:skorium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:skorium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:skorium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.UMBELLIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:umbellium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:umbellium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:umbellium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.MYSTALIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:mystalium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:mystalium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:mystalium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.DUILIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:duilium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:duilium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:duilium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.OSNIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:osnium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:osnium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:duilium_ingot_recipe")});
		}
		if ((entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(UmbreoRpgModItems.ULTRIUM_INGOT.get()))
				: false) && !(new Object() {
					public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
						if (_ent instanceof ServerPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						else if (_ent.level.isClientSide() && _ent instanceof LocalPlayer _player)
							return _player.getRecipeBook().contains(recipe);
						return false;
					}
				}.hasRecipe(entity, new ResourceLocation("umbreo_rpg:ultrium_block_recipe")))) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:ultrium_block_recipe")});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("umbreo_rpg:ultrium_ingot_recipe")});
		}
	}
}
