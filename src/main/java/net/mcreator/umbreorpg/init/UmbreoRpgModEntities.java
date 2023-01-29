
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.umbreorpg.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.umbreorpg.entity.ZoraliumBowEntity;
import net.mcreator.umbreorpg.entity.VenomBeetleEntity;
import net.mcreator.umbreorpg.entity.UmbelliumBowEntity;
import net.mcreator.umbreorpg.entity.TwilightGolemEntity;
import net.mcreator.umbreorpg.entity.TreantEntity;
import net.mcreator.umbreorpg.entity.StoneGolemEntity;
import net.mcreator.umbreorpg.entity.SkoriumBowEntity;
import net.mcreator.umbreorpg.entity.ShopkeeperEntity;
import net.mcreator.umbreorpg.entity.ReinforcedIronBowEntity;
import net.mcreator.umbreorpg.entity.NetheriteBowEntity;
import net.mcreator.umbreorpg.entity.MossyGolemEntity;
import net.mcreator.umbreorpg.entity.ManaGolemEntity;
import net.mcreator.umbreorpg.entity.LathiumBowEntity;
import net.mcreator.umbreorpg.entity.IronBowEntity;
import net.mcreator.umbreorpg.entity.ImpEntity;
import net.mcreator.umbreorpg.entity.FrostGolemEntity;
import net.mcreator.umbreorpg.entity.FireflyEntity;
import net.mcreator.umbreorpg.entity.DustmiteEntity;
import net.mcreator.umbreorpg.entity.DiamondBowEntity;
import net.mcreator.umbreorpg.entity.DemonEntity;
import net.mcreator.umbreorpg.entity.CobiumBowEntity;
import net.mcreator.umbreorpg.entity.BlastGolemEntity;
import net.mcreator.umbreorpg.entity.BankerEntity;
import net.mcreator.umbreorpg.entity.BanditLeaderEntity;
import net.mcreator.umbreorpg.entity.BanditBrownEntity;
import net.mcreator.umbreorpg.entity.BanditBlondeEntity;
import net.mcreator.umbreorpg.entity.BanditBlackEntity;
import net.mcreator.umbreorpg.entity.BakerEntity;
import net.mcreator.umbreorpg.UmbreoRpgMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UmbreoRpgModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, UmbreoRpgMod.MODID);
	public static final RegistryObject<EntityType<TreantEntity>> TREANT = register("treant",
			EntityType.Builder.<TreantEntity>of(TreantEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TreantEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<ImpEntity>> IMP = register("imp",
			EntityType.Builder.<ImpEntity>of(ImpEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ImpEntity::new).fireImmune().sized(0.7000000000000001f, 1f));
	public static final RegistryObject<EntityType<IronBowEntity>> IRON_BOW = register("projectile_iron_bow",
			EntityType.Builder.<IronBowEntity>of(IronBowEntity::new, MobCategory.MISC).setCustomClientFactory(IronBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ReinforcedIronBowEntity>> REINFORCED_IRON_BOW = register("projectile_reinforced_iron_bow",
			EntityType.Builder.<ReinforcedIronBowEntity>of(ReinforcedIronBowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ReinforcedIronBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiamondBowEntity>> DIAMOND_BOW = register("projectile_diamond_bow",
			EntityType.Builder.<DiamondBowEntity>of(DiamondBowEntity::new, MobCategory.MISC).setCustomClientFactory(DiamondBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ZoraliumBowEntity>> ZORALIUM_BOW = register("projectile_zoralium_bow",
			EntityType.Builder.<ZoraliumBowEntity>of(ZoraliumBowEntity::new, MobCategory.MISC).setCustomClientFactory(ZoraliumBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LathiumBowEntity>> LATHIUM_BOW = register("projectile_lathium_bow",
			EntityType.Builder.<LathiumBowEntity>of(LathiumBowEntity::new, MobCategory.MISC).setCustomClientFactory(LathiumBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CobiumBowEntity>> COBIUM_BOW = register("projectile_cobium_bow",
			EntityType.Builder.<CobiumBowEntity>of(CobiumBowEntity::new, MobCategory.MISC).setCustomClientFactory(CobiumBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SkoriumBowEntity>> SKORIUM_BOW = register("projectile_skorium_bow",
			EntityType.Builder.<SkoriumBowEntity>of(SkoriumBowEntity::new, MobCategory.MISC).setCustomClientFactory(SkoriumBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NetheriteBowEntity>> NETHERITE_BOW = register("projectile_netherite_bow",
			EntityType.Builder.<NetheriteBowEntity>of(NetheriteBowEntity::new, MobCategory.MISC).setCustomClientFactory(NetheriteBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UmbelliumBowEntity>> UMBELLIUM_BOW = register("projectile_umbellium_bow",
			EntityType.Builder.<UmbelliumBowEntity>of(UmbelliumBowEntity::new, MobCategory.MISC).setCustomClientFactory(UmbelliumBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DustmiteEntity>> DUSTMITE = register("dustmite",
			EntityType.Builder.<DustmiteEntity>of(DustmiteEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DustmiteEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<FireflyEntity>> FIREFLY = register("firefly",
			EntityType.Builder.<FireflyEntity>of(FireflyEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FireflyEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<VenomBeetleEntity>> VENOM_BEETLE = register("venom_beetle",
			EntityType.Builder.<VenomBeetleEntity>of(VenomBeetleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VenomBeetleEntity::new)

					.sized(0.3f, 0.3f));
	public static final RegistryObject<EntityType<DemonEntity>> DEMON = register("demon",
			EntityType.Builder.<DemonEntity>of(DemonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DemonEntity::new).fireImmune().sized(1.5f, 3f));
	public static final RegistryObject<EntityType<StoneGolemEntity>> STONE_GOLEM = register("stone_golem",
			EntityType.Builder.<StoneGolemEntity>of(StoneGolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StoneGolemEntity::new).fireImmune().sized(1.5f, 2.6f));
	public static final RegistryObject<EntityType<ManaGolemEntity>> MANA_GOLEM = register("mana_golem",
			EntityType.Builder.<ManaGolemEntity>of(ManaGolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ManaGolemEntity::new).fireImmune().sized(1.5f, 2.6f));
	public static final RegistryObject<EntityType<MossyGolemEntity>> MOSSY_GOLEM = register("mossy_golem",
			EntityType.Builder.<MossyGolemEntity>of(MossyGolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MossyGolemEntity::new).fireImmune().sized(1.5f, 2.6f));
	public static final RegistryObject<EntityType<FrostGolemEntity>> FROST_GOLEM = register("frost_golem",
			EntityType.Builder.<FrostGolemEntity>of(FrostGolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FrostGolemEntity::new).fireImmune().sized(1.5f, 2.6f));
	public static final RegistryObject<EntityType<TwilightGolemEntity>> TWILIGHT_GOLEM = register("twilight_golem",
			EntityType.Builder.<TwilightGolemEntity>of(TwilightGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TwilightGolemEntity::new).fireImmune().sized(1.5f, 2.6f));
	public static final RegistryObject<EntityType<BlastGolemEntity>> BLAST_GOLEM = register("blast_golem",
			EntityType.Builder.<BlastGolemEntity>of(BlastGolemEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlastGolemEntity::new).fireImmune().sized(1.5f, 2.6f));
	public static final RegistryObject<EntityType<BanditBlackEntity>> BANDIT_BLACK = register("bandit_black",
			EntityType.Builder.<BanditBlackEntity>of(BanditBlackEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanditBlackEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BanditBrownEntity>> BANDIT_BROWN = register("bandit_brown",
			EntityType.Builder.<BanditBrownEntity>of(BanditBrownEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanditBrownEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BanditBlondeEntity>> BANDIT_BLONDE = register("bandit_blonde",
			EntityType.Builder.<BanditBlondeEntity>of(BanditBlondeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanditBlondeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BanditLeaderEntity>> BANDIT_LEADER = register("bandit_leader",
			EntityType.Builder.<BanditLeaderEntity>of(BanditLeaderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BanditLeaderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BankerEntity>> BANKER = register("banker",
			EntityType.Builder.<BankerEntity>of(BankerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BankerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BakerEntity>> BAKER = register("baker",
			EntityType.Builder.<BakerEntity>of(BakerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BakerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShopkeeperEntity>> SHOPKEEPER = register("shopkeeper",
			EntityType.Builder.<ShopkeeperEntity>of(ShopkeeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShopkeeperEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TreantEntity.init();
			ImpEntity.init();
			DustmiteEntity.init();
			FireflyEntity.init();
			VenomBeetleEntity.init();
			DemonEntity.init();
			StoneGolemEntity.init();
			ManaGolemEntity.init();
			MossyGolemEntity.init();
			FrostGolemEntity.init();
			TwilightGolemEntity.init();
			BlastGolemEntity.init();
			BanditBlackEntity.init();
			BanditBrownEntity.init();
			BanditBlondeEntity.init();
			BanditLeaderEntity.init();
			BankerEntity.init();
			BakerEntity.init();
			ShopkeeperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TREANT.get(), TreantEntity.createAttributes().build());
		event.put(IMP.get(), ImpEntity.createAttributes().build());
		event.put(DUSTMITE.get(), DustmiteEntity.createAttributes().build());
		event.put(FIREFLY.get(), FireflyEntity.createAttributes().build());
		event.put(VENOM_BEETLE.get(), VenomBeetleEntity.createAttributes().build());
		event.put(DEMON.get(), DemonEntity.createAttributes().build());
		event.put(STONE_GOLEM.get(), StoneGolemEntity.createAttributes().build());
		event.put(MANA_GOLEM.get(), ManaGolemEntity.createAttributes().build());
		event.put(MOSSY_GOLEM.get(), MossyGolemEntity.createAttributes().build());
		event.put(FROST_GOLEM.get(), FrostGolemEntity.createAttributes().build());
		event.put(TWILIGHT_GOLEM.get(), TwilightGolemEntity.createAttributes().build());
		event.put(BLAST_GOLEM.get(), BlastGolemEntity.createAttributes().build());
		event.put(BANDIT_BLACK.get(), BanditBlackEntity.createAttributes().build());
		event.put(BANDIT_BROWN.get(), BanditBrownEntity.createAttributes().build());
		event.put(BANDIT_BLONDE.get(), BanditBlondeEntity.createAttributes().build());
		event.put(BANDIT_LEADER.get(), BanditLeaderEntity.createAttributes().build());
		event.put(BANKER.get(), BankerEntity.createAttributes().build());
		event.put(BAKER.get(), BakerEntity.createAttributes().build());
		event.put(SHOPKEEPER.get(), ShopkeeperEntity.createAttributes().build());
	}
}
