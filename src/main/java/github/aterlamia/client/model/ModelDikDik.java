package github.aterlamia.client.model;


import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

public class ModelDikDik extends ZAWAModelBase {
	private final BookwormModelRenderer Body;
	private final BookwormModelRenderer cube_r1;
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
	private final BookwormModelRenderer Hipr;
	private final BookwormModelRenderer LegUpR;
	private final BookwormModelRenderer LegDownR;
	private final BookwormModelRenderer LegDownR_r1;
	private final BookwormModelRenderer LegDownR2;
	private final BookwormModelRenderer LegDownR_r2;
	private final BookwormModelRenderer Hipr3;
	private final BookwormModelRenderer HipR_r1;
	private final BookwormModelRenderer LegUpR3;
	private final BookwormModelRenderer LegDownR5;
	private final BookwormModelRenderer LegDownR_r3;
	private final BookwormModelRenderer LegDownR6;
	private final BookwormModelRenderer LegDownR_r4;
	private final BookwormModelRenderer Hipr4;
	private final BookwormModelRenderer HipR_r2;
	private final BookwormModelRenderer LegUpR4;
	private final BookwormModelRenderer LegDownR7;
	private final BookwormModelRenderer LegDownR_r5;
	private final BookwormModelRenderer LegDownR8;
	private final BookwormModelRenderer LegDownR_r6;
	private final BookwormModelRenderer Hipr2;
	private final BookwormModelRenderer LegUpR2;
	private final BookwormModelRenderer LegDownR3;
	private final BookwormModelRenderer LegDownR_r7;
	private final BookwormModelRenderer LegDownR4;
	private final BookwormModelRenderer LegDownR_r8;
	private final BookwormModelRenderer cube_r2;
	private final BookwormModelRenderer cube_r3_r1;
	private final BookwormModelRenderer cube_r3_r2;
	private final BookwormModelRenderer cube_r3_r2_r1;
	private final BookwormModelRenderer cube_r2_r1;
	private final BookwormModelRenderer cube_r2_r1_r1;

	public ModelDikDik() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new BookwormModelRenderer(this, "Body");
		Body.setRotationPoint(0.0F, -13.0F, 16.0F);
		

		cube_r1 = new BookwormModelRenderer(this, "cube_r1");
		cube_r1.setRotationPoint(0.0F, 7.5F, -27.75F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 28, -3.0F, -0.25F, 0.5F, 1, 3, 1, 0.0F, false));

		Head = new BookwormModelRenderer(this, "Head");
		Head.setRotationPoint(0.5F, 0.5F, -2.75F);
		Body.addChild(Head);
		

		Hair_r1 = new BookwormModelRenderer(this, "Hair_r1");
		Hair_r1.setRotationPoint(0.0F, -8.0F, 1.5F);
		Head.addChild(Hair_r1);
		setRotationAngle(Hair_r1, 0.5236F, 0.0F, 0.0F);
		Hair_r1.cubeList.add(new ModelBox(Hair_r1, 51, 0, -3.5F, 3.0F, -1.25F, 1, 2, 3, 0.0F, false));

		Mouth_r1 = new BookwormModelRenderer(this, "Mouth_r1");
		Mouth_r1.setRotationPoint(0.0F, 2.0F, 7.0F);
		Head.addChild(Mouth_r1);
		setRotationAngle(Mouth_r1, -0.6981F, 0.0F, 0.0F);
		Mouth_r1.cubeList.add(new ModelBox(Mouth_r1, 26, 0, -4.0F, -0.3329F, -0.0436F, 2, 1, 4, 0.0F, false));

		Snout_r1 = new BookwormModelRenderer(this, "Snout_r1");
		Snout_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Snout_r1);
		setRotationAngle(Snout_r1, -0.3491F, 0.0F, 0.0F);
		Snout_r1.cubeList.add(new ModelBox(Snout_r1, 57, 62, -5.0F, -4.0F, 3.0F, 4, 4, 6, 0.0F, false));
		Snout_r1.cubeList.add(new ModelBox(Snout_r1, 44, 15, -6.0F, -6.0F, 0.0F, 6, 6, 6, 0.0F, false));

		Muzzle = new BookwormModelRenderer(this, "Muzzle");
		Muzzle.setRotationPoint(-3.0F, 0.0F, 10.0F);
		Head.addChild(Muzzle);
		setRotationAngle(Muzzle, -0.9163F, 0.0F, 0.0F);
		Muzzle.cubeList.add(new ModelBox(Muzzle, 21, 58, -1.0F, -0.2441F, -4.3728F, 2, 2, 8, 0.0F, false));

		MuzleBottom_r1 = new BookwormModelRenderer(this, "MuzleBottom_r1");
		MuzleBottom_r1.setRotationPoint(3.0F, 0.0F, -3.0F);
		Muzzle.addChild(MuzleBottom_r1);
		setRotationAngle(MuzleBottom_r1, 0.3054F, 0.0F, 0.0F);
		MuzleBottom_r1.cubeList.add(new ModelBox(MuzleBottom_r1, 0, 68, -4.0F, 2.0F, -0.25F, 2, 2, 6, 0.0F, false));

		MuzzleEnd_r1 = new BookwormModelRenderer(this, "MuzzleEnd_r1");
		MuzzleEnd_r1.setRotationPoint(3.0F, 1.0F, 4.0F);
		Muzzle.addChild(MuzzleEnd_r1);
		setRotationAngle(MuzzleEnd_r1, 0.48F, 0.0F, 0.0F);
		MuzzleEnd_r1.cubeList.add(new ModelBox(MuzzleEnd_r1, 35, 0, -3.5F, -0.2441F, -1.1228F, 1, 1, 2, 0.0F, false));

		MuzzleEnd_r2 = new BookwormModelRenderer(this, "MuzzleEnd_r2");
		MuzzleEnd_r2.setRotationPoint(3.0F, 0.75F, 3.0F);
		Muzzle.addChild(MuzzleEnd_r2);
		setRotationAngle(MuzzleEnd_r2, -0.1745F, 0.0F, 0.0F);
		MuzzleEnd_r2.cubeList.add(new ModelBox(MuzzleEnd_r2, 42, 15, -3.5F, -0.8941F, -0.2228F, 1, 1, 2, 0.0F, false));

		SnoutTop = new BookwormModelRenderer(this, "SnoutTop");
		SnoutTop.setRotationPoint(0.0F, -0.5F, 9.75F);
		Head.addChild(SnoutTop);
		setRotationAngle(SnoutTop, -0.9163F, 0.0F, 0.0F);
		SnoutTop.cubeList.add(new ModelBox(SnoutTop, 38, 68, -5.0F, -0.1628F, -3.7515F, 4, 4, 4, 0.0F, false));

		Horns = new BookwormModelRenderer(this, "Horns");
		Horns.setRotationPoint(0.0F, 0.5F, 2.75F);
		Head.addChild(Horns);
		setRotationAngle(Horns, 0.3491F, 0.0F, 0.0F);
		Horns.cubeList.add(new ModelBox(Horns, 43, 43, -5.0F, -8.0F, 4.0F, 1, 5, 1, 0.0F, false));
		Horns.cubeList.add(new ModelBox(Horns, 27, 43, -2.0F, -8.0F, 4.0F, 1, 5, 1, 0.0F, false));

		EarL = new BookwormModelRenderer(this, "EarL");
		EarL.setRotationPoint(-6.0F, 1.0F, -0.5F);
		Head.addChild(EarL);
		setRotationAngle(EarL, 0.3123F, 0.1586F, -0.4549F);
		

		EarL_r1 = new BookwormModelRenderer(this, "EarL_r1");
		EarL_r1.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r1);
		setRotationAngle(EarL_r1, 0.0F, 0.3491F, 0.0F);
		EarL_r1.cubeList.add(new ModelBox(EarL_r1, 53, 28, -6.5F, -8.7412F, 0.8819F, 1, 3, 3, 0.0F, false));

		EarL_r2 = new BookwormModelRenderer(this, "EarL_r2");
		EarL_r2.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r2);
		setRotationAngle(EarL_r2, -0.0873F, 0.3491F, 0.0F);
		EarL_r2.cubeList.add(new ModelBox(EarL_r2, 35, 15, -6.5F, -6.7912F, 1.2819F, 1, 6, 2, 0.0F, false));

		EarL_r3 = new BookwormModelRenderer(this, "EarL_r3");
		EarL_r3.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r3);
		setRotationAngle(EarL_r3, 0.0873F, 0.3491F, 0.0F);
		EarL_r3.cubeList.add(new ModelBox(EarL_r3, 21, 56, -6.5F, -7.4912F, 1.5319F, 1, 6, 2, 0.0F, false));

		EarL2 = new BookwormModelRenderer(this, "EarL2");
		EarL2.setRotationPoint(0.0F, 1.0F, -0.5F);
		Head.addChild(EarL2);
		setRotationAngle(EarL2, 0.3123F, -0.1586F, 0.4549F);
		

		EarL_r4 = new BookwormModelRenderer(this, "EarL_r4");
		EarL_r4.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r4);
		setRotationAngle(EarL_r4, 0.0F, -0.3491F, 0.0F);
		EarL_r4.cubeList.add(new ModelBox(EarL_r4, 0, 0, 5.5F, -8.7412F, 0.8819F, 1, 3, 3, 0.0F, false));

		EarL_r5 = new BookwormModelRenderer(this, "EarL_r5");
		EarL_r5.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r5);
		setRotationAngle(EarL_r5, -0.0873F, -0.3491F, 0.0F);
		EarL_r5.cubeList.add(new ModelBox(EarL_r5, 0, 33, 5.5F, -6.7912F, 1.2819F, 1, 6, 2, 0.0F, false));

		EarL_r6 = new BookwormModelRenderer(this, "EarL_r6");
		EarL_r6.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r6);
		setRotationAngle(EarL_r6, 0.0873F, -0.3491F, 0.0F);
		EarL_r6.cubeList.add(new ModelBox(EarL_r6, 18, 33, 5.5F, -7.4912F, 1.5319F, 1, 6, 2, 0.0F, false));

		Hipr = new BookwormModelRenderer(this, "Hipr");
		Hipr.setRotationPoint(0.0F, 13.0F, -22.0F);
		Body.addChild(Hipr);
		Hipr.cubeList.add(new ModelBox(Hipr, 0, 34, -1.0F, -6.0F, -4.0F, 4, 9, 9, 0.0F, false));

		LegUpR = new BookwormModelRenderer(this, "LegUpR");
		LegUpR.setRotationPoint(0.0F, 3.0F, 0.0F);
		Hipr.addChild(LegUpR);
		setRotationAngle(LegUpR, -0.4363F, 0.0F, 0.0F);
		LegUpR.cubeList.add(new ModelBox(LegUpR, 58, 0, -0.5F, -2.0F, -3.0F, 3, 8, 6, 0.0F, false));

		LegDownR = new BookwormModelRenderer(this, "LegDownR");
		LegDownR.setRotationPoint(0.0F, -23.0F, 22.0F);
		LegUpR.addChild(LegDownR);
		

		LegDownR_r1 = new BookwormModelRenderer(this, "LegDownR_r1");
		LegDownR_r1.setRotationPoint(0.0F, 29.0F, -23.0F);
		LegDownR.addChild(LegDownR_r1);
		setRotationAngle(LegDownR_r1, -0.2618F, 0.0F, 0.0F);
		LegDownR_r1.cubeList.add(new ModelBox(LegDownR_r1, 77, 0, 0.0F, -2.5F, -0.5F, 2, 8, 3, 0.0F, false));

		LegDownR2 = new BookwormModelRenderer(this, "LegDownR2");
		LegDownR2.setRotationPoint(0.0F, 32.0F, -23.0F);
		LegDownR.addChild(LegDownR2);
		setRotationAngle(LegDownR2, 0.6545F, 0.0F, 0.0F);
		

		LegDownR_r2 = new BookwormModelRenderer(this, "LegDownR_r2");
		LegDownR_r2.setRotationPoint(0.0F, -4.0F, 0.0F);
		LegDownR2.addChild(LegDownR_r2);
		setRotationAngle(LegDownR_r2, -0.2618F, 0.0F, 0.0F);
		LegDownR_r2.cubeList.add(new ModelBox(LegDownR_r2, 0, 77, 0.0F, 5.5F, -1.5F, 2, 11, 2, 0.0F, false));

		Hipr3 = new BookwormModelRenderer(this, "Hipr3");
		Hipr3.setRotationPoint(0.0F, 10.75F, -8.0F);
		Body.addChild(Hipr3);
		setRotationAngle(Hipr3, 0.2182F, 0.0F, 0.0F);
		

		HipR_r1 = new BookwormModelRenderer(this, "HipR_r1");
		HipR_r1.setRotationPoint(0.0F, -0.75F, -2.0F);
		Hipr3.addChild(HipR_r1);
		setRotationAngle(HipR_r1, 0.3491F, 0.0F, 0.0F);
		HipR_r1.cubeList.add(new ModelBox(HipR_r1, 27, 43, -1.0F, -0.8675F, -2.403F, 4, 7, 7, 0.0F, false));

		LegUpR3 = new BookwormModelRenderer(this, "LegUpR3");
		LegUpR3.setRotationPoint(0.0F, 4.25F, 2.0F);
		Hipr3.addChild(LegUpR3);
		setRotationAngle(LegUpR3, 0.0436F, 0.0F, 0.0F);
		LegUpR3.cubeList.add(new ModelBox(LegUpR3, 66, 48, -0.5F, -1.2756F, -3.1941F, 3, 8, 5, 0.0F, false));

		LegDownR5 = new BookwormModelRenderer(this, "LegDownR5");
		LegDownR5.setRotationPoint(0.0F, 5.0F, 0.0F);
		LegUpR3.addChild(LegDownR5);
		

		LegDownR_r3 = new BookwormModelRenderer(this, "LegDownR_r3");
		LegDownR_r3.setRotationPoint(0.0F, 1.0F, -2.0F);
		LegDownR5.addChild(LegDownR_r3);
		setRotationAngle(LegDownR_r3, -0.2618F, 0.0F, 0.0F);
		LegDownR_r3.cubeList.add(new ModelBox(LegDownR_r3, 64, 73, 0.0F, -1.75F, -0.5F, 2, 8, 3, 0.0F, false));

		LegDownR6 = new BookwormModelRenderer(this, "LegDownR6");
		LegDownR6.setRotationPoint(0.0F, 7.0F, -2.75F);
		LegDownR5.addChild(LegDownR6);
		setRotationAngle(LegDownR6, -0.0436F, 0.0F, 0.0F);
		

		LegDownR_r4 = new BookwormModelRenderer(this, "LegDownR_r4");
		LegDownR_r4.setRotationPoint(0.0F, -5.1301F, 1.8125F);
		LegDownR6.addChild(LegDownR_r4);
		setRotationAngle(LegDownR_r4, -0.2618F, 0.0F, 0.0F);
		LegDownR_r4.cubeList.add(new ModelBox(LegDownR_r4, 55, 73, 0.0F, 4.4993F, -1.4673F, 2, 11, 2, 0.0F, false));

		Hipr4 = new BookwormModelRenderer(this, "Hipr4");
		Hipr4.setRotationPoint(-7.0F, 10.75F, -8.0F);
		Body.addChild(Hipr4);
		setRotationAngle(Hipr4, 0.2182F, 0.0F, 0.0F);
		

		HipR_r2 = new BookwormModelRenderer(this, "HipR_r2");
		HipR_r2.setRotationPoint(0.0F, -0.75F, -2.0F);
		Hipr4.addChild(HipR_r2);
		setRotationAngle(HipR_r2, 0.3491F, 0.0F, 0.0F);
		HipR_r2.cubeList.add(new ModelBox(HipR_r2, 35, 0, -1.0F, -0.8675F, -2.403F, 4, 7, 7, 0.0F, false));

		LegUpR4 = new BookwormModelRenderer(this, "LegUpR4");
		LegUpR4.setRotationPoint(0.0F, 4.25F, 2.0F);
		Hipr4.addChild(LegUpR4);
		setRotationAngle(LegUpR4, 0.0436F, 0.0F, 0.0F);
		LegUpR4.cubeList.add(new ModelBox(LegUpR4, 64, 23, -0.5F, -1.2756F, -3.1941F, 3, 8, 5, 0.0F, false));

		LegDownR7 = new BookwormModelRenderer(this, "LegDownR7");
		LegDownR7.setRotationPoint(0.0F, 5.0F, 0.0F);
		LegUpR4.addChild(LegDownR7);
		

		LegDownR_r5 = new BookwormModelRenderer(this, "LegDownR_r5");
		LegDownR_r5.setRotationPoint(0.0F, 1.0F, -2.0F);
		LegDownR7.addChild(LegDownR_r5);
		setRotationAngle(LegDownR_r5, -0.2618F, 0.0F, 0.0F);
		LegDownR_r5.cubeList.add(new ModelBox(LegDownR_r5, 26, 69, 0.0F, -1.75F, -0.5F, 2, 8, 3, 0.0F, false));

		LegDownR8 = new BookwormModelRenderer(this, "LegDownR8");
		LegDownR8.setRotationPoint(0.0F, 7.0F, -2.75F);
		LegDownR7.addChild(LegDownR8);
		setRotationAngle(LegDownR8, -0.0436F, 0.0F, 0.0F);
		

		LegDownR_r6 = new BookwormModelRenderer(this, "LegDownR_r6");
		LegDownR_r6.setRotationPoint(0.0F, -5.1301F, 1.8125F);
		LegDownR8.addChild(LegDownR_r6);
		setRotationAngle(LegDownR_r6, -0.2618F, 0.0F, 0.0F);
		LegDownR_r6.cubeList.add(new ModelBox(LegDownR_r6, 17, 69, 0.0F, 4.4993F, -1.4673F, 2, 11, 2, 0.0F, false));

		Hipr2 = new BookwormModelRenderer(this, "Hipr2");
		Hipr2.setRotationPoint(-7.0F, 13.0F, -22.0F);
		Body.addChild(Hipr2);
		Hipr2.cubeList.add(new ModelBox(Hipr2, 26, 24, -1.0F, -6.0F, -4.0F, 4, 9, 9, 0.0F, false));

		LegUpR2 = new BookwormModelRenderer(this, "LegUpR2");
		LegUpR2.setRotationPoint(0.0F, 3.0F, 0.0F);
		Hipr2.addChild(LegUpR2);
		setRotationAngle(LegUpR2, -0.4363F, 0.0F, 0.0F);
		LegUpR2.cubeList.add(new ModelBox(LegUpR2, 44, 53, -0.5F, -2.0F, -3.0F, 3, 8, 6, 0.0F, false));

		LegDownR3 = new BookwormModelRenderer(this, "LegDownR3");
		LegDownR3.setRotationPoint(0.0F, -23.0F, 22.0F);
		LegUpR2.addChild(LegDownR3);
		

		LegDownR_r7 = new BookwormModelRenderer(this, "LegDownR_r7");
		LegDownR_r7.setRotationPoint(0.0F, 29.0F, -23.0F);
		LegDownR3.addChild(LegDownR_r7);
		setRotationAngle(LegDownR_r7, -0.2618F, 0.0F, 0.0F);
		LegDownR_r7.cubeList.add(new ModelBox(LegDownR_r7, 76, 12, 0.0F, -2.5F, -0.5F, 2, 8, 3, 0.0F, false));

		LegDownR4 = new BookwormModelRenderer(this, "LegDownR4");
		LegDownR4.setRotationPoint(0.0F, 32.0F, -23.0F);
		LegDownR3.addChild(LegDownR4);
		setRotationAngle(LegDownR4, 0.6545F, 0.0F, 0.0F);
		

		LegDownR_r8 = new BookwormModelRenderer(this, "LegDownR_r8");
		LegDownR_r8.setRotationPoint(0.0F, -4.0F, 0.0F);
		LegDownR4.addChild(LegDownR_r8);
		setRotationAngle(LegDownR_r8, -0.2618F, 0.0F, 0.0F);
		LegDownR_r8.cubeList.add(new ModelBox(LegDownR_r8, 75, 73, 0.0F, 5.25F, -1.5F, 2, 11, 2, 0.0F, false));

		cube_r2 = new BookwormModelRenderer(this, "cube_r2");
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.9599F, 0.0F, 0.0F);
		

		cube_r3_r1 = new BookwormModelRenderer(this, "cube_r3_r1");
		cube_r3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -0.6109F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 0, 0, -6.75F, 4.0F, 7.0F, 8, 23, 9, 0.0F, false));

		cube_r3_r2 = new BookwormModelRenderer(this, "cube_r3_r2");
		cube_r3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2.addChild(cube_r3_r2);
		setRotationAngle(cube_r3_r2, -0.0873F, 0.0F, 0.0F);
		

		cube_r3_r2_r1 = new BookwormModelRenderer(this, "cube_r3_r2_r1");
		cube_r3_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r3_r2.addChild(cube_r3_r2_r1);
		setRotationAngle(cube_r3_r2_r1, 0.7418F, 0.0F, 0.0F);
		cube_r3_r2_r1.cubeList.add(new ModelBox(cube_r3_r2_r1, 0, 53, -5.0F, 7.75F, -2.75F, 5, 9, 5, 0.0F, false));

		cube_r2_r1 = new BookwormModelRenderer(this, "cube_r2_r1");
		cube_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.3927F, 0.0F, 0.0F);
		

		cube_r2_r1_r1 = new BookwormModelRenderer(this, "cube_r2_r1_r1");
		cube_r2_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2_r1.addChild(cube_r2_r1_r1);
		setRotationAngle(cube_r2_r1_r1, 0.1745F, 0.0F, 0.0F);
		cube_r2_r1_r1.cubeList.add(new ModelBox(cube_r2_r1_r1, 50, 38, -5.0F, 0.0F, -2.0F, 5, 9, 5, 0.0F, false));

		this.save();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
	}

	public void setRotationAngle(BookwormModelRenderer BookwormModelRenderer, float x, float y, float z) {
		BookwormModelRenderer.rotateAngleX = x;
		BookwormModelRenderer.rotateAngleY = y;
		BookwormModelRenderer.rotateAngleZ = z;
	}
}