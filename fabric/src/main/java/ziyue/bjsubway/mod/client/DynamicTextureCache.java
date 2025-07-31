package ziyue.bjsubway.mod.client;

import ziyue.bjsubway.mod.BeijingSubway;

/**
 * @since 1.0.0-beta-1
 */

public class DynamicTextureCache extends ziyue.tjmetro.mod.client.DynamicTextureCache
{
    public static DynamicTextureCache instance;

    public void reload() {
        font = null;
        fontCjk = null;
        BeijingSubway.LOGGER.debug("Refreshing dynamic resources");
        dynamicResources.values().forEach(dynamicResource -> dynamicResource.needsRefresh = true);
        generatingResources.clear();
    }
}
