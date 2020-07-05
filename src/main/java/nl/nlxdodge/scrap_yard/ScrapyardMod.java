package nl.nlxdodge.scrap_yard;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Settings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrap_yard.blocks.ScrapBlock;
import nl.nlxdodge.scrap_yard.items.weapons.BambooSpear;
import nl.nlxdodge.scrap_yard.items.weapons.GlassSword;
import nl.nlxdodge.scrap_yard.misc.ToolMaterials;

public class ScrapyardMod implements ModInitializer {
	public static Settings itemSettings = new Item.Settings();

	public static final Item GLASS_SWORD = new GlassSword(ToolMaterials.GLASS, 2, 2.0f, itemSettings);
	public static final Item BAMBOO_SPEAR = new BambooSpear(ToolMaterials.BAMBOO, 2, 2.0f, itemSettings);

	public static final Block SCRAP_BLOCK = new ScrapBlock(
			AbstractBlock.Settings.of(Material.METAL, MaterialColor.BROWN).strength(1.0F).sounds(BlockSoundGroup.BONE));

	public static final ItemGroup SCRAP_YARD_GROUP = FabricItemGroupBuilder.create(new Identifier("scrap_yard", "all"))
			.icon(() -> new ItemStack(BAMBOO_SPEAR)).build();

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "glass_sword"), GLASS_SWORD);
		Registry.register(Registry.ITEM, new Identifier("scrap_yard", "bamboo_spear"), BAMBOO_SPEAR);
		Registry.register(Registry.BLOCK, new Identifier("scrap_yard", "scrap"), SCRAP_BLOCK);
	}
}
