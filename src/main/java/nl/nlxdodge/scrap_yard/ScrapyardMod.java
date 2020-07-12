package nl.nlxdodge.scrap_yard;

import dev.emi.trinkets.api.SlotGroups;
import dev.emi.trinkets.api.Slots;
import dev.emi.trinkets.api.TrinketSlots;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrap_yard.blocks.RecyclerBlock;
import nl.nlxdodge.scrap_yard.blocks.ScrapBlock;
import nl.nlxdodge.scrap_yard.items.ScrapItem;
import nl.nlxdodge.scrap_yard.items.SilverFishSpray;
import nl.nlxdodge.scrap_yard.items.wearables.BambooSpear;
import nl.nlxdodge.scrap_yard.items.wearables.GlassSword;
import nl.nlxdodge.scrap_yard.items.wearables.KingRing;
import nl.nlxdodge.scrap_yard.misc.ToolMaterials;
import nl.nlxdodge.scrap_yard.misc.enchants.CorrosiveEnchant;

public class ScrapyardMod implements ModInitializer {

	/* Itemgroup */
	public static final ItemGroup SCRAP_YARD_GROUP = FabricItemGroupBuilder.create(new Identifier("scrap_yard", "all"))
			.icon(() -> new ItemStack(Items.BOWL)).build();

	/* Items and Blocks */
	public static final Item BAMBOO_SPEAR = new BambooSpear(ToolMaterials.BAMBOO, 2, 1.0f,
			new Item.Settings().group(SCRAP_YARD_GROUP));
	public static final Block SCRAP_BLOCK = new ScrapBlock(
			AbstractBlock.Settings.of(Material.METAL, MaterialColor.BROWN).strength(1.0F));
	public static final Block RECYCLER_BLOCK = new RecyclerBlock(
			AbstractBlock.Settings.of(Material.METAL, MaterialColor.GREEN).strength(3.0F));

	/* Enchants */
	public static final Enchantment CORROSIVE = Registry.register(Registry.ENCHANTMENT,
			new Identifier("scrap_yard", "corrosive"), new CorrosiveEnchant());

	/* Sounds */
	public static final Identifier SILVER_FISH_SPRAY_USAGE = new Identifier("scrap_yard:silver_fish_spray_usage");
	public static SoundEvent SILVER_FISH_SPRAY_USAGE_EVENT = new SoundEvent(SILVER_FISH_SPRAY_USAGE);

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "glass_sword"),
				new GlassSword(ToolMaterials.GLASS, 2, 1.5f, new Item.Settings().group(SCRAP_YARD_GROUP)));

		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "bamboo_spear"), BAMBOO_SPEAR);

		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "king_ring"),
				new KingRing(new Item.Settings().group(SCRAP_YARD_GROUP)));
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "silver_fish_spray"),
				new SilverFishSpray(new Item.Settings().group(SCRAP_YARD_GROUP)));

		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "scrap_item"),
				new ScrapItem(new Item.Settings().group(SCRAP_YARD_GROUP)));
		Registry.register(Registry.BLOCK, new Identifier("scrap_yard", "scrap_block"), SCRAP_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "scrap_block"),
				new BlockItem(SCRAP_BLOCK, new Item.Settings().group(SCRAP_YARD_GROUP)));

		Registry.register(Registry.BLOCK, new Identifier("scrap_yard", "recycler_block"), RECYCLER_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "recycler_block"),
				new BlockItem(RECYCLER_BLOCK, new Item.Settings().group(SCRAP_YARD_GROUP)));

		TrinketSlots.addSlot(SlotGroups.HAND, Slots.RING,
				new Identifier("trinkets", "textures/item/empty_trinket_slot_ring.png"));
	}
}
