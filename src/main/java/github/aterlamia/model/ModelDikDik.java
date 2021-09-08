// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class ModelDikDik extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
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
	private final ModelRenderer Hipr;
	private final ModelRenderer LegUpR;
	private final ModelRenderer LegDownR;
	private final ModelRenderer LegDownR_r1;
	private final ModelRenderer LegDownR2;
	private final ModelRenderer LegDownR_r2;
	private final ModelRenderer Hipr3;
	private final ModelRenderer HipR_r1;
	private final ModelRenderer LegUpR3;
	private final ModelRenderer LegDownR5;
	private final ModelRenderer LegDownR_r3;
	private final ModelRenderer LegDownR6;
	private final ModelRenderer LegDownR_r4;
	private final ModelRenderer Hipr4;
	private final ModelRenderer HipR_r2;
	private final ModelRenderer LegUpR4;
	private final ModelRenderer LegDownR7;
	private final ModelRenderer LegDownR_r5;
	private final ModelRenderer LegDownR8;
	private final ModelRenderer LegDownR_r6;
	private final ModelRenderer Hipr2;
	private final ModelRenderer LegUpR2;
	private final ModelRenderer LegDownR3;
	private final ModelRenderer LegDownR_r7;
	private final ModelRenderer LegDownR4;
	private final ModelRenderer LegDownR_r8;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r3_r2;
	private final ModelRenderer cube_r3_r2_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r2_r1_r1;

	public ModelDikDik() {
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -13.0F, 16.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 7.5F, -27.75F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(44, 28).addBox(-3.0F, -0.25F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.5F, 0.5F, -2.75F);
		Body.addChild(Head);
		

		Hair_r1 = new ModelRenderer(this);
		Hair_r1.setRotationPoint(0.0F, -8.0F, 1.5F);
		Head.addChild(Hair_r1);
		setRotationAngle(Hair_r1, 0.5236F, 0.0F, 0.0F);
		Hair_r1.setTextureOffset(51, 0).addBox(-3.5F, 3.0F, -1.25F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Mouth_r1 = new ModelRenderer(this);
		Mouth_r1.setRotationPoint(0.0F, 2.0F, 7.0F);
		Head.addChild(Mouth_r1);
		setRotationAngle(Mouth_r1, -0.6981F, 0.0F, 0.0F);
		Mouth_r1.setTextureOffset(26, 0).addBox(-4.0F, -0.3329F, -0.0436F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		Snout_r1 = new ModelRenderer(this);
		Snout_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Snout_r1);
		setRotationAngle(Snout_r1, -0.3491F, 0.0F, 0.0F);
		Snout_r1.setTextureOffset(57, 62).addBox(-5.0F, -4.0F, 3.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		Snout_r1.setTextureOffset(44, 15).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		Muzzle = new ModelRenderer(this);
		Muzzle.setRotationPoint(-3.0F, 0.0F, 10.0F);
		Head.addChild(Muzzle);
		setRotationAngle(Muzzle, -0.9163F, 0.0F, 0.0F);
		Muzzle.setTextureOffset(21, 58).addBox(-1.0F, -0.2441F, -4.3728F, 2.0F, 2.0F, 8.0F, 0.0F, false);

		MuzleBottom_r1 = new ModelRenderer(this);
		MuzleBottom_r1.setRotationPoint(3.0F, 0.0F, -3.0F);
		Muzzle.addChild(MuzleBottom_r1);
		setRotationAngle(MuzleBottom_r1, 0.3054F, 0.0F, 0.0F);
		MuzleBottom_r1.setTextureOffset(0, 68).addBox(-4.0F, 2.0F, -0.25F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		MuzzleEnd_r1 = new ModelRenderer(this);
		MuzzleEnd_r1.setRotationPoint(3.0F, 1.0F, 4.0F);
		Muzzle.addChild(MuzzleEnd_r1);
		setRotationAngle(MuzzleEnd_r1, 0.48F, 0.0F, 0.0F);
		MuzzleEnd_r1.setTextureOffset(35, 0).addBox(-3.5F, -0.2441F, -1.1228F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		MuzzleEnd_r2 = new ModelRenderer(this);
		MuzzleEnd_r2.setRotationPoint(3.0F, 0.75F, 3.0F);
		Muzzle.addChild(MuzzleEnd_r2);
		setRotationAngle(MuzzleEnd_r2, -0.1745F, 0.0F, 0.0F);
		MuzzleEnd_r2.setTextureOffset(42, 15).addBox(-3.5F, -0.8941F, -0.2228F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		SnoutTop = new ModelRenderer(this);
		SnoutTop.setRotationPoint(0.0F, -0.5F, 9.75F);
		Head.addChild(SnoutTop);
		setRotationAngle(SnoutTop, -0.9163F, 0.0F, 0.0F);
		SnoutTop.setTextureOffset(38, 68).addBox(-5.0F, -0.1628F, -3.7515F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		Horns = new ModelRenderer(this);
		Horns.setRotationPoint(0.0F, 0.5F, 2.75F);
		Head.addChild(Horns);
		setRotationAngle(Horns, 0.3491F, 0.0F, 0.0F);
		Horns.setTextureOffset(43, 43).addBox(-5.0F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Horns.setTextureOffset(27, 43).addBox(-2.0F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(-6.0F, 1.0F, -0.5F);
		Head.addChild(EarL);
		setRotationAngle(EarL, 0.3123F, 0.1586F, -0.4549F);
		

		EarL_r1 = new ModelRenderer(this);
		EarL_r1.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r1);
		setRotationAngle(EarL_r1, 0.0F, 0.3491F, 0.0F);
		EarL_r1.setTextureOffset(53, 28).addBox(-6.5F, -8.7412F, 0.8819F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		EarL_r2 = new ModelRenderer(this);
		EarL_r2.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r2);
		setRotationAngle(EarL_r2, -0.0873F, 0.3491F, 0.0F);
		EarL_r2.setTextureOffset(35, 15).addBox(-6.5F, -6.7912F, 1.2819F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		EarL_r3 = new ModelRenderer(this);
		EarL_r3.setRotationPoint(6.0F, 1.0F, 0.0F);
		EarL.addChild(EarL_r3);
		setRotationAngle(EarL_r3, 0.0873F, 0.3491F, 0.0F);
		EarL_r3.setTextureOffset(21, 56).addBox(-6.5F, -7.4912F, 1.5319F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		EarL2 = new ModelRenderer(this);
		EarL2.setRotationPoint(0.0F, 1.0F, -0.5F);
		Head.addChild(EarL2);
		setRotationAngle(EarL2, 0.3123F, -0.1586F, 0.4549F);
		

		EarL_r4 = new ModelRenderer(this);
		EarL_r4.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r4);
		setRotationAngle(EarL_r4, 0.0F, -0.3491F, 0.0F);
		EarL_r4.setTextureOffset(0, 0).addBox(5.5F, -8.7412F, 0.8819F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		EarL_r5 = new ModelRenderer(this);
		EarL_r5.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r5);
		setRotationAngle(EarL_r5, -0.0873F, -0.3491F, 0.0F);
		EarL_r5.setTextureOffset(0, 33).addBox(5.5F, -6.7912F, 1.2819F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		EarL_r6 = new ModelRenderer(this);
		EarL_r6.setRotationPoint(-6.0F, 1.0F, 0.0F);
		EarL2.addChild(EarL_r6);
		setRotationAngle(EarL_r6, 0.0873F, -0.3491F, 0.0F);
		EarL_r6.setTextureOffset(18, 33).addBox(5.5F, -7.4912F, 1.5319F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		Hipr = new ModelRenderer(this);
		Hipr.setRotationPoint(0.0F, 13.0F, -22.0F);
		Body.addChild(Hipr);
		Hipr.setTextureOffset(0, 34).addBox(-1.0F, -6.0F, -4.0F, 4.0F, 9.0F, 9.0F, 0.0F, false);

		LegUpR = new ModelRenderer(this);
		LegUpR.setRotationPoint(0.0F, 3.0F, 0.0F);
		Hipr.addChild(LegUpR);
		setRotationAngle(LegUpR, -0.4363F, 0.0F, 0.0F);
		LegUpR.setTextureOffset(58, 0).addBox(-0.5F, -2.0F, -3.0F, 3.0F, 8.0F, 6.0F, 0.0F, false);

		LegDownR = new ModelRenderer(this);
		LegDownR.setRotationPoint(0.0F, -23.0F, 22.0F);
		LegUpR.addChild(LegDownR);
		

		LegDownR_r1 = new ModelRenderer(this);
		LegDownR_r1.setRotationPoint(0.0F, 29.0F, -23.0F);
		LegDownR.addChild(LegDownR_r1);
		setRotationAngle(LegDownR_r1, -0.2618F, 0.0F, 0.0F);
		LegDownR_r1.setTextureOffset(77, 0).addBox(0.0F, -2.5F, -0.5F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		LegDownR2 = new ModelRenderer(this);
		LegDownR2.setRotationPoint(0.0F, 32.0F, -23.0F);
		LegDownR.addChild(LegDownR2);
		setRotationAngle(LegDownR2, 0.6545F, 0.0F, 0.0F);
		

		LegDownR_r2 = new ModelRenderer(this);
		LegDownR_r2.setRotationPoint(0.0F, -4.0F, 0.0F);
		LegDownR2.addChild(LegDownR_r2);
		setRotationAngle(LegDownR_r2, -0.2618F, 0.0F, 0.0F);
		LegDownR_r2.setTextureOffset(0, 77).addBox(0.0F, 5.5F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		Hipr3 = new ModelRenderer(this);
		Hipr3.setRotationPoint(0.0F, 10.75F, -8.0F);
		Body.addChild(Hipr3);
		setRotationAngle(Hipr3, 0.2182F, 0.0F, 0.0F);
		

		HipR_r1 = new ModelRenderer(this);
		HipR_r1.setRotationPoint(0.0F, -0.75F, -2.0F);
		Hipr3.addChild(HipR_r1);
		setRotationAngle(HipR_r1, 0.3491F, 0.0F, 0.0F);
		HipR_r1.setTextureOffset(27, 43).addBox(-1.0F, -0.8675F, -2.403F, 4.0F, 7.0F, 7.0F, 0.0F, false);

		LegUpR3 = new ModelRenderer(this);
		LegUpR3.setRotationPoint(0.0F, 4.25F, 2.0F);
		Hipr3.addChild(LegUpR3);
		setRotationAngle(LegUpR3, 0.0436F, 0.0F, 0.0F);
		LegUpR3.setTextureOffset(66, 48).addBox(-0.5F, -1.2756F, -3.1941F, 3.0F, 8.0F, 5.0F, 0.0F, false);

		LegDownR5 = new ModelRenderer(this);
		LegDownR5.setRotationPoint(0.0F, 5.0F, 0.0F);
		LegUpR3.addChild(LegDownR5);
		

		LegDownR_r3 = new ModelRenderer(this);
		LegDownR_r3.setRotationPoint(0.0F, 1.0F, -2.0F);
		LegDownR5.addChild(LegDownR_r3);
		setRotationAngle(LegDownR_r3, -0.2618F, 0.0F, 0.0F);
		LegDownR_r3.setTextureOffset(64, 73).addBox(0.0F, -1.75F, -0.5F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		LegDownR6 = new ModelRenderer(this);
		LegDownR6.setRotationPoint(0.0F, 7.0F, -2.75F);
		LegDownR5.addChild(LegDownR6);
		setRotationAngle(LegDownR6, -0.0436F, 0.0F, 0.0F);
		

		LegDownR_r4 = new ModelRenderer(this);
		LegDownR_r4.setRotationPoint(0.0F, -5.1301F, 1.8125F);
		LegDownR6.addChild(LegDownR_r4);
		setRotationAngle(LegDownR_r4, -0.2618F, 0.0F, 0.0F);
		LegDownR_r4.setTextureOffset(55, 73).addBox(0.0F, 4.4993F, -1.4673F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		Hipr4 = new ModelRenderer(this);
		Hipr4.setRotationPoint(-7.0F, 10.75F, -8.0F);
		Body.addChild(Hipr4);
		setRotationAngle(Hipr4, 0.2182F, 0.0F, 0.0F);
		

		HipR_r2 = new ModelRenderer(this);
		HipR_r2.setRotationPoint(0.0F, -0.75F, -2.0F);
		Hipr4.addChild(HipR_r2);
		setRotationAngle(HipR_r2, 0.3491F, 0.0F, 0.0F);
		HipR_r2.setTextureOffset(35, 0).addBox(-1.0F, -0.8675F, -2.403F, 4.0F, 7.0F, 7.0F, 0.0F, false);

		LegUpR4 = new ModelRenderer(this);
		LegUpR4.setRotationPoint(0.0F, 4.25F, 2.0F);
		Hipr4.addChild(LegUpR4);
		setRotationAngle(LegUpR4, 0.0436F, 0.0F, 0.0F);
		LegUpR4.setTextureOffset(64, 23).addBox(-0.5F, -1.2756F, -3.1941F, 3.0F, 8.0F, 5.0F, 0.0F, false);

		LegDownR7 = new ModelRenderer(this);
		LegDownR7.setRotationPoint(0.0F, 5.0F, 0.0F);
		LegUpR4.addChild(LegDownR7);
		

		LegDownR_r5 = new ModelRenderer(this);
		LegDownR_r5.setRotationPoint(0.0F, 1.0F, -2.0F);
		LegDownR7.addChild(LegDownR_r5);
		setRotationAngle(LegDownR_r5, -0.2618F, 0.0F, 0.0F);
		LegDownR_r5.setTextureOffset(26, 69).addBox(0.0F, -1.75F, -0.5F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		LegDownR8 = new ModelRenderer(this);
		LegDownR8.setRotationPoint(0.0F, 7.0F, -2.75F);
		LegDownR7.addChild(LegDownR8);
		setRotationAngle(LegDownR8, -0.0436F, 0.0F, 0.0F);
		

		LegDownR_r6 = new ModelRenderer(this);
		LegDownR_r6.setRotationPoint(0.0F, -5.1301F, 1.8125F);
		LegDownR8.addChild(LegDownR_r6);
		setRotationAngle(LegDownR_r6, -0.2618F, 0.0F, 0.0F);
		LegDownR_r6.setTextureOffset(17, 69).addBox(0.0F, 4.4993F, -1.4673F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		Hipr2 = new ModelRenderer(this);
		Hipr2.setRotationPoint(-7.0F, 13.0F, -22.0F);
		Body.addChild(Hipr2);
		Hipr2.setTextureOffset(26, 24).addBox(-1.0F, -6.0F, -4.0F, 4.0F, 9.0F, 9.0F, 0.0F, false);

		LegUpR2 = new ModelRenderer(this);
		LegUpR2.setRotationPoint(0.0F, 3.0F, 0.0F);
		Hipr2.addChild(LegUpR2);
		setRotationAngle(LegUpR2, -0.4363F, 0.0F, 0.0F);
		LegUpR2.setTextureOffset(44, 53).addBox(-0.5F, -2.0F, -3.0F, 3.0F, 8.0F, 6.0F, 0.0F, false);

		LegDownR3 = new ModelRenderer(this);
		LegDownR3.setRotationPoint(0.0F, -23.0F, 22.0F);
		LegUpR2.addChild(LegDownR3);
		

		LegDownR_r7 = new ModelRenderer(this);
		LegDownR_r7.setRotationPoint(0.0F, 29.0F, -23.0F);
		LegDownR3.addChild(LegDownR_r7);
		setRotationAngle(LegDownR_r7, -0.2618F, 0.0F, 0.0F);
		LegDownR_r7.setTextureOffset(76, 12).addBox(0.0F, -2.5F, -0.5F, 2.0F, 8.0F, 3.0F, 0.0F, false);

		LegDownR4 = new ModelRenderer(this);
		LegDownR4.setRotationPoint(0.0F, 32.0F, -23.0F);
		LegDownR3.addChild(LegDownR4);
		setRotationAngle(LegDownR4, 0.6545F, 0.0F, 0.0F);
		

		LegDownR_r8 = new ModelRenderer(this);
		LegDownR_r8.setRotationPoint(0.0F, -4.0F, 0.0F);
		LegDownR4.addChild(LegDownR_r8);
		setRotationAngle(LegDownR_r8, -0.2618F, 0.0F, 0.0F);
		LegDownR_r8.setTextureOffset(75, 73).addBox(0.0F, 5.25F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.9599F, 0.0F, 0.0F);
		

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -0.6109F, 0.0F, 0.0F);
		cube_r3_r1.setTextureOffset(0, 0).addBox(-6.75F, 4.0F, 7.0F, 8.0F, 23.0F, 9.0F, 0.0F, false);

		cube_r3_r2 = new ModelRenderer(this);
		cube_r3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2.addChild(cube_r3_r2);
		setRotationAngle(cube_r3_r2, -0.0873F, 0.0F, 0.0F);
		

		cube_r3_r2_r1 = new ModelRenderer(this);
		cube_r3_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r3_r2.addChild(cube_r3_r2_r1);
		setRotationAngle(cube_r3_r2_r1, 0.7418F, 0.0F, 0.0F);
		cube_r3_r2_r1.setTextureOffset(0, 53).addBox(-5.0F, 7.75F, -2.75F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.3927F, 0.0F, 0.0F);
		

		cube_r2_r1_r1 = new ModelRenderer(this);
		cube_r2_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2_r1.addChild(cube_r2_r1_r1);
		setRotationAngle(cube_r2_r1_r1, 0.1745F, 0.0F, 0.0F);
		cube_r2_r1_r1.setTextureOffset(50, 38).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);
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