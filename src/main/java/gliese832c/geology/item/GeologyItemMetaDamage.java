package gliese832c.geology.item;

import gliese832c.geology.enums.IMetaEnum;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;

import javax.annotation.Nonnull;
import java.util.Set;

public class GeologyItemMetaDamage<T extends Enum<T> & IStringSerializable & IMetaEnum> extends GeologyItemDamage {


    private String specialProperty;


    private final Class<T> enumm;
    public final T[] values;

    public final TextFormatting infoColor;
    private final String[][] tooltips;
    public String[][] info;

    public GeologyItemMetaDamage(float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, Class<T> enumm, String specialProperty, TextFormatting infoColor, String[]... tooltips) {
        super(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn);
        setHasSubtypes(true);
        this.enumm = enumm;
        values = enumm.getEnumConstants();
        this.infoColor = infoColor;
        this.tooltips = tooltips;
        this.specialProperty = specialProperty;
    }

    public GeologyItemMetaDamage(float attackDamageIn, float attackSpeedIn, ToolMaterial materialIn, Set<Block> effectiveBlocksIn, Class<T> enumm, String specialProperty, String[]... tooltips) {
        this(attackDamageIn, attackSpeedIn, materialIn, effectiveBlocksIn, enumm, specialProperty, TextFormatting.AQUA, tooltips);
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        if (isInCreativeTab(tab)) {
            for (int i = 0; i < values.length; ++i) {
                items.add(new ItemStack(this, 1, i));
            }
        }
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        for (int i = 0; i < values.length; ++i) {
            if (stack.getMetadata() == i) {
                return getTranslationKey() + "." + values[i].getName();
            }
        }
        return getTranslationKey() + "." + values[0].getName();
    }

    protected ActionResult<ItemStack> actionResult(boolean success, ItemStack stack) {
        return new ActionResult<>(success ? EnumActionResult.SUCCESS : EnumActionResult.FAIL, stack);
    }



    @Override
    public String getItemStackDisplayName(@Nonnull ItemStack stack) {
        if (this.specialProperty.equals("rock_item")) {
            String langKey = this.getUnlocalizedNameInefficiently(stack);
            langKey = langKey.replaceAll("_item", "");
            langKey = langKey.replaceAll("item.", "tile.");
            return I18n.translateToLocal(langKey + ".name").trim() + " " + I18n.translateToLocal("descriptor.geology.item_rock").trim();
        } else if (this.specialProperty.equals("shard_item")) {
            String langKey = this.getUnlocalizedNameInefficiently(stack);
            //langKey = langKey.replaceAll("_item", "");
            //langKey = langKey.replaceAll("item.", "tile.");
            return I18n.translateToLocal(langKey + ".name").trim() + " " + I18n.translateToLocal("descriptor.geology.item_shard").trim();
        } else {
            return I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name").trim();
        }
    }
}