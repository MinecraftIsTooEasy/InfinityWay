package huix.infinity.common.core.tag;

import huix.infinity.init.InfinityWay;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class IFWEntityTypeTags {
    public static final TagKey<EntityType<?>> LIVESTOCK = create("ifw_livestock");

    private static TagKey<EntityType<?>> create(String name) {
        return TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(InfinityWay.MOD_ID, name));
    }
}
