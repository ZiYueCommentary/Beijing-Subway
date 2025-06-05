package ziyue.bjsubway.fabric;

import net.fabricmc.api.ClientModInitializer;
import ziyue.bjsubway.mod.BeijingSubwayClient;
import ziyue.bjsubway.mod.client.Filters;

/**
 * @since 1.0.0-beta-1
 */

public final class MainFabricClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient() {
        BeijingSubwayClient.init();
        Filters.init();
    }
}
