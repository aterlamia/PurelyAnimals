package github.aterlamia.entity.render;

import github.aterlamia.client.model.ModelDikDik;
import github.aterlamia.entity.EntityDikDik;
import github.aterlamia.client.model.ModelEmu;
import github.aterlamia.utils.Reference;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.soggymustache.bookworm.common.entity.data.Gender;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;

public class RenderDikDik extends RenderLivingZAWA<EntityDikDik> {
    private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID, "textures/entity/dikdik/dikdik.png");

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

    protected void preRenderCallback(EntityDikDik entity, float partialTickTime) {
        float scale = 0.3F + (ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? 0.01f : 0f) +
                (float)ModuleManager.SCALE.getSizeMultiplier(entity) * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F,  - 0.0F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }
}
