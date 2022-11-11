package gliese832c.geology.block;

import gliese832c.geology.enums.IBlockMetaEnum;
import gliese832c.geology.util.CollectionHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

import javax.annotation.Nullable;
import java.util.Iterator;

public abstract class BlockMetaFalling<T extends Enum<T> & IStringSerializable & IBlockMetaEnum> extends BlockFalling implements IBlockMeta {

    public final T[] values;
    public final PropertyEnum<T> type;

    protected boolean canSustainPlant = true;
    protected boolean canCreatureSpawn = true;

    protected static boolean keepInventory;

    public BlockMetaFalling(Class<T> enumm, PropertyEnum<T> property, Material material) {
        super(material);
        values = enumm.getEnumConstants();
        type = property;
        setDefaultState(blockState.getBaseState().withProperty(type, values[0]));
        setMetaHarvestLevels();
        setHardness(2F);
        setResistance(15F);
    }



    @Override
    public String getMetaName(ItemStack stack) {
        //return values[StackHelper.getMetadata(stack)].getName();
        //return null;
        return values[stack.getMetadata()].getName();
    }

    public void setMetaHarvestLevels() {
        Iterator<T> itr = CollectionHelper.asList(values).iterator();
        while (itr.hasNext()) {
            T nextState = itr.next();
            setHarvestLevel(nextState.getHarvestTool(), nextState.getHarvestLevel(), getStateFromMeta(nextState.getID()));
        }
    }

    @Override
    public int getLightValue(IBlockState state, IBlockAccess world, BlockPos pos) {
        return state.getValue(type).getLightValue();
    }

    @Override
    public float getBlockHardness(IBlockState state, World world, BlockPos pos) {
        return state.getValue(type).getHardness();
    }

    @Override
    public float getExplosionResistance(World world, BlockPos pos, @Nullable Entity exploder, Explosion explosion) {
        return world.getBlockState(pos).getValue(type).getResistance();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(type).getID();
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(type, values[meta]);
    }

    @Override
    public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list) {
        for (int i = 0; i < values.length; i++) {
            list.add(new ItemStack(this, 1, i));
        }
    }

    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(state));
    }

    @Override
    public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
        return canSustainPlant && super.canSustainPlant(state, world, pos, direction, plantable);
    }

    @Override
    public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, net.minecraft.entity.EntityLiving.SpawnPlacementType type) {
        return canCreatureSpawn && super.canCreatureSpawn(state, world, pos, type);
    }

    @Override
    public boolean rotateBlock(World world, BlockPos pos, EnumFacing axis) {
        return false;
    }

    // Inventory
    public void dropItems(World world, BlockPos pos, IInventory inventory) {
        InventoryHelper.dropInventoryItems(world, pos, inventory);
    }
}