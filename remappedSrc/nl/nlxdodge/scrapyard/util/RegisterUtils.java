package nl.nlxdodge.scrapyard.util;

import net.minecraft.util.Identifier;
import nl.nlxdodge.scrapyard.ScrapyardMod;

public class RegisterUtils {

    public static Identifier getIdentifier(String path) {
        return new Identifier(ScrapyardMod.IDENTIFIER, path);
    }
}
