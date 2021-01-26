package nl.nlxdodge.scrapyard.items;

import net.minecraft.item.Item;
import nl.nlxdodge.scrapyard.ScrapyardMod;

public class ScrapItem extends Item {
  public ScrapItem(Settings settings) {
    super(settings.group(ScrapyardMod.SCRAP_YARD_GROUP));
  }
}