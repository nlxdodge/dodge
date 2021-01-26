package nl.nlxdodge.scrapyard.items.consumeables;

import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import nl.nlxdodge.scrapyard.misc.FoodComponentExt;

public class SweetBerrySoda extends Item {
    public SweetBerrySoda(Settings settings) {
        super(settings.food(FoodComponentExt.SWEET_BERRY_SODA));
    }

    public SoundEvent getDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }

    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }
}
