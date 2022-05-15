package nl.nlxdodge.dodge.items.wearables;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import nl.nlxdodge.dodge.DodgeMod;

import java.util.List;

public class SeaAnchor extends SwordItem {

    public static final List<TagKey<Block>> suitableFor = List.of(
            BlockTags.SNOW,
            BlockTags.ICE,
            BlockTags.CORALS,
            BlockTags.PICKAXE_MINEABLE,
            nl.nlxdodge.dodge.util.BlockTags.PRISMARINE
    );

    public SeaAnchor(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings.group(DodgeMod.SCRAP_YARD_GROUP));
    }

    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if (state.streamTags().anyMatch(suitableFor::contains)) {
            return 20.0F;
        }
        return 1.5F;
    }

    public boolean isSuitableFor(BlockState state) {
        return state.streamTags().anyMatch(suitableFor::contains);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.dodge.sea_anchor.tooltip"));
    }
}
