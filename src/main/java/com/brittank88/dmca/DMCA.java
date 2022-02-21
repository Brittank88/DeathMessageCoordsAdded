package com.brittank88.dmca;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DMCA implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("DMCA");

    @Override
    public void onInitialize() { LOGGER.info("DMCA initialized!"); }
}
