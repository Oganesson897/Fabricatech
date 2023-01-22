package og.hlft.fabricatech;

import net.minecraft.util.Identifier;

public class Utils {
    public static final String ID = "fabricatech";
    
    public static Identifier get(String path) {
        return new Identifier(ID, path);
    }
}
