package xxrexraptorxx.keyeffects.utils;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.lwjgl.glfw.GLFW;
import xxrexraptorxx.keyeffects.main.References;

@Mod.EventBusSubscriber(modid = References.MODID, value = Dist.CLIENT, bus = Bus.MOD)
public class KeyBindings {

    private static final String CATEGORY = References.NAME;

    public static final KeyBinding CLEAR_EFFECTS = new KeyBinding("Clear Effects", KeyConflictContext.IN_GAME, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_KP_0, CATEGORY);
    public static final KeyBinding EFFECT_SPEED = new KeyBinding("Effect: Speed", KeyConflictContext.IN_GAME, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_KP_1, CATEGORY);


    @SubscribeEvent
    public static void registerKeyBindings(final FMLClientSetupEvent event) {
        ClientRegistry.registerKeyBinding(CLEAR_EFFECTS);
        ClientRegistry.registerKeyBinding(EFFECT_SPEED);
    }
}