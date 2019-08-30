package dev.latvian.kubejs.entity;

import dev.latvian.kubejs.server.ServerJS;
import dev.latvian.kubejs.world.WorldEventJS;
import net.minecraft.entity.Entity;

/**
 * @author LatvianModder
 */
public class EntityEventJS extends WorldEventJS
{
	public final EntityJS entity;

	public EntityEventJS(EntityJS e)
	{
		super(e.world());
		entity = e;
	}

	public EntityEventJS(Entity e)
	{
		super(ServerJS.instance.world(e.world));
		entity = server.entity(e);
	}
}