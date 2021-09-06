package github.aterlamia.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelDikDik extends ModelBase {

    private float partialTicks;

    public ModelRenderer EarLeft;
    public ModelRenderer EarLowLeft;
    public ModelRenderer EarLowRight;
    public ModelRenderer EarRight;
    public ModelRenderer head;
    public ModelRenderer Hornleft;
    public ModelRenderer HornRight;
    public ModelRenderer Snouth;


    public ModelDikDik() {
        this.textureWidth = 0;
        this.textureHeight = 0;

        this.EarLeft = new ModelRenderer(this, 0, 0);
        this.EarLeft.addBox(-0.141928f, -0.180559f, 0.625595f, 0, 0, 0, 0f);
        this.EarLeft.setRotationPoint(1.294968f, 18.784277f, 0.625595f);
        this.EarLeft.rotateAngleX = -0.300640f;
        this.EarLeft.rotateAngleY = -0.000000f;
        this.EarLeft.rotateAngleZ = -0.000000f;
        this.EarLeft.mirror = true;

        this.EarLowLeft = new ModelRenderer(this, 0, 0);
        this.EarLowLeft.addBox(-0.091056f, -0.115839f, 0.545831f, 0, 0, 0, 0f);
        this.EarLowLeft.setRotationPoint(1.294968f, 19.041550f, 0.545831f);
        this.EarLowLeft.rotateAngleX = -0.300640f;
        this.EarLowLeft.rotateAngleY = -0.000000f;
        this.EarLowLeft.rotateAngleZ = -0.000000f;
        this.EarLowLeft.mirror = true;

        this.EarLowRight = new ModelRenderer(this, 0, 0);
        this.EarLowRight.addBox(-0.091056f, -0.115839f, -0.596920f, 0, 0, 0, 0f);
        this.EarLowRight.setRotationPoint(1.289797f, 19.044419f, -0.596920f);
        this.EarLowRight.rotateAngleX = 6.710361f;
        this.EarLowRight.rotateAngleY = -0.000000f;
        this.EarLowRight.rotateAngleZ = 0.000000f;
        this.EarLowRight.mirror = true;

        this.EarRight = new ModelRenderer(this, 0, 0);
        this.EarRight.addBox(-0.141928f, -0.180559f, -0.708514f, 0, 0, 0, 0f);
        this.EarRight.setRotationPoint(1.289797f, 18.799269f, -0.708514f);
        this.EarRight.rotateAngleX = 6.710361f;
        this.EarRight.rotateAngleY = -0.000000f;
        this.EarRight.rotateAngleZ = 0.000000f;
        this.EarRight.mirror = true;

        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-0.637348f, -0.637348f, -0.010508f, 1, 1, 1, 0f);
        this.head.setRotationPoint(1.363116f, 19.684618f, -0.010508f);
        this.head.rotateAngleX = 0.000000f;
        this.head.rotateAngleY = -0.000000f;
        this.head.rotateAngleZ = 0.370462f;
        this.head.mirror = true;

        this.Hornleft = new ModelRenderer(this, 0, 0);
        this.Hornleft.addBox(0.077310f, 0.077310f, 0.279704f, 0, 0, 0, 0f);
        this.Hornleft.setRotationPoint(1.505465f, 19.129435f, 0.279704f);
        this.Hornleft.rotateAngleX = 0.000000f;
        this.Hornleft.rotateAngleY = -0.000000f;
        this.Hornleft.rotateAngleZ = 0.504086f;
        this.Hornleft.mirror = true;

        this.HornRight = new ModelRenderer(this, 0, 0);
        this.HornRight.addBox(0.077310f, 0.077310f, -0.316064f, 0, 0, 0, 0f);
        this.HornRight.setRotationPoint(1.505465f, 19.159223f, -0.316064f);
        this.HornRight.rotateAngleX = 0.000000f;
        this.HornRight.rotateAngleY = -0.000000f;
        this.HornRight.rotateAngleZ = 0.504086f;
        this.HornRight.mirror = true;

        this.Snouth = new ModelRenderer(this, 0, 0);
        this.Snouth.addBox(0.438310f, 0.447419f, -0.000000f, 1, 1, 1, 0f);
        this.Snouth.setRotationPoint(2.428706f, 20.506657f, -0.000000f);
        this.Snouth.rotateAngleX = 0.000000f;
        this.Snouth.rotateAngleY = -0.000000f;
        this.Snouth.rotateAngleZ = 0.612059f;
        this.Snouth.mirror = true;


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entity, float limbSwing, float limbSwingAmount,
            float partialTicks) {
        this.partialTicks = partialTicks;
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, 
            float headPitch, float scale) {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);

        this.EarLeft.render(scale);
        this.EarLowLeft.render(scale);
        this.EarLowRight.render(scale);
        this.EarRight.render(scale);
        this.head.render(scale);
        this.Hornleft.render(scale);
        this.HornRight.render(scale);
        this.Snouth.render(scale);

    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
            float headPitch, float scale, Entity entity) {
    }
}
