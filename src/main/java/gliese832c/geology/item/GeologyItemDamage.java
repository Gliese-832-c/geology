package gliese832c.geology.item;

import gliese832c.geology.enums.BlockTypes;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class GeologyItemDamage extends ItemTool {
    protected GeologyItemDamage(float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn) {
        super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
        this.maxStackSize = 64;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        return 1.0f;
    }
    
    public ItemStack getStackFromMetaID(int meta) {
        return new ItemStack(this, 1, meta);
    }
}
