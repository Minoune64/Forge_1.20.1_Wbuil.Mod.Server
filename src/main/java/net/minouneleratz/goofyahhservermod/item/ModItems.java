package net.minouneleratz.goofyahhservermod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minouneleratz.goofyahhservermod.GoofyAhhServerMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GoofyAhhServerMod.MOD_ID);

    public static final RegistryObject<Item>  GIANTFROGSCALE = ITEMS.register("giant_frog_scale",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GIANTFROGANTLER = ITEMS.register("giant_frog_antler",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
