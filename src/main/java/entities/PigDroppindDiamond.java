package entities;

import java.util.Random;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigDroppindDiamond {

	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event) {
		if (!(event.entity instanceof EntityPig)) {
			return;
		}
		Random random = new Random();
		if (!event.entity.worldObj.isRemote) {
			event.entity.dropItem(Items.diamond, random.nextInt(3));
		}
	}
}
