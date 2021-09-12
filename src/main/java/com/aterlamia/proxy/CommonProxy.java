package com.aterlamia.proxy;

import com.aterlamia.event.PAEventHandler;
import com.aterlamia.init.ModEntities;
import com.aterlamia.init.ModItems;
import com.aterlamia.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class CommonProxy {
	public static CreativeTabs PURELYANIMALS;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new PAEventHandler());
		PURELYANIMALS = new CreativeTabs(Reference.MODID + ".tab") {

			@Override
			@SideOnly(Side.CLIENT)
			public void displayAllRelevantItems(NonNullList<ItemStack> itemList) {
				super.displayAllRelevantItems(itemList);
			}

			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Item.getItemFromBlock(Blocks.BRICK_BLOCK));
			}
		};
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModEntities.init();
		ModItems.register();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {

	}
}
