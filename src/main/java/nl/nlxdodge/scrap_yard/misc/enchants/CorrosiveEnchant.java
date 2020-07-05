package nl.nlxdodge.scrap_yard.misc.enchants;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

public class CorrosiveEnchant extends Enchantment {
  public CorrosiveEnchant() {
    super(Enchantment.Rarity.RARE, EnchantmentTarget.BREAKABLE,
        new EquipmentSlot[] { EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND });
  }

  @Override
  public int getMinPower(int level) {
    return 1;
  }

  @Override
  public int getMaxLevel() {
    return 2;
  }

  @Override
  public boolean isAcceptableItem(ItemStack stack) {
    return stack.getItem() instanceof ShieldItem;
 }

  @Override
  public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
    if((new Random()).nextBoolean()) {
      return;
    }
    attacker.getItemsHand().forEach(item -> {
      int repairCost = item.getRepairCost();
      item.setRepairCost(repairCost + level);
    });
  }
}