package nl.nlxdodge.scrapyard.items.wearables;


import nl.nlxdodge.scrapyard.items.BasicItem;
import nl.nlxdodge.scrapyard.items.ModItems;

public class HandSaw extends BasicItem {

    public HandSaw(Settings settings) {
        super(settings.maxDamage(256).recipeRemainder(ModItems.HAND_SAW));
    }
}