package nl.nlxdodge.scrap_yard.items.wearables;

import java.util.List;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class KingRing extends TrinketItem {

  public KingRing(Settings settings) {
    super(settings.maxCount(1));
  }

  @Override
  public boolean canWearInSlot(String group, String slot) {
    return group.equals(SlotGroups.HAND) && slot.equals(Slots.RING);
  }

  @Override
  public void tick(PlayerEntity player, ItemStack stack) {
    if (!player.hasStatusEffect(StatusEffects.LUCK)) {
      player.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 30, 0, false, false, false));
    }
  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.scrap_yard.king_ring.tooltip_1"));
  }
}