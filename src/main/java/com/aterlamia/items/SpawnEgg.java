package com.aterlamia.items;

import com.aterlamia.init.ModItems;
import com.aterlamia.utils.Reference;
import net.minecraft.util.ResourceLocation;
import org.zawamod.entity.painting.EntityZooPainting;
import org.zawamod.init.items.ItemCustomSpawnEgg;

public class SpawnEgg extends ItemCustomSpawnEgg {
    private final ResourceLocation resourceLoc;

    public SpawnEgg(String unloc, EntityZooPainting.EnumArt art) {
        super(unloc, Reference.MODID, art);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unloc));
        ModItems.ITEMS.add(this);
        resourceLoc = null;
    }

    public SpawnEgg(String pathIn) {
        super(pathIn, Reference.MODID);
        resourceLoc = new ResourceLocation(Reference.MODID, pathIn);

        this.setRegistryName(resourceLoc);
        ModItems.ITEMS.add(this);
    }
}
