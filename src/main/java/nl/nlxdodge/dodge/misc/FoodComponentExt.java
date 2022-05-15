package nl.nlxdodge.dodge.misc;

import net.minecraft.item.FoodComponent;

public class FoodComponentExt {

    public static final FoodComponent MEAT_SKEWER;
    public static final FoodComponent RAW_MEAT_SKEWER;
    public static final FoodComponent SWEET_BERRY_SODA;

    static {
        MEAT_SKEWER = (new FoodComponent.Builder().hunger(14).saturationModifier(0.6F).meat().build());
        RAW_MEAT_SKEWER = (new FoodComponent.Builder().hunger(6).saturationModifier(0.3F).meat().build());
        SWEET_BERRY_SODA = (new FoodComponent.Builder().hunger(8).saturationModifier(0.4F).build());
    }
}
