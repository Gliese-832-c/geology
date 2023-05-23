package gliese832c.geology.item;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class GeologyItemChisel extends ItemTool {


    protected GeologyItemChisel(float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) {
        super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        return true;
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return com.google.common.collect.ImmutableSet.of("chisel");
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        return 1.0f;
    }
}