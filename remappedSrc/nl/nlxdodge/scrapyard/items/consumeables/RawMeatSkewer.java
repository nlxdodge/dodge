package nl.nlxdodge.scrapyard.items.consumeables;

import net.minecraft.item.Item;
import nl.nlxdodge.scrapyard.items.BasicItem;
import nl.nlxdodge.scrapyard.misc.FoodComponentExt;

public class RawMeatSkewer extends BasicItem {
    public RawMeatSkewer(Settings settings) {
        super(settings.food(FoodComponentExt.RAW_MEAT_SKEWER));
    }
}
