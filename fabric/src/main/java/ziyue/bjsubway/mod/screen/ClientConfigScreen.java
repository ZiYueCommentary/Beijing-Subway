package ziyue.bjsubway.mod.screen;

import me.shedaniel.clothconfig2.gui.entries.TextListEntry;
import org.mtr.mapping.holder.Screen;
import org.mtr.mapping.mapper.TextHelper;
import ziyue.bjsubway.mod.Reference;
import ziyue.bjsubway.mod.config.ConfigClient;
import ziyue.centralconfig.ModuleCategory;
import ziyue.tjmetro.mapping.TextFormatter;

import java.util.Random;

import static ziyue.tjmetro.mod.screen.ClientConfigScreen.TIANJIN_METRO_CENTRAL_CONFIG;

/**
 * @author ZiYueCommentary
 * @since 1.0.0-beta-5
 */

public class ClientConfigScreen
{
    public static final ModuleCategory BEIJING_SUBWAY_CONFIG = new ModuleCategory(Reference.MOD_ID, () -> TextHelper.literal("Beijing Metro"), (entryBuilder, category) -> {
        TextListEntry textFooter = entryBuilder.startTextDescription(TextFormatter.FOOTER_LINK.apply(ConfigClient.FOOTERS.get(new Random().nextInt(ConfigClient.FOOTERS.size())))).build();
        category.addEntry(textFooter);
    });

    static {
        TIANJIN_METRO_CENTRAL_CONFIG.registerModuleCategory(BEIJING_SUBWAY_CONFIG);
    }

    public static void initialize() {

    }

    public static Screen getClothConfigScreen(Screen parent) {
        return TIANJIN_METRO_CENTRAL_CONFIG.getConfigScreen(parent, Reference.MOD_ID);
    }
}
