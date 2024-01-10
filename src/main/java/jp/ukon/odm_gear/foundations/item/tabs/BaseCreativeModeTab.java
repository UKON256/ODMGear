package jp.ukon.odm_gear.foundations.item.tabs;

import jp.ukon.odm_gear.ODMGear;
import net.minecraft.world.item.CreativeModeTab;

public abstract class BaseCreativeModeTab extends CreativeModeTab {
    public BaseCreativeModeTab(String id) {
        super(ODMGear.ID + "." + id);
    }
}
