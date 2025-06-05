package ziyue.bjsubway.mod;

public interface CreativeModeTabs
{
    //CreativeModeTabHolder TIANJIN_METRO = Registry.createCreativeModeTabHolder("tianjin_metro", () -> new ItemStack(new ItemConvertible(BlockList.LOGO.get().data)));

    static void registerCreativeModeTabs() {
        // Calling this class to initialize constants
        BeijingSubway.LOGGER.info("Registering creative mode tabs");
    }
}
