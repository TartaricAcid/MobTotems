package com.corwinjv.mobtotems.blocks.tiles.TotemLogic;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * Created by CorwinJV on 1/25/2017.
 */
public abstract class TotemLogic {
    public enum EffectType {
        EFFECT,
        MODIFIER
    }

    public abstract List<ItemStack> getCost();

    @Nonnull
    public abstract EffectType getEffectType();

    @Nonnull
    public Modifiers adjustModifiers(Modifiers modifiers) {
        return modifiers;
    }

    public void performEffect(World world, BlockPos pos, Modifiers modifiers) {
    }
}
