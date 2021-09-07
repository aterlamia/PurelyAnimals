package github.aterlamia;

import github.aterlamia.utils.Reference;
import github.aterlamia.utils.handlers.RegistryHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(
        modid = Reference.MODID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION
)
public class PurelyAnimals {


    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(Reference.MODID)
    public static PurelyAnimals INSTANCE;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.preInitRegistries(event);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries(event);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries(event);
    }

    @EventHandler
    public static void serverInit(FMLServerStartingEvent event)
    {
        RegistryHandler.serverRegistries(event);
    }
}
