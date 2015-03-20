package agriculture.items;

import agriculture.Agriculture;
import agriculture.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSeeds;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

public class ModItemSeeds extends ItemSeeds
{

    private Block field_150925_a;
    private Block soilBlockId;

    public ModItemSeeds(String unLocalizedName, Block p_i45352_1_, Block p_i45352_2_)
    {
        super(p_i45352_1_, p_i45352_2_);
        this.field_150925_a = p_i45352_1_;
        this.soilBlockId = p_i45352_2_;
        this.setTextureName(Reference.ID + ":" + unLocalizedName);
        this.setUnlocalizedName(unLocalizedName);
        this.setCreativeTab(Agriculture.tabAgriculture);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z)
    {
        return EnumPlantType.Crop;
    }

    @Override
    public Block getPlant(IBlockAccess world, int x, int y, int z)
    {
        return field_150925_a;
    }

    @Override
    public int getPlantMetadata(IBlockAccess world, int x, int y, int z)
    {
        return 0;
    }

}
