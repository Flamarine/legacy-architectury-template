package net.examplemod;

import com.google.common.base.Suppliers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class ExampleMod {
    public static final String MOD_ID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "1.0";
    public static Logger LOGGER = LogManager.getLogger(NAME);

    public static void init() {
        LOGGER.info(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
