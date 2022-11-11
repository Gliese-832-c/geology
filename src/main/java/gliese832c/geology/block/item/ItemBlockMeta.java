package gliese832c.geology.block.item;

// Initial code taken from tomdodd4598's NuclearCraft (of course with the appropriate license), though the class has been modified
// https://github.com/tomdodd4598/NuclearCraft

import gliese832c.geology.block.IBlockMeta;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.*;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.text.translation.I18n;

import javax.annotation.Nonnull;

public class ItemBlockMeta extends ItemBlock
{
    String specialProperty;

    public <T extends Enum<T> & IStringSerializable> ItemBlockMeta(Block block, Class<T> enumm, String specialProperty) {
        super(block);
        if (!(block instanceof IBlockMeta)) {
            throw new IllegalArgumentException(String.format("The block %s for this ItemBlockMeta is not an instance of IBlockMeta!", block.getTranslationKey()));
        }
        setMaxDamage(0);
        setHasSubtypes(true);

        this.specialProperty = specialProperty;
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return getTranslationKey() + "." + ((IBlockMeta) block).getMetaName(stack);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }



    @Override
    public String getItemStackDisplayName(@Nonnull ItemStack stack) {
        if (this.specialProperty.equals("cracked")) {
            String langKey = this.getUnlocalizedNameInefficiently(stack);
            langKey = langKey.replaceAll("_cracked", "");
            return I18n.translateToLocal("descriptor.geology.cracked").trim() + " " + I18n.translateToLocal(langKey + ".name").trim();
        } else if (this.specialProperty.equals("polished")) {
            String langKey = this.getUnlocalizedNameInefficiently(stack);
            langKey = langKey.replaceAll("_polished", "");
            return I18n.translateToLocal("descriptor.geology.polished").trim() + " " + I18n.translateToLocal(langKey + ".name").trim();
        } else if (this.specialProperty.equals("bricks")) {
            String langKey = this.getUnlocalizedNameInefficiently(stack);
            langKey = langKey.replaceAll("_bricks", "");
            return I18n.translateToLocal(langKey + ".name").trim() + " " + I18n.translateToLocal("descriptor.geology.bricks").trim();
        } else if (this.specialProperty.equals("boulder")) {
            String langKey = this.getUnlocalizedNameInefficiently(stack);
            langKey = langKey.replaceAll("_boulder", "");
            return I18n.translateToLocal(langKey + ".name").trim() + " " + I18n.translateToLocal("descriptor.geology.boulder").trim();
        } else if (this.specialProperty.equals("rocks")) {
            String langKey = this.getUnlocalizedNameInefficiently(stack);
            langKey = langKey.replaceAll("_rocks", "");
            return I18n.translateToLocal(langKey + ".name").trim() + " " + I18n.translateToLocal("descriptor.geology.rocks").trim();
        } else {
            return I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name").trim();
        }
    }

    private IBlockState getBlockState(ItemStack stack) {
        return block.getStateFromMeta(getMetadata(stack.getItemDamage()));
    }
}
