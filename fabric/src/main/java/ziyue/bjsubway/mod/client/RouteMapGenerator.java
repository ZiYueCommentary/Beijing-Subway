package ziyue.bjsubway.mod.client;

import org.mtr.mod.config.Config;
import org.mtr.mod.data.IGui;

/**
 * @author ZiYueCommentary
 * @see org.mtr.mod.client.RouteMapGenerator
 * @since 1.0.0-beta-1
 */

public class RouteMapGenerator implements IGui
{
    protected static int scale;
    protected static int lineSize;
    protected static int lineSpacing;
    protected static int fontSizeBig;
    protected static int fontSizeSmall;

    public static void setConstants() {
        scale = (int) Math.pow(2, Config.getClient().getDynamicTextureResolution() + 5);
        lineSize = scale / 8;
        lineSpacing = lineSize * 3 / 2;
        fontSizeBig = lineSize * 2;
        fontSizeSmall = fontSizeBig / 2;
    }
}
