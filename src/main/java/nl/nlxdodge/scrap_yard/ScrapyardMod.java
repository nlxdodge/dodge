package nl.nlxdodge.scrap_yard;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketSlots;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrap_yard.blocks.ModBlocks;
import nl.nlxdodge.scrap_yard.blocks.entities.RecyclerBlockEntity;
import nl.nlxdodge.scrap_yard.items.ModItems;

public class ScrapyardMod implements ModInitializer {

	public static final ItemGroup SCRAP_YARD_GROUP = FabricItemGroupBuilder.create(new Identifier("scrap_yard", "all"))
			.icon(() -> new ItemStack(net.minecraft.item.Items.BOWL)).build();

	public static BlockEntityType<RecyclerBlockEntity> RECYCLER_BLOCK_ENTITY;

	@Override
	public void onInitialize() {
		TrinketSlots.addSlot(SlotGroups.HAND, Slots.RING,
				new Identifier("trinkets", "textures/item/empty_trinket_slot_ring.png"));

		ModItems.registerItems();
		ModBlocks.registerBlocks();

		/* Block Entities */
		RECYCLER_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "scrap_yard:recycler_block_entity",
				BlockEntityType.Builder.create(RecyclerBlockEntity::new, ModBlocks.RECYCLER_BLOCK).build(null));
	}
}
