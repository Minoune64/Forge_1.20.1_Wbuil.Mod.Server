package net.minouneleratz.goofyahhservermod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.minouneleratz.goofyahhservermod.GoofyAhhServerMod;
import net.minouneleratz.goofyahhservermod.block.ModBlocks;

public class ModBlocksStateProvider extends BlockStateProvider {


    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GoofyAhhServerMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.MUDDY_SANDS);
        blockWithItem(ModBlocks.MUDDY_SANDS_BRICKS);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
