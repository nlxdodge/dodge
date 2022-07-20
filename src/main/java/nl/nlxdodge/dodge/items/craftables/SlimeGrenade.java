package nl.nlxdodge.dodge.items.craftables;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SnowballItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import nl.nlxdodge.dodge.DodgeMod;
import nl.nlxdodge.dodge.entity.SlimeGrenadeEntity;

public class SlimeGrenade extends SnowballItem {
    public SlimeGrenade(Settings settings) {
        super(settings.maxCount(1).group(DodgeMod.DODGE_GROUP));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SPLASH_POTION_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!world.isClient) {
            SlimeGrenadeEntity slimeGrenadeEntity = new SlimeGrenadeEntity(world, user);
            slimeGrenadeEntity.setItem(itemStack);
            slimeGrenadeEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
            world.spawnEntity(slimeGrenadeEntity);
        }
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
}
