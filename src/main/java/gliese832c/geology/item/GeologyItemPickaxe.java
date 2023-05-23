package gliese832c.geology.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class GeologyItemPickaxe extends ItemPickaxe {
    protected GeologyItemPickaxe(ToolMaterial material) {
        super(material);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        return true;
    }
}
