package dawdad.f4f;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class F4f implements ModInitializer {
    @Override
    public void onInitialize() {
        for (DyeColor color : DyeColor.values()) {
            Registry.register(Registry.ITEM, new Identifier("f4f", color.name().toLowerCase(Locale.ROOT) + "_fabric"),
                    new Item(new Item.Settings().group(ItemGroup.MATERIALS)));
        }
    }
}
