package com.rayeart.wordsounds.util.handlers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.rayeart.wordsounds.util.Reference;

public class ChatTestHandler {
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	 public void ListenChat(ClientChatReceivedEvent event) {
        Minecraft game = Minecraft.getMinecraft();
        EntityPlayer player = game.player;
        if (event.getMessage().getUnformattedText().toLowerCase().contains("oof")) {
            player.playSound(new SoundEvent(new ResourceLocation("wsm:music/oof")), 1.0f, 1.2f);
        }
	}
}