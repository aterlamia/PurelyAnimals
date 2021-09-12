package com.aterlamia.items;

import com.aterlamia.PurelyAnimals;
import com.aterlamia.init.ModItems;
import com.aterlamia.utils.Reference;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name) {
        setRegistryName(Reference.MODID + ":" + name);
        setCreativeTab(PurelyAnimals.PROXY.PURELYANIMALS);
        ModItems.ITEMS.add(this);
    }
}
