package com.aterlamia.utils;

import com.aterlamia.entity.EntityDikDik;
import com.aterlamia.entity.EntityEmu;
import net.minecraft.util.ResourceLocation;
import org.zawamod.ZAWAMain;

public class AnimalPack {
    public static final org.zawamod.entity.core.AnimalPack DIKDIK = ZAWAMain.registerPack(EntityDikDik.class, new ResourceLocation(Reference.MODID, "data/animal/dikdik.json")).applyVariantSetup();
    public static final org.zawamod.entity.core.AnimalPack EMU =  ZAWAMain.registerPack(EntityEmu.class, new ResourceLocation(Reference.MODID, "data/animal/emu.json")).applyVariantSetup();
}
