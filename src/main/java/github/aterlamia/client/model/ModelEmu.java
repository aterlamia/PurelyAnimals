package github.aterlamia.client.model;

import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

@SideOnly(Side.CLIENT)
public class ModelEmu extends ZAWAModelBase {
    private final BookwormModelRenderer LeftFoot;
    private final BookwormModelRenderer Leg_r1;
    private final BookwormModelRenderer RightFoot;
    private final BookwormModelRenderer Leg_r2;
    private final BookwormModelRenderer MainBody;
    private final BookwormModelRenderer Tail_r1;
    private final BookwormModelRenderer Body2_r1;
    private final BookwormModelRenderer Body1_r1;
    private final BookwormModelRenderer HeadandNeck;
    private final BookwormModelRenderer Neck1_r1;
    private final BookwormModelRenderer Neck2_r1;
    private final BookwormModelRenderer MainNeck_r1;
    private final BookwormModelRenderer BeakTop_r1;
    private final BookwormModelRenderer Jowel_r1;
    private final BookwormModelRenderer LeftToes;
    private final BookwormModelRenderer RightToe_r1;
    private final BookwormModelRenderer LeftToe_r1;
    private final BookwormModelRenderer RightToes;
    private final BookwormModelRenderer LeftToe_r2;
    private final BookwormModelRenderer RightToe_r2;
    private final BookwormModelRenderer LeftLegTop;
    private final BookwormModelRenderer RightLegTop;

    public ModelEmu() {
        textureWidth = 64;
        textureHeight = 64;

        LeftFoot = new BookwormModelRenderer(this, "LeftFoot");
        LeftFoot.setRotationPoint(1.5F, 23.0F, -3.25F);


        Leg_r1 = new BookwormModelRenderer(this, "Legr1" );
        Leg_r1.setRotationPoint(0.0F, 0.0F, 6.0F);
        LeftFoot.addChild(Leg_r1);
        setRotationAngle(Leg_r1, -0.1745F, 0.0F, 0.0F);
        Leg_r1.cubeList.add(new ModelBox(Leg_r1, 24, 33, -0.5F, -5.0F, -0.575F, 1, 6, 1, 0.0F, false));

        RightFoot = new BookwormModelRenderer(this, "RightFoot");
        RightFoot.setRotationPoint(-1.5F, 21.0F, 2.75F);


        Leg_r2 = new BookwormModelRenderer(this, "Legr2");
        Leg_r2.setRotationPoint(0.0F, 2.0F, 0.0F);
        RightFoot.addChild(Leg_r2);
        setRotationAngle(Leg_r2, -0.1745F, 0.0F, 0.0F);
        Leg_r2.cubeList.add(new ModelBox(Leg_r2, 0, 14, -0.5F, -5.0F, -0.625F, 1, 6, 1, 0.0F, false));

        MainBody = new BookwormModelRenderer(this, "MainBody");
        MainBody.setRotationPoint(-0.75F, 13.0F, -1.0F);
        MainBody.cubeList.add(new ModelBox(MainBody, 12, 25, -3.25F, -1.0F, 1.25F, 1, 5, 5, -0.3F, false));
        MainBody.cubeList.add(new ModelBox(MainBody, 0, 25, 3.25F, -1.0F, 0.25F, 1, 5, 5, -0.3F, false));

        Tail_r1 = new BookwormModelRenderer(this, "TailR1");
        Tail_r1.setRotationPoint(0.925F, 1.226F, 8.2481F);
        MainBody.addChild(Tail_r1);
        setRotationAngle(Tail_r1, -0.5672F, 0.0F, 0.0F);
        Tail_r1.cubeList.add(new ModelBox(Tail_r1, 23, 0, -2.925F, -1.9739F, -0.5441F, 5, 4, 4, -0.4F, false));

        Body2_r1 = new BookwormModelRenderer(this, "Body2r1");
        Body2_r1.setRotationPoint(-0.075F, 0.8047F, 5.7221F);
        MainBody.addChild(Body2_r1);
        setRotationAngle(Body2_r1, -0.3054F, 0.0F, 0.0F);
        Body2_r1.cubeList.add(new ModelBox(Body2_r1, 19, 20, -2.95F, -2.6F, -1.275F, 7, 5, 5, -0.3F, false));

        Body1_r1 = new BookwormModelRenderer(this, "Body1_r1");
        Body1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        MainBody.addChild(Body1_r1);
        setRotationAngle(Body1_r1, 0.0873F, 0.0F, 0.0F);
        Body1_r1.cubeList.add(new ModelBox(Body1_r1, 0, 0, -3.0F, -1.5F, -2.9F, 7, 5, 9, -0.3F, false));

        HeadandNeck = new BookwormModelRenderer(this, "HeadAndNeck");
        HeadandNeck.setRotationPoint(0.0F, 24.0F, 0.0F);
        HeadandNeck.cubeList.add(new ModelBox(HeadandNeck, 30, 31, -1.25F, -19.975F, -9.725F, 2, 1, 2, -0.29F, false));
        HeadandNeck.cubeList.add(new ModelBox(HeadandNeck, 17, 14, -1.25F, -21.125F, -8.375F, 2, 2, 3, -0.1F, false));

        Neck1_r1 = new BookwormModelRenderer(this, "Neck1");
        Neck1_r1.setRotationPoint(0.0F, -10.0F, -6.0F);
        HeadandNeck.addChild(Neck1_r1);
        setRotationAngle(Neck1_r1, -0.9599F, 0.0F, 0.0F);
        Neck1_r1.cubeList.add(new ModelBox(Neck1_r1, 0, 14, -2.75F, -5.35F, -3.1F, 5, 4, 7, -0.2F, false));

        Neck2_r1 = new BookwormModelRenderer(this, "Neck2");
        Neck2_r1.setRotationPoint(-0.75F, -12.75F, -4.75F);
        HeadandNeck.addChild(Neck2_r1);
        setRotationAngle(Neck2_r1, 0.4363F, 0.0F, 0.0F);
        Neck2_r1.cubeList.add(new ModelBox(Neck2_r1, 29, 11, -1.0F, -3.4F, -0.825F, 3, 5, 3, -0.2F, false));

        MainNeck_r1 = new BookwormModelRenderer(this, "MainNeck");
        MainNeck_r1.setRotationPoint(-0.25F, -25.0F, -4.0F);
        HeadandNeck.addChild(MainNeck_r1);
        setRotationAngle(MainNeck_r1, 0.2182F, 0.0F, 0.0F);
        MainNeck_r1.cubeList.add(new ModelBox(MainNeck_r1, 0, 0, -1.0F, 4.75F, -4.425F, 2, 7, 2, -0.2F, false));

        BeakTop_r1 = new BookwormModelRenderer(this, "Beaktop");
        BeakTop_r1.setRotationPoint(-0.25F, -19.975F, -8.975F);
        HeadandNeck.addChild(BeakTop_r1);
        setRotationAngle(BeakTop_r1, 0.2618F, 0.0F, 0.0F);
        BeakTop_r1.cubeList.add(new ModelBox(BeakTop_r1, 24, 30, -1.0F, -0.25F, -1.0F, 2, 1, 2, -0.2F, false));

        Jowel_r1 = new BookwormModelRenderer(this, "Jowel");
        Jowel_r1.setRotationPoint(0.0F, -28.75F, -4.0F);
        HeadandNeck.addChild(Jowel_r1);
        setRotationAngle(Jowel_r1, -0.2618F, 0.0F, 0.0F);
        Jowel_r1.cubeList.add(new ModelBox(Jowel_r1, 7, 25, -1.25F, 9.65F, -2.775F, 2, 1, 3, -0.3F, false));

        LeftToes = new BookwormModelRenderer(this, "LeftToes");
        LeftToes.setRotationPoint(0.0F, 24.0F, 0.0F);
        LeftToes.cubeList.add(new ModelBox(LeftToes, 6, 35, 1.0F, -0.75F, 1.0F, 1, 1, 2, -0.08F, false));

        RightToe_r1 = new BookwormModelRenderer(this, "Righttoe");
        RightToe_r1.setRotationPoint(0.75F, 0.0F, 3.25F);
        LeftToes.addChild(RightToe_r1);
        setRotationAngle(RightToe_r1, 0.0F, 0.6109F, 0.0F);
        RightToe_r1.cubeList.add(new ModelBox(RightToe_r1, 0, 35, 0.1F, -0.75F, -1.75F, 1, 1, 2, -0.2F, false));

        LeftToe_r1 = new BookwormModelRenderer(this, "LeftToe");
        LeftToe_r1.setRotationPoint(2.25F, 0.0F, 3.25F);
        LeftToes.addChild(LeftToe_r1);
        setRotationAngle(LeftToe_r1, 0.0F, -0.6109F, 0.0F);
        LeftToe_r1.cubeList.add(new ModelBox(LeftToe_r1, 34, 34, -1.075F, -0.75F, -1.75F, 1, 1, 2, -0.2F, false));

        RightToes = new BookwormModelRenderer(this, "RightToes");
        RightToes.setRotationPoint(0.0F, 24.0F, 0.0F);
        RightToes.cubeList.add(new ModelBox(RightToes, 28, 34, -2.0F, -0.75F, 1.0F, 1, 1, 2, -0.08F, false));

        LeftToe_r2 = new BookwormModelRenderer(this, "LeftToer2");
        LeftToe_r2.setRotationPoint(-0.75F, 0.0F, 3.25F);
        RightToes.addChild(LeftToe_r2);
        setRotationAngle(LeftToe_r2, 0.0F, -0.6109F, 0.0F);
        LeftToe_r2.cubeList.add(new ModelBox(LeftToe_r2, 32, 8, -1.1F, -0.75F, -1.75F, 1, 1, 2, -0.2F, false));

        RightToe_r2 = new BookwormModelRenderer(this, "RighToer2");
        RightToe_r2.setRotationPoint(-2.25F, 0.0F, 3.25F);
        RightToes.addChild(RightToe_r2);
        setRotationAngle(RightToe_r2, 0.0F, 0.6109F, 0.0F);
        RightToe_r2.cubeList.add(new ModelBox(RightToe_r2, 25, 17, 0.075F, -0.75F, -1.75F, 1, 1, 2, -0.2F, false));

        LeftLegTop = new BookwormModelRenderer(this, "LeftLegTop");
        LeftLegTop.setRotationPoint(0.0F, 24.0F, 0.0F);
        LeftLegTop.cubeList.add(new ModelBox(LeftLegTop, 0, 25, 1.0F, -8.5F, 3.0F, 1, 1, 1, 0.2F, false));
        LeftLegTop.cubeList.add(new ModelBox(LeftLegTop, 24, 14, 1.0F, -7.75F, 3.0F, 1, 2, 1, 0.1F, false));

        RightLegTop = new BookwormModelRenderer(this, "RightLegTop");
        RightLegTop.setRotationPoint(0.0F, 17.5F, 3.575F);
        RightLegTop.cubeList.add(new ModelBox(RightLegTop, 17, 19, -2.0F, -2.0F, -0.575F, 1, 1, 1, 0.2F, false));
        RightLegTop.cubeList.add(new ModelBox(RightLegTop, 23, 0, -2.0F, -1.25F, -0.575F, 1, 2, 1, 0.1F, false));

        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        LeftFoot.render(f5);
        RightFoot.render(f5);
        MainBody.render(f5);
        HeadandNeck.render(f5);
        LeftToes.render(f5);
        RightToes.render(f5);
        LeftLegTop.render(f5);
        RightLegTop.render(f5);
    }

    public void setRotationAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }
}