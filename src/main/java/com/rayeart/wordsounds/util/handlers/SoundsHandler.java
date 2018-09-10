package com.rayeart.wordsounds.util.handlers;

import com.rayeart.wordsounds.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundsHandler {
	
	private static int size = 0;

	public static SoundEvent CHAT_OOF;
	
	public static void  init() {
		size = SoundEvent.REGISTRY.getKeys().size();
	
	}
	
	public static SoundEvent register(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent e = new SoundEvent(location);
		
		SoundEvent.REGISTRY.register(size, location, e);
		size++;
		return e;
	}
	
}
