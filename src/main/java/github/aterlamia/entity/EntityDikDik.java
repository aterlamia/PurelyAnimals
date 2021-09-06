package github.aterlamia.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityDikDik extends EntityCow {
    public EntityDikDik(World worldIn) {
        super(worldIn);
    }
//
//    @Override
//    protected void entityInit() {
//
//    }
//
//    @Override
//    protected void readEntityFromNBT(NBTTagCompound compound) {
//
//    }
//
//    @Override
//    protected void writeEntityToNBT(NBTTagCompound compound) {
//
//    }


    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new EntityDikDik(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return super.getHurtSound(damageSourceIn);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }
}
