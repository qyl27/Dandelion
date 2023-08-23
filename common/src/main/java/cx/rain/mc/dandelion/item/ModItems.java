package cx.rain.mc.dandelion.item;

import cx.rain.mc.dandelion.Dandelion;
import cx.rain.mc.dandelion.block.ModBlocks;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Dandelion.MODID, Registries.ITEM);

    public static void register() {
        ITEMS.register();
    }

    public static final RegistrySupplier<Item> DANDELION = ITEMS.register(new ResourceLocation("minecraft:dandelion"), () -> new BlockItem(ModBlocks.DANDELION.get(), new Item.Properties()));
}
