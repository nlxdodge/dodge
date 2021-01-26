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
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeInfo;

public class ModItems {

    public static final Item BAMBOO_SPEAR = new BambooSpear(ToolMaterials.BAMBOO, 2, 1.0f, new Item.Settings());
    public static final Item GLASS_SWORD = new GlassSword(ToolMaterials.GLASS, 2, 1.5f, new Item.Settings());
    public static final Item SILVERFISH_SPRAY = new SilverFishSpray(new Item.Settings());
    public static final Item SCRAP_ITEM = new ScrapItem(new Item.Settings());
    public static final Item SWEET_BERRY_SODA = new SweetBerrySoda(new Item.Settings());
    public static final Item RAW_MEAT_SKEWER = new RawMeatSkewer(new Item.Settings());
    public static final Item COOKED_MEAT_SKEWER = new CookedMeatSkewer(new Item.Settings());
    public static final Item KING_RING = new KingRing(new Item.Settings());

    public static void registerItems() {
        Registry.register(Registry.ITEM, genIdentifier("glass_sword"), GLASS_SWORD);
        Registry.register(Registry.ITEM, genIdentifier("bamboo_spear"), BAMBOO_SPEAR);
        Registry.register(Registry.ITEM, genIdentifier("silver_fish_spray"), SILVERFISH_SPRAY);
        Registry.register(Registry.ITEM, genIdentifier("scrap_item"), SCRAP_ITEM);
        Registry.register(Registry.ITEM, genIdentifier("sweet_berry_soda"), SWEET_BERRY_SODA);
        Registry.register(Registry.ITEM, genIdentifier("raw_meat_skewer"), RAW_MEAT_SKEWER);
        Registry.register(Registry.ITEM, genIdentifier("cooked_meat_skewer"), COOKED_MEAT_SKEWER);
        Registry.register(Registry.ITEM, genIdentifier("king_ring"), KING_RING);
    }

    private static Identifier genIdentifier(String path) {
        return new Identifier(ScrapyardMod.IDENTIFIER, path);
    }
}
