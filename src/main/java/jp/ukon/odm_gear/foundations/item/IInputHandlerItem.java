package jp.ukon.odm_gear.foundations.item;

import net.minecraft.world.entity.player.Player;

public interface IInputHandlerItem {
    void onKeyDown(int key, Player player);
    void onKeyUp(int key, Player player);
}
