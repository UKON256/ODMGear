package jp.ukon.odm_gear.foundations.events;

import jp.ukon.odm_gear.utils.debug.ChatHandler;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(Dist.CLIENT)
public class KeyInputEvent {
    /*@SubscribeEvent
    public static void onInputEvent(InputEvent.Key event) {
        if (Minecraft.getInstance().screen == null) return;
        ChatHandler.info("aaa");

        int key = event.getKey();
        boolean pressed = !(event.getAction() == 0);

        ChatHandler.info(key + ", " + pressed);
    }*/
}
