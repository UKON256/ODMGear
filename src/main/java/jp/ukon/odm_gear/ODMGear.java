package jp.ukon.odm_gear;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ODMGear.ID)
public class ODMGear {
    public static final String ID = "odm_gear";
    public static final String NAME = "ODM Gear";
    public static final String VERSION = "0.0.1";

    public static final Logger LOGGER = LogManager.getLogger();

    public ODMGear() {
        load();
    }

    public void load()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        AllBlocks.register(bus);
        AllEntity.register(bus);
        AllEntity.register(bus);
        AllItems.register(bus);

        AllCreativeModeTabs.register();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
