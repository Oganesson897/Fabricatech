package og.hlft.fabricatech;

import net.minecraft.util.Identifier;

public class Utils {
    public static final String MODID = "fabricatech";
    
    public static Identifier asId(String path) {
        return new Identifier(MODID, path);
    }
}
