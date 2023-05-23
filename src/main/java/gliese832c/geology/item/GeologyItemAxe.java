package gliese832c.geology.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class GeologyItemAxe extends ItemAxe {
    protected GeologyItemAxe(ToolMaterial material) {
        super(material, material.getAttackDamage(), -2.6F);
        this.setMaxDamage(material.getMaxUses() / 5);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(1, attacker);
        return true;
    }
}
