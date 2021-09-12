package com.aterlamia.init;

import com.aterlamia.items.SpawnEgg;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<>();

	public static final Item DIKDIK_SPAWN_EGG = new SpawnEgg("dikdik");
	public static final Item EMU_SPAWN_EGG = new SpawnEgg("emu");;

	public static void register() {
	}
}
