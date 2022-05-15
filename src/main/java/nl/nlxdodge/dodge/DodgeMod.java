package nl.nlxdodge.dodge;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import nl.nlxdodge.dodge.blocks.ModBlocks;
import nl.nlxdodge.dodge.items.ModItems;

public class DodgeMod implements ModInitializer {

    public static final String IDENTIFIER = "dodge";
    public static final ItemGroup SCRAP_YARD_GROUP = FabricItemGroupBuilder
            .create(new Identifier("dodge", "all"))
            .icon(() -> new ItemStack(ModItems.KING_RING))
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModItems.registerFuelItems();
        ModBlocks.registerBlocks();
    }
}
