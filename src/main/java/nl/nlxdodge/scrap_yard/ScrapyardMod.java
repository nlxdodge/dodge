package nl.nlxdodge.scrap_yard;

import java.util.function.Supplier;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.Item.Settings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrap_yard.blocks.ScrapBlock;
import nl.nlxdodge.scrap_yard.items.weapons.BambooSpear;
import nl.nlxdodge.scrap_yard.items.weapons.GlassSword;
import nl.nlxdodge.scrap_yard.misc.ToolMaterials;

public class ScrapyardMod implements ModInitializer {

	public static final ItemGroup SCRAP_YARD_GROUP = FabricItemGroupBuilder.create(new Identifier("scrap_yard", "all"))
			.icon(() -> new ItemStack(Items.DARK_OAK_BOAT)).build();

	public static final Settings DEFAULT_SETTINGS = new Item.Settings().group(SCRAP_YARD_GROUP);

	public static final Item BAMBOO_SPEAR = new BambooSpear(ToolMaterials.BAMBOO, 2, 1.0f, DEFAULT_SETTINGS);
	public static final Item GLASS_SWORD = new GlassSword(ToolMaterials.GLASS, 2, 1.5f, DEFAULT_SETTINGS);
	public static final Block SCRAP_BLOCK = new ScrapBlock(
			AbstractBlock.Settings.of(Material.METAL, MaterialColor.BROWN).strength(2.0F).sounds(BlockSoundGroup.LODESTONE));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "glass_sword"), GLASS_SWORD);
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "bamboo_spear"), BAMBOO_SPEAR);
		Registry.register(Registry.BLOCK, new Identifier("scrap_yard", "scrap_block"), SCRAP_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "scrap_block"),
				new BlockItem(SCRAP_BLOCK, DEFAULT_SETTINGS));
	}
}
