package finiteskies.fsmod.entity.passive;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEntitySquirrel extends ModelBase {
	  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer tail;
    ModelRenderer ear1;
    ModelRenderer ear2;
    ModelRenderer nose;
    public int textureWidth = 64;
    public int textureHeight = 32;
  
    protected double distanceMovedTotal = 0.0D;
    protected static final double CYCLES_PER_BLOCK = 3.0D; 
    protected int cycleIndex = 0;
    protected float[][] undulationCycle = new float[][]
    {
        { 45F, -45F, -45F, 0F, 45F, 45F, 0F, -45F },
        { 0F, 45F, -45F, -45F, 0F, 45F, 45F, 0F },
        { -45F, 90F, 0F, -45F, -45F, 0F, 45F, 45F },
        { -45F, 45F, 45F, 0F, -45F, -45F, 0F, 45F },
        { 0F, -45F, 45F, 45F, 0F, -45F, -45F, 0F },
        { 45F, -90F, 0F, 45F, 45F, 0F, -45F, -45F },
    };

    public ModelEntitySquirrel() {
    textureWidth = 64;
    textureHeight = 32;

      ear1 = new ModelRenderer(this, 16, 14);
      ear1.addBox(-1F, -2F, -1F, 1, 2, 1);
      ear1.setRotationPoint(-3F, 14.5F, -3F);
      ear1.setTextureSize(64, 32);
      ear1.mirror = true;
      setRotation(ear1, 0F, 0F, 0F);
     // convertToChild(head, ear1);

      ear2 = new ModelRenderer(this, 16, 14);
      ear2.addBox(0F, -2F, -1F, 1, 2, 1);
      ear2.setRotationPoint(1F, 14.5F, -3F);
      ear2.setTextureSize(64, 32);
      ear2.mirror = true;
      setRotation(ear2, 0F, 0F, 0F);
   //   convertToChild(head, ear2);

      nose = new ModelRenderer(this, 0, 10);
      nose.addBox(-1.5F, 0F, -1F, 3, 2, 1);
      nose.setRotationPoint(-1F, 16.7F, -5.5F);
      nose.setTextureSize(64, 32);
      nose.mirror = true;
      setRotation(nose, 0F, 0F, 0F);
   //   convertToChild(head, nose);        
      
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-3F, -3F, -2F, 6, 6, 4);
      head.setRotationPoint(-1F, 16.5F, -4F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
   //   convertToChild(body, head);   

      body = new ModelRenderer(this, 18, 14);
      body.addBox(-4F, -2F, -3F, 5, 7, 4);
      body.setRotationPoint(0.5F, 19F, -1F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 1.48353F, 0F, 0F);
      //convertToChild();
      
      leg1 = new ModelRenderer(this, 0, 18);
      leg1.addBox(-1F, 0F, -1F, 2, 3, 2);
      leg1.setRotationPoint(-3.5F, 21F, 3F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0.5235988F, 0F, 0F);
   //   convertToChild(body, leg1);

      leg2 = new ModelRenderer(this, 0, 18);
      leg2.addBox(-1F, 0F, -1F, 2, 3, 2);
      leg2.setRotationPoint(1.5F, 21F, 3F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0.5235988F, 0F, 0F);
   //   convertToChild(body, leg2);

      leg3 = new ModelRenderer(this, 0, 18);
      leg3.addBox(-1F, 0F, -1F, 2, 5, 2);
      leg3.setRotationPoint(-2.5F, 19F, -4F);
      leg3.setTextureSize(64, 32);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
   //   convertToChild(body, leg3);
 
      leg4 = new ModelRenderer(this, 0, 18);
      leg4.addBox(-1F, 0F, -1F, 2, 5, 2);
      leg4.setRotationPoint(0.5F, 19F, -4F);
      leg4.setTextureSize(64, 32);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
   //   convertToChild(body, leg4);
 
      tail = new ModelRenderer(this, 9, 18);
      tail.addBox(-1F, -3F, -1F, 3, 5, 2);
      tail.setRotationPoint(-1.5F, 17F, 3F);
      tail.setTextureSize(64, 32);
      tail.mirror = true;
      setRotation(tail, 3.141593F, 0F, 0F);
  //    convertToChild(body, tail);

  }
 
  @Override
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    tail.render(f5);
    ear1.render(f5);
    ear2.render(f5);
    nose.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
 
  @Override
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    //animate if moving
    updateDistanceMovedTotal(entity);
    cycleIndex = (int) ((getDistanceMovedTotal(entity)*CYCLES_PER_BLOCK)
            %undulationCycle.length);
      // DEBUG
      System.out.println("ModelSquirrel setRotationAngles(), distanceMoved ="
            +getDistanceMovedTotal(entity)+", cycleIndex ="+cycleIndex);
      leg1.rotateAngleZ = degToRad(undulationCycle[cycleIndex][0]) ;
      leg2.rotateAngleZ = degToRad(undulationCycle[cycleIndex][1]) ;
      leg3.rotateAngleZ = degToRad(undulationCycle[cycleIndex][2]) ;
      leg4.rotateAngleZ = degToRad(undulationCycle[cycleIndex][3]) ;
    
  }

  //This is really useful for converting the source from a Techne model export
  //which will have absolute rotation points that need to be converted before
  //creating the addChild() relationship
/*  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild) {
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
  */
  protected void updateDistanceMovedTotal(Entity parEntity) 
  {
      distanceMovedTotal += parEntity.getDistance(parEntity.prevPosX, parEntity.prevPosY, 
            parEntity.prevPosZ);
  }
  protected double getDistanceMovedTotal(Entity parEntity) 
  {
      return (distanceMovedTotal);
  }
  protected float degToRad(float degrees)
  {
      return degrees * (float)Math.PI / 180 ;
  }
}
