package nl.nlxdodge.dodge.items;

import net.minecraft.item.Item;
import nl.nlxdodge.dodge.ScrapyardMod;

public class BasicItem extends Item {

    public BasicItem(Settings settings) {
        super(settings.group(ScrapyardMod.SCRAP_YARD_GROUP));
    }
}
