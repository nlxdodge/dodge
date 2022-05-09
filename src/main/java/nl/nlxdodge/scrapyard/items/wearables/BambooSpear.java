package nl.nlxdodge.scrapyard.items.wearables;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.TridentItem;
import nl.nlxdodge.scrapyard.ScrapyardMod;

public class BambooSpear extends TridentItem {

  public BambooSpear(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
    super(settings.group(ScrapyardMod.SCRAP_YARD_GROUP));
  }
}