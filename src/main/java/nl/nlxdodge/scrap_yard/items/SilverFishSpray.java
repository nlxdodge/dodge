package nl.nlxdodge.scrap_yard.items;

import java.util.List;
import java.util.function.Consumer;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import nl.nlxdodge.scrap_yard.ScrapyardMod;

public class SilverFishSpray extends Item {

  private final int radius = 6;
  private final int height = 3;
  
  public SilverFishSpray(Item.Settings settings) {
    super(settings);
  }

  @Override
  public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
    if (!world.isClient) {
      BlockPos cornerLeft = new BlockPos(user.getPos().getX() - radius, user.getPos().getY() - height, user.getPos().getZ() - radius);
      BlockPos cornerRight = new BlockPos(user.getPos().getX() + radius, user.getPos().getY() + height, user.getPos().getZ() + radius);
      world.getEntities(null, new Box(cornerLeft, cornerRight)).forEach(entity -> {
        if (entity instanceof SilverfishEntity || entity instanceof EndermiteEntity) {
          entity.damage(DamageSource.player((PlayerEntity) user), 20);
        }
      });
      world.playSound(null, user.getBlockPos(), ScrapyardMod.SILVER_FISH_SPRAY_USAGE_EVENT, SoundCategory.PLAYERS, 1f,
          1f);
      user.getStackInHand(hand).damage(1, user, (e) -> {
        e.sendToolBreakStatus(hand);
      });
    }
    return TypedActionResult.pass(user.getStackInHand(hand));
  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.scrap_yard.silver_fish_spray.tooltip_1"));
    tooltip.add(new TranslatableText("item.scrap_yard.silver_fish_spray.tooltip_2"));
  }
}