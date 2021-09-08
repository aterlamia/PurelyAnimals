// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r3_r2;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(21, 40).addBox(1.0F, 8.0F, -26.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		bb_main.setTextureOffset(21, 40).addBox(1.0F, 15.0F, -26.0F, 2.0F, 20.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.5F, 9.75F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.9163F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(36, 51).addBox(-5.0F, -0.1628F, -3.7515F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
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
		cube_r3_r2.setTextureOffset(35, 0).addBox(-5.0F, 4.5F, 3.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r2.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.3927F, 0.0F, 0.0F);
		cube_r2_r1.setTextureOffset(0, 33).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.0F, -2.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3123F, -0.1586F, 0.4549F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(40, 40).addBox(-5.0F, -4.0F, 3.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 48).addBox(-4.0F, -2.0F, 5.5F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r4.setTextureOffset(29, 27).addBox(-6.0F, -6.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.0F, -1.0F, 0.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3123F, 0.1586F, -0.4549F);
		

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(6.0F, 4.0F, 0.0F);
		cube_r5.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.0F, 0.6981F, 0.0F);
		cube_r5_r1.setTextureOffset(26, 0).addBox(-6.5F, -9.4912F, -2.3681F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -1.0F, 0.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3123F, -0.1586F, 0.4549F);
		

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(-6.0F, 4.0F, 0.0F);
		cube_r9.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.0F, -0.6981F, 0.0F);
		cube_r6_r1.setTextureOffset(0, 0).addBox(5.5F, -9.4912F, -2.3681F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(33, 0).addBox(-5.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(0, 33).addBox(-2.0F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 3.0F, 8.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.5672F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(33, 40).addBox(-4.0F, -0.5829F, -1.0436F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.0F, 0.0F, 10.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.9163F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(35, 15).addBox(-1.0F, -0.2441F, -4.3728F, 2.0F, 2.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}