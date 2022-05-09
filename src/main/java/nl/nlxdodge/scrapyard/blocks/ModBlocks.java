package nl.nlxdodge.scrapyard.blocks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrapyard.ScrapyardMod;

import static nl.nlxdodge.scrapyard.util.RegisterUtils.getIdentifier;

public class ModBlocks {

    public static final Block SCRAP_BLOCK = new ScrapBlock(AbstractBlock.Settings.of(Material.METAL, DyeColor.BROWN));
    public static final Block BALLOON_BLOCK = new BalloonBlock(AbstractBlock.Settings.of(Material.SPONGE, DyeColor.BROWN));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, getIdentifier("scrap_block"), SCRAP_BLOCK);
        Registry.register(Registry.ITEM, getIdentifier("scrap_block"),
                new BlockItem(SCRAP_BLOCK, new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));

        Registry.register(Registry.BLOCK, getIdentifier("balloon_block"), BALLOON_BLOCK);
        Registry.register(Registry.ITEM, getIdentifier("balloon_block"),
                new BlockItem(BALLOON_BLOCK, new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));

        BlockRenderLayerMap.INSTANCE.putBlock(BALLOON_BLOCK, RenderLayer.getCutout());
    }
}
