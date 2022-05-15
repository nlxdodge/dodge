package nl.nlxdodge.dodge.util;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.dodge.DodgeMod;

public final class BlockTags {
    public static final TagKey<Block> PRISMARINE = TagKey.of(Registry.BLOCK_KEY, new Identifier(DodgeMod.IDENTIFIER, "prismarine"));

    private BlockTags() {
    }
}
