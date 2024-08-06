package de.pnku.mbhv.mixin;

import de.pnku.mbhv.block.MoreBeehiveVariantBlock;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {

    @Inject(method = "isValid", at = @At("HEAD"), cancellable = true)
    private void injectedIsValid(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (BlockEntityType.BEEHIVE.equals(this) && state.getBlock() instanceof MoreBeehiveVariantBlock) {
            cir.setReturnValue(true);
        }
    }
}
