package cx.rain.mc.dandelion.item.tab;

import cx.rain.mc.dandelion.Dandelion;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Dandelion.MODID, Registries.CREATIVE_MODE_TAB);

    public static void register() {
        TABS.register();
    }
}
