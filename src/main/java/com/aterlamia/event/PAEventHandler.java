package com.aterlamia.event;

import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;

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
