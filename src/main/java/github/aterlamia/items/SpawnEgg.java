package github.aterlamia.items;

import github.aterlamia.PurelyAnimals;
import github.aterlamia.init.ModItems;
import github.aterlamia.proxy.CommonProxy;
import github.aterlamia.utils.Reference;
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
        setCreativeTab(CommonProxy.PURELYANIMALS);
    }

    public SpawnEgg(String pathIn) {
        super(pathIn, Reference.MODID);
        resourceLoc = new ResourceLocation(Reference.MODID, pathIn);

        this.setRegistryName(resourceLoc);
        setCreativeTab(CommonProxy.PURELYANIMALS);
        ModItems.ITEMS.add(this);
    }
}
