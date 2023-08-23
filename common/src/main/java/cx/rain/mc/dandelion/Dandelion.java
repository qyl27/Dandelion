package cx.rain.mc.dandelion;

import cx.rain.mc.dandelion.block.ModBlocks;
import cx.rain.mc.dandelion.item.ModItems;
import cx.rain.mc.dandelion.item.tab.ModTabs;

public class Dandelion {
    public static final String MODID = "dandelion";
    
    public Dandelion() {
        
    }
    
    public void init() {
        ModBlocks.register();
        ModItems.register();
        ModTabs.register();
    }
}
