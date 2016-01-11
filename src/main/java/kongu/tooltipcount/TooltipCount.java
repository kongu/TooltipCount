package kongu.tooltipcount;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = TooltipCount.MOD_ID, version = TooltipCount.VERSION, name = TooltipCount.MOD_NAME)
public class TooltipCount
{
	public static final String MOD_ID = "tooltipcount";
	public static final String VERSION = "0.0.1";
	public static final String MOD_NAME = "TooltipCount";

	@Mod.Instance(MOD_ID)
	public static TooltipCount instance;

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new TooltipHandler());
	}
}