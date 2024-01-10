package jp.ukon.odm_gear.foundations.item.tabs;

import jp.ukon.odm_gear.AllItems;
import net.minecraft.world.item.ItemStack;

public class PartsCreativeModeTab extends BaseCreativeModeTab {
    public PartsCreativeModeTab() {
        super("parts");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(AllItems.ICE_BURST_SHARD.get());
    }
}
