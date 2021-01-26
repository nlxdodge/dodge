package nl.nlxdodge.scrapyard;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import nl.nlxdodge.scrapyard.blocks.ModBlocks;
import nl.nlxdodge.scrapyard.items.ModItems;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeInfo;
import top.theillusivec4.curios.api.SlotTypePreset;

public class ScrapyardMod implements ModInitializer {

	public static final String IDENTIFIER = "scrapyard";
	public static final ItemGroup SCRAP_YARD_GROUP = FabricItemGroupBuilder.create(new Identifier("scrapyard", "all"))
			.icon(() -> new ItemStack(ModItems.BAMBOO_SPEAR)).build();

	@Override
	public void onInitialize() {
		CuriosApi.enqueueSlotType(SlotTypeInfo.BuildScheme.REGISTER, SlotTypePreset.RING.getInfoBuilder().build());

		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
