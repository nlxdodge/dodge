package nl.nlxdodge.scrap_yard.items.consumeables;

import net.minecraft.item.Item;
import nl.nlxdodge.scrap_yard.misc.FoodComponentExt;

public class CookedMeatSkewer extends Item {
    public CookedMeatSkewer(Settings settings) {
        super(settings.food(FoodComponentExt.MEAT_SKEWER));
    }
}
