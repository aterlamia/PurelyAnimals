package github.aterlamia.entity.render;

import github.aterlamia.client.model.ModelEmu;
import github.aterlamia.entity.EntityDikDik;
import github.aterlamia.entity.EntityEmu;
import github.aterlamia.utils.Reference;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.soggymustache.bookworm.common.entity.data.Gender;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;

public class RenderEmu extends RenderLivingZAWA<EntityEmu> {
    private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID, "textures/entity/emu/emu.png");

    public RenderEmu(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelEmu(), 0.5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityEmu entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityEmu entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityEmu entity, float partialTickTime) {
        float scale = 1.3F + (ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? 0.01f : 0f) +
                (float)ModuleManager.SCALE.getSizeMultiplier(entity) * 0.01f;
        GlStateManager.scale(scale, scale, scale);
        GlStateManager.translate(0.0F,  - 0.0F * scale, 0.0F);
        super.preRenderCallback(entity, partialTickTime);
    }
}
