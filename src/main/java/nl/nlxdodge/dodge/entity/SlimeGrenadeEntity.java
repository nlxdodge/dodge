package nl.nlxdodge.dodge.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public class SlimeGrenadeEntity extends SnowballEntity {

    private static final int SLOW_DURATION = 120;
    private static final int AMPLIFIER = 4;
    private static final int HEIGHT = 3;
    private static final int RADIUS = 3;
    Entity user;

    public SlimeGrenadeEntity(World world, PlayerEntity user) {
        super(world, user);
        this.user = user;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        if (entity instanceof LivingEntity livingEntity) {
            int damage = entity instanceof SlimeEntity ? 0 : 3;
            entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), (float) damage);
            livingEntity.setStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, SLOW_DURATION, AMPLIFIER), user);
        }
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        // TODO implement random splatter
        BlockPos cornerLeft = new BlockPos(user.getPos().getX() - RADIUS, user.getPos().getY() - HEIGHT, user.getPos().getZ() - RADIUS);
        BlockPos cornerRight = new BlockPos(user.getPos().getX() + RADIUS, user.getPos().getY() + HEIGHT, user.getPos().getZ() + RADIUS);
        world.getEntitiesByClass(LivingEntity.class, new Box(cornerLeft, cornerRight), EntityPredicates.VALID_LIVING_ENTITY)
                .forEach(entity -> entity.setStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, SLOW_DURATION, AMPLIFIER), user));

        if (!this.world.isClient) {
            this.world.sendEntityStatus(this, (byte) 3);
            this.discard();
        }
    }
}
