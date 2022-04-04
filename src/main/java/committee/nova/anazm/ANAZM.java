package committee.nova.anazm;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ANAZM implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Absolutely Not A Zoom Mod");
	public static KeyBinding zoomKeyBinding;
	// For hooking the zoom event
	public static boolean isZooming = false;

	@Override
	public void onInitializeClient() {
		LOGGER.info("?");
		zoomKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.anazm.zoom", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_C, "category.anazm.main"));
	}
}
