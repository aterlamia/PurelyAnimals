package github.aterlamia.utils.handlers;

import com.google.common.collect.Lists;
import github.aterlamia.init.EntityInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;
import java.util.Set;

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



    /**
     * Registers all biomes of every type provided.
     *
     * @param type Biome types to include.
     * @return Biome array of all biomes retrieved from the type param.
     **/
    public static Biome[] getAllBiomesOf(BiomeDictionary.Type... type) {
        List<Biome> biomesOfType = Lists.newArrayList();
        for (BiomeDictionary.Type t : type) {
            for (Biome b : Biome.REGISTRY) {
                Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(b);
                if (types.contains(t)) {
                    biomesOfType.add(b);
                }
            }
        }

        return biomesOfType.toArray(new Biome[biomesOfType.size()]);
    }


    /**
     * Creates a list of biomes given then removes the excluded biome types given.
     *
     * @param include All biomes to include.
     * @param exclude The biome types to exclude of the previously given biomes.
     * @return Biome array of included biomes minus any excluded biome types.
     **/
    public static Biome[] excludeBiomesByType(Biome[] include, BiomeDictionary.Type... exclude) {
        List<Biome> biomesOfType = Lists.newArrayList();

        for(int i = 0; i < include.length; ++i) {
            biomesOfType.add(include[i]);

            Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(include[i]);
            for (BiomeDictionary.Type t : exclude) {
                if (types.contains(t)) {
                    biomesOfType.remove(include[i]);
                }
            }
        }

        return biomesOfType.toArray(new Biome[biomesOfType.size()]);
    }
}
