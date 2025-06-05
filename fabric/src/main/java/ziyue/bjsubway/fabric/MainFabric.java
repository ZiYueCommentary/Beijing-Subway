package ziyue.bjsubway.fabric;

import net.fabricmc.api.ModInitializer;
import ziyue.bjsubway.mod.BeijingSubway;

/**
 * @since 1.0.0-beta-1
 */

public final class MainFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		BeijingSubway.init();
	}
}
