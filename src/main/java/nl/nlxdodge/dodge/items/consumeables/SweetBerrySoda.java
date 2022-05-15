package nl.nlxdodge.dodge.items.consumeables;

import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import nl.nlxdodge.dodge.items.BasicItem;
import nl.nlxdodge.dodge.misc.FoodComponentExt;

public class SweetBerrySoda extends BasicItem {
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
