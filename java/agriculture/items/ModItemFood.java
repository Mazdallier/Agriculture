package agriculture.items;

import agriculture.Agriculture;
import agriculture.help.Reference;
import net.minecraft.item.ItemFood;

public class ModItemFood extends ItemFood
{
    
    public ModItemFood(String unLocalizedName, int itemId, float recoveryOfHunger, boolean canEatWolf)
    {
        super(itemId, recoveryOfHunger, canEatWolf);
        setAlwaysEdible();
        setTextureName(Reference.ID + ":" + unLocalizedName);
        setUnlocalizedName(unLocalizedName);
        setCreativeTab(Agriculture.tabAgriculture);
    }
    
}
