package xxrexraptorxx.keyeffects.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xxrexraptorxx.keyeffects.main.References;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = References.MODID)
public class Events {

    private static final Minecraft MINECRAFT = Minecraft.getInstance();


    @SubscribeEvent
    public static void clientTick(final TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        if (KeyBindings.CLEAR_EFFECTS.isKeyDown()) {
            Minecraft.getInstance().player.getActivePotionEffects().clear();
        }

        if (KeyBindings.EFFECT_SPEED.isPressed()) {
            Minecraft.getInstance().player.addPotionEffect(new EffectInstance(Effects.SPEED, 5000, 2));
        }
        }
    }
