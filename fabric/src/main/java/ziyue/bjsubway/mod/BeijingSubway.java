package ziyue.bjsubway.mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @since 1.0.0-beta-1
 */

public final class BeijingSubway
{
    public static final Logger LOGGER = LogManager.getLogger(Reference.NAME);

    public static void init() {
        LOGGER.info("Beijing Metro launched!");

        CreativeModeTabs.registerCreativeModeTabs();
        Registry.REGISTRY_TABS.init();

        BlockList.registerBlocks();
        ItemList.registerItems();
        BlockEntityTypes.registerBlockEntities();
        EntityTypes.registerEntities();

        Registry.setupPackets("packet");

        Registry.init();
    }
}
