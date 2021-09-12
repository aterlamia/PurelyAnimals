package com.aterlamia.init;

import com.google.common.collect.Lists;
import com.aterlamia.entity.*;
import com.aterlamia.entity.render.RenderDikDik;
import com.aterlamia.entity.render.RenderEmu;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.configuration.ZAWAConfig;
import org.zawamod.configuration.ZAWASpawnConfiguration;
import org.zawamod.entity.land.EntityAfricanLion;
import org.zawamod.entity.land.EntityKoala;
import org.zawamod.util.BiomeEdit;
import org.zawamod.util.SpawnUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ModEntities {

    public static final List<EntityContainer> CONTAINERS = new ArrayList<>();

    static {
        add(EntityDikDik.class, "dikdik");
        add(EntityEmu.class, "emu");
    }

    private static void add(Class<? extends Entity> entityClass, String entityNameIn) {
        CONTAINERS.add(new EntityContainer(entityClass, entityNameIn));
    }

    public static class EntityContainer {
        public Class<? extends Entity> entityClass;
        public String entityName;

        public EntityContainer(Class<? extends Entity> EntityClass, String entityNameIn) {
            this.entityClass = EntityClass;
            this.entityName = entityNameIn;
        }
    }

    public static void init() {
        if (ZAWAConfig.serverOptions.canSpawn) {
            ZAWASpawnConfiguration.edits.put(EntityDikDik.class, new BiomeEdit(new String[]{"biomesoplenty:lush_desert"}, new String[]{"biomesoplenty:tundra", "biomesoplenty:snowy_tundra", "biomesoplenty:snowy_forest", "biomesoplenty:alps", "biomesoplenty:cold_desert", "biomesoplenty:crag", "minecraft:hell"}));
            ZAWASpawnConfiguration.edits.put(EntityEmu.class, new BiomeEdit(new String[0], new String[]{"minecraft:taiga", "minecraft:taiga_hills", "minecraft:taiga_cold", "minecraft:taiga_cold_hills", "minecraft:redwood_taiga", "minecraft:redwood_taiga_hills", "minecraft:extreme_hills_with_trees", "minecraft:mutated_taiga", "minecraft:mutated_taiga_cold", "minecraft:mutated_redwood_taiga", "minecraft:mutated_redwood_taiga_hills", "minecraft:desert", "minecraft:desert_hills", "minecraft:mutated_mesa", "minecraft:mutated_mesa_rock", "minecraft:mutated_mesa_clear_rock", "biomesoplenty:volcanic_island", "biomesoplenty:corrupted_sands", "biomesoplenty:fungi_forest", "biomesoplenty:phantasmagoric_inferno", "biomesoplenty:undergarden", "biomesoplenty:visceral_heap", "traverse:snowy_coniferous_forest", "traverse:red_desert", "traverse:badlands", "traverse:mountainous_desert"}));

            ZAWASpawnConfiguration.add(EntityAfricanLion.class, "Dikdiks", 8, 2, 4, EnumCreatureType.CREATURE, SpawnUtils.mergeBiomes(new Biome[][]{SpawnUtils.getBiomesOfType(BiomeDictionary.Type.HOT), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.DRY), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.SAVANNA), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.PLAINS), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.SANDY)}));
            ZAWASpawnConfiguration.add(EntityKoala.class, "Emus", 10, 3, 6, EnumCreatureType.CREATURE, SpawnUtils.mergeBiomes(new Biome[][]{SpawnUtils.getBiomesOfType(BiomeDictionary.Type.FOREST), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.HOT), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.DENSE), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.LUSH), SpawnUtils.getBiomesOfType(BiomeDictionary.Type.SWAMP)}));
        }
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityDikDik.class, RenderDikDik::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityEmu.class, RenderEmu::new);
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
