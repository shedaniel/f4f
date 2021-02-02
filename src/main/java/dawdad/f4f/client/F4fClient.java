package dawdad.f4f.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

@Environment(EnvType.CLIENT)
public class F4fClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for (DyeColor value : DyeColor.values()) {
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
                return value.getFireworkColor();
            }, Registry.ITEM.get(new Identifier("f4f", value.name().toLowerCase(Locale.ROOT) + "_fabric")));
        }
    }
}
