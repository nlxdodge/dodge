package nl.nlxdodge.scrapyard.items;

import net.minecraft.client.item.TooltipContext;
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
import nl.nlxdodge.scrapyard.Sounds;

import java.util.List;

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

     world.getEntitiesByClass(SilverfishEntity.class, new Box(cornerLeft, cornerRight), null).forEach(entity -> entity.damage(DamageSource.player(user), 20));

     world.getEntitiesByClass(EndermiteEntity.class, new Box(cornerLeft, cornerRight), null).forEach(entity ->entity.damage(DamageSource.player(user), 20));

      world.playSound(null, user.getBlockPos(), Sounds.SILVER_FISH_SPRAY_USAGE_EVENT, SoundCategory.PLAYERS, 1f, 1f);
      user.getStackInHand(hand).damage(1, user, (e) -> e.sendToolBreakStatus(hand));
    }
    return TypedActionResult.pass(user.getStackInHand(hand));
  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.scrapyard.silver_fish_spray.tooltip_1"));
    tooltip.add(new TranslatableText("item.scrapyard.silver_fish_spray.tooltip_2"));
  }
}