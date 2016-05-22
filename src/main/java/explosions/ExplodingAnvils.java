package explosions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ExplodingAnvils {

	@SubscribeEvent
	public void explode(LivingHurtEvent event) {
		if (event.source != DamageSource.anvil) {
			return;
		}

		Entity entity = event.entity;
		event.entity.worldObj.createExplosion(entity, entity.posX, entity.posY, entity.posZ, 10, false);
	}
}
