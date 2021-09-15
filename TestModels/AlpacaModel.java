// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AlpacaModel extends ModelBase {
	private final ModelRenderer Chest;
	private final ModelRenderer Chest2;
	private final ModelRenderer FrontLegL;
	private final ModelRenderer LowerlegR3;
	private final ModelRenderer LowerLegR_r2;
	private final ModelRenderer HoofR3;
	private final ModelRenderer HoofR_r2;
	private final ModelRenderer FrontLegR;
	private final ModelRenderer LowerlegR2;
	private final ModelRenderer LowerLegR_r4;
	private final ModelRenderer HoofR2;
	private final ModelRenderer HoofR_r4;
	private final ModelRenderer Body;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r1_r2;
	private final ModelRenderer Hips;
	private final ModelRenderer Hips_r1;
	private final ModelRenderer Tail_r1;
	private final ModelRenderer UpperLegR;
	private final ModelRenderer TighR;
	private final ModelRenderer LowerlegR;
	private final ModelRenderer HoofR;
	private final ModelRenderer HoofBoxR_r1;
	private final ModelRenderer UpperLegL;
	private final ModelRenderer TighL;
	private final ModelRenderer LowerlegL;
	private final ModelRenderer HoofL;
	private final ModelRenderer HoofBoxL_r1;
	private final ModelRenderer Neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer NeckUpper;
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Jaw;
	private final ModelRenderer Snout;
	private final ModelRenderer Snout_r1;
	private final ModelRenderer SnoutTop_r1;
	private final ModelRenderer EarLeft;
	private final ModelRenderer EarLEft_r1;
	private final ModelRenderer EarLEft_r1_r1;
	private final ModelRenderer EarLEft_r1_r1_r1;
	private final ModelRenderer EarRight;
	private final ModelRenderer EarLEft_r2;
	private final ModelRenderer EarLEft_r1_r2;
	private final ModelRenderer EarLEft_r1_r1_r2;
	private final ModelRenderer bb_main;

	public AlpacaModel() {
		textureWidth = 256;
		textureHeight = 256;

		Chest = new ModelRenderer(this);
		Chest.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Chest2 = new ModelRenderer(this);
		Chest2.setRotationPoint(0.0F, 2.0F, 5.0F);
		Chest.addChild(Chest2);
		setRotationAngle(Chest2, -0.3927F, 0.0F, 0.0F);
		Chest2.cubeList.add(new ModelBox(Chest2, 0, 16, -6.5F, -8.4343F, -3.8848F, 7, 7, 7, 0.0F, false));

		FrontLegL = new ModelRenderer(this);
		FrontLegL.setRotationPoint(-4.25F, -1.816F, 5.7294F);
		Chest.addChild(FrontLegL);
		FrontLegL.cubeList.add(new ModelBox(FrontLegL, 42, 0, -3.0F, 0.0F, -1.5F, 3, 8, 4, 0.0F, false));

		LowerlegR3 = new ModelRenderer(this);
		LowerlegR3.setRotationPoint(-0.5F, 5.0F, 1.0F);
		FrontLegL.addChild(LowerlegR3);
		setRotationAngle(LowerlegR3, 0.48F, 0.0F, 0.0F);
		

		LowerLegR_r2 = new ModelRenderer(this);
		LowerLegR_r2.setRotationPoint(1.0F, 5.0F, -0.75F);
		LowerlegR3.addChild(LowerLegR_r2);
		setRotationAngle(LowerLegR_r2, -0.48F, 0.0F, 0.0F);
		LowerLegR_r2.cubeList.add(new ModelBox(LowerLegR_r2, 0, 46, -3.0F, -2.7648F, -2.911F, 2, 8, 2, 0.0F, false));

		HoofR3 = new ModelRenderer(this);
		HoofR3.setRotationPoint(0.0F, -5.0F, 0.0F);
		LowerlegR3.addChild(HoofR3);
		

		HoofR_r2 = new ModelRenderer(this);
		HoofR_r2.setRotationPoint(0.0F, 5.0F, 1.5F);
		HoofR3.addChild(HoofR_r2);
		setRotationAngle(HoofR_r2, -0.48F, 0.0F, 0.0F);
		HoofR_r2.cubeList.add(new ModelBox(HoofR_r2, 31, 49, -2.5F, 10.2352F, -2.911F, 3, 2, 3, 0.0F, false));

		FrontLegR = new ModelRenderer(this);
		FrontLegR.setRotationPoint(1.75F, -1.816F, 5.7294F);
		Chest.addChild(FrontLegR);
		FrontLegR.cubeList.add(new ModelBox(FrontLegR, 42, 0, -3.0F, 0.0F, -1.5F, 3, 8, 4, 0.0F, false));

		LowerlegR2 = new ModelRenderer(this);
		LowerlegR2.setRotationPoint(-0.5F, 5.0F, 1.0F);
		FrontLegR.addChild(LowerlegR2);
		setRotationAngle(LowerlegR2, 0.48F, 0.0F, 0.0F);
		

		LowerLegR_r4 = new ModelRenderer(this);
		LowerLegR_r4.setRotationPoint(1.0F, 5.0F, -0.75F);
		LowerlegR2.addChild(LowerLegR_r4);
		setRotationAngle(LowerLegR_r4, -0.48F, 0.0F, 0.0F);
		LowerLegR_r4.cubeList.add(new ModelBox(LowerLegR_r4, 0, 46, -3.0F, -2.7648F, -2.911F, 2, 8, 2, 0.0F, false));

		HoofR2 = new ModelRenderer(this);
		HoofR2.setRotationPoint(0.0F, -5.0F, 0.0F);
		LowerlegR2.addChild(HoofR2);
		

		HoofR_r4 = new ModelRenderer(this);
		HoofR_r4.setRotationPoint(0.0F, 5.0F, 1.5F);
		HoofR2.addChild(HoofR_r4);
		setRotationAngle(HoofR_r4, -0.48F, 0.0F, 0.0F);
		HoofR_r4.cubeList.add(new ModelBox(HoofR_r4, 31, 49, -2.5F, 10.2352F, -2.911F, 3, 2, 3, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Chest.addChild(Body);
		

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.1222F, 0.0F, 0.0F);
		

		Body_r1_r2 = new ModelRenderer(this);
		Body_r1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body_r1.addChild(Body_r1_r2);
		setRotationAngle(Body_r1_r2, 0.0873F, 0.0F, 0.0F);
		Body_r1_r2.cubeList.add(new ModelBox(Body_r1_r2, 0, 0, -6.0F, -7.35F, -4.6F, 6, 6, 9, 0.0F, false));

		Hips = new ModelRenderer(this);
		Hips.setRotationPoint(0.0F, -6.55F, -3.7F);
		Body.addChild(Hips);
		setRotationAngle(Hips, 0.2182F, 0.0F, 0.0F);
		

		Hips_r1 = new ModelRenderer(this);
		Hips_r1.setRotationPoint(0.0F, -0.45F, 0.7F);
		Hips.addChild(Hips_r1);
		setRotationAngle(Hips_r1, -0.1745F, 0.0F, 0.0F);
		Hips_r1.cubeList.add(new ModelBox(Hips_r1, 23, 25, -5.5F, -0.366F, -6.2206F, 5, 6, 6, 0.0F, false));

		Tail_r1 = new ModelRenderer(this);
		Tail_r1.setRotationPoint(0.0F, 0.3F, -5.65F);
		Hips.addChild(Tail_r1);
		setRotationAngle(Tail_r1, -0.7854F, 0.0F, 0.0F);
		Tail_r1.cubeList.add(new ModelBox(Tail_r1, 35, 0, -3.5F, -0.2599F, 0.0269F, 1, 2, 1, 0.0F, false));

		UpperLegR = new ModelRenderer(this);
		UpperLegR.setRotationPoint(1.75F, 0.934F, -3.6206F);
		Hips.addChild(UpperLegR);
		setRotationAngle(UpperLegR, -0.1309F, 0.0F, 0.0F);
		UpperLegR.cubeList.add(new ModelBox(UpperLegR, 30, 38, -3.0F, -1.0097F, -1.9546F, 3, 8, 4, 0.0F, false));

		TighR = new ModelRenderer(this);
		TighR.setRotationPoint(0.0F, 6.8028F, 1.7001F);
		UpperLegR.addChild(TighR);
		setRotationAngle(TighR, -0.3927F, 0.0F, 0.0F);
		TighR.cubeList.add(new ModelBox(TighR, 45, 35, -3.0F, -0.1346F, -2.8223F, 3, 7, 3, 0.0F, false));

		LowerlegR = new ModelRenderer(this);
		LowerlegR.setRotationPoint(0.0F, 6.75F, 0.25F);
		TighR.addChild(LowerlegR);
		setRotationAngle(LowerlegR, 0.3054F, 0.0F, 0.0F);
		LowerlegR.cubeList.add(new ModelBox(LowerlegR, 18, 55, -2.5F, -0.8655F, -2.0835F, 2, 7, 2, 0.0F, false));

		HoofR = new ModelRenderer(this);
		HoofR.setRotationPoint(0.0F, 4.6474F, -0.1353F);
		LowerlegR.addChild(HoofR);
		setRotationAngle(HoofR, 0.0873F, 0.0F, 0.0F);
		

		HoofBoxR_r1 = new ModelRenderer(this);
		HoofBoxR_r1.setRotationPoint(4.25F, 1.9978F, 0.8734F);
		HoofR.addChild(HoofBoxR_r1);
		setRotationAngle(HoofBoxR_r1, -0.0873F, 0.0F, 0.0F);
		HoofBoxR_r1.cubeList.add(new ModelBox(HoofBoxR_r1, 18, 49, -7.25F, -1.9761F, -3.5187F, 3, 2, 3, 0.0F, false));

		UpperLegL = new ModelRenderer(this);
		UpperLegL.setRotationPoint(-4.25F, 0.934F, -3.6206F);
		Hips.addChild(UpperLegL);
		setRotationAngle(UpperLegL, -0.1309F, 0.0F, 0.0F);
		UpperLegL.cubeList.add(new ModelBox(UpperLegL, 30, 38, -3.0F, -1.0097F, -1.9546F, 3, 8, 4, 0.0F, false));

		TighL = new ModelRenderer(this);
		TighL.setRotationPoint(0.0F, 6.8028F, 1.7001F);
		UpperLegL.addChild(TighL);
		setRotationAngle(TighL, -0.3927F, 0.0F, 0.0F);
		TighL.cubeList.add(new ModelBox(TighL, 45, 35, -3.0F, -0.1346F, -2.8223F, 3, 7, 3, 0.0F, false));

		LowerlegL = new ModelRenderer(this);
		LowerlegL.setRotationPoint(0.0F, 6.75F, 0.25F);
		TighL.addChild(LowerlegL);
		setRotationAngle(LowerlegL, 0.3054F, 0.0F, 0.0F);
		LowerlegL.cubeList.add(new ModelBox(LowerlegL, 18, 55, -2.5F, -0.8655F, -2.0835F, 2, 7, 2, 0.0F, false));

		HoofL = new ModelRenderer(this);
		HoofL.setRotationPoint(0.0F, 4.6474F, -0.1353F);
		LowerlegL.addChild(HoofL);
		setRotationAngle(HoofL, 0.0873F, 0.0F, 0.0F);
		

		HoofBoxL_r1 = new ModelRenderer(this);
		HoofBoxL_r1.setRotationPoint(4.25F, 1.9978F, 0.8734F);
		HoofL.addChild(HoofBoxL_r1);
		setRotationAngle(HoofBoxL_r1, -0.0873F, 0.0F, 0.0F);
		HoofBoxL_r1.cubeList.add(new ModelBox(HoofBoxL_r1, 18, 49, -7.25F, -1.9761F, -3.5187F, 3, 2, 3, 0.0F, false));

		Neck = new ModelRenderer(this);
		Neck.setRotationPoint(0.0F, -3.75F, 9.25F);
		Chest.addChild(Neck);
		setRotationAngle(Neck, -0.1745F, 0.0F, 0.0F);
		

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(-2.5F, 1.634F, -0.032F);
		Neck.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.2182F, 0.0F, 0.0F);
		neck_r1.cubeList.add(new ModelBox(neck_r1, 0, 31, -2.0F, -6.9482F, -3.3538F, 3, 8, 4, 0.0F, false));

		NeckUpper = new ModelRenderer(this);
		NeckUpper.setRotationPoint(0.0F, 2.0F, 0.0F);
		neck_r1.addChild(NeckUpper);
		NeckUpper.cubeList.add(new ModelBox(NeckUpper, 0, 31, -1.5F, -14.4482F, -2.6038F, 2, 7, 3, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(2.0F, -13.5F, -1.5F);
		NeckUpper.addChild(Head);
		setRotationAngle(Head, 0.48F, 0.0F, 0.0F);
		

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 6.0F, -4.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, -0.2182F, 0.0F, 0.0F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 25, 10, -5.0F, -13.0F, 1.5F, 5, 6, 6, 0.0F, false));

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, -0.1F, 5.3F);
		Head.addChild(Jaw);
		setRotationAngle(Jaw, -0.3054F, 0.0F, 0.0F);
		Jaw.cubeList.add(new ModelBox(Jaw, 46, 30, -3.5F, -0.2439F, -0.8694F, 2, 1, 4, 0.0F, false));

		Snout = new ModelRenderer(this);
		Snout.setRotationPoint(0.0F, 11.5F, -8.0F);
		Head.addChild(Snout);
		

		Snout_r1 = new ModelRenderer(this);
		Snout_r1.setRotationPoint(0.0F, -5.0F, 4.0F);
		Snout.addChild(Snout_r1);
		setRotationAngle(Snout_r1, -0.2182F, 0.0F, 0.0F);
		Snout_r1.cubeList.add(new ModelBox(Snout_r1, 45, 44, -4.0F, -11.3939F, 7.1806F, 3, 3, 4, 0.0F, false));

		SnoutTop_r1 = new ModelRenderer(this);
		SnoutTop_r1.setRotationPoint(0.5F, -11.134F, 7.532F);
		Snout_r1.addChild(SnoutTop_r1);
		setRotationAngle(SnoutTop_r1, -0.1745F, 0.0F, 0.0F);
		SnoutTop_r1.cubeList.add(new ModelBox(SnoutTop_r1, 28, 56, -4.0F, -0.7599F, -0.4014F, 2, 3, 3, 0.0F, false));

		EarLeft = new ModelRenderer(this);
		EarLeft.setRotationPoint(-3.9F, -4.0F, 1.5F);
		Head.addChild(EarLeft);
		setRotationAngle(EarLeft, 0.0F, -1.3963F, 0.0F);
		

		EarLEft_r1 = new ModelRenderer(this);
		EarLEft_r1.setRotationPoint(-1.5F, 10.0F, -2.5F);
		EarLeft.addChild(EarLEft_r1);
		

		EarLEft_r1_r1 = new ModelRenderer(this);
		EarLEft_r1_r1.setRotationPoint(-3.5F, -10.134F, -5.468F);
		EarLEft_r1.addChild(EarLEft_r1_r1);
		

		EarLEft_r1_r1_r1 = new ModelRenderer(this);
		EarLEft_r1_r1_r1.setRotationPoint(3.9F, 16.0F, 0.0F);
		EarLEft_r1_r1.addChild(EarLEft_r1_r1_r1);
		EarLEft_r1_r1_r1.cubeList.add(new ModelBox(EarLEft_r1_r1_r1, 15, 31, 0.5229F, -21.5401F, 7.6744F, 2, 4, 1, 0.0F, false));

		EarRight = new ModelRenderer(this);
		EarRight.setRotationPoint(-1.1F, -4.0F, 1.5F);
		Head.addChild(EarRight);
		setRotationAngle(EarRight, 0.0F, 1.3963F, 0.0F);
		

		EarLEft_r2 = new ModelRenderer(this);
		EarLEft_r2.setRotationPoint(1.5F, 10.0F, -2.5F);
		EarRight.addChild(EarLEft_r2);
		

		EarLEft_r1_r2 = new ModelRenderer(this);
		EarLEft_r1_r2.setRotationPoint(3.5F, -10.134F, -5.468F);
		EarLEft_r2.addChild(EarLEft_r1_r2);
		

		EarLEft_r1_r1_r2 = new ModelRenderer(this);
		EarLEft_r1_r1_r2.setRotationPoint(-3.9F, 16.0F, 0.0F);
		EarLEft_r1_r2.addChild(EarLEft_r1_r1_r2);
		EarLEft_r1_r1_r2.cubeList.add(new ModelBox(EarLEft_r1_r1_r2, 15, 31, -2.5229F, -21.5401F, 7.6744F, 2, 4, 1, 0.0F, true));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -20.0F, 14.8F, -10.0F, 20, 20, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Chest.render(f5);
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}