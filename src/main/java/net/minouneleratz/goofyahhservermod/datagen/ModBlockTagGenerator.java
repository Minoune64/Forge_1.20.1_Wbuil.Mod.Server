package net.minouneleratz.goofyahhservermod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minouneleratz.goofyahhservermod.GoofyAhhServerMod;
import net.minouneleratz.goofyahhservermod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {


    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GoofyAhhServerMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.MUDDY_SANDS.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MUDDY_SANDS_BRICKS.get());
    }
}
