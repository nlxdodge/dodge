package nl.nlxdodge.dodge.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.dodge.items.consumeables.CookedMeatSkewer;
import nl.nlxdodge.dodge.items.consumeables.RawMeatSkewer;
import nl.nlxdodge.dodge.items.consumeables.SweetBerrySoda;
import nl.nlxdodge.dodge.items.craftables.GoldRing;
import nl.nlxdodge.dodge.items.craftables.ScrapItem;
import nl.nlxdodge.dodge.items.craftables.SlimeCore;
import nl.nlxdodge.dodge.items.craftables.SlimeGrenade;
import nl.nlxdodge.dodge.items.wearables.*;
import nl.nlxdodge.dodge.misc.ToolMaterials;

import static nl.nlxdodge.dodge.util.RegisterUtils.getIdentifier;

public class ModItems {

    public static final Item GLASS_SWORD = new GlassSword(ToolMaterials.GLASS, 2, -3.0f, new Item.Settings());
    public static final Item SILVERFISH_SPRAY = new SilverFishSpray(new Item.Settings());
    public static final Item SCRAP_ITEM = new ScrapItem(new Item.Settings());
    public static final Item SWEET_BERRY_SODA = new SweetBerrySoda(new Item.Settings());
    public static final Item RAW_MEAT_SKEWER = new RawMeatSkewer(new Item.Settings());
    public static final Item COOKED_MEAT_SKEWER = new CookedMeatSkewer(new Item.Settings());
    public static final Item GOLD_RING = new GoldRing(new Item.Settings());
    public static final Item KING_RING = new KingRing(new Item.Settings());
    public static final Item HAND_SAW = new HandSaw(new Item.Settings());
    public static final Item SLIME_CORE = new SlimeCore(new Item.Settings());
    public static final Item SEA_ANCHOR = new SeaAnchor(net.minecraft.item.ToolMaterials.IRON, 8, -3.5f, new Item.Settings());
    public static final Item SLIME_GRENADE = new SlimeGrenade(new Item.Settings());

    public static void registerItems() {
        registerItem("glass_sword", GLASS_SWORD);
        registerItem("silver_fish_spray", SILVERFISH_SPRAY);
        registerItem("scrap_item", SCRAP_ITEM);
        registerItem("sweet_berry_soda", SWEET_BERRY_SODA);
        registerItem("raw_meat_skewer", RAW_MEAT_SKEWER);
        registerItem("cooked_meat_skewer", COOKED_MEAT_SKEWER);
        registerItem("gold_ring", GOLD_RING);
        registerItem("king_ring", KING_RING);
        registerItem("hand_saw", HAND_SAW);
        registerItem("slime_core", SLIME_CORE);
        registerItem("sea_anchor", SEA_ANCHOR);
        registerItem("slime_grenade", SLIME_GRENADE);
    }

    public static void registerFuelItems() {
        FuelRegistry.INSTANCE.add(SLIME_CORE, 3200);
    }

    private static void registerItem(String identifier, Item item) {
        Registry.register(Registry.ITEM, getIdentifier(identifier), item);
    }
}
