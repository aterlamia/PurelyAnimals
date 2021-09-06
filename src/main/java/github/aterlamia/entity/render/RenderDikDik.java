package github.aterlamia.entity.render;

import github.aterlamia.entity.EntityDikDik;
import github.aterlamia.model.ModelDikDik;
import github.aterlamia.utils.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderDikDik extends RenderLiving<EntityDikDik> {
    private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/dikdik.png");

    public RenderDikDik(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelDikDik(), 0.5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityDikDik entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityDikDik entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}
