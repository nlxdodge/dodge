package nl.nlxdodge.dodge.items.wearables;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import nl.nlxdodge.dodge.DodgeMod;

import java.util.List;

public class KingRing extends TrinketItem {

    public KingRing(Settings settings) {
        super(settings.group(DodgeMod.DODGE_GROUP));
    }

    @Override
    public void onEquip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.setStatusEffect(new StatusEffectInstance(StatusEffects.LUCK), null);
    }

    @Override
    public void onUnequip(ItemStack stack, SlotReference slot, LivingEntity entity) {
        entity.removeStatusEffect(StatusEffects.LUCK);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.dodge.king_ring.tooltip_1"));
        tooltip.add(new TranslatableText("item.dodge.king_ring.tooltip_2"));
    }
}