package nl.nlxdodge.dodge.items.wearables;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import nl.nlxdodge.dodge.DodgeMod;

import java.util.List;

public class SeaAnchor extends SwordItem {

    public static final List<TagKey<Block>> suitableFor = List.of(
            BlockTags.ICE,
            BlockTags.CORALS,
            BlockTags.PICKAXE_MINEABLE
    );

    public SeaAnchor(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings.group(DodgeMod.SCRAP_YARD_GROUP));
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int damage = attacker.isSubmergedInWater() ? (int) Math.round(Math.random()) : 1;
        stack.damage(damage, attacker, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        int damage = miner.isSubmergedInWater() ? (int) Math.round(Math.random()) : 1;
        if (state.getHardness(world, pos) != 0.0F) {
            stack.damage(damage, miner, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return true;
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (state.streamTags().anyMatch(suitableFor::contains)) {
            return 20.0F;
        }
        return 1.5F;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return state.streamTags().anyMatch(suitableFor::contains);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.dodge.sea_anchor.tooltip"));
    }
}
