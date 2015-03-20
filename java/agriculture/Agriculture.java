package agriculture;

import agriculture.blocks.ModBlocks;
import agriculture.help.Reference;
import agriculture.items.ModItems;
import agriculture.proxy.CommonProxy;
import agriculture.tabs.AgricultureTab;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
public class Agriculture
{

    public static CreativeTabs tabAgriculture = new AgricultureTab(CreativeTabs.getNextID(), "tabAgriculture");

    @Mod.Instance("Agriculture")
    public static Agriculture instance;
    @SidedProxy(clientSide = "agriculture.proxy.ClientProxy", serverSide = "agriculture.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
