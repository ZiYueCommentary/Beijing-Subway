package ziyue.bjsubway.mod;

import org.mtr.mapping.holder.RenderLayer;
import ziyue.bjsubway.mod.screen.ClientConfigScreen;
import ziyue.tjmetro.mapping.ModLoaderHelper;

/**
 * @since 1.0.0-beta-1
 */

public final class BeijingSubwayClient
{
    public static void init() {
        if (ModLoaderHelper.hasClothConfig()) {
            ClientConfigScreen.initialize();
        }

        RegistryClient.registerBlockRenderType(RenderLayer.getCutout(), BlockList.LOGO);

        RegistryClient.setupPackets("packet");

        RegistryClient.REGISTRY_CLIENT.init();
    }
}
