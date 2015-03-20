package agriculture.items;

import agriculture.blocks.ModBlocks;
import agriculture.help.Reference;
import agriculture.help.RegisterHelper;
import net.minecraft.init.Blocks;

public class ModItems
{
    //Seeds
    public static ModItemSeeds radishSeed = new ModItemSeeds(Reference.RADISH_SEED_NAME, ModBlocks.radishBlock, Blocks.farmland);
    public static ModItemSeeds soyBeanSeed = new ModItemSeeds(Reference.SOYBEAN_SEED_NAME, ModBlocks.soyBeanBlock, Blocks.farmland);
    public static ModItemSeeds cabbageSeed = new ModItemSeeds(Reference.CABBAGE_SEED_NAME, ModBlocks.cabbageBlock ,Blocks.farmland);
    public static ModItemSeeds chineseCabbageSeed = new ModItemSeeds(Reference.CHINESE_CABBAGE_SEED_NAME, ModBlocks.chineseCabbageBlock, Blocks.farmland);
    public static ModItemSeeds okraSeed = new ModItemSeeds(Reference.OKRA_SEED_NAME, ModBlocks.okraBlock, Blocks.farmland);
    public static ModItemSeeds tomatoSeed = new ModItemSeeds(Reference.TOMATO_SEED_NAME, ModBlocks.tomatoBlock, Blocks.farmland);
    public static ModItemSeeds lettuceSeed = new ModItemSeeds(Reference.LETTUCE_SEED_NAME, ModBlocks.lettuceBlock, Blocks.farmland);
    public static ModItemSeeds aubergineSeed = new ModItemSeeds(Reference.AUBERGINE_SEED_NAME, ModBlocks.aubergineBlock, Blocks.farmland);
    public static ModItemSeeds spinachSeed = new ModItemSeeds(Reference.SPINACH_SEED_NAME, ModBlocks.spinachBlock, Blocks.farmland);
    public static ModItemSeeds sweetGreenPepperSeed = new ModItemSeeds(Reference.SWEET_GREEN_PEPPER_Seed_NAME, ModBlocks.sweetGreenPepperBlock, Blocks.farmland);
    public static ModItemSeeds paprikaSeed = new ModItemSeeds(Reference.PAPRIKA_SEED_NAME, ModBlocks.paprikaBlock, Blocks.farmland);
    public static ModItemSeeds broccoliSeed = new ModItemSeeds(Reference.BROCCOLI_SEED_NAME, ModBlocks.broccoliBlock, Blocks.farmland);
    public static ModItemSeeds asparagusSeed = new ModItemSeeds(Reference.ASPARAGUS_SEED_NAME, ModBlocks.asparagusBlock, Blocks.farmland);
    public static ModItemSeeds dragonFruitSeed = new ModItemSeeds(Reference.DRAGON_FRUIT_SEED_NAME, ModBlocks.dragonFruitBlock, Blocks.farmland);
    public static ModItemSeeds bitterGourdSeed = new ModItemSeeds(Reference.BITTER_GOURD_SEED_NAME, ModBlocks.bitterGourdBlock, Blocks.farmland);

    //Food
    public static ModItemFood radish = new ModItemFood(Reference.RADISH_NAME, 1, 0.3F, false);
    public static ModItemFood soyBean = new ModItemFood(Reference.SOYBEAN_NAME, 2,0.4F, false);
    public static ModItemFood cabbage = new ModItemFood(Reference.CABBAGE_NAME, 3, 0.2F, false);
    public static ModItemFood chineseCabbage = new ModItemFood(Reference.CHINESE_CABBAGE_NAME, 4, 0.2F, false);
    public static ModItemFood okra = new ModItemFood(Reference.OKRA_NAME, 5, 0.5F,false);
    public static ModItemFood tomato = new ModItemFood(Reference.TOMATO_NAME, 6, 0.2F, false);
    public static ModItemFood lettuce = new ModItemFood(Reference.LETTUCE_NAME, 7, 0.5F,false);
    public static ModItemFood aubergine = new ModItemFood(Reference.AUBERGINE_NAME, 8, 0.2F, false);
    public static ModItemFood spinach = new ModItemFood(Reference.SPINACH_NAME, 9, 0.8F,false);
    public static ModItemFood sweetGreenPepper = new ModItemFood(Reference.SWEET_GREEN_PEPPER_NAME, 10, 0.35F, false);
    public static ModItemFood paprika = new ModItemFood(Reference.PAPRIKA_NAME, 11, 0.31F,false);
    public static ModItemFood broccoli = new ModItemFood(Reference.BROCCOLI_NAME, 12, 0.23F, false);
    public static ModItemFood asparagus = new ModItemFood(Reference.ASPARAGUS_NAME, 13, 0.24F,false);
    public static ModItemFood dragonFruit = new ModItemFood(Reference.DRAGON_FRUIT_NAME, 14, 0.25F, false);
    public static ModItemFood bitterGourd = new ModItemFood(Reference.BITTER_GOURD_NAME, 15, 0.42F, false);

    public static void init()
    {
        //Seeds
        RegisterHelper.registerItem(radishSeed);
        RegisterHelper.registerItem(soyBeanSeed);
        RegisterHelper.registerItem(cabbageSeed);
        RegisterHelper.registerItem(chineseCabbageSeed);
        RegisterHelper.registerItem(okraSeed);
        RegisterHelper.registerItem(tomatoSeed);
        RegisterHelper.registerItem(lettuceSeed);
        RegisterHelper.registerItem(aubergineSeed);
        RegisterHelper.registerItem(spinachSeed);
        RegisterHelper.registerItem(sweetGreenPepperSeed);
        RegisterHelper.registerItem(paprikaSeed);
        RegisterHelper.registerItem(broccoliSeed);
        RegisterHelper.registerItem(bitterGourdSeed);

        //Food
        RegisterHelper.registerItemFood(radish);
        RegisterHelper.registerItemFood(soyBean);
        RegisterHelper.registerItemFood(cabbage);
        RegisterHelper.registerItemFood(chineseCabbage);
        RegisterHelper.registerItemFood(okra);
        RegisterHelper.registerItemFood(tomato);
        RegisterHelper.registerItemFood(lettuce);
        RegisterHelper.registerItemFood(aubergine);
        RegisterHelper.registerItemFood(spinach);
        RegisterHelper.registerItemFood(sweetGreenPepper);
        RegisterHelper.registerItemFood(paprika);
        RegisterHelper.registerItemFood(broccoli);
        RegisterHelper.registerItemFood(bitterGourd);
        
        //Recipes
        initItemRecipes();
    }

    private static void initItemRecipes()
    {
        
    }

}
