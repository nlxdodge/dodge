package nl.nlxdodge.scrapyard;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketSlots;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import nl.nlxdodge.scrapyard.blocks.ModBlocks;
import nl.nlxdodge.scrapyard.items.ModItems;

public class ScrapyardMod implements ModInitializer {

	public static final ItemGroup SCRAP_YARD_GROUP = FabricItemGroupBuilder.create(new Identifier("scrapyard", "all"))
			.icon(() -> new ItemStack(net.minecraft.item.Items.BOWL)).build();

	@Override
	public void onInitialize() {
		TrinketSlots.addSlot(SlotGroups.HAND, Slots.RING,
				new Identifier("trinkets", "textures/item/empty_trinket_slot_ring.png"));

		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}