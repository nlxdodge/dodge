package nl.nlxdodge.dodge.items.wearables;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.entity.mob.SilverfishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import nl.nlxdodge.dodge.Sounds;
import nl.nlxdodge.dodge.items.BasicItem;

import java.util.List;

public class SilverFishSpray extends BasicItem {

    private static final int RADIUS = 6;
    private static final int HEIGHT = 6;


    public SilverFishSpray(Item.Settings settings) {
        super(settings.maxDamage(64));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient()) {
            BlockPos cornerLeft = new BlockPos(user.getPos().getX() - RADIUS, user.getPos().getY() - HEIGHT, user.getPos().getZ() - RADIUS);
            BlockPos cornerRight = new BlockPos(user.getPos().getX() + RADIUS, user.getPos().getY() + HEIGHT, user.getPos().getZ() + RADIUS);

            world.getEntitiesByClass(SilverfishEntity.class, new Box(cornerLeft, cornerRight), EntityPredicates.VALID_LIVING_ENTITY)
                    .forEach(entity -> entity.damage(DamageSource.player(user), 20));

            world.getEntitiesByClass(EndermiteEntity.class, new Box(cornerLeft, cornerRight), EntityPredicates.VALID_LIVING_ENTITY)
                    .forEach(entity -> entity.damage(DamageSource.player(user), 20));

            world.playSound(null, user.getBlockPos(), Sounds.SILVER_FISH_SPRAY_USAGE_EVENT, SoundCategory.PLAYERS, 1f, 1f);
            user.getStackInHand(hand).damage(1, user, (e) -> e.sendToolBreakStatus(hand));
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.dodge.silver_fish_spray.tooltip_1"));
        tooltip.add(new TranslatableText("item.dodge.silver_fish_spray.tooltip_2"));
    }
}