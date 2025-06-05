package ziyue.bjsubway.mod;

/**
 * @since 1.0.0-beta-1
 */

public interface BlockList
{

    static void registerBlocks() {
        // Calling this class to initialize constants
        BeijingSubway.LOGGER.info("Registering blocks");
    }
}
