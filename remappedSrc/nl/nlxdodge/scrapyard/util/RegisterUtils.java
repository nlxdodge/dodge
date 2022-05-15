package nl.nlxdodge.dodge.util;

import net.minecraft.util.Identifier;
import nl.nlxdodge.dodge.ScrapyardMod;

public class RegisterUtils {

    public static Identifier getIdentifier(String path) {
        return new Identifier(ScrapyardMod.IDENTIFIER, path);
    }
}
