package nl.nlxdodge.scrapyard.items.consumeables;

import net.minecraft.item.Item;
import nl.nlxdodge.scrapyard.items.BasicItem;
import nl.nlxdodge.scrapyard.misc.FoodComponentExt;

public class CookedMeatSkewer extends BasicItem {
    public CookedMeatSkewer(Settings settings) {
        super(settings.food(FoodComponentExt.MEAT_SKEWER));
    }
}
