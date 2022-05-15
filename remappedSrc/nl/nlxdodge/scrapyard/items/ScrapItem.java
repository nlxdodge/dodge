package nl.nlxdodge.dodge.items;

import net.minecraft.item.Item;
import nl.nlxdodge.dodge.ScrapyardMod;

public class ScrapItem extends Item {
  public ScrapItem(Settings settings) {
    super(settings.group(ScrapyardMod.SCRAP_YARD_GROUP));
  }
}