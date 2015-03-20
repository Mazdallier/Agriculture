package agriculture.blocks;

import agriculture.help.Reference;
import agriculture.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockDragonFruit extends BlockCrop
{
    private IIcon[] iconArray;

    public BlockDragonFruit(String name)
    {
        super();
        setHardness(0.0f);
        setBlockName(name);
        setStepSound(Block.soundTypeGrass);
        setTickRandomly(true);
    }

    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.iconArray = new IIcon[8];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = par1IconRegister.registerIcon(Reference.ID + ":" + this.getUnlocalizedName() + "_stage_" + i);
        }
    }

    @Override
    public IIcon getIcon(int par1, int par2)
    {
        if (par2 < 0 || par2 > 7)
        {
            par2 = 7;
        }
        return this.iconArray[par2];
    }

    public int getRenderType()
    {
        return 6;
    }

    @Override
    protected Item func_149866_i()
    {
        return ModItems.dragonFruitSeed;
    }

    @Override
    protected Item func_149865_P()
    {
        return ModItems.dragonFruit;
    }
}
