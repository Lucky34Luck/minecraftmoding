package movements;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
	public static final String MODID = "MovementsMod";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new SuperJump());
		FMLCommonHandler.instance().bus().register(new Parachute());
		MinecraftForge.EVENT_BUS.register(new Parachute());
		MinecraftForge.EVENT_BUS.register(new GolemWallClimb());
	}
}
