package finiteskies.fsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelEntitySquirrel extends ModelBase
{
	  //fields
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 0.0F;
  
  public ModelEntitySquirrel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      WolfHead = new ModelRenderer(this, 0, 0);
      WolfHead.addBox(-3F, -3F, -2F, 6, 6, 4);
      WolfHead.setRotationPoint(-1F, 16.5F, -4F);
      WolfHead.setTextureSize(64, 32);
      WolfHead.mirror = true;
      setRotation(WolfHead, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 18, 14);
      Body.addBox(-4F, -2F, -3F, 5, 7, 4);
      Body.setRotationPoint(0.5F, 19F, -1F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 1.48353F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 18);
      Leg1.addBox(-1F, 0F, -1F, 2, 3, 2);
      Leg1.setRotationPoint(-3.5F, 21F, 3F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0.5235988F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 18);
      Leg2.addBox(-1F, 0F, -1F, 2, 3, 2);
      Leg2.setRotationPoint(1.5F, 21F, 3F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0.5235988F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 18);
      Leg3.addBox(-1F, 0F, -1F, 2, 5, 2);
      Leg3.setRotationPoint(-2.5F, 19F, -4F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 0, 18);
      Leg4.addBox(-1F, 0F, -1F, 2, 5, 2);
      Leg4.setRotationPoint(0.5F, 19F, -4F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 9, 18);
      Tail.addBox(-1F, -3F, -1F, 3, 5, 2);
      Tail.setRotationPoint(-1.5F, 17F, 2.8F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 3.141593F, 0F, 0F);
      Ear1 = new ModelRenderer(this, 16, 14);
      Ear1.addBox(-1F, -2F, -1F, 1, 2, 1);
      Ear1.setRotationPoint(-3F, 14.5F, -3F);
      Ear1.setTextureSize(64, 32);
      Ear1.mirror = true;
      setRotation(Ear1, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 16, 14);
      Ear2.addBox(0F, -2F, -1F, 1, 2, 1);
      Ear2.setRotationPoint(1F, 14.5F, -3F);
      Ear2.setTextureSize(64, 32);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 10);
      Nose.addBox(-1.5F, 0F, -1F, 3, 2, 1);
      Nose.setRotationPoint(-1F, 16.7F, -5.5F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);

      convertToChild(WolfHead, Ear1);
      convertToChild(WolfHead, Ear2);
      convertToChild(WolfHead, Nose);

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float scale)
  {
    super.render(entity, f, f1, f2, f3, f4, scale);
    setRotationAngles(f, f1, f2, f3, f4, scale, entity);


    if (this.isChild)
    {
        float f11 = 2.0F;
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0F, this.childYOffset * scale, this.childZOffset * scale);
        GlStateManager.scale(0.7F, 0.7F, 0.7F);
        WolfHead.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.scale(0.5F, 0.5F, 0.5F);
        GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
        Body.render(scale);
        Leg1.render(scale);
        Leg2.render(scale);
        Leg3.render(scale);
        Leg4.render(scale);
        Tail.render(scale);
        GlStateManager.popMatrix();
    }
    else
    {
        WolfHead.render(scale);
        Body.render(scale);
        Leg1.render(scale);
        Leg2.render(scale);
        Leg3.render(scale);
        Leg4.render(scale);
        Tail.render(scale);
    }
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
  {
    super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
    this.WolfHead.rotateAngleX = headPitch * 0.017453292F;
    this.WolfHead.rotateAngleY = netHeadYaw * 0.017453292F;
    this.Body.rotateAngleX = ((float)Math.PI / 2F);
    this.Leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    this.Leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.Leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.Leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }
  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
  {
     // move child rotation point to be relative to parent
     parChild.rotationPointX -= parParent.rotationPointX;
     parChild.rotationPointY -= parParent.rotationPointY;
     parChild.rotationPointZ -= parParent.rotationPointZ;
     // make rotations relative to parent
     parChild.rotateAngleX -= parParent.rotateAngleX;
     parChild.rotateAngleY -= parParent.rotateAngleY;
     parChild.rotateAngleZ -= parParent.rotateAngleZ;
     // create relationship
     parParent.addChild(parChild);
  }

}
