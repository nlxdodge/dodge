package nl.nlxdodge.dodge.items.consumeables;

import net.minecraft.item.Item;
import nl.nlxdodge.dodge.items.BasicItem;
import nl.nlxdodge.dodge.misc.FoodComponentExt;

public class RawMeatSkewer extends BasicItem {
    public RawMeatSkewer(Settings settings) {
        super(settings.food(FoodComponentExt.RAW_MEAT_SKEWER));
    }
}
