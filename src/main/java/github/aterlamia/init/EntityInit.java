package github.aterlamia.init;

import github.aterlamia.PurelyAnimals;
import github.aterlamia.entity.EntityDikDik;
import github.aterlamia.utils.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities() {
        registerEntity("DikDik", EntityDikDik.class, Reference.ENTITY_DIKDIK, 50, 11437146, 000000);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int col1, int col2) {
        EntityRegistry.registerModEntity(
                new ResourceLocation(
                        Reference.MODID + ":" + name
                ),
                entity,
                name,
                id,
                PurelyAnimals.INSTANCE,
                range,
                1,
                true,
                col1,
                col2
        );
    }
}
