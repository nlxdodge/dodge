package nl.nlxdodge.dodge.misc;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ModStatusEffects {

    public static final StatusEffect BLEEDING_STATUS_EFFECT = new BleedingStatusEffect(StatusEffectCategory.HARMFUL, 0x8a0303);
    public static final DamageSource BLEEDING_DAMAGE_SOURCE = new BleedingDamageSource("bleeding_damage_source");
}
