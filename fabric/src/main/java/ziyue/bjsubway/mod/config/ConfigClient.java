package ziyue.bjsubway.mod.config;

import org.mtr.mapping.holder.Screen;
import org.mtr.mapping.mapper.TextHelper;
import ziyue.bjsubway.mod.Reference;
import ziyue.bjsubway.mod.screen.ClientConfigScreen;
import ziyue.tjmetro.mapping.ModLoaderHelper;
import ziyue.tjmetro.mod.screen.MissingClothConfigScreen;
import ziyue.tjmetro.mod.config.ConfigClient.Property;
import ziyue.tjmetro.mod.config.ConfigClient.Footer;

import java.util.Arrays;
import java.util.List;

/**
 * @author ZiYueCommentary
 * @see Property
 * @since 1.0.0-beta-1
 */

public class ConfigClient
{
    public static final List<Footer> FOOTERS = Arrays.asList(
            new Footer(() -> TextHelper.literal("Daoli"), "")
    );

    public static Screen getConfigScreen(Screen parent) {
        if (ModLoaderHelper.hasClothConfig()) {
            return ClientConfigScreen.getClothConfigScreen(parent);
        }
        return new Screen(new MissingClothConfigScreen(parent));
    }
}
