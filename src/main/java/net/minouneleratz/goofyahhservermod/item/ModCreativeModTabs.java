package net.minouneleratz.goofyahhservermod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minouneleratz.goofyahhservermod.GoofyAhhServerMod;
import net.minouneleratz.goofyahhservermod.block.ModBlocks;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GoofyAhhServerMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GOOFYAHHSERVERMOD_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GIANTFROGANTLER.get()))
                    .title(Component.translatable("creativetab.goofyahhservermod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GIANTFROGANTLER.get());
                        pOutput.accept(ModItems.GIANTFROGSCALE.get());

                        pOutput.accept(ModBlocks.MUDDY_SANDS.get());
                        pOutput.accept(ModBlocks.MUDDY_SANDS_BRICKS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
