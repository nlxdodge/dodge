package nl.nlxdodge.dodge.items.wearables;


import nl.nlxdodge.dodge.items.BasicItem;
import nl.nlxdodge.dodge.items.ModItems;

public class HandSaw extends BasicItem {

    public HandSaw(Settings settings) {
        super(settings.maxDamage(256).recipeRemainder(ModItems.HAND_SAW));
    }
}