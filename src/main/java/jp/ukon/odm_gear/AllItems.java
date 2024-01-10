package jp.ukon.odm_gear;

import jp.ukon.odm_gear.contents.item.IceBurstShard;
import jp.ukon.odm_gear.contents.item.odm_gears.ODM_Gear;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ODMGear.ID);

    public static RegistryObject<IceBurstShard> ICE_BURST_SHARD = ITEMS.register("ice_burst_shard", IceBurstShard::new);
    public static RegistryObject<ODM_Gear> ODM_GEAR = ITEMS.register("odm_gear", ODM_Gear::new);

    public static void register(IEventBus bus) { ITEMS.register(bus); }
}
