package nl.nlxdodge.dodge.items;

import net.minecraft.item.Item;
import nl.nlxdodge.dodge.DodgeMod;

public class BasicItem extends Item {

    public BasicItem(Settings settings) {
        super(settings.group(DodgeMod.SCRAP_YARD_GROUP));
    }
}
