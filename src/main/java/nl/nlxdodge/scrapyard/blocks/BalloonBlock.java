package nl.nlxdodge.scrapyard.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import nl.nlxdodge.scrapyard.Sounds;

public class BalloonBlock extends BasicBlock {

    public BalloonBlock(Settings settings) {
        super(settings.nonOpaque().strength(2.0f));
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        entity.addVelocity(entity.getVelocity().getX() * 1.5, 1D, entity.getVelocity().getZ() * 1.5);
        world.playSound(null, entity.getBlockPos(), Sounds.BALLOON_BLOCK_JUMP_EVENT, SoundCategory.PLAYERS, 1f, 1f);
    }
}
