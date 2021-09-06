package github.aterlamia.utils.handlers;

import github.aterlamia.entity.EntityDikDik;
import github.aterlamia.entity.render.RenderDikDik;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityDikDik.class, new IRenderFactory<EntityDikDik>() {
            @Override
            public Render<? super EntityDikDik> createRenderFor(RenderManager manager) {
                return new RenderDikDik(manager);
            }
        });
    }
}
