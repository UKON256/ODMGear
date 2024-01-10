package jp.ukon.odm_gear.contents.item.odm_gears;

import jp.ukon.odm_gear.AllCreativeModeTabs;
import jp.ukon.odm_gear.foundations.item.IInputHandlerItem;
import jp.ukon.odm_gear.utils.debug.ChatHandler;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class ODM_Gear extends Item implements IInputHandlerItem {
    public ODM_Gear() {
        super(new Item.Properties().tab(AllCreativeModeTabs.ODM_CREATIVE_TAB));
    }


    // IInputHandlerItem
    @Override
    public void onKeyDown(int key, Player player) {
        ChatHandler.info("onKeyDown!");
    }

    @Override
    public void onKeyUp(int key, Player player) {
        ChatHandler.info("oneKeyUp!");
    }
}
