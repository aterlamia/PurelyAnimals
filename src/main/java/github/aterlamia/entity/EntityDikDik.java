package github.aterlamia.entity;

import github.aterlamia.entity.base.BaseLandAnimal;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.zawamod.entity.ai.EntityAIRapidEatGrass;
import org.zawamod.entity.core.AnimalPack;

import javax.annotation.Nullable;

public class EntityDikDik extends BaseLandAnimal {
    public EntityDikDik(World worldIn) {
        super(worldIn);
        this.setSize(0.9f, 2.0f);
    }
    private EntityAIRapidEatGrass entityAIEatGrass;
    @Override
    public float getEyeHeight() {
        return this.height * 0.8F;
    }

    @Override
    public EntityDikDik createChild(EntityAgeable ageable) {
        return new EntityDikDik(world);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() { //TODO
        return null;
    }


    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return null;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return null;
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.entityAIEatGrass = new EntityAIRapidEatGrass(this);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(10, this.entityAIEatGrass);
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return github.aterlamia.utils.AnimalPack.DIKDIK;
    }


}
