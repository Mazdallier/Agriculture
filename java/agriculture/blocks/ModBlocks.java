package agriculture.blocks;

import agriculture.help.Reference;
import agriculture.help.RegisterHelper;

public class ModBlocks
{
    public static BlockRadish radishBlock = new BlockRadish(Reference.RADISH_BLOCK_NAME);
    public static BlockSoyBean soyBeanBlock = new BlockSoyBean(Reference.SOYBEAN_BLOCK_NAME);
    public static BlockCabbage cabbageBlock = new BlockCabbage(Reference.CABBAGE_BLOCK_NAME);
    public static BlockChineseCabbage chineseCabbageBlock = new BlockChineseCabbage(Reference.CHINESE_CABBAGE_BLOCK_NAME);
    public static BlockOkra okraBlock=  new BlockOkra(Reference.OKRA_BLOCK_NAME);
    public static BlockTomato tomatoBlock = new BlockTomato(Reference.TOMATO_BLOCK_NAME);
    public static BlockLettuce lettuceBlock = new BlockLettuce(Reference.LETTUCE_BLOCK_NAME);
    public static BlockAubergine aubergineBlock = new BlockAubergine(Reference.AUBERGINE_BLOCK_NAME);
    public static BlockSpinach spinachBlock = new BlockSpinach(Reference.SPINACH_BLOCK_NAME);
    public static BlockSweetGreenPepper sweetGreenPepperBlock = new BlockSweetGreenPepper(Reference.SWEET_GREEN_PEPPER_BLOCK_NAME);
    public static BlockPaprika paprikaBlock = new BlockPaprika(Reference.PAPRIKA_BLOCK_NAME);
    public static BlockBroccoli broccoliBlock = new BlockBroccoli(Reference.BROCCOLI_BLOCK_NAME);
    public static BlockAsparagus asparagusBlock = new BlockAsparagus(Reference.ASPARAGUS_BLOCK_NAME);
    public static BlockDragonFruit dragonFruitBlock = new BlockDragonFruit(Reference.DRAGON_FRUIT_BLOCK_NAME);
    public static BlockBitterGourd bitterGourdBlock = new BlockBitterGourd(Reference.BITTER_GOURD_BLOCK_NAME);

    public static void init()
    {
        RegisterHelper.registerBlock(radishBlock);
        RegisterHelper.registerBlock(soyBeanBlock);
        RegisterHelper.registerBlock(cabbageBlock);
        RegisterHelper.registerBlock(chineseCabbageBlock);
        RegisterHelper.registerBlock(okraBlock);
        RegisterHelper.registerBlock(tomatoBlock);
        RegisterHelper.registerBlock(lettuceBlock);
        RegisterHelper.registerBlock(aubergineBlock);
        RegisterHelper.registerBlock(spinachBlock);
        RegisterHelper.registerBlock(sweetGreenPepperBlock);
        RegisterHelper.registerBlock(paprikaBlock);
        RegisterHelper.registerBlock(broccoliBlock);
        RegisterHelper.registerBlock(asparagusBlock);
        RegisterHelper.registerBlock(dragonFruitBlock);
        RegisterHelper.registerBlock(bitterGourdBlock);
    }

}
