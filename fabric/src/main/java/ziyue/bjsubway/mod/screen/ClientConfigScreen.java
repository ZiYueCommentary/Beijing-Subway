package ziyue.bjsubway.mod.screen;

import me.shedaniel.clothconfig2.gui.entries.TextListEntry;
import org.mtr.core.data.Siding;
import org.mtr.mapping.holder.Screen;
import org.mtr.mapping.mapper.TextHelper;
import org.mtr.mod.client.MinecraftClientData;
import ziyue.bjsubway.mod.Reference;
import ziyue.centralconfig.ModuleCategory;
import ziyue.tjmetro.mapping.TextFormatter;

import java.util.Random;

import static ziyue.tjmetro.mod.screen.ClientConfigScreen.TIANJIN_METRO_CENTRAL_CONFIG;

/**
 * @author ZiYueCommentary
 * @since 1.0.0-beta-1
 */

public class ClientConfigScreen
{
    public static final ModuleCategory BEIJING_SUBWAY_CONFIG = new ModuleCategory(Reference.MOD_ID, () -> TextHelper.literal(TextHelper.translatable("config.category.bjsubway").getString()), (entryBuilder, category) -> {
        TextListEntry textFooter = entryBuilder.startTextDescription(TextFormatter.FOOTER_LINK.apply(ziyue.tjmetro.mod.config.ConfigClient.FOOTERS.get(new Random().nextInt(ziyue.tjmetro.mod.config.ConfigClient.FOOTERS.size())))).build();
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
