package net.minouneleratz.goofyahhservermod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minouneleratz.goofyahhservermod.GoofyAhhServerMod;
import net.minouneleratz.goofyahhservermod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GoofyAhhServerMod.MOD_ID);

    public static final RegistryObject<Block> MUDDY_SANDS = registerBlock("muddy_sands",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD).sound(SoundType.SAND)));
    public static final RegistryObject<Block> MUDDY_SANDS_BRICKS = registerBlock("muddy_sands_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    };

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name , RegistryObject<T> block){

        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }
}
