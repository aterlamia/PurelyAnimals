import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
class ModelModelName extends ModelBase {

    private float partialTicks;

    public ModelRenderer Cube;
    public ModelRenderer Cube.001;
    public ModelRenderer Cube.002;
    public ModelRenderer Cube.003;
    public ModelRenderer Cube.004;
    public ModelRenderer Cube.005;
    public ModelRenderer Cube.006;


    public ModelModelName() {
        this.textureWidth = 0;
        this.textureHeight = 0;

        this.Cube = new ModelRenderer(this, 0, 0);
        this.Cube.addBox(-1.000000f, -1.000000f, 0.000000f, 2, 2, 2, 0f);
        this.Cube.setRotationPoint(0.000000f, 24.000000f, 0.000000f);
        this.Cube.rotateAngleX = 0.000000f;
        this.Cube.rotateAngleY = -0.000000f;
        this.Cube.rotateAngleZ = 0.000000f;
        this.Cube.mirror = true;

        this.Cube.001 = new ModelRenderer(this, 0, 0);
        this.Cube.001.addBox(-1.000000f, -1.000000f, -0.391935f, 2, 2, 2, 0f);
        this.Cube.001.setRotationPoint(-1.273935f, 21.977981f, -0.391935f);
        this.Cube.001.rotateAngleX = 0.000000f;
        this.Cube.001.rotateAngleY = -0.000000f;
        this.Cube.001.rotateAngleZ = 0.000000f;
        this.Cube.001.mirror = true;

        this.Cube.002 = new ModelRenderer(this, 0, 0);
        this.Cube.002.addBox(-1.000000f, -1.000000f, -0.643174f, 2, 2, 2, 0f);
        this.Cube.002.setRotationPoint(-0.184054f, 20.358246f, -0.643174f);
        this.Cube.002.rotateAngleX = 0.000000f;
        this.Cube.002.rotateAngleY = -0.000000f;
        this.Cube.002.rotateAngleZ = 0.000000f;
        this.Cube.002.mirror = true;

        this.Cube.003 = new ModelRenderer(this, 0, 0);
        this.Cube.003.addBox(-1.000000f, -1.000000f, -0.103238f, 2, 2, 2, 0f);
        this.Cube.003.setRotationPoint(-0.965742f, 18.381557f, -0.103238f);
        this.Cube.003.rotateAngleX = 0.000000f;
        this.Cube.003.rotateAngleY = -0.000000f;
        this.Cube.003.rotateAngleZ = 0.000000f;
        this.Cube.003.mirror = true;

        this.Cube.004 = new ModelRenderer(this, 0, 0);
        this.Cube.004.addBox(0.242961f, 0.242961f, -1.181496f, 0, 0, 0, 0f);
        this.Cube.004.setRotationPoint(1.152789f, 20.379365f, -1.181496f);
        this.Cube.004.rotateAngleX = 0.000000f;
        this.Cube.004.rotateAngleY = -0.000000f;
        this.Cube.004.rotateAngleZ = 0.000000f;
        this.Cube.004.mirror = true;

        this.Cube.005 = new ModelRenderer(this, 0, 0);
        this.Cube.005.addBox(0.242961f, 0.242961f, -1.147631f, 0, 0, 0, 0f);
        this.Cube.005.setRotationPoint(1.333697f, 20.397974f, -1.147631f);
        this.Cube.005.rotateAngleX = 0.000000f;
        this.Cube.005.rotateAngleY = -0.000000f;
        this.Cube.005.rotateAngleZ = 0.000000f;
        this.Cube.005.mirror = true;

        this.Cube.006 = new ModelRenderer(this, 0, 0);
        this.Cube.006.addBox(0.242961f, 0.242961f, -1.116512f, 0, 0, 0, 0f);
        this.Cube.006.setRotationPoint(1.575045f, 20.426563f, -1.116512f);
        this.Cube.006.rotateAngleX = 0.000000f;
        this.Cube.006.rotateAngleY = -0.000000f;
        this.Cube.006.rotateAngleZ = 0.000000f;
        this.Cube.006.mirror = true;


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

        this.Cube.render(scale);
        this.Cube.001.render(scale);
        this.Cube.002.render(scale);
        this.Cube.003.render(scale);
        this.Cube.004.render(scale);
        this.Cube.005.render(scale);
        this.Cube.006.render(scale);

    }

    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
            float headPitch, float scale, Entity entity) {
    }
}
