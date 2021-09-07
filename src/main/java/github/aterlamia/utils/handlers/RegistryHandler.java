package github.aterlamia.utils.handlers;

import github.aterlamia.init.EntityInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {

    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {

    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {

    }

    public static void  preInitRegistries(FMLPreInitializationEvent event) {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenderers();
    }

    public static void postInitRegistries() {

    }

    public static void initRegistries(FMLInitializationEvent event)
    {
    }

    public static void postInitRegistries(FMLPostInitializationEvent event)
    {

    }

    public static void serverRegistries(FMLServerStartingEvent event)
    {

    }
}
