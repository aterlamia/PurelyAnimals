package github.aterlamia.model;


import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;


public class ModelGrantsGazelle extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Leg1;
    public BookwormModelRenderer Leg2;
    public BookwormModelRenderer Leg3;
    public BookwormModelRenderer Leg4;
    public BookwormModelRenderer Tail1;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer Tail2;
    public BookwormModelRenderer head;
    public BookwormModelRenderer shape14;
    public BookwormModelRenderer shape16;
    public BookwormModelRenderer shape16_1;
    public BookwormModelRenderer shape15;
    public BookwormModelRenderer shape15_1;
    public BookwormModelRenderer shape15_2;
    public BookwormModelRenderer shape15_3;
    public BookwormModelRenderer shape15_4;
    public BookwormModelRenderer shape15_5;
    public BookwormModelRenderer shape17;

    public ModelGrantsGazelle() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.shape16_1 = new BookwormModelRenderer(this, 54, 19, "shape16_1");
        this.shape16_1.setRotationPoint(-0.5F, -1.8F, -1.2F);
        this.shape16_1.addBox(0.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(this.shape16_1, 0.0F, -0.2617994F, -2.2310543F);
        this.shape16 = new BookwormModelRenderer(this, 0, 0, "shape16");
        this.shape16.setRotationPoint(0.4F, -2.0F, -1.3F);
        this.shape16.addBox(0.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(this.shape16, -0.4098033F, 0.0F, 0.7740535F);
        this.shape15_2 = new BookwormModelRenderer(this, 59, 21, "shape15_2");
        this.shape15_2.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.shape15_2.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.shape15_2, 0.08726646F, 0.0F, -0.08726646F);
        this.Leg3 = new BookwormModelRenderer(this, 30, 0, "Leg3");
        this.Leg3.setRotationPoint(2.6F, 5.0F, 7.5F);
        this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Leg2 = new BookwormModelRenderer(this, 8, 0, "Leg2");
        this.Leg2.setRotationPoint(-2.6F, 5.0F, -5.7F);
        this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Tail1 = new BookwormModelRenderer(this, 46, 0, "Tail1");
        this.Tail1.setRotationPoint(0.0F, 0.1F, 8.6F);
        this.Tail1.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(this.Tail1, 0.28501227F, 0.0F, 0.0F);
        this.shape15 = new BookwormModelRenderer(this, 8, 23, "shape15");
        this.shape15.setRotationPoint(-2.0F, -1.0F, -2.6F);
        this.shape15.addBox(0.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(this.shape15, -0.43633232F, 0.0F, -0.17453292F);
        this.shape15_3 = new BookwormModelRenderer(this, 30, 23, "shape15_3");
        this.shape15_3.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.shape15_3.addBox(-0.5F, -8.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.shape15_3, -0.9075712F, 0.0F, 0.0F);
        this.shape15_4 = new BookwormModelRenderer(this, 0, 23, "shape15_4");
        this.shape15_4.setRotationPoint(-1.0F, -2.0F, 0.0F);
        this.shape15_4.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.shape15_4, 0.08726646F, 0.0F, 0.08726646F);
        this.Tail2 = new BookwormModelRenderer(this, 57, 0, "Tail2");
        this.Tail2.setRotationPoint(0.0F, 5.0F, -0.5F);
        this.Tail2.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.Tail2, 0.17453292F, 0.0F, 0.0F);
        this.shape15_1 = new BookwormModelRenderer(this, 16, 23, "shape15_1");
        this.shape15_1.setRotationPoint(2.0F, -1.0F, -2.6F);
        this.shape15_1.addBox(-2.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(this.shape15_1, -0.43633232F, 0.0F, 0.17453292F);
        this.shape15_5 = new BookwormModelRenderer(this, 34, 23, "shape15_5");
        this.shape15_5.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.shape15_5.addBox(-0.5F, -8.0F, 0.0F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.shape15_5, -0.9075712F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 46, 1, "Neck");
        this.Neck.setRotationPoint(0.1F, 0.5F, -3.0F);
        this.Neck.addBox(-1.5F, -8.0F, -5.0F, 3, 10, 5, 0.0F);
        this.setRotateAngle(this.Neck, 0.61086524F, 0.0F, 0.0F);
        this.head = new BookwormModelRenderer(this, 41, 18, "head");
        this.head.setRotationPoint(0.0F, -6.3F, -1.2F);
        this.head.addBox(-2.0F, -2.0F, -5.0F, 4, 4, 5, 0.0F);
        this.setRotateAngle(this.head, 0.0F, 0.0F, 0.0F);
        this.shape14 = new BookwormModelRenderer(this, 0, 23, "shape14");
        this.shape14.setRotationPoint(0.0F, -0.7F, -4.5F);
        this.shape14.addBox(-1.0F, 0.0F, -3.5F, 2, 2, 4, 0.0F);
        this.Leg1 = new BookwormModelRenderer(this, 0, 0, "Leg1");
        this.Leg1.setRotationPoint(2.6F, 5.0F, -5.7F);
        this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(-0.2F, 7.0F, -0.1F);
        this.Body.addBox(-3.5F, 0.0F, -7.0F, 7, 7, 16, 0.0F);
        this.Leg4 = new BookwormModelRenderer(this, 38, 0, "Leg4");
        this.Leg4.setRotationPoint(-2.6F, 5.0F, 7.5F);
        this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.shape17 = new BookwormModelRenderer(this, 0, 0, "shape17");
        this.shape17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape17.addBox(0.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F);
        this.setRotateAngle(this.shape16, -0.61086524F, 0.0F, 0.0F);
        this.head.addChild(this.shape16_1);
        this.head.addChild(this.shape16);
        this.shape15.addChild(this.shape15_2);
        this.Body.addChild(this.Leg3);
        this.Body.addChild(this.Leg2);
        this.Body.addChild(this.Tail1);
        this.head.addChild(this.shape15);
        this.shape15_2.addChild(this.shape15_3);
        this.shape15_1.addChild(this.shape15_4);
        this.Tail1.addChild(this.Tail2);
        this.head.addChild(this.shape15_1);
        this.shape15_4.addChild(this.shape15_5);
        this.Body.addChild(this.Neck);
        this.head.addChild(this.shape14);
        this.Body.addChild(this.Leg1);
        this.Body.addChild(this.Leg4);
        this.Neck.addChild(this.shape17);
        this.shape17.addChild(this.head);
        this.save();
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        if (this.isChild) {
            float scaleFactor = 0.5F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
            GlStateManager.scale(scaleFactor, scaleFactor, scaleFactor);
            this.Body.render(f5);
            GlStateManager.popMatrix();
        } else {
            this.Body.render(f5);
        }

    }

    public void setRotateAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        this.reset();
        float globalSpeed = 1.75F;
        float globalHeight = 0.5F;
        float globalDegree = 1.0F;
        this.Neck.rotateAngleY = f3 * 0.017453292F / 2.0F;
        this.head.rotateAngleX = f4 * 0.017453292F - 0.4F;
        this.Leg1.rotateAngleX = 1.0F * f1 * 0.5F * globalDegree * MathHelper.cos(f * 0.5F * globalSpeed + 0.0F) + 0.0F;
        this.Leg2.rotateAngleX = -1.0F * f1 * 0.5F * globalDegree * MathHelper.cos(f * 0.5F * globalSpeed + 0.0F) + 0.0F;
        this.Leg3.rotateAngleX = 1.0F * f1 * 0.5F * globalDegree * MathHelper.cos(f * 0.5F * globalSpeed + 0.0F) + 0.0F;
        this.Leg4.rotateAngleX = -1.0F * f1 * 0.5F * globalDegree * MathHelper.cos(f * 0.5F * globalSpeed + 0.0F) + 0.0F;
        this.Neck.rotateAngleX = -1.0F * f1 * 0.1F * globalDegree * MathHelper.cos(f * 0.4F * globalSpeed + 2.5F) + 0.61086524F;
        this.Neck.rotateAngleX = 0.03F * MathHelper.cos((float)entity.ticksExisted * 0.1F + 2.5F) + 0.61086524F;
        this.Tail1.rotateAngleZ = -1.0F * MathHelper.cos((float)entity.ticksExisted * 0.2F + 0.0F) * 0.2F * 0.5F + 0.0F;
        this.Tail2.rotateAngleZ = 1.0F * MathHelper.cos((float)entity.ticksExisted * 0.15F + 0.0F) * 0.4F * 0.5F + 0.0F;
    }
}
