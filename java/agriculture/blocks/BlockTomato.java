package agriculture.blocks;

import agriculture.help.Reference;
import agriculture.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;

public class BlockTomato extends BlockCrop
{
    private IIcon[] iconArray;

    public BlockTomato(String name)
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

    @Override
    public int getRenderType()
    {
        return 1;
    }

    @Override
    protected Item func_149866_i()
    {
        return ModItems.tomatoSeed;
    }

    @Override
    protected Item func_149865_P()
    {
        return ModItems.tomato;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z,
                                    EntityPlayer player, int side, float posX, float posY, float posZ)
    {
        if (world.getBlockMetadata(x, y, z) == 7)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
            EntityItem entityItemCrop = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(ModItems.okra, 1));
            EntityItem entityItemSeed = new EntityItem(world, player.posX, player.posY - 1.0D, player.posZ, new ItemStack(ModItems.okraSeed, 1));
            world.spawnEntityInWorld(entityItemCrop);
            world.spawnEntityInWorld(entityItemSeed);
            if (!(player instanceof FakePlayer))
            {
                entityItemCrop.onCollideWithPlayer(player);
                entityItemSeed.onCollideWithPlayer(player);
            }
            return true;
        }
        return false;
    }
}
