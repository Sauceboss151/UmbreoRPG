
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
import net.mcreator.umbreorpg.entity.UmbelliumBowEntity;
import net.mcreator.umbreorpg.entity.TreantEntity;
import net.mcreator.umbreorpg.entity.SkoriumBowEntity;
import net.mcreator.umbreorpg.entity.ReinforcedIronBowEntity;
import net.mcreator.umbreorpg.entity.NetheriteBowEntity;
import net.mcreator.umbreorpg.entity.LathiumBowEntity;
import net.mcreator.umbreorpg.entity.IronBowEntity;
import net.mcreator.umbreorpg.entity.ImpEntity;
import net.mcreator.umbreorpg.entity.DiamondBowEntity;
import net.mcreator.umbreorpg.entity.CobiumBowEntity;
import net.mcreator.umbreorpg.UmbreoRpgMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UmbreoRpgModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, UmbreoRpgMod.MODID);
	public static final RegistryObject<EntityType<TreantEntity>> TREANT = register("treant",
			EntityType.Builder.<TreantEntity>of(TreantEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TreantEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<ImpEntity>> IMP = register("imp",
			EntityType.Builder.<ImpEntity>of(ImpEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ImpEntity::new).fireImmune().sized(0.5f, 1f));
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

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TreantEntity.init();
			ImpEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TREANT.get(), TreantEntity.createAttributes().build());
		event.put(IMP.get(), ImpEntity.createAttributes().build());
	}
}
