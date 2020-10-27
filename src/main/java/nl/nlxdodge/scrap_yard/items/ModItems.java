package nl.nlxdodge.scrap_yard.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrap_yard.ScrapyardMod;
import nl.nlxdodge.scrap_yard.items.wearables.BambooSpear;
import nl.nlxdodge.scrap_yard.items.wearables.GlassSword;
import nl.nlxdodge.scrap_yard.items.wearables.KingRing;
import nl.nlxdodge.scrap_yard.misc.ToolMaterials;

public class ModItems {

    public static final Item BAMBOO_SPEAR = new BambooSpear(ToolMaterials.BAMBOO, 2, 1.0f,
            new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("scrap_yard", "glass_sword"),
                new GlassSword(ToolMaterials.GLASS, 2, 1.5f, new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("scrap_yard", "bamboo_spear"), BAMBOO_SPEAR);
        Registry.register(Registry.ITEM, new Identifier("scrap_yard", "king_ring"),
                new KingRing(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("scrap_yard", "silver_fish_spray"),
                new SilverFishSpray(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP).maxDamage(64)));
        Registry.register(Registry.ITEM, new Identifier("scrap_yard", "scrap_item"),
                new ScrapItem(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
    }
}
