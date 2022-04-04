package committee.nova.anazm.mixin;

import committee.nova.anazm.ANAZM;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin {
    @ModifyVariable(method = "getFov", at = @At(value = "RETURN", shift = At.Shift.BEFORE), ordinal = 0)
    private double getFov(double fov) {
        int d;
        if (ANAZM.zoomKeyBinding.isPressed()) {
            d = 9;
            ANAZM.isZooming = true;
        } else {
            d = 1;
            ANAZM.isZooming = false;
        }
        return fov / d;
    }
}
