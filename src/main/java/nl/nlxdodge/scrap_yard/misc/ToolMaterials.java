package nl.nlxdodge.scrap_yard.misc;

import java.util.function.Supplier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum ToolMaterials implements ToolMaterial {

  GLASS(0, 124, 6.0F, 3.0F, 12, () -> {
    return Ingredient.ofStacks(new ItemStack(Items.GLASS));
  }), BAMBOO(1, 255, 4.0F, 2.5F, 20, () -> {
    return Ingredient.ofStacks(new ItemStack(Items.BAMBOO));
  });

  private final int miningLevel;
  private final int itemDurability;
  private final float miningSpeed;
  private final float attackDamage;
  private final int enchantability;
  private final Lazy<Ingredient> repairIngredient;

  private ToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability,
      Supplier<Ingredient> repairIngredient) {
    this.miningLevel = miningLevel;
    this.itemDurability = itemDurability;
    this.miningSpeed = miningSpeed;
    this.attackDamage = attackDamage;
    this.enchantability = enchantability;
    this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
  }

  public int getDurability() {
    return this.itemDurability;
  }

  public float getMiningSpeedMultiplier() {
    return this.miningSpeed;
  }

  public float getAttackDamage() {
    return this.attackDamage;
  }

  public int getMiningLevel() {
    return this.miningLevel;
  }

  public int getEnchantability() {
    return this.enchantability;
  }

  public Ingredient getRepairIngredient() {
    return (Ingredient) this.repairIngredient.get();
  }
}