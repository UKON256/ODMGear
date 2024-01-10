package jp.ukon.odm_gear;

import jp.ukon.odm_gear.foundations.item.tabs.ODMCreativeModeTab;
import jp.ukon.odm_gear.foundations.item.tabs.PartsCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;

public class AllCreativeModeTabs {
    public static final CreativeModeTab ODM_CREATIVE_TAB = new ODMCreativeModeTab();
    public static final CreativeModeTab PARTS_CREATIVE_TAB = new PartsCreativeModeTab();

    public static void register() { }
}
