package gliese832c.geology.block.item;

// Code taken from tomdodd4598's NuclearCraft (of course with the appropriate licnense) - Thanks, Tom
// https://github.com/tomdodd4598/NuclearCraft

import gliese832c.geology.block.IBlockMeta;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.IStringSerializable;

public class ItemBlockMeta extends ItemBlock
{
    public <T extends Enum<T> & IStringSerializable> ItemBlockMeta(Block block, Class<T> enumm) {
        super(block);
        if (!(block instanceof IBlockMeta)) {
            throw new IllegalArgumentException(String.format("The block %s for this ItemBlockMeta is not an instance of IBlockMeta!", block.getTranslationKey()));
        }
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return getTranslationKey() + "." + ((IBlockMeta) block).getMetaName(stack);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }
}
