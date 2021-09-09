package github.aterlamia.event;

import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;

import java.util.Iterator;

public class PAEventHandler {
    public PAEventHandler() {

    }

    @SubscribeEvent
    public void onPlayerLogOut(PlayerLoggedOutEvent event) {
    }

    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload event) {

    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {

    }
}
