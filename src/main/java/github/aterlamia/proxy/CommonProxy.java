package github.aterlamia.proxy;

import github.aterlamia.event.PAEventHandler;
import github.aterlamia.init.ModEntities;
import github.aterlamia.init.ModItems;
import github.aterlamia.utils.Reference;
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
		System.out.print("\nPREININT\n");
		MinecraftForge.EVENT_BUS.register(new PAEventHandler());
		PURELYANIMALS = new CreativeTabs(Reference.MODID + ".tab") {
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Item.getItemFromBlock(Blocks.BRICK_BLOCK));
			}

			@Override
			@SideOnly(Side.CLIENT)
			public void displayAllRelevantItems(NonNullList<ItemStack> itemList) {
				super.displayAllRelevantItems(itemList);
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
