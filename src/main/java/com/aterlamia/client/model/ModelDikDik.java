package com.aterlamia.client.model;

import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

public class ModelDikDik extends ZAWAModelBase {
    private final BookwormModelRenderer Body;
    private final BookwormModelRenderer tail;
    private final BookwormModelRenderer ShoulderL;
    private final BookwormModelRenderer ShoulderLl_r1;
    private final BookwormModelRenderer ArmUpperL;
    private final BookwormModelRenderer ArmLowerL;
    private final BookwormModelRenderer LegDownR_r3_r1;
    private final BookwormModelRenderer HoofFrontLeft;
    private final BookwormModelRenderer LegDownR_r4;
    private final BookwormModelRenderer bone;
    private final BookwormModelRenderer ShoulderR;
    private final BookwormModelRenderer ArmUpperR;
    private final BookwormModelRenderer ArmLowerR;
    private final BookwormModelRenderer HoofFrontRight;
    private final BookwormModelRenderer Hipr;
    private final BookwormModelRenderer LegUpperR;
    private final BookwormModelRenderer LegLowerR;
    private final BookwormModelRenderer HoofBackRight;
    private final BookwormModelRenderer HipL;
    private final BookwormModelRenderer LegUpperL;
    private final BookwormModelRenderer LegLowerL;
    private final BookwormModelRenderer HoofBackLeft;
    private final BookwormModelRenderer bodybase;
    private final BookwormModelRenderer romp;
    private final BookwormModelRenderer NeckBotom;
    private final BookwormModelRenderer NeckTop;
    private final BookwormModelRenderer NeckTop_r1;
    private final BookwormModelRenderer Head;
    private final BookwormModelRenderer Hair_r1;
    private final BookwormModelRenderer Mouth_r1;
    private final BookwormModelRenderer Snout_r1;
    private final BookwormModelRenderer Muzzle;
    private final BookwormModelRenderer MuzleBottom_r1;
    private final BookwormModelRenderer MuzzleEnd_r1;
    private final BookwormModelRenderer MuzzleEnd_r2;
    private final BookwormModelRenderer SnoutTop;
    private final BookwormModelRenderer Horns;
    private final BookwormModelRenderer EarL;
    private final BookwormModelRenderer EarL_r1;
    private final BookwormModelRenderer EarL_r2;
    private final BookwormModelRenderer EarL_r3;
    private final BookwormModelRenderer EarL2;
    private final BookwormModelRenderer EarL_r4;
    private final BookwormModelRenderer EarL_r5;
    private final BookwormModelRenderer EarL_r6;

    public ModelDikDik() {
        textureWidth = 128;
        textureHeight = 128;

        Body = new BookwormModelRenderer(this, "Body");
        Body.setRotationPoint(0.0F, -11.5F, -17.0F);
        setRotationAngle(Body, -3.1416F, -0.0087F, 3.1416F);


        tail = new BookwormModelRenderer(this, "tail");
        tail.setRotationPoint(0.0F, 7.5F, -27.75F);
        Body.addChild(tail);
        setRotationAngle(tail, -0.3927F, 0.0F, 0.0F);
        tail.cubeList.add(new ModelBox(tail, 44, 15, -3.0F, -0.25F, 0.5F, 1, 3, 1, 0.0F, false));

        ShoulderL = new BookwormModelRenderer(this, "ShoulderL");
        ShoulderL.setRotationPoint(0.0F, 10.75F, -10.0F);
        Body.addChild(ShoulderL);
        setRotationAngle(ShoulderL, 0.7852F, -0.0149F, 0.041F);


        ShoulderLl_r1 = new BookwormModelRenderer(this, "ShoulderLl_r1");
        ShoulderLl_r1.setRotationPoint(0.0F, 26.5F, 27.0F);
        ShoulderL.addChild(ShoulderLl_r1);
        setRotationAngle(ShoulderLl_r1, 0.0F, 0.0F, -0.0436F);
        ShoulderLl_r1.cubeList.add(new ModelBox(ShoulderLl_r1, 27, 43, 0.0F, -27.3675F, -29.403F, 4, 7, 7, 0.0F, false));

        ArmUpperL = new BookwormModelRenderer(this, "ArmUpperL");
        ArmUpperL.setRotationPoint(0.0F, 6.0F, 2.25F);
        ShoulderL.addChild(ArmUpperL);
        setRotationAngle(ArmUpperL, -0.3037F, -0.0547F, -0.0285F);
        ArmUpperL.cubeList.add(new ModelBox(ArmUpperL, 66, 48, -0.5F, -1.2756F, -3.1941F, 3, 8, 5, 0.0F, false));

        ArmLowerL = new BookwormModelRenderer(this, "ArmLowerL");
        ArmLowerL.setRotationPoint(0.0F, 5.0F, 0.0F);
        ArmUpperL.addChild(ArmLowerL);


        LegDownR_r3_r1 = new BookwormModelRenderer(this, "LegDownR_r3_r1");
        LegDownR_r3_r1.setRotationPoint(0.0F, 1.5F, -1.0F);
        ArmLowerL.addChild(LegDownR_r3_r1);
        setRotationAngle(LegDownR_r3_r1, -0.2618F, 0.0F, 0.0F);
        LegDownR_r3_r1.cubeList.add(new ModelBox(LegDownR_r3_r1, 76, 12, 0.0F, -2.25F, -1.5F, 2, 8, 3, 0.0F, false));

        HoofFrontLeft = new BookwormModelRenderer(this, "HoofFrontLeft");
        HoofFrontLeft.setRotationPoint(0.0F, 7.0F, -2.75F);
        ArmLowerL.addChild(HoofFrontLeft);
        setRotationAngle(HoofFrontLeft, -0.0436F, 0.0F, 0.0F);


        LegDownR_r4 = new BookwormModelRenderer(this, "LegDownR_r4");
        LegDownR_r4.setRotationPoint(0.0F, -5.1301F, 1.8125F);
        HoofFrontLeft.addChild(LegDownR_r4);
        setRotationAngle(LegDownR_r4, -0.2618F, 0.0F, 0.0F);
        LegDownR_r4.cubeList.add(new ModelBox(LegDownR_r4, 75, 73, 0.0F, 3.2493F, -1.4673F, 2, 11, 2, 0.0F, false));

        bone = new BookwormModelRenderer(this, "bone");
        bone.setRotationPoint(0.0F, 13.6301F, 25.6875F);
        LegDownR_r4.addChild(bone);


        ShoulderR = new BookwormModelRenderer(this, "ShoulderR");
        ShoulderR.setRotationPoint(-7.0F, 11.0F, -10.0F);
        Body.addChild(ShoulderR);
        setRotationAngle(ShoulderR, 0.7422F, -0.0387F, -0.0202F);
        ShoulderR.cubeList.add(new ModelBox(ShoulderR, 35, 0, -1.0F, -0.8675F, -2.403F, 4, 7, 7, 0.0F, false));

        ArmUpperR = new BookwormModelRenderer(this, "ArmUpperR");
        ArmUpperR.setRotationPoint(0.0F, 5.0F, 2.0F);
        ShoulderR.addChild(ArmUpperR);
        setRotationAngle(ArmUpperR, -0.1746F, 0.0F, 0.0F);
        ArmUpperR.cubeList.add(new ModelBox(ArmUpperR, 64, 23, -0.5F, -1.2756F, -3.1941F, 3, 8, 5, 0.0F, false));

        ArmLowerR = new BookwormModelRenderer(this, "ArmLowerR");
        ArmLowerR.setRotationPoint(0.0F, 6.0F, -1.0F);
        ArmUpperR.addChild(ArmLowerR);
        setRotationAngle(ArmLowerR, -0.3054F, 0.0F, 0.0F);
        ArmLowerR.cubeList.add(new ModelBox(ArmLowerR, 64, 73, 0.0F, -1.75F, -1.5F, 2, 8, 3, 0.0F, false));

        HoofFrontRight = new BookwormModelRenderer(this, "HoofFrontRight");
        HoofFrontRight.setRotationPoint(0.0F, -1.0F, 1.0F);
        ArmLowerR.addChild(HoofFrontRight);
        HoofFrontRight.cubeList.add(new ModelBox(HoofFrontRight, 26, 69, 0.0F, 5.3692F, -2.4048F, 2, 11, 2, 0.0F, false));

        Hipr = new BookwormModelRenderer(this, "Hipr");
        Hipr.setRotationPoint(0.0F, 13.0F, -22.0F);
        Body.addChild(Hipr);
        Hipr.cubeList.add(new ModelBox(Hipr, 0, 34, -1.0F, -6.0F, -4.0F, 4, 9, 9, 0.0F, false));

        LegUpperR = new BookwormModelRenderer(this, "LegUpperR");
        LegUpperR.setRotationPoint(0.0F, 3.0F, 0.0F);
        Hipr.addChild(LegUpperR);
        setRotationAngle(LegUpperR, -0.4363F, 0.0F, 0.0F);
        LegUpperR.cubeList.add(new ModelBox(LegUpperR, 58, 0, -0.5F, -2.0F, -3.0F, 3, 8, 6, 0.0F, false));

        LegLowerR = new BookwormModelRenderer(this, "LegLowerR");
        LegLowerR.setRotationPoint(0.0F, 5.0F, 0.0F);
        LegUpperR.addChild(LegLowerR);
        setRotationAngle(LegLowerR, -0.2182F, 0.0F, 0.0F);
        LegLowerR.cubeList.add(new ModelBox(LegLowerR, 77, 0, 0.0F, -2.25F, -1.5F, 2, 8, 3, 0.0F, false));

        HoofBackRight = new BookwormModelRenderer(this, "HoofBackRight");
        HoofBackRight.setRotationPoint(0.0F, 5.5F, -0.5F);
        LegLowerR.addChild(HoofBackRight);
        setRotationAngle(HoofBackRight, 0.6109F, 0.0F, 0.0F);
        HoofBackRight.cubeList.add(new ModelBox(HoofBackRight, 0, 77, 0.0F, -0.3302F, -0.9917F, 2, 11, 2, 0.0F, false));

        HipL = new BookwormModelRenderer(this, "HipL");
        HipL.setRotationPoint(-7.0F, 13.0F, -22.0F);
        Body.addChild(HipL);
        HipL.cubeList.add(new ModelBox(HipL, 26, 24, -1.0F, -6.0F, -4.0F, 4, 9, 9, 0.0F, false));

        LegUpperL = new BookwormModelRenderer(this, "LegUpperL");
        LegUpperL.setRotationPoint(0.0F, 3.0F, 0.0F);
        HipL.addChild(LegUpperL);
        setRotationAngle(LegUpperL, -0.4363F, 0.0F, 0.0F);
        LegUpperL.cubeList.add(new ModelBox(LegUpperL, 44, 53, -0.5F, -2.0F, -3.0F, 3, 8, 6, 0.0F, false));

        LegLowerL = new BookwormModelRenderer(this, "LegLowerL");
        LegLowerL.setRotationPoint(0.0F, 4.0F, 0.5F);
        LegUpperL.addChild(LegLowerL);
        setRotationAngle(LegLowerL, -0.2618F, 0.0F, 0.0F);
        LegLowerL.cubeList.add(new ModelBox(LegLowerL, 53, 73, 0.0F, -0.5F, -1.5F, 2, 8, 3, 0.0F, false));

        HoofBackLeft = new BookwormModelRenderer(this, "HoofBackLeft");
        HoofBackLeft.setRotationPoint(0.0F, 7.5F, 0.25F);
        LegLowerL.addChild(HoofBackLeft);
        setRotationAngle(HoofBackLeft, 0.6545F, 0.0F, 0.0F);
        HoofBackLeft.cubeList.add(new ModelBox(HoofBackLeft, 17, 69, 0.0F, -1.0632F, -1.1211F, 2, 11, 2, 0.0F, false));

        bodybase = new BookwormModelRenderer(this, "bodybase");
        bodybase.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(bodybase);
        setRotationAngle(bodybase, -0.9599F, 0.0F, 0.0F);


        romp = new BookwormModelRenderer(this, "romp");
        romp.setRotationPoint(0.0F, 0.0F, 0.0F);
        bodybase.addChild(romp);
        setRotationAngle(romp, -0.6109F, 0.0F, 0.0F);
        romp.cubeList.add(new ModelBox(romp, 0, 0, -6.75F, 4.0F, 7.0F, 8, 23, 9, 0.0F, false));

        NeckBotom = new BookwormModelRenderer(this, "NeckBotom");
        NeckBotom.setRotationPoint(0.0F, 11.8304F, 8.988F);
        bodybase.addChild(NeckBotom);
        setRotationAngle(NeckBotom, 0.3927F, 0.0F, 0.0F);
        NeckBotom.cubeList.add(new ModelBox(NeckBotom, 0, 53, -5.0F, -7.116F, -2.6908F, 5, 9, 5, 0.0F, false));

        NeckTop = new BookwormModelRenderer(this, "NeckTop");
        NeckTop.setRotationPoint(0.0F, -15.6964F, 1.0712F);
        NeckBotom.addChild(NeckTop);
        setRotationAngle(NeckTop, -0.6109F, 0.0F, 0.0F);


        NeckTop_r1 = new BookwormModelRenderer(this, "NeckTop_r1");
        NeckTop_r1.setRotationPoint(666.0F, 5.5F, 9.0F);
        NeckTop.addChild(NeckTop_r1);
        setRotationAngle(NeckTop_r1, 0.4363F, 0.0F, 0.0F);
        NeckTop_r1.cubeList.add(new ModelBox(NeckTop_r1, 50, 38, -671.0F, -8.5F, -8.0F, 5, 9, 5, 0.0F, false));

        Head = new BookwormModelRenderer(this, "Head");
        Head.setRotationPoint(-179.5F, 1.25F, -0.75F);
        NeckTop.addChild(Head);
        setRotationAngle(Head, 0.7854F, 0.0F, 0.0F);


        Hair_r1 = new BookwormModelRenderer(this, "Hair_r1");
        Hair_r1.setRotationPoint(180.0F, -8.7071F, 0.7929F);
        Head.addChild(Hair_r1);
        setRotationAngle(Hair_r1, 0.5236F, 0.0F, 0.0F);
        Hair_r1.cubeList.add(new ModelBox(Hair_r1, 51, 0, -3.5F, 3.0F, -1.25F, 1, 2, 3, 0.0F, false));

        Mouth_r1 = new BookwormModelRenderer(this, "Mouth_r1");
        Mouth_r1.setRotationPoint(180.0F, 1.2929F, 6.2929F);
        Head.addChild(Mouth_r1);
        setRotationAngle(Mouth_r1, -0.6981F, 0.0F, 0.0F);
        Mouth_r1.cubeList.add(new ModelBox(Mouth_r1, 26, 0, -4.0F, -0.3329F, -0.0436F, 2, 1, 4, 0.0F, false));

        Snout_r1 = new BookwormModelRenderer(this, "Snout_r1");
        Snout_r1.setRotationPoint(180.0F, -0.7071F, -0.7071F);
        Head.addChild(Snout_r1);
        setRotationAngle(Snout_r1, -0.3491F, 0.0F, 0.0F);
        Snout_r1.cubeList.add(new ModelBox(Snout_r1, 57, 62, -5.0F, -4.0F, 3.0F, 4, 4, 6, 0.0F, false));
        Snout_r1.cubeList.add(new ModelBox(Snout_r1, 44, 15, -6.0F, -6.0F, 0.0F, 6, 6, 6, 0.0F, false));

        Muzzle = new BookwormModelRenderer(this, "Muzzle");
        Muzzle.setRotationPoint(177.0F, -0.7071F, 9.2929F);
        Head.addChild(Muzzle);
        setRotationAngle(Muzzle, -0.9163F, 0.0F, 0.0F);
        Muzzle.cubeList.add(new ModelBox(Muzzle, 21, 58, -1.0F, -0.2441F, -4.3728F, 2, 2, 8, 0.0F, false));

        MuzleBottom_r1 = new BookwormModelRenderer(this, "MuzleBottom_r1");
        MuzleBottom_r1.setRotationPoint(3.0F, 0.0F, -3.0F);
        Muzzle.addChild(MuzleBottom_r1);
        setRotationAngle(MuzleBottom_r1, 0.3054F, 0.0F, 0.0F);
        MuzleBottom_r1.cubeList.add(new ModelBox(MuzleBottom_r1, 36, 68, -4.0F, 2.0F, -0.25F, 2, 2, 6, 0.0F, false));

        MuzzleEnd_r1 = new BookwormModelRenderer(this, "MuzzleEnd_r1");
        MuzzleEnd_r1.setRotationPoint(3.0F, 1.0F, 4.0F);
        Muzzle.addChild(MuzzleEnd_r1);
        setRotationAngle(MuzzleEnd_r1, 0.48F, 0.0F, 0.0F);
        MuzzleEnd_r1.cubeList.add(new ModelBox(MuzzleEnd_r1, 44, 28, -3.5F, -0.2441F, -1.1228F, 1, 1, 2, 0.0F, false));

        MuzzleEnd_r2 = new BookwormModelRenderer(this, "MuzzleEnd_r2");
        MuzzleEnd_r2.setRotationPoint(3.0F, 0.75F, 3.0F);
        Muzzle.addChild(MuzzleEnd_r2);
        setRotationAngle(MuzzleEnd_r2, -0.1745F, 0.0F, 0.0F);
        MuzzleEnd_r2.cubeList.add(new ModelBox(MuzzleEnd_r2, 35, 0, -3.5F, -0.8941F, -0.2228F, 1, 1, 2, 0.0F, false));

        SnoutTop = new BookwormModelRenderer(this, "SnoutTop");
        SnoutTop.setRotationPoint(180.0F, -1.2071F, 9.0429F);
        Head.addChild(SnoutTop);
        setRotationAngle(SnoutTop, -0.9163F, 0.0F, 0.0F);
        SnoutTop.cubeList.add(new ModelBox(SnoutTop, 0, 68, -5.0F, -0.1628F, -3.7515F, 4, 4, 4, 0.0F, false));

        Horns = new BookwormModelRenderer(this, "Horns");
        Horns.setRotationPoint(180.0F, -0.2071F, 2.0429F);
        Head.addChild(Horns);
        setRotationAngle(Horns, 0.3491F, 0.0F, 0.0F);
        Horns.cubeList.add(new ModelBox(Horns, 43, 43, -5.0F, -8.0F, 4.0F, 1, 5, 1, 0.0F, false));
        Horns.cubeList.add(new ModelBox(Horns, 27, 43, -2.0F, -8.0F, 4.0F, 1, 5, 1, 0.0F, false));

        EarL = new BookwormModelRenderer(this, "EarL");
        EarL.setRotationPoint(174.0F, 0.2929F, -1.2071F);
        Head.addChild(EarL);
        setRotationAngle(EarL, 0.3123F, 0.1586F, -0.4549F);


        EarL_r1 = new BookwormModelRenderer(this, "EarL_r1");
        EarL_r1.setRotationPoint(6.0F, 1.0F, 0.0F);
        EarL.addChild(EarL_r1);
        setRotationAngle(EarL_r1, 0.0F, 0.3491F, 0.0F);
        EarL_r1.cubeList.add(new ModelBox(EarL_r1, 34, 58, -6.5F, -8.7412F, 0.8819F, 1, 3, 3, 0.0F, false));

        EarL_r2 = new BookwormModelRenderer(this, "EarL_r2");
        EarL_r2.setRotationPoint(6.0F, 1.0F, 0.0F);
        EarL.addChild(EarL_r2);
        setRotationAngle(EarL_r2, -0.0873F, 0.3491F, 0.0F);
        EarL_r2.cubeList.add(new ModelBox(EarL_r2, 53, 28, -6.5F, -6.7912F, 1.2819F, 1, 6, 2, 0.0F, false));

        EarL_r3 = new BookwormModelRenderer(this, "EarL_r3");
        EarL_r3.setRotationPoint(6.0F, 1.0F, 0.0F);
        EarL.addChild(EarL_r3);
        setRotationAngle(EarL_r3, 0.0873F, 0.3491F, 0.0F);
        EarL_r3.cubeList.add(new ModelBox(EarL_r3, 18, 33, -6.5F, -7.4912F, 1.5319F, 1, 6, 2, 0.0F, false));

        EarL2 = new BookwormModelRenderer(this, "EarL2");
        EarL2.setRotationPoint(180.0F, 0.2929F, -1.2071F);
        Head.addChild(EarL2);
        setRotationAngle(EarL2, 0.3123F, -0.1586F, 0.4549F);


        EarL_r4 = new BookwormModelRenderer(this, "EarL_r4");
        EarL_r4.setRotationPoint(-6.0F, 1.0F, 0.0F);
        EarL2.addChild(EarL_r4);
        setRotationAngle(EarL_r4, 0.0F, -0.3491F, 0.0F);
        EarL_r4.cubeList.add(new ModelBox(EarL_r4, 35, 15, 5.5F, -8.7412F, 0.8819F, 1, 3, 3, 0.0F, false));

        EarL_r5 = new BookwormModelRenderer(this, "EarL_r5");
        EarL_r5.setRotationPoint(-6.0F, 1.0F, 0.0F);
        EarL2.addChild(EarL_r5);
        setRotationAngle(EarL_r5, -0.0873F, -0.3491F, 0.0F);
        EarL_r5.cubeList.add(new ModelBox(EarL_r5, 0, 33, 5.5F, -6.7912F, 1.2819F, 1, 6, 2, 0.0F, false));

        EarL_r6 = new BookwormModelRenderer(this, "EarL_r6");
        EarL_r6.setRotationPoint(-6.0F, 1.0F, 0.0F);
        EarL2.addChild(EarL_r6);
        setRotationAngle(EarL_r6, 0.0873F, -0.3491F, 0.0F);
        EarL_r6.cubeList.add(new ModelBox(EarL_r6, 0, 0, 5.5F, -7.4912F, 1.5319F, 1, 6, 2, 0.0F, false));

        this.save();
    }

    protected void performIdleAnimation(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, Entity entity) {
        super.performIdleAnimation(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
        this.reset();
        this.speed = 2.3F;
        this.degree = 2.1F;
        this.tail.rotateAngleX = MathHelper.cos(53.0F + limbSwing * 0.0462F * this.speed + 3.1415927F) * this.degree * -0.5F * limbSwingAmount * 0.5F;
        this.NeckBotom.rotateAngleX = MathHelper.cos(-20.0F + limbSwing * 0.0562F * this.speed + 3.1415927F) * this.degree * -0.1F * limbSwingAmount * 0.5F + 1.1F;
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        Body.render(scale);
    }

    public void setRotationAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
        BookwormModelRenderer.rotateAngleX = x;
        BookwormModelRenderer.rotateAngleY = y;
        BookwormModelRenderer.rotateAngleZ = z;
    }

    @Override
    protected void performGenericAnimation(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.performGenericAnimation(f, f1, f2, f3, f4, f5, entity);
        this.reset();


        speed = 2.0F;
        degree = 2.0F;
        this.ShoulderL.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F + 0.1F;
        this.ShoulderR.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + 0.1F;

        this.ArmUpperL.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F + -0.15F;
        this.ArmUpperR.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + -0.15F;
        this.HoofFrontLeft.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F;
        this.HoofFrontRight.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F;

        this.LegUpperL.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * -0.9F) * f1 * 0.5F + 0.9F;
        this.LegLowerL.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -0.5F) * f1 * 0.5F + -0.8F;
        this.LegUpperR.rotateAngleX = MathHelper.cos((f * speed * 0.3F) + (float) Math.PI) * (degree * 0.9F) * f1 * 0.5F + 0.9F;
        this.LegLowerR.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 0.5F) * f1 * 0.5F + -0.8F;
        this.NeckBotom.rotateAngleX = MathHelper.cos((f * speed * 0.6F) + (float) Math.PI) * (degree * -0.06F) * f1 * 0.5F + 1.05F;


        degree = 4.0F;
        this.Hipr.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * 1.0F) * f1 * 0.5F + -0.35F;
        this.HipL.rotateAngleX = MathHelper.cos(2.0F + (f * speed * 0.3F) + (float) Math.PI) * (degree * -1.0F) * f1 * 0.5F + -0.35F;
        degree = 1.0F;

        this.Head.rotateAngleX = MathHelper.cos(1.0F + (f * speed * 0.6F) + (float) Math.PI) * (degree * 0.1F) * f1 * 0.5F + 0.8F;
    }
}