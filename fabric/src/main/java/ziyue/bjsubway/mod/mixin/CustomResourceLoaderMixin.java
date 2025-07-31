package ziyue.bjsubway.mod.mixin;

import org.mtr.libraries.it.unimi.dsi.fastutil.objects.Object2ObjectAVLTreeMap;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;
import org.mtr.mod.client.CustomResourceLoader;
import org.mtr.mod.resource.SignResource;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ziyue.bjsubway.mod.block.base.RailwaySigns;

@Mixin(CustomResourceLoader.class)
public abstract class CustomResourceLoaderMixin
{
    @Shadow(remap = false)
    @Final
    private static ObjectArrayList<SignResource> SIGNS;

    @Shadow(remap = false)
    @Final
    private static Object2ObjectAVLTreeMap<String, SignResource> SIGNS_CACHE;

    @Inject(at = @At("TAIL"), method = "reload", remap = false)
    private static void afterReload(CallbackInfo ci) {
        for (RailwaySigns.SignType value : RailwaySigns.SignType.values()) {
            SIGNS.add(value.sign);
            SIGNS_CACHE.put(value.signId, value.sign);
        }
    }
}
