package kongu.tooltipcount;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;

public class TooltipHandler
{
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onTooltip(ItemTooltipEvent event)
	{
		String currentItemName = event.itemStack.getItem().getUnlocalizedName();
		ItemStack[] inv = event.entityPlayer.inventory.mainInventory;

		int amount = 0;
		for (int i = 0; i < inv.length; i++)
		{
			if (inv[i] != null && inv[i].getItem().getUnlocalizedName().equals(currentItemName))
			{
				amount += inv[i].stackSize;
			}
		}

		event.toolTip.add("# in inventory: " + amount);
	}
}
