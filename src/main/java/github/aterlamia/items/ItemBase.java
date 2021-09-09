package github.aterlamia.items;

import github.aterlamia.PurelyAnimals;
import github.aterlamia.init.ModItems;
import github.aterlamia.utils.Reference;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name) {
        setRegistryName(Reference.MODID + ":" + name);
        setCreativeTab(PurelyAnimals.PROXY.PURELYANIMALS);
        ModItems.ITEMS.add(this);
    }
}
