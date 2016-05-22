package newCommands;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	public static final String MODID = "newCommands";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLServerStartingEvent event) {
		event.registerServerCommand(new FlamingPigs());
	}
}
