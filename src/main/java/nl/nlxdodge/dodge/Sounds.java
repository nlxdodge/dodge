package nl.nlxdodge.dodge;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class Sounds {

    public static final Identifier SILVER_FISH_SPRAY_USAGE = new Identifier("dodge:silver_fish_spray_usage");
    public static final Identifier BALLOON_BLOCK_JUMP = new Identifier("dodge:balloon_block_jump");

    public static SoundEvent SILVER_FISH_SPRAY_USAGE_EVENT = new SoundEvent(SILVER_FISH_SPRAY_USAGE);
    public static SoundEvent BALLOON_BLOCK_JUMP_EVENT = new SoundEvent(BALLOON_BLOCK_JUMP);
}
