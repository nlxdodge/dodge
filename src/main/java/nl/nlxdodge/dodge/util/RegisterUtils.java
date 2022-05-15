package nl.nlxdodge.dodge.util;

import net.minecraft.util.Identifier;
import nl.nlxdodge.dodge.DodgeMod;

public class RegisterUtils {

    public static Identifier getIdentifier(String path) {
        return new Identifier(DodgeMod.IDENTIFIER, path);
    }
}
