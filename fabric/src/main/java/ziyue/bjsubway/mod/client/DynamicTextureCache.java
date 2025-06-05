package ziyue.bjsubway.mod.client;

import org.mtr.libraries.it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import ziyue.bjsubway.mod.BeijingSubway;

import java.awt.*;

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
