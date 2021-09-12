package com.aterlamia;

import com.aterlamia.entity.*;
import com.aterlamia.init.ModEntities;
import com.aterlamia.init.ModItems;
import com.aterlamia.proxy.CommonProxy;
import com.aterlamia.utils.Reference;
import com.aterlamia.utils.handlers.RegistryHandler;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;
import org.zawamod.entity.base.ZAWABaseWater;
import org.zawamod.entity.water.EntityFishBase;
import org.zawamod.init.ZAWAItems;

@Mod(
        modid = Reference.MODID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS,
        dependencies = Reference.DEPENDS
)
public class PurelyAnimals {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy PROXY;

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(Reference.MODID)
    public static PurelyAnimals INSTANCE;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries(event);
        PROXY.preInit(event);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        PROXY.init(event);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        RegistryHandler.postInitRegistries(event);
        ZAWAItems.SPAWN_EGG_DATA.put(EntityDikDik.class, new ItemStack(ModItems.DIKDIK_SPAWN_EGG));
        ZAWAItems.SPAWN_EGG_DATA.put(EntityEmu.class, new ItemStack(ModItems.EMU_SPAWN_EGG));
        PROXY.postInit(event);
    }

    @EventHandler
    public static void serverInit(FMLServerStartingEvent event) {
        RegistryHandler.serverRegistries(event);
    }


    @Mod.EventBusSubscriber(modid = Reference.MODID)
    public static class Handlers {
        @SubscribeEvent
        public static void registerEntities(final RegistryEvent.Register<EntityEntry> event) {
            final IForgeRegistry<EntityEntry> registry = event.getRegistry();
            int id = 0;
            for (ModEntities.EntityContainer a : ModEntities.CONTAINERS) {
                EntityEntry entry = EntityEntryBuilder.create().entity(a.entityClass).id(new ResourceLocation(Reference.MODID, a.entityName), id++).name(Reference.MODID + "." + a.entityName).tracker(1024, 1, true).build();
                if (ZAWABaseWater.class.isAssignableFrom(a.entityClass) || EntityFishBase.class.isAssignableFrom(a.entityClass)) {
                    EntitySpawnPlacementRegistry.setPlacementType(a.entityClass, EntityLiving.SpawnPlacementType.IN_WATER);
                }
                registry.register(entry);
            }
        }
    }
}