package nl.nlxdodge.scrapyard.items.wearables;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import top.theillusivec4.curios.api.type.component.ICurio;
import java.util.List;

public class KingRing extends Item implements ICurio  {

    public KingRing(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.scrapyard.king_ring.tooltip_1"));
        tooltip.add(new TranslatableText("item.scrapyard.king_ring.tooltip_2"));
    }

    @Override
    public void onEquip(String identifier, int index, LivingEntity livingEntity) {
        StatusEffectInstance luckInstance = new StatusEffectInstance(StatusEffects.LUCK);
        luckInstance.setPermanent(true);
        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION));
    }

    @Override
    public void onUnequip(String identifier, int index, LivingEntity livingEntity) {
        livingEntity.removeStatusEffect(StatusEffects.LUCK);
    }
}