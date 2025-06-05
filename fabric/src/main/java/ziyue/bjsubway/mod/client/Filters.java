package ziyue.bjsubway.mod.client;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.TextHelper;
import ziyue.bjsubway.mod.CreativeModeTabs;
import ziyue.bjsubway.mod.config.ConfigClient;
import ziyue.tjmetro.mapping.FilterBuilder;

public interface Filters
{
    PressAction OPTION_BUTTON_ACTION = button -> MinecraftClient.getInstance().openScreen(ConfigClient.getConfigScreen(MinecraftClient.getInstance().getCurrentScreenMapped()));

    static void init() {
        //FilterBuilder.setReservedButton(CreativeModeTabs.TIANJIN_METRO, TextHelper.translatable("button.tjmetro.tianjin_metro_options"), OPTION_BUTTON_ACTION);
    }
}
