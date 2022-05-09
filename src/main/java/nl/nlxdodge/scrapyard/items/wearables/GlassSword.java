package nl.nlxdodge.scrapyard.items.wearables;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import nl.nlxdodge.scrapyard.ScrapyardMod;

public class GlassSword extends SwordItem {

  public GlassSword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
    super(material, attackDamage, attackSpeed, settings.group(ScrapyardMod.SCRAP_YARD_GROUP));
  }
}