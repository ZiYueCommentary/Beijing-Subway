package ziyue.bjsubway.mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mtr.mapping.holder.ItemConvertible;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.registry.CreativeModeTabHolder;

/**
 * @since 1.0.0-beta-1
 */

public final class BeijingSubway
{
    public static final Logger LOGGER = LogManager.getLogger(Reference.NAME);
    public static final CreativeModeTabHolder CREATIVE_MODE_TAB = Registry.createCreativeModeTabHolder("beijing_subway", () -> new ItemStack(new ItemConvertible(BlockList.LOGO.get().data)));

    public static void init() {
        LOGGER.info("Beijing Metro launched!");

        Registry.REGISTRY_TABS.init();

        BlockList.registerBlocks();
        ItemList.registerItems();
        BlockEntityTypes.registerBlockEntities();
        EntityTypes.registerEntities();

        Registry.setupPackets("packet");

        Registry.init();
    }
}
