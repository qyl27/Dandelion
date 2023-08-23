package cx.rain.mc.dandelion.block;

import cx.rain.mc.dandelion.Dandelion;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Dandelion.MODID, Registries.BLOCK);

    public static void register() {
        BLOCKS.register();
    }

    public static final RegistrySupplier<Block> DANDELION = BLOCKS.register(new ResourceLocation("minecraft:dandelion"), DandelionBlock::new);
}
