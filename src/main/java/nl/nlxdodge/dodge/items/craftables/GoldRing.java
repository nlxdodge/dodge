package nl.nlxdodge.dodge.items.craftables;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import nl.nlxdodge.dodge.items.BasicItem;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GoldRing extends BasicItem {
    public GoldRing(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("item.scrapyard.gold_ring.tooltip"));
    }
}