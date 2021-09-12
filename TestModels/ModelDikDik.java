// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class ModelDikDik extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer tail;
	private final ModelRenderer ShoulderL;
	private final ModelRenderer ShoulderLl_r1;
	private final ModelRenderer ArmUpperL;
	private final ModelRenderer ArmLowerL;
	private final ModelRenderer LegDownR_r3_r1;
	private final ModelRenderer HoofFrontLeft;
	private final ModelRenderer LegDownR_r4;
	private final ModelRenderer bone;
	private final ModelRenderer ShoulderR;
	private final ModelRenderer ArmUpperR;
	private final ModelRenderer ArmLowerR;
	private final ModelRenderer HoofFrontRight;
	private final ModelRenderer Hipr;
	private final ModelRenderer LegUpperR;
	private final ModelRenderer LegLowerR;
	private final ModelRenderer HoofBackRight;
	private final ModelRenderer HipL;
	private final ModelRenderer LegUpperL;
	private final ModelRenderer LegLowerL;
	private final ModelRenderer HoofBackLeft;
	private final ModelRenderer bodybase;
	private final ModelRenderer romp;
	private final ModelRenderer NeckBotom;
	private final ModelRenderer NeckTop;
	private final ModelRenderer NeckTop_r1;
	private final ModelRenderer Head;
	private final ModelRenderer Hair_r1;
	private final ModelRenderer Mouth_r1;
	private final ModelRenderer Snout_r1;
	private final ModelRenderer Muzzle;
	private final ModelRenderer MuzleBottom_r1;
	private final ModelRenderer MuzzleEnd_r1;
	private final ModelRenderer MuzzleEnd_r2;
	private final ModelRenderer SnoutTop;
	private final ModelRenderer Horns;
	private final ModelRenderer EarL;
	private final ModelRenderer EarL_r1;
	private final ModelRenderer EarL_r2;
	private final ModelRenderer EarL_r3;
	private final ModelRenderer EarL2;
	private final ModelRenderer EarL_r4;
	private final ModelRenderer EarL_r5;
	private final ModelRenderer EarL_r6;

	public ModelDikDik() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -11.5F, -17.0F);
		setRotationAngle(Body, -3.1416F, -0.0087F, 3.1416F);
		

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 7.5F, -27.75F);
		Body.addChild(tail);
		setRotationAngle(tail, -0.3927F, 0.0F, 0.0F);
		tail.setTextureOffset(44, 15).addBox(-3.0F, -0.25F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		ShoulderL = new ModelRenderer(this);
		ShoulderL.setRotationPoint(0.0F, 10.75F, -10.0F);
		Body.addChild(ShoulderL);
		setRotationAngle(ShoulderL, 0.567F, -0.0149F, 0.041F);
		

		ShoulderLl_r1 = new ModelRenderer(this);
		ShoulderLl_r1.setRotationPoint(0.0F, 26.5F, 27.0F);
		ShoulderL.addChild(ShoulderLl_r1);
		setRotationAngle(ShoulderLl_r1, 0.0F, 0.0F, -0.0436F);
		ShoulderLl_r1.setTextureOffset(27, 43).addBox(0.0F, -27.3675F, -29.403F, 4.0F, 7.0F, 7.0F, 0.0F, false);

		ArmUpperL = new ModelRenderer(this);
		ArmUpperL.setRotationPoint(0.0F, 6.0F, 2.25F);
		ShoulderL.addChild(ArmUpperL);
		setRotationAngle(ArmUpperL, -0.3037F, -0.0547F, -0.0285F);
		ArmUpperL.setTextureOffset(66, 48).addBox(-0.5F, -1.2756F, -3.1941F, 3.0F, 8.0F, 5.0F, 0.0F, false);

		ArmLowerL = new ModelRenderer(this);
		ArmLowerL.setRotationPoint(0.0F, 5.0F, 0.0F);
		ArmUpperL.addChild(ArmLowerL);
		

		LegDownR_r3_r1 = new ModelRenderer(this);
		LegDownR_r3_r1.setRotationPoint(0.0F, 1.5F, -1.0F);
		ArmLowerL.addChild(LegDownR_r3_r1);
		setRotationAngle(LegDownR_r3_r1, -0.2618F, 0.0F, 0.0F);
		LegDownR_r3_r1.setTextureOffset(76, 12).addBox(0.0F, -2.25F, -1.5F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		HoofFrontLeft = new ModelRenderer(this);
		HoofFrontLeft.setRotationPoint(0.0F, 7.0F, -2.75F);
		ArmLowerL.addChild(HoofFrontLeft);
		setRotationAngle(HoofFrontLeft, -0.0436F, 0.0F, 0.0F);
		

		LegDownR_r4 = new ModelRenderer(this);
		LegDownR_r4.setRotationPoint(0.0F, -5.1301F, 1.8125F);
		HoofFrontLeft.addChild(LegDownR_r4);
		setRotationAngle(LegDownR_r4, -0.2618F, 0.0F, 0.0F);
		LegDownR_r4.setTextureOffset(75, 73).addBox(0.0F, 3.2493F, -1.4673F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 13.6301F, 25.6875F);
		LegDownR_r4.addChild(bone);
		

		ShoulderR = new ModelRenderer(this);
		ShoulderR.setRotationPoint(-7.0F, 11.0F, -10.0F);
		Body.addChild(ShoulderR);
		setRotationAngle(ShoulderR, 0.4804F, -0.0387F, -0.0202F);
		ShoulderR.setTextureOffset(35, 0).addBox(-1.0F, -0.8675F, -2.403F, 4.0F, 7.0F, 7.0F, 0.0F, false);

		ArmUpperR = new ModelRenderer(this);
		ArmUpperR.setRotationPoint(0.0F, 5.0F, 2.0F);
		ShoulderR.addChild(ArmUpperR);
		setRotationAngle(ArmUpperR, -0.1746F, 0.0F, 0.0F);
		ArmUpperR.setTextureOffset(64, 23).addBox(-0.5F, -1.2756F, -3.1941F, 3.0F, 8.0F, 5.0F, 0.0F, false);

		ArmLowerR = new ModelRenderer(this);
		ArmLowerR.setRotationPoint(0.0F, 6.0F, -1.0F);
		ArmUpperR.addChild(ArmLowerR);
		setRotationAngle(ArmLowerR, -0.3054F, 0.0F, 0.0F);
		ArmLowerR.setTextureOffset(64, 73).addBox(0.0F, -1.75F, -1.5F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		HoofFrontRight = new ModelRenderer(this);
		HoofFrontRight.setRotationPoint(0.0F, -1.0F, 1.0F);
		ArmLowerR.addChild(HoofFrontRight);
		HoofFrontRight.setTextureOffset(26, 69).addBox(0.0F, 5.3692F, -2.4048F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		Hipr = new ModelRenderer(this);
		Hipr.setRotationPoint(0.0F, 13.0F, -22.0F);
		Body.addChild(Hipr);
		Hipr.setTextureOffset(0, 34).addBox(-1.0F, -6.0F, -4.0F, 4.0F, 9.0F, 9.0F, 0.0F, false);

		LegUpperR = new ModelRenderer(this);
		LegUpperR.setRotationPoint(0.0F, 3.0F, 0.0F);
		Hipr.addChild(LegUpperR);
		setRotationAngle(LegUpperR, -0.4363F, 0.0F, 0.0F);
		LegUpperR.setTextureOffset(58, 0).addBox(-0.5F, -2.0F, -3.0F, 3.0F, 8.0F, 6.0F, 0.0F, false);

		LegLowerR = new ModelRenderer(this);
		LegLowerR.setRotationPoint(0.0F, 5.0F, 0.0F);
		LegUpperR.addChild(LegLowerR);
		setRotationAngle(LegLowerR, -0.2182F, 0.0F, 0.0F);
		LegLowerR.setTextureOffset(77, 0).addBox(0.0F, -2.25F, -1.5F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		HoofBackRight = new ModelRenderer(this);
		HoofBackRight.setRotationPoint(0.0F, 5.5F, -0.5F);
		LegLowerR.addChild(HoofBackRight);
		setRotationAngle(HoofBackRight, 0.6109F, 0.0F, 0.0F);
		HoofBackRight.setTextureOffset(0, 77).addBox(0.0F, -0.3302F, -0.9917F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		HipL = new ModelRenderer(this);
		HipL.setRotationPoint(-7.0F, 13.0F, -22.0F);
		Body.addChild(HipL);
		HipL.setTextureOffset(26, 24).addBox(-1.0F, -6.0F, -4.0F, 4.0F, 9.0F, 9.0F, 0.0F, false);

		LegUpperL = new ModelRenderer(this);
		LegUpperL.setRotationPoint(0.0F, 3.0F, 0.0F);
		HipL.addChild(LegUpperL);
		setRotationAngle(LegUpperL, -0.4363F, 0.0F, 0.0F);
		LegUpperL.setTextureOffset(44, 53).addBox(-0.5F, -2.0F, -3.0F, 3.0F, 8.0F, 6.0F, 0.0F, false);

		LegLowerL = new ModelRenderer(this);
		LegLowerL.setRotationPoint(0.0F, 4.0F, 0.5F);
		LegUpperL.addChild(LegLowerL);
		setRotationAngle(LegLowerL, -0.2618F, 0.0F, 0.0F);
		LegLowerL.setTextureOffset(53, 73).addBox(0.0F, -0.5F, -1.5F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		HoofBackLeft = new ModelRenderer(this);
		HoofBackLeft.setRotationPoint(0.0F, 7.5F, 0.25F);
		LegLowerL.addChild(HoofBackLeft);
		setRotationAngle(HoofBackLeft, 0.6545F, 0.0F, 0.0F);
		HoofBackLeft.setTextureOffset(17, 69).addBox(0.0F, -1.0632F, -1.1211F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		bodybase = new ModelRenderer(this);
		bodybase.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(bodybase);
		setRotationAngle(bodybase, -0.9599F, 0.0F, 0.0F);
		

		romp = new ModelRenderer(this);
		romp.setRotationPoint(0.0F, 0.0F, 0.0F);
		bodybase.addChild(romp);
		setRotationAngle(romp, -0.6109F, 0.0F, 0.0F);
		romp.setTextureOffset(0, 0).addBox(-6.75F, 4.0F, 7.0F, 8.0F, 23.0F, 9.0F, 0.0F, false);

		NeckBotom = new ModelRenderer(this);
		NeckBotom.setRotationPoint(0.0F, 11.8304F, 8.988F);
		bodybase.addChild(NeckBotom);
		setRotationAngle(NeckBotom, 0.3927F, 0.0F, 0.0F);
		NeckBotom.setTextureOffset(0, 53).addBox(-5.0F, -7.116F, -2.6908F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		NeckTop = new ModelRenderer(this);
		NeckTop.setRotationPoint(0.0F, -15.6964F, 1.0712F);
		NeckBotom.addChild(NeckTop);
		setRotationAngle(NeckTop, -0.6109F, 0.0F, 0.0F);
		

		NeckTop_r1 = new ModelRenderer(this);
		NeckTop_r1.setRotationPoint(666.0F, 5.5F, 9.0F);
		NeckTop.addChild(NeckTop_r1);
		setRotationAngle(NeckTop_r1, 0.4363F, 0.0F, 0.0F);
		NeckTop_r1.setTextureOffset(50, 38).addBox(-671.0F, -8.5F, -8.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(-179.5F, 1.25F, -0.75F);
		NeckTop.addChild(Head);
		setRotationAngle(Head, 0.7854F, 0.0F, 0.0F);
		

		Hair_r1 = new ModelRenderer(this);
		Hair_r1.setRotationPoint(180.0F, -8.7071F, 0.7929F);
		Head.addChild(Hair_r1);
		setRotationAngle(Hair_r1, 0.5236F, 0.0F, 0.0F);
		Hair_r1.setTextureOffset(51, 0).addBox(-3.5F, 3.0F, -1.25F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Mouth_r1 = new ModelRenderer(this);
		Mouth_r1.setRotationPoint(180.0F, 1.2929F, 6.2929F);
		Head.addChild(Mouth_r1);
		setRotationAngle(Mouth_r1, -0.6981F, 0.0F, 0.0F);
		Mouth_r1.setTextureOffset(26, 0).addBox(-4.0F, -0.3329F, -0.0436F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		Snout_r1 = new ModelRenderer(this);
		Snout_r1.setRotationPoint(180.0F, -0.7071F, -0.7071F);
		Head.addChild(Snout_r1);
		setRotationAngle(Snout_r1, -0.3491F, 0.0F, 0.0F);
		Snout_r1.setTextureOffset(57, 62).addBox(-5.0F, -4.0F, 3.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		Snout_r1.setTextureOffset(44, 15).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		Muzzle = new ModelRenderer(this);
		Muzzle.setRotationPoint(177.0F, -0.7071F, 9.2929F);
		Head.addChild(Muzzle);
		setRotationAngle(Muzzle, -0.9163F, 0.0F, 0.0F);
		Muzzle.setTextureOffset(21, 58).addBox(-1.0F, -0.2441F, -4.3728F, 2.0F, 2.0F, 8.0F, 0.0F, false);

		MuzleBottom_r1 = new ModelRenderer(this);
		MuzleBottom_r1.setRotationPoint(3.0F, 0.0F, -3.0F);
		Muzzle.addChild(MuzleBottom_r1);
		setRotationAngle(MuzleBottom_r1, 0.3054F, 0.0F, 0.0F);
		MuzleBottom_r1.setTextureOffset(36, 68).addBox(-4.0F, 2.0F, -0.25F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		MuzzleEnd_r1 = new ModelRenderer(this);
		MuzzleEnd_r1.setRotationPoint(3.0F, 1.0F, 4.0F);
		Muzzle.addChild(MuzzleEnd_r1);
		setRotationAngle(MuzzleEnd_r1, 0.48F, 0.0F, 0.0F);
		MuzzleEnd_r1.setTextureOffset(44, 28).addBox(-3.5F, -0.2441F, -1.1228F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		MuzzleEnd_r2 = new ModelRenderer(this);
		MuzzleEnd_r2.setRotationPoint(3.0F, 0.75F, 3.0F);
		Muzzle.addChild(MuzzleEnd_r2);
		setRotationAngle(MuzzleEnd_r2, -0.1745F, 0.0F, 0.0F);
		MuzzleEnd_r2.setTextureOffset(35, 0).addBox(-3.5F, -0.8941F, -0.2228F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		SnoutTop = new ModelRenderer(this);
		SnoutTop.setRotationPoint(180.0F, -1.2071F, 9.0429F);
		Head.addChild(SnoutTop);
		setRotationAngle(SnoutTop, -0.9163F, 0.0F, 0.0F);
		SnoutTop.setTextureOffset(0, 68).addBox(-5.0F, -0.1628F, -3.7515F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		Horns = new ModelRenderer(this);
		Horns.setRotationPoint(180.0F, -0.2071F, 2.0429F);
		Head.addChild(Horns);
		setRotationAngle(Horns, 0.3491F, 0.0F, 0.0F);
		Horns.setTextureOffset(43, 43).addBox(-5.0F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Horns.setTextureOffset(27, 43).addBox(-2.0F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(174.0F, 0.2929F, -1.2071F);
		Head.addChild(EarL);
		setRotationAngle(EarL, 0.3123F, 0.1586F, -0.4549F);
		

		EarL_r1 = new ModelRenderer(this);
		EarL_r1.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r1);
		setRotationAngle(EarL_r1, 0.0F, 0.3491F, 0.0F);
		EarL_r1.setTextureOffset(34, 58).addBox(-6.5F, -8.7412F, 0.8819F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		EarL_r2 = new ModelRenderer(this);
		EarL_r2.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r2);
		setRotationAngle(EarL_r2, -0.0873F, 0.3491F, 0.0F);
		EarL_r2.setTextureOffset(53, 28).addBox(-6.5F, -6.7912F, 1.2819F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		EarL_r3 = new ModelRenderer(this);
		EarL_r3.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r3);
		setRotationAngle(EarL_r3, 0.0873F, 0.3491F, 0.0F);
		EarL_r3.setTextureOffset(18, 33).addBox(-6.5F, -7.4912F, 1.5319F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		EarL2 = new ModelRenderer(this);
		EarL2.setRotationPoint(180.0F, 0.2929F, -1.2071F);
		Head.addChild(EarL2);
		setRotationAngle(EarL2, 0.3123F, -0.1586F, 0.4549F);
		

		EarL_r4 = new ModelRenderer(this);
		EarL_r4.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r4);
		setRotationAngle(EarL_r4, 0.0F, -0.3491F, 0.0F);
		EarL_r4.setTextureOffset(35, 15).addBox(5.5F, -8.7412F, 0.8819F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		EarL_r5 = new ModelRenderer(this);
		EarL_r5.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r5);
		setRotationAngle(EarL_r5, -0.0873F, -0.3491F, 0.0F);
		EarL_r5.setTextureOffset(0, 33).addBox(5.5F, -6.7912F, 1.2819F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		EarL_r6 = new ModelRenderer(this);
		EarL_r6.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r6);
		setRotationAngle(EarL_r6, 0.0873F, -0.3491F, 0.0F);
		EarL_r6.setTextureOffset(0, 0).addBox(5.5F, -7.4912F, 1.5319F, 1.0F, 6.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}