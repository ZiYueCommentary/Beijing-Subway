package ziyue.bjsubway.mod.client;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.TextHelper;
import ziyue.bjsubway.mod.BeijingSubway;
import ziyue.bjsubway.mod.BlockList;
import ziyue.bjsubway.mod.config.ConfigClient;
import ziyue.filters.Filter;
import ziyue.tjmetro.mapping.FilterBuilder;

import static ziyue.tjmetro.mod.ItemList.WRENCH;

public interface Filters
{
    PressAction OPTION_BUTTON_ACTION = button -> MinecraftClient.getInstance().openScreen(ConfigClient.getConfigScreen(MinecraftClient.getInstance().getCurrentScreenMapped()));
    Filter DECORATION = FilterBuilder.registerFilter(BeijingSubway.CREATIVE_MODE_TAB, TextHelper.translatable("filter.tjmetro.tianjin_decoration"), () -> new ItemStack(new ItemConvertible(BlockList.LOGO.get().data)));

    static void init() {
        FilterBuilder.registerUncategorizedItemsFilter(BeijingSubway.CREATIVE_MODE_TAB);

        FilterBuilder.setReservedButton(BeijingSubway.CREATIVE_MODE_TAB, TextHelper.translatable("button.bjsubway.options"), OPTION_BUTTON_ACTION);

        FilterBuilder.addBlocks(Filters.DECORATION, BlockList.LOGO);
    }
}
