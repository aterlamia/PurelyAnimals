package github.aterlamia.utils.handlers;

import github.aterlamia.init.EntityInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
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

    public static void  preInitRegistries() {
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenderers();
    }

    public static void postInitRegistries() {

    }
}
