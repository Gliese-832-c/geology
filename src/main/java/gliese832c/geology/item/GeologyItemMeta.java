package gliese832c.geology.item;

import gliese832c.geology.enums.IMetaEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.text.TextFormatting;

public class GeologyItemMeta<T extends Enum<T> & IStringSerializable & IMetaEnum> extends Item {

    private final Class<T> enumm;
    public final T[] values;

    public final TextFormatting infoColor;
    private final String[][] tooltips;
    public String[][] info;

    public GeologyItemMeta(Class<T> enumm, TextFormatting infoColor, String[]... tooltips) {
        setHasSubtypes(true);
        this.enumm = enumm;
        values = enumm.getEnumConstants();
        this.infoColor = infoColor;
        this.tooltips = tooltips;
    }

    public GeologyItemMeta(Class<T> enumm, String[]... tooltips) {
        this(enumm, TextFormatting.AQUA, tooltips);
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
}