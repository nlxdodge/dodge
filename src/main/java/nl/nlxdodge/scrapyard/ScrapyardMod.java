package nl.nlxdodge.scrapyard;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import nl.nlxdodge.scrapyard.blocks.ModBlocks;
import nl.nlxdodge.scrapyard.items.ModItems;

public class ScrapyardMod implements ModInitializer {

    public static final String IDENTIFIER = "scrapyard";
    public static final ItemGroup SCRAP_YARD_GROUP = FabricItemGroupBuilder
            .create(new Identifier("scrapyard", "all"))
            .icon(() -> new ItemStack(ModItems.KING_RING))
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
