package ziyue.bjsubway.mod;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.registry.BlockRegistryObject;
import ziyue.tjmetro.mod.block.BlockLogo;

/**
 * @since 1.0.0-beta-1
 */

public interface BlockList
{
    BlockRegistryObject LOGO = Registry.registerBlockWithBlockItem("logo", () -> new Block(new BlockLogo()), BeijingSubway.CREATIVE_MODE_TAB);

    static void registerBlocks() {
        // Calling this class to initialize constants
        BeijingSubway.LOGGER.info("Registering blocks");
    }
}
