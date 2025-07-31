package ziyue.bjsubway.mod.block.base;

import org.mtr.core.serializer.JsonReader;
import org.mtr.libraries.com.google.gson.JsonObject;
import org.mtr.mod.resource.SignResource;
import ziyue.bjsubway.mod.Reference;
import ziyue.tjmetro.mod.block.base.IRailwaySign;

/**
 * @since 1.0.0-beta-1
 */

public abstract class RailwaySigns
{
    static {
        IRailwaySign.signIsExit(""); // Initializing...
        IRailwaySign.EXIT_SIGNS.add(SignType.ROUTE.signId);
    }

    public enum SignType
    {
        ROUTE("route", "route", false, false);

        public final String signId;
        public final SignResource sign;

        SignType(String texture, String translation, boolean flipTexture, boolean flipCustomText, boolean hasCustomText, boolean small, int backgroundColor) {
            this.signId = String.format("\2_BJSUBWAY_%s", this).toLowerCase();
            final JsonObject object = new JsonObject();
            object.addProperty("id", this.signId);
            object.addProperty("textureResource", Reference.MOD_ID + ":textures/sign/" + texture + ".png");
            object.addProperty("flipTexture", flipTexture);
            object.addProperty("customText", hasCustomText ? "sign.bjsubway." + translation : "");
            object.addProperty("flipCustomText", flipCustomText);
            object.addProperty("small", small);
            object.addProperty("backgroundColor", backgroundColor);
            this.sign = new SignResource(new JsonReader(object));
        }

        SignType(String texture, String translation, boolean flipTexture, boolean flipCustomText) {
            this(texture, translation, flipTexture, flipCustomText, true, true, 0);
        }

        SignType(String texture, String translation, boolean flipTexture, boolean flipCustomText, boolean small) {
            this(texture, translation, flipTexture, flipCustomText, true, small, 0);
        }

        SignType(String texture, boolean flipTexture) {
            this(texture, texture, flipTexture, false, false, true, 0);
        }

        SignType(String texture, boolean flipTexture, boolean small) {
            this(texture, texture, flipTexture, false, false, small, 0);
        }
    }
}
