package nl.nlxdodge.scrapyard.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrapyard.ScrapyardMod;
import nl.nlxdodge.scrapyard.items.consumeables.CookedMeatSkewer;
import nl.nlxdodge.scrapyard.items.consumeables.RawMeatSkewer;
import nl.nlxdodge.scrapyard.items.consumeables.SweetBerrySoda;
import nl.nlxdodge.scrapyard.items.wearables.BambooSpear;
import nl.nlxdodge.scrapyard.items.wearables.GlassSword;
import nl.nlxdodge.scrapyard.items.wearables.KingRing;
import nl.nlxdodge.scrapyard.misc.ToolMaterials;

public class ModItems {

    public static final Item BAMBOO_SPEAR = new BambooSpear(ToolMaterials.BAMBOO, 2, 1.0f,
            new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("scrapyard", "glass_sword"),
                new GlassSword(ToolMaterials.GLASS, 2, 1.5f, new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("scrapyard", "bamboo_spear"), BAMBOO_SPEAR);
        Registry.register(Registry.ITEM, new Identifier("scrapyard", "king_ring"),
                new KingRing(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("scrapyard", "silver_fish_spray"),
                new SilverFishSpray(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP).maxDamage(64)));
        Registry.register(Registry.ITEM, new Identifier("scrapyard", "scrap_item"),
                new ScrapItem(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("scrapyard", "sweet_berry_soda"),
                new SweetBerrySoda(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("scrapyard", "raw_meat_skewer"),
                new RawMeatSkewer(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
        Registry.register(Registry.ITEM, new Identifier("scrapyard", "cooked_meat_skewer"),
                new CookedMeatSkewer(new Item.Settings().group(ScrapyardMod.SCRAP_YARD_GROUP)));
    }
}
