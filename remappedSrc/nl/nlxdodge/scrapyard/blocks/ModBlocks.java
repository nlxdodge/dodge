package nl.nlxdodge.dodge.blocks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.dodge.ScrapyardMod;

import static nl.nlxdodge.dodge.util.RegisterUtils.getIdentifier;

public class ModBlocks {

    public static final Block SCRAP_BLOCK = new ScrapBlock(AbstractBlock.Settings.of(Material.METAL, MapColor.BROWN));
    public static final Block BALLOON_BLOCK = new BalloonBlock(AbstractBlock.Settings.of(Material.SPONGE, MapColor.BROWN));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, getIdentifier("scrap_block"), SCRAP_BLOCK);
        Registry.register(Registry.ITEM, getIdentifier("scrap_block"),
                new BlockItem(SCRAP_BLOCK, new Item.Settings()));

        Registry.register(Registry.BLOCK, getIdentifier("balloon_block"), BALLOON_BLOCK);
        Registry.register(Registry.ITEM, getIdentifier("balloon_block"),
                new BlockItem(BALLOON_BLOCK, new Item.Settings()));

        BlockRenderLayerMap.INSTANCE.putBlock(BALLOON_BLOCK, RenderLayer.getCutout());
    }
}
