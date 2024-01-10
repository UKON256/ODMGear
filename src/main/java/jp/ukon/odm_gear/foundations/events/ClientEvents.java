package jp.ukon.odm_gear.foundations.events;

import jp.ukon.odm_gear.AllKeyMapping;
import jp.ukon.odm_gear.foundations.item.IInputHandlerItem;
import jp.ukon.odm_gear.utils.debug.ChatHandler;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(Dist.CLIENT)
public class ClientEvents {
    public static List<Boolean> keyStatusCache = new ArrayList<Boolean>();
    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        Player player = Minecraft.getInstance().player;
        if (player == null) return;
        if (Minecraft.getInstance().isPaused()) return;
        ChatHandler.info("aaa");
        if (Minecraft.getInstance().screen == null) return;

        List<Boolean> keyStatus = AllKeyMapping.getStatus();
        for (int i = 0; i < keyStatus.size(); i++) {
            boolean cachedKeyDown = keyStatusCache.get(i);
            boolean nowKeyDown = keyStatus.get(i);
            ChatHandler.info("bbb");
            if (cachedKeyDown == nowKeyDown) continue;

            keyStatusCache.set(i, nowKeyDown);

            ChatHandler.info("ccc");
            ItemStack stack = getKeyPressStack(player);
            if (stack == null) return;

            KeyMapping key = AllKeyMapping.keyBindings.get(i);
            if (nowKeyDown)
                ((IInputHandlerItem) stack.getItem()).onKeyDown(key.getKey().getValue(), player);
            else
                ((IInputHandlerItem) stack.getItem()).onKeyUp(key.getKey().getValue(), player);
        }
    }

    public static ItemStack getKeyPressStack(Player player) {
        if (player == null) return null;

        ItemStack stack = player.getItemInHand(InteractionHand.MAIN_HAND);
        if (stack != null) {
            Item item = stack.getItem();
            if (item instanceof IInputHandlerItem)
                return stack;
        }

        stack = player.getItemInHand(InteractionHand.OFF_HAND);
        if (stack != null) {
            Item item = stack.getItem();
            if (item instanceof IInputHandlerItem)
                return stack;
        }
        return null;
    }
}
