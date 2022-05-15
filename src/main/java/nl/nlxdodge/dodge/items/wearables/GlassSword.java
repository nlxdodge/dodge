package nl.nlxdodge.dodge.items.wearables;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import nl.nlxdodge.dodge.DodgeMod;
import nl.nlxdodge.dodge.misc.ModStatusEffects;

public class GlassSword extends SwordItem {

    public GlassSword(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings.group(DodgeMod.SCRAP_YARD_GROUP));
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.hasStatusEffect(ModStatusEffects.BLEEDING_STATUS_EFFECT)) {
            target.addStatusEffect(new StatusEffectInstance(ModStatusEffects.BLEEDING_STATUS_EFFECT, 100), attacker);
        }
        stack.damage(1, attacker, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }
}