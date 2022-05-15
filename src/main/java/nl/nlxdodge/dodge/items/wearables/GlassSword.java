package nl.nlxdodge.dodge.items.wearables;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import nl.nlxdodge.dodge.DodgeMod;

public class GlassSword extends SwordItem {

  public GlassSword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
    super(material, attackDamage, attackSpeed, settings.group(DodgeMod.SCRAP_YARD_GROUP));
  }
}