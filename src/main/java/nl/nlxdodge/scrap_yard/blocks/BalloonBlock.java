package nl.nlxdodge.scrap_yard.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import nl.nlxdodge.scrap_yard.Sounds;

public class BalloonBlock extends Block {

    public BalloonBlock(Settings settings) {
        super(settings.nonOpaque().strength(2.0f));
    }

    @Override
    public boolean shouldDropItemsOnExplosion(Explosion explosion) {
        return false;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, Entity entity) {
        entity.addVelocity(0D, 1D, 0D);
        world.playSound(null, entity.getBlockPos(), Sounds.BALLOON_BLOCK_JUMP_EVENT, SoundCategory.PLAYERS, 1f, 1f);
    }
}
