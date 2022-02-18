package com.brittank88.dmca.mixin;

import net.minecraft.entity.damage.DamageTracker;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DamageTracker.class)
public class DamageTrackerMixin {
    @Inject(method = "getDeathMessage", at = @At("RETURN"), cancellable = true)
    private void DMCA_getDeathMessage(CallbackInfoReturnable<Text> cir) {
        Vec3d pos = ((DamageTracker) (Object) this).getEntity().getPos();
        cir.setReturnValue(Text.of(String.format("%s at (%d, %d, %d)", cir.getReturnValue().getString(), (int)pos.getX(), (int)pos.getY(), (int)pos.getZ())));
    }
}
