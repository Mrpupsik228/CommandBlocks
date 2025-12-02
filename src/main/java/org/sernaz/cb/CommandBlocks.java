package org.sernaz.cb;

import net.fabricmc.api.ModInitializer;
import org.sernaz.cb.block.ModBlocks;

public class CommandBlocks implements ModInitializer {
    public static final String MOD_ID = "cb";
    
    @Override
    public void onInitialize() {
        ModBlocks.initialize();
    }
}
