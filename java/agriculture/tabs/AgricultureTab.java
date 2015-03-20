package agriculture.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class AgricultureTab extends CreativeTabs
{
    
    String name;

    public AgricultureTab(int par1, String par2Str)
    {
        super(par1, par2Str);
        this.name = par2Str;
    }

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        if (this.name == "tabAgriculture")
        {
            return Items.apple;
        }
        return null;
    }
}
