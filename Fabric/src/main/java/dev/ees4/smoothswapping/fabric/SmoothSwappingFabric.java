package dev.ees4.smoothswapping.fabric;

import dev.ees4.smoothswapping.SmoothSwapping;
import net.fabricmc.api.ClientModInitializer;

public class SmoothSwappingFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        SmoothSwapping.init();
    }
}