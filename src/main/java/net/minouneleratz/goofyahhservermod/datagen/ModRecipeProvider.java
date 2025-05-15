package net.minouneleratz.goofyahhservermod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.StonecutterRecipe;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minouneleratz.goofyahhservermod.GoofyAhhServerMod;
import net.minouneleratz.goofyahhservermod.block.ModBlocks;
import net.minouneleratz.goofyahhservermod.item.ModItems;
import org.apache.commons.lang3.ObjectUtils;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MUDDY_SANDS.get())
                .pattern("SM")
                .pattern("MS")
                .define('S', Blocks.SAND)
                .define('M', Blocks.MUD)
                .unlockedBy(getHasName(Blocks.MUD), has(Blocks.MUD))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MUDDY_SANDS_BRICKS.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.MUDDY_SANDS.get())
                .unlockedBy(getHasName(Items.MUD), has(Items.MUD))
                .save(pWriter);

        }
}
