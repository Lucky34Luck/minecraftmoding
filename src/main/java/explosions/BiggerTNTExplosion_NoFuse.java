package explosions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BiggerTNTExplosion_NoFuse {
	float power = 32.0f;

	@SubscribeEvent
	public void explode(EntityJoinWorldEvent event) {
		if (!(event.entity instanceof EntityTNTPrimed)) {
			return;
		}
		Entity tnt = event.entity;
		event.entity.worldObj.createExplosion(tnt, tnt.posX, tnt.posY, tnt.posZ, power, true);
	}
}
