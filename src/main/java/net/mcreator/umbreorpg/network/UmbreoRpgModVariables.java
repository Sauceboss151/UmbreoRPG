package net.mcreator.umbreorpg.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.umbreorpg.UmbreoRpgMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UmbreoRpgModVariables {
	public static double umbreoRpgNumberOfTarget = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		UmbreoRpgMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new,
				SavedDataSyncMessage::handler);
		UmbreoRpgMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.umbreoRpgAlchemyExp = original.umbreoRpgAlchemyExp;
			clone.umbreoRpgAlchemyExpNextLevel = original.umbreoRpgAlchemyExpNextLevel;
			clone.umbreoRpgAlchemyLevel = original.umbreoRpgAlchemyLevel;
			clone.umbreoRpgCombatExp = original.umbreoRpgCombatExp;
			clone.umbreoRpgCombatExpNextLevel = original.umbreoRpgCombatExpNextLevel;
			clone.umbreoRpgCombatLevel = original.umbreoRpgCombatLevel;
			clone.umbreoRpgCombatLevelDamageIncrease = original.umbreoRpgCombatLevelDamageIncrease;
			clone.umbreoRpgCombatLevelDurabilityChance = original.umbreoRpgCombatLevelDurabilityChance;
			clone.umbreoRpgCookBookPageOpened = original.umbreoRpgCookBookPageOpened;
			clone.umbreoRpgCookingExp = original.umbreoRpgCookingExp;
			clone.umbreoRpgCookingExpNextLevel = original.umbreoRpgCookingExpNextLevel;
			clone.umbreoRpgCookingLevel = original.umbreoRpgCookingLevel;
			clone.umbreoRpgFarmingExp = original.umbreoRpgFarmingExp;
			clone.umbreoRpgFarmingExpNextLevel = original.umbreoRpgFarmingExpNextLevel;
			clone.umbreoRpgFarmingLevel = original.umbreoRpgFarmingLevel;
			clone.umbreoRpgFletchingExp = original.umbreoRpgFletchingExp;
			clone.umbreoRpgFletchingExpNextLevel = original.umbreoRpgFletchingExpNextLevel;
			clone.umbreoRpgFletchingLevel = original.umbreoRpgFletchingLevel;
			clone.umbreoRpgMagicExp = original.umbreoRpgMagicExp;
			clone.umbreoRpgMagicExpNextLevel = original.umbreoRpgMagicExpNextLevel;
			clone.umbreoRpgMagicLevel = original.umbreoRpgMagicLevel;
			clone.umbreoRpgMiningExp = original.umbreoRpgMiningExp;
			clone.umbreoRpgMiningExpNextLevel = original.umbreoRpgMiningExpNextLevel;
			clone.umbreoRpgMiningLevel = original.umbreoRpgMiningLevel;
			clone.umbreoRpgOpenCloseSkillGui = original.umbreoRpgOpenCloseSkillGui;
			clone.umbreoRpgSmithingExp = original.umbreoRpgSmithingExp;
			clone.umbreoRpgSmithingExpNextLevel = original.umbreoRpgSmithingExpNextLevel;
			clone.umbreoRpgSmithingLevel = original.umbreoRpgSmithingLevel;
			clone.umbreoRpgItemBeingCooked = original.umbreoRpgItemBeingCooked;
			clone.umbreoRpgUmbreonAllied = original.umbreoRpgUmbreonAllied;
			clone.umbreoRpgBorealAllied = original.umbreoRpgBorealAllied;
			clone.umbreoRpgVorashAllied = original.umbreoRpgVorashAllied;
			clone.umbreoRpgFateChosenTeleport = original.umbreoRpgFateChosenTeleport;
			clone.umbreoRpgManaCapacity = original.umbreoRpgManaCapacity;
			clone.umbreoRpgManaRegenRate = original.umbreoRpgManaRegenRate;
			clone.umbreoRpgCurrentMana = original.umbreoRpgCurrentMana;
			clone.umbreoRpgPlayerBankGoldTotal = original.umbreoRpgPlayerBankGoldTotal;
			clone.umbreoRpgOverlayTimeout = original.umbreoRpgOverlayTimeout;
			if (!event.isWasDeath()) {
				clone.umbreoRpgSkillPageOpened = original.umbreoRpgSkillPageOpened;
				clone.umbreoRpgTargetOverlayHealth = original.umbreoRpgTargetOverlayHealth;
				clone.umbreoRpgTargetOverlayMaxHealth = original.umbreoRpgTargetOverlayMaxHealth;
				clone.umbreoRpgTargetOverlayName = original.umbreoRpgTargetOverlayName;
				clone.umbreoRpgCookingRangeXPos = original.umbreoRpgCookingRangeXPos;
				clone.umbreoRpgCookingRangeYPos = original.umbreoRpgCookingRangeYPos;
				clone.umbreoRpgCookingRangeZPos = original.umbreoRpgCookingRangeZPos;
				clone.umbreoRpgAlchemyTableXPos = original.umbreoRpgAlchemyTableXPos;
				clone.umbreoRpgAlchemyTableYPos = original.umbreoRpgAlchemyTableYPos;
				clone.umbreoRpgAlchemyTableZPos = original.umbreoRpgAlchemyTableZPos;
				clone.umbreoRpgAshBuildUp = original.umbreoRpgAshBuildUp;
				clone.umbreoRpgFoundIronTier = original.umbreoRpgFoundIronTier;
				clone.umbreoRpgFoundDiamondTier = original.umbreoRpgFoundDiamondTier;
				clone.umbreoRpgFoundHighTier = original.umbreoRpgFoundHighTier;
				clone.umbreoRpgFoundUltraTier = original.umbreoRpgFoundUltraTier;
				clone.umbreoRpgFoundGodTier = original.umbreoRpgFoundGodTier;
				clone.umbreoRpgFoundOtherTier = original.umbreoRpgFoundOtherTier;
				clone.umbreoRpgAshBuildUpCapacity = original.umbreoRpgAshBuildUpCapacity;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					UmbreoRpgMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					UmbreoRpgMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					UmbreoRpgMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "umbreo_rpg_worldvars";
		public boolean umbreoRpgWorldOfMagicEnabled = false;
		public boolean umbreoRpgUmbreoWarBoreal = false;
		public boolean umbreoRpgUmbreoWarVorash = false;
		public boolean umbreoRpgBorealWarVorash = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			umbreoRpgWorldOfMagicEnabled = nbt.getBoolean("umbreoRpgWorldOfMagicEnabled");
			umbreoRpgUmbreoWarBoreal = nbt.getBoolean("umbreoRpgUmbreoWarBoreal");
			umbreoRpgUmbreoWarVorash = nbt.getBoolean("umbreoRpgUmbreoWarVorash");
			umbreoRpgBorealWarVorash = nbt.getBoolean("umbreoRpgBorealWarVorash");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("umbreoRpgWorldOfMagicEnabled", umbreoRpgWorldOfMagicEnabled);
			nbt.putBoolean("umbreoRpgUmbreoWarBoreal", umbreoRpgUmbreoWarBoreal);
			nbt.putBoolean("umbreoRpgUmbreoWarVorash", umbreoRpgUmbreoWarVorash);
			nbt.putBoolean("umbreoRpgBorealWarVorash", umbreoRpgBorealWarVorash);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				UmbreoRpgMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "umbreo_rpg_mapvars";
		public boolean umbreoRpgTargetOverlayDisplayStat = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			umbreoRpgTargetOverlayDisplayStat = nbt.getBoolean("umbreoRpgTargetOverlayDisplayStat");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("umbreoRpgTargetOverlayDisplayStat", umbreoRpgTargetOverlayDisplayStat);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				UmbreoRpgMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e),
						MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("umbreo_rpg", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double umbreoRpgAlchemyExp = 0;
		public double umbreoRpgAlchemyExpNextLevel = 25.0;
		public double umbreoRpgAlchemyLevel = 0.0;
		public double umbreoRpgCombatExp = 0;
		public double umbreoRpgCombatExpNextLevel = 50.0;
		public double umbreoRpgCombatLevel = 0.0;
		public double umbreoRpgCombatLevelDamageIncrease = 0;
		public double umbreoRpgCombatLevelDurabilityChance = 0.0;
		public double umbreoRpgCookBookPageOpened = 0;
		public double umbreoRpgCookingExp = 0;
		public double umbreoRpgCookingExpNextLevel = 25.0;
		public double umbreoRpgCookingLevel = 0.0;
		public double umbreoRpgFarmingExp = 0;
		public double umbreoRpgFarmingExpNextLevel = 100.0;
		public double umbreoRpgFarmingLevel = 0;
		public double umbreoRpgFletchingExp = 0;
		public double umbreoRpgFletchingExpNextLevel = 10.0;
		public double umbreoRpgFletchingLevel = 0;
		public double umbreoRpgMagicExp = 0;
		public double umbreoRpgMagicExpNextLevel = 50.0;
		public double umbreoRpgMagicLevel = 0;
		public double umbreoRpgMiningExp = 0.0;
		public double umbreoRpgMiningExpNextLevel = 250.0;
		public double umbreoRpgMiningLevel = 0;
		public boolean umbreoRpgOpenCloseSkillGui = false;
		public double umbreoRpgSkillPageOpened = 0;
		public double umbreoRpgSmithingExp = 0;
		public double umbreoRpgSmithingExpNextLevel = 25.0;
		public double umbreoRpgSmithingLevel = 0;
		public double umbreoRpgTargetOverlayHealth = 0.0;
		public double umbreoRpgTargetOverlayMaxHealth = 0.0;
		public String umbreoRpgTargetOverlayName = "";
		public double umbreoRpgCookingRangeXPos = 0;
		public double umbreoRpgCookingRangeYPos = 0;
		public double umbreoRpgCookingRangeZPos = 0;
		public ItemStack umbreoRpgItemBeingCooked = ItemStack.EMPTY;
		public double umbreoRpgAlchemyTableXPos = 0;
		public double umbreoRpgAlchemyTableYPos = 0;
		public double umbreoRpgAlchemyTableZPos = 0;
		public double umbreoRpgAshBuildUp = 0;
		public boolean umbreoRpgFoundIronTier = false;
		public boolean umbreoRpgFoundDiamondTier = false;
		public boolean umbreoRpgFoundHighTier = false;
		public boolean umbreoRpgFoundUltraTier = false;
		public boolean umbreoRpgFoundGodTier = false;
		public boolean umbreoRpgFoundOtherTier = false;
		public boolean umbreoRpgUmbreonAllied = false;
		public boolean umbreoRpgBorealAllied = false;
		public boolean umbreoRpgVorashAllied = false;
		public boolean umbreoRpgFateChosenTeleport = false;
		public double umbreoRpgManaCapacity = 100.0;
		public double umbreoRpgManaRegenRate = 1.0;
		public double umbreoRpgCurrentMana = 100.0;
		public double umbreoRpgAshBuildUpCapacity = 2400.0;
		public double umbreoRpgPlayerBankGoldTotal = 0;
		public double umbreoRpgOverlayTimeout = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				UmbreoRpgMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("umbreoRpgAlchemyExp", umbreoRpgAlchemyExp);
			nbt.putDouble("umbreoRpgAlchemyExpNextLevel", umbreoRpgAlchemyExpNextLevel);
			nbt.putDouble("umbreoRpgAlchemyLevel", umbreoRpgAlchemyLevel);
			nbt.putDouble("umbreoRpgCombatExp", umbreoRpgCombatExp);
			nbt.putDouble("umbreoRpgCombatExpNextLevel", umbreoRpgCombatExpNextLevel);
			nbt.putDouble("umbreoRpgCombatLevel", umbreoRpgCombatLevel);
			nbt.putDouble("umbreoRpgCombatLevelDamageIncrease", umbreoRpgCombatLevelDamageIncrease);
			nbt.putDouble("umbreoRpgCombatLevelDurabilityChance", umbreoRpgCombatLevelDurabilityChance);
			nbt.putDouble("umbreoRpgCookBookPageOpened", umbreoRpgCookBookPageOpened);
			nbt.putDouble("umbreoRpgCookingExp", umbreoRpgCookingExp);
			nbt.putDouble("umbreoRpgCookingExpNextLevel", umbreoRpgCookingExpNextLevel);
			nbt.putDouble("umbreoRpgCookingLevel", umbreoRpgCookingLevel);
			nbt.putDouble("umbreoRpgFarmingExp", umbreoRpgFarmingExp);
			nbt.putDouble("umbreoRpgFarmingExpNextLevel", umbreoRpgFarmingExpNextLevel);
			nbt.putDouble("umbreoRpgFarmingLevel", umbreoRpgFarmingLevel);
			nbt.putDouble("umbreoRpgFletchingExp", umbreoRpgFletchingExp);
			nbt.putDouble("umbreoRpgFletchingExpNextLevel", umbreoRpgFletchingExpNextLevel);
			nbt.putDouble("umbreoRpgFletchingLevel", umbreoRpgFletchingLevel);
			nbt.putDouble("umbreoRpgMagicExp", umbreoRpgMagicExp);
			nbt.putDouble("umbreoRpgMagicExpNextLevel", umbreoRpgMagicExpNextLevel);
			nbt.putDouble("umbreoRpgMagicLevel", umbreoRpgMagicLevel);
			nbt.putDouble("umbreoRpgMiningExp", umbreoRpgMiningExp);
			nbt.putDouble("umbreoRpgMiningExpNextLevel", umbreoRpgMiningExpNextLevel);
			nbt.putDouble("umbreoRpgMiningLevel", umbreoRpgMiningLevel);
			nbt.putBoolean("umbreoRpgOpenCloseSkillGui", umbreoRpgOpenCloseSkillGui);
			nbt.putDouble("umbreoRpgSkillPageOpened", umbreoRpgSkillPageOpened);
			nbt.putDouble("umbreoRpgSmithingExp", umbreoRpgSmithingExp);
			nbt.putDouble("umbreoRpgSmithingExpNextLevel", umbreoRpgSmithingExpNextLevel);
			nbt.putDouble("umbreoRpgSmithingLevel", umbreoRpgSmithingLevel);
			nbt.putDouble("umbreoRpgTargetOverlayHealth", umbreoRpgTargetOverlayHealth);
			nbt.putDouble("umbreoRpgTargetOverlayMaxHealth", umbreoRpgTargetOverlayMaxHealth);
			nbt.putString("umbreoRpgTargetOverlayName", umbreoRpgTargetOverlayName);
			nbt.putDouble("umbreoRpgCookingRangeXPos", umbreoRpgCookingRangeXPos);
			nbt.putDouble("umbreoRpgCookingRangeYPos", umbreoRpgCookingRangeYPos);
			nbt.putDouble("umbreoRpgCookingRangeZPos", umbreoRpgCookingRangeZPos);
			nbt.put("umbreoRpgItemBeingCooked", umbreoRpgItemBeingCooked.save(new CompoundTag()));
			nbt.putDouble("umbreoRpgAlchemyTableXPos", umbreoRpgAlchemyTableXPos);
			nbt.putDouble("umbreoRpgAlchemyTableYPos", umbreoRpgAlchemyTableYPos);
			nbt.putDouble("umbreoRpgAlchemyTableZPos", umbreoRpgAlchemyTableZPos);
			nbt.putDouble("umbreoRpgAshBuildUp", umbreoRpgAshBuildUp);
			nbt.putBoolean("umbreoRpgFoundIronTier", umbreoRpgFoundIronTier);
			nbt.putBoolean("umbreoRpgFoundDiamondTier", umbreoRpgFoundDiamondTier);
			nbt.putBoolean("umbreoRpgFoundHighTier", umbreoRpgFoundHighTier);
			nbt.putBoolean("umbreoRpgFoundUltraTier", umbreoRpgFoundUltraTier);
			nbt.putBoolean("umbreoRpgFoundGodTier", umbreoRpgFoundGodTier);
			nbt.putBoolean("umbreoRpgFoundOtherTier", umbreoRpgFoundOtherTier);
			nbt.putBoolean("umbreoRpgUmbreonAllied", umbreoRpgUmbreonAllied);
			nbt.putBoolean("umbreoRpgBorealAllied", umbreoRpgBorealAllied);
			nbt.putBoolean("umbreoRpgVorashAllied", umbreoRpgVorashAllied);
			nbt.putBoolean("umbreoRpgFateChosenTeleport", umbreoRpgFateChosenTeleport);
			nbt.putDouble("umbreoRpgManaCapacity", umbreoRpgManaCapacity);
			nbt.putDouble("umbreoRpgManaRegenRate", umbreoRpgManaRegenRate);
			nbt.putDouble("umbreoRpgCurrentMana", umbreoRpgCurrentMana);
			nbt.putDouble("umbreoRpgAshBuildUpCapacity", umbreoRpgAshBuildUpCapacity);
			nbt.putDouble("umbreoRpgPlayerBankGoldTotal", umbreoRpgPlayerBankGoldTotal);
			nbt.putDouble("umbreoRpgOverlayTimeout", umbreoRpgOverlayTimeout);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			umbreoRpgAlchemyExp = nbt.getDouble("umbreoRpgAlchemyExp");
			umbreoRpgAlchemyExpNextLevel = nbt.getDouble("umbreoRpgAlchemyExpNextLevel");
			umbreoRpgAlchemyLevel = nbt.getDouble("umbreoRpgAlchemyLevel");
			umbreoRpgCombatExp = nbt.getDouble("umbreoRpgCombatExp");
			umbreoRpgCombatExpNextLevel = nbt.getDouble("umbreoRpgCombatExpNextLevel");
			umbreoRpgCombatLevel = nbt.getDouble("umbreoRpgCombatLevel");
			umbreoRpgCombatLevelDamageIncrease = nbt.getDouble("umbreoRpgCombatLevelDamageIncrease");
			umbreoRpgCombatLevelDurabilityChance = nbt.getDouble("umbreoRpgCombatLevelDurabilityChance");
			umbreoRpgCookBookPageOpened = nbt.getDouble("umbreoRpgCookBookPageOpened");
			umbreoRpgCookingExp = nbt.getDouble("umbreoRpgCookingExp");
			umbreoRpgCookingExpNextLevel = nbt.getDouble("umbreoRpgCookingExpNextLevel");
			umbreoRpgCookingLevel = nbt.getDouble("umbreoRpgCookingLevel");
			umbreoRpgFarmingExp = nbt.getDouble("umbreoRpgFarmingExp");
			umbreoRpgFarmingExpNextLevel = nbt.getDouble("umbreoRpgFarmingExpNextLevel");
			umbreoRpgFarmingLevel = nbt.getDouble("umbreoRpgFarmingLevel");
			umbreoRpgFletchingExp = nbt.getDouble("umbreoRpgFletchingExp");
			umbreoRpgFletchingExpNextLevel = nbt.getDouble("umbreoRpgFletchingExpNextLevel");
			umbreoRpgFletchingLevel = nbt.getDouble("umbreoRpgFletchingLevel");
			umbreoRpgMagicExp = nbt.getDouble("umbreoRpgMagicExp");
			umbreoRpgMagicExpNextLevel = nbt.getDouble("umbreoRpgMagicExpNextLevel");
			umbreoRpgMagicLevel = nbt.getDouble("umbreoRpgMagicLevel");
			umbreoRpgMiningExp = nbt.getDouble("umbreoRpgMiningExp");
			umbreoRpgMiningExpNextLevel = nbt.getDouble("umbreoRpgMiningExpNextLevel");
			umbreoRpgMiningLevel = nbt.getDouble("umbreoRpgMiningLevel");
			umbreoRpgOpenCloseSkillGui = nbt.getBoolean("umbreoRpgOpenCloseSkillGui");
			umbreoRpgSkillPageOpened = nbt.getDouble("umbreoRpgSkillPageOpened");
			umbreoRpgSmithingExp = nbt.getDouble("umbreoRpgSmithingExp");
			umbreoRpgSmithingExpNextLevel = nbt.getDouble("umbreoRpgSmithingExpNextLevel");
			umbreoRpgSmithingLevel = nbt.getDouble("umbreoRpgSmithingLevel");
			umbreoRpgTargetOverlayHealth = nbt.getDouble("umbreoRpgTargetOverlayHealth");
			umbreoRpgTargetOverlayMaxHealth = nbt.getDouble("umbreoRpgTargetOverlayMaxHealth");
			umbreoRpgTargetOverlayName = nbt.getString("umbreoRpgTargetOverlayName");
			umbreoRpgCookingRangeXPos = nbt.getDouble("umbreoRpgCookingRangeXPos");
			umbreoRpgCookingRangeYPos = nbt.getDouble("umbreoRpgCookingRangeYPos");
			umbreoRpgCookingRangeZPos = nbt.getDouble("umbreoRpgCookingRangeZPos");
			umbreoRpgItemBeingCooked = ItemStack.of(nbt.getCompound("umbreoRpgItemBeingCooked"));
			umbreoRpgAlchemyTableXPos = nbt.getDouble("umbreoRpgAlchemyTableXPos");
			umbreoRpgAlchemyTableYPos = nbt.getDouble("umbreoRpgAlchemyTableYPos");
			umbreoRpgAlchemyTableZPos = nbt.getDouble("umbreoRpgAlchemyTableZPos");
			umbreoRpgAshBuildUp = nbt.getDouble("umbreoRpgAshBuildUp");
			umbreoRpgFoundIronTier = nbt.getBoolean("umbreoRpgFoundIronTier");
			umbreoRpgFoundDiamondTier = nbt.getBoolean("umbreoRpgFoundDiamondTier");
			umbreoRpgFoundHighTier = nbt.getBoolean("umbreoRpgFoundHighTier");
			umbreoRpgFoundUltraTier = nbt.getBoolean("umbreoRpgFoundUltraTier");
			umbreoRpgFoundGodTier = nbt.getBoolean("umbreoRpgFoundGodTier");
			umbreoRpgFoundOtherTier = nbt.getBoolean("umbreoRpgFoundOtherTier");
			umbreoRpgUmbreonAllied = nbt.getBoolean("umbreoRpgUmbreonAllied");
			umbreoRpgBorealAllied = nbt.getBoolean("umbreoRpgBorealAllied");
			umbreoRpgVorashAllied = nbt.getBoolean("umbreoRpgVorashAllied");
			umbreoRpgFateChosenTeleport = nbt.getBoolean("umbreoRpgFateChosenTeleport");
			umbreoRpgManaCapacity = nbt.getDouble("umbreoRpgManaCapacity");
			umbreoRpgManaRegenRate = nbt.getDouble("umbreoRpgManaRegenRate");
			umbreoRpgCurrentMana = nbt.getDouble("umbreoRpgCurrentMana");
			umbreoRpgAshBuildUpCapacity = nbt.getDouble("umbreoRpgAshBuildUpCapacity");
			umbreoRpgPlayerBankGoldTotal = nbt.getDouble("umbreoRpgPlayerBankGoldTotal");
			umbreoRpgOverlayTimeout = nbt.getDouble("umbreoRpgOverlayTimeout");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.umbreoRpgAlchemyExp = message.data.umbreoRpgAlchemyExp;
					variables.umbreoRpgAlchemyExpNextLevel = message.data.umbreoRpgAlchemyExpNextLevel;
					variables.umbreoRpgAlchemyLevel = message.data.umbreoRpgAlchemyLevel;
					variables.umbreoRpgCombatExp = message.data.umbreoRpgCombatExp;
					variables.umbreoRpgCombatExpNextLevel = message.data.umbreoRpgCombatExpNextLevel;
					variables.umbreoRpgCombatLevel = message.data.umbreoRpgCombatLevel;
					variables.umbreoRpgCombatLevelDamageIncrease = message.data.umbreoRpgCombatLevelDamageIncrease;
					variables.umbreoRpgCombatLevelDurabilityChance = message.data.umbreoRpgCombatLevelDurabilityChance;
					variables.umbreoRpgCookBookPageOpened = message.data.umbreoRpgCookBookPageOpened;
					variables.umbreoRpgCookingExp = message.data.umbreoRpgCookingExp;
					variables.umbreoRpgCookingExpNextLevel = message.data.umbreoRpgCookingExpNextLevel;
					variables.umbreoRpgCookingLevel = message.data.umbreoRpgCookingLevel;
					variables.umbreoRpgFarmingExp = message.data.umbreoRpgFarmingExp;
					variables.umbreoRpgFarmingExpNextLevel = message.data.umbreoRpgFarmingExpNextLevel;
					variables.umbreoRpgFarmingLevel = message.data.umbreoRpgFarmingLevel;
					variables.umbreoRpgFletchingExp = message.data.umbreoRpgFletchingExp;
					variables.umbreoRpgFletchingExpNextLevel = message.data.umbreoRpgFletchingExpNextLevel;
					variables.umbreoRpgFletchingLevel = message.data.umbreoRpgFletchingLevel;
					variables.umbreoRpgMagicExp = message.data.umbreoRpgMagicExp;
					variables.umbreoRpgMagicExpNextLevel = message.data.umbreoRpgMagicExpNextLevel;
					variables.umbreoRpgMagicLevel = message.data.umbreoRpgMagicLevel;
					variables.umbreoRpgMiningExp = message.data.umbreoRpgMiningExp;
					variables.umbreoRpgMiningExpNextLevel = message.data.umbreoRpgMiningExpNextLevel;
					variables.umbreoRpgMiningLevel = message.data.umbreoRpgMiningLevel;
					variables.umbreoRpgOpenCloseSkillGui = message.data.umbreoRpgOpenCloseSkillGui;
					variables.umbreoRpgSkillPageOpened = message.data.umbreoRpgSkillPageOpened;
					variables.umbreoRpgSmithingExp = message.data.umbreoRpgSmithingExp;
					variables.umbreoRpgSmithingExpNextLevel = message.data.umbreoRpgSmithingExpNextLevel;
					variables.umbreoRpgSmithingLevel = message.data.umbreoRpgSmithingLevel;
					variables.umbreoRpgTargetOverlayHealth = message.data.umbreoRpgTargetOverlayHealth;
					variables.umbreoRpgTargetOverlayMaxHealth = message.data.umbreoRpgTargetOverlayMaxHealth;
					variables.umbreoRpgTargetOverlayName = message.data.umbreoRpgTargetOverlayName;
					variables.umbreoRpgCookingRangeXPos = message.data.umbreoRpgCookingRangeXPos;
					variables.umbreoRpgCookingRangeYPos = message.data.umbreoRpgCookingRangeYPos;
					variables.umbreoRpgCookingRangeZPos = message.data.umbreoRpgCookingRangeZPos;
					variables.umbreoRpgItemBeingCooked = message.data.umbreoRpgItemBeingCooked;
					variables.umbreoRpgAlchemyTableXPos = message.data.umbreoRpgAlchemyTableXPos;
					variables.umbreoRpgAlchemyTableYPos = message.data.umbreoRpgAlchemyTableYPos;
					variables.umbreoRpgAlchemyTableZPos = message.data.umbreoRpgAlchemyTableZPos;
					variables.umbreoRpgAshBuildUp = message.data.umbreoRpgAshBuildUp;
					variables.umbreoRpgFoundIronTier = message.data.umbreoRpgFoundIronTier;
					variables.umbreoRpgFoundDiamondTier = message.data.umbreoRpgFoundDiamondTier;
					variables.umbreoRpgFoundHighTier = message.data.umbreoRpgFoundHighTier;
					variables.umbreoRpgFoundUltraTier = message.data.umbreoRpgFoundUltraTier;
					variables.umbreoRpgFoundGodTier = message.data.umbreoRpgFoundGodTier;
					variables.umbreoRpgFoundOtherTier = message.data.umbreoRpgFoundOtherTier;
					variables.umbreoRpgUmbreonAllied = message.data.umbreoRpgUmbreonAllied;
					variables.umbreoRpgBorealAllied = message.data.umbreoRpgBorealAllied;
					variables.umbreoRpgVorashAllied = message.data.umbreoRpgVorashAllied;
					variables.umbreoRpgFateChosenTeleport = message.data.umbreoRpgFateChosenTeleport;
					variables.umbreoRpgManaCapacity = message.data.umbreoRpgManaCapacity;
					variables.umbreoRpgManaRegenRate = message.data.umbreoRpgManaRegenRate;
					variables.umbreoRpgCurrentMana = message.data.umbreoRpgCurrentMana;
					variables.umbreoRpgAshBuildUpCapacity = message.data.umbreoRpgAshBuildUpCapacity;
					variables.umbreoRpgPlayerBankGoldTotal = message.data.umbreoRpgPlayerBankGoldTotal;
					variables.umbreoRpgOverlayTimeout = message.data.umbreoRpgOverlayTimeout;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
