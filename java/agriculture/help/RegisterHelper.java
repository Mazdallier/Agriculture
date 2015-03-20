package agriculture.help;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterHelper
{

    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block, Reference.ID + "." + block.getUnlocalizedName());
    }

    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, Reference.ID + "." + item.getUnlocalizedName());
    }

    public static void registerItemFood(Item item)
    {
        GameRegistry.registerItem(item, Reference.ID + "." + item.getUnlocalizedName());
    }

}

