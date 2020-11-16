package nl.nlxdodge.scrap_yard.items.consumeables;

import net.minecraft.item.Item;
import nl.nlxdodge.scrap_yard.misc.FoodComponentExt;

public class RawMeatSkewer extends Item {
    public RawMeatSkewer(Settings settings) {
        super(settings.food(FoodComponentExt.RAW_MEAT_SKEWER));
    }
}
