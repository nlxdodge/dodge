package nl.nlxdodge.dodge.items.consumeables;

import net.minecraft.item.Item;
import nl.nlxdodge.dodge.items.BasicItem;
import nl.nlxdodge.dodge.misc.FoodComponentExt;

public class CookedMeatSkewer extends BasicItem {
    public CookedMeatSkewer(Settings settings) {
        super(settings.food(FoodComponentExt.MEAT_SKEWER));
    }
}
