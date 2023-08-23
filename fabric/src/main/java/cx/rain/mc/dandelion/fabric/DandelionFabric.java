package cx.rain.mc.dandelion.fabric;

import cx.rain.mc.dandelion.Dandelion;
import net.fabricmc.api.ModInitializer;

public class DandelionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        new Dandelion().init();
    }
}
