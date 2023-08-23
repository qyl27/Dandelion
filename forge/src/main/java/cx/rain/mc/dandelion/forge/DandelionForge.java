package cx.rain.mc.dandelion.forge;

import dev.architectury.platform.forge.EventBuses;
import cx.rain.mc.dandelion.Dandelion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Dandelion.MODID)
public class DandelionForge {
    public DandelionForge() {
        EventBuses.registerModEventBus(Dandelion.MODID, FMLJavaModLoadingContext.get().getModEventBus());
        new Dandelion().init();
    }
}
