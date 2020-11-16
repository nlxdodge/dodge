package nl.nlxdodge.scrapyard.items.consumeables;

import net.minecraft.item.Item;
import nl.nlxdodge.scrapyard.misc.FoodComponentExt;

public class CookedMeatSkewer extends Item {
    public CookedMeatSkewer(Settings settings) {
        super(settings.food(FoodComponentExt.MEAT_SKEWER));
    }
}
