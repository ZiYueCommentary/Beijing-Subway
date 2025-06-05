package ziyue.bjsubway.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import ziyue.bjsubway.mod.BeijingMetro;
import ziyue.bjsubway.mod.BeijingMetroClient;
import ziyue.bjsubway.mod.Reference;
import ziyue.bjsubway.mod.client.Filters;

/**
 * @since 1.0.0-beta-1
 */

@Mod(Reference.MOD_ID)
public final class MainForge
{
    public static boolean filterInitialized = false;

    public MainForge() {
        BeijingMetro.init();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            BeijingMetroClient.init();
            MainForgeClient.registerConfigMenu();
        });
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void afterRegistry(
#if MC_VERSION <= "11701"
        net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent.Post event
#elif MC_VERSION <= "11802"
        net.minecraftforge.client.event.ScreenEvent.DrawScreenEvent.Post event
#elif MC_VERSION <= "12004"
        net.minecraftforge.client.event.ScreenEvent.Init.Post event
#endif
    ) {
        if (filterInitialized) return;
        Filters.init();
        filterInitialized = true;
    }
}
