package jp.ukon.odm_gear;

import com.mojang.blaze3d.platform.InputConstants;
import jp.ukon.odm_gear.foundations.events.ClientEvents;
import jp.ukon.odm_gear.foundations.key.NonConflictKeyMapping;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;
import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllKeyMapping {
    public static final String KEY_CATEGORY = "key.category.odm_gear.main";
    public static ArrayList<KeyMapping> keyBindings = new ArrayList<KeyMapping>();

    private static KeyMapping create(KeyMapping key)
    {
        keyBindings.add(key);
        ClientEvents.keyStatusCache.add(false);
        return key;
    }

    public static KeyMapping key_shootLeftAnchor = create(new NonConflictKeyMapping("key.shootLeftAnchor.title", InputConstants.Type.MOUSE, GLFW.GLFW_MOUSE_BUTTON_1, KEY_CATEGORY));
    public static KeyMapping key_shootRightAnchor = create(new NonConflictKeyMapping("key.shootRightAnchor.title", InputConstants.Type.MOUSE, GLFW.GLFW_MOUSE_BUTTON_2, KEY_CATEGORY));
    public static KeyMapping key_windWire = create(new NonConflictKeyMapping("key.windWire.title", InputConstants.KEY_LALT, KEY_CATEGORY));
    public static KeyMapping key_extendWire = create(new NonConflictKeyMapping("key.extendWire.title", InputConstants.KEY_LCONTROL, KEY_CATEGORY));
    public static KeyMapping key_blastGus = create(new NonConflictKeyMapping("key.blast_gus.title", InputConstants.KEY_LSHIFT, KEY_CATEGORY));
    public static KeyMapping key_prepareWeapon = create(new NonConflictKeyMapping("key.prepareWeapon.title", InputConstants.KEY_R, KEY_CATEGORY));

    public static List<Boolean> getStatus() {
        List<Boolean> status = new ArrayList<Boolean>();
        for (KeyMapping key : keyBindings) {
            status.add(key.isDown());
        }
        return status;
    }

    @SubscribeEvent
    public static void registerKeyBinding(RegisterKeyMappingsEvent event){
        keyBindings.forEach(event::register);
    }
}
