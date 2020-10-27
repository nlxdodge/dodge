package nl.nlxdodge.scrap_yard.blocks;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrap_yard.ScrapyardMod;

public class ModBlocks {

    public static final Block SCRAP_BLOCK = new ScrapBlock(AbstractBlock.Settings.of(Material.METAL, MaterialColor.BROWN));
    public static final Block BALLOON_BLOCK = new BalloonBlock(AbstractBlock.Settings.of(Material.SPONGE, MaterialColor.BROWN));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier("scrap_yard", "scrap_block"), SCRAP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("scrap_yard", "scrap_block"),
                new BlockItem(SCRAP_BLOCK, new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("scrap_yard", "balloon_block"), BALLOON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("scrap_yard", "balloon_block"),
                new BlockItem(BALLOON_BLOCK, new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));

        BlockRenderLayerMap.INSTANCE.putBlock(BALLOON_BLOCK, RenderLayer.getCutout());
    }
}
