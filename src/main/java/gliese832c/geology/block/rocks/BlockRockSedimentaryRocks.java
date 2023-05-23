package gliese832c.geology.block.rocks;

import gliese832c.geology.block.BlockMetaFalling;
import gliese832c.geology.enums.BlockTypes;
import gliese832c.geology.tab.GeologyTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Random;

public class BlockRockSedimentaryRocks extends BlockMetaFalling
{
    public final static PropertyEnum TYPE = PropertyEnum.create("type", BlockTypes.RockSedimentaryTypes.class);
    private static final AxisAlignedBB ROCKS_AABB = new AxisAlignedBB(1.0 / 16.0, 0.0 / 16.0, 1.0 / 16.0, 15.0 / 16.0, 2.0 / 16.0, 15.0 / 16.0);

    public BlockRockSedimentaryRocks()
    {
        super(BlockTypes.RockSedimentaryTypes.class, TYPE, Material.SAND);
        setCreativeTab(GeologyTabs.ROCKS);
        //setHarvestLevel("shovel", 0);
    }

    @Override
    public float getBlockHardness(IBlockState state, World world, BlockPos pos)
    {
        // return ((BlockTypes.RockSedimentaryTypes) state.getValue(type)).getHardness();
        return 0.5f;
    }

    @Override
    public String getHarvestTool(IBlockState state)
    {
        // return ((BlockTypes.RockSedimentaryTypes) state.getValue(type)).getHarvestTool();
        return null;
    }

    public int getHarvestLevel(IBlockState state)
    {
        // return ((BlockTypes.RockSedimentaryTypes) state.getValue(type)).getHarvestLevel();
        return -1;
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((BlockTypes.RockSedimentaryTypes) state.getValue(type)).getID();
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(type, values[meta]);
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return ((BlockTypes.RockSedimentaryTypes) state.getValue(type)).getID();
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((BlockTypes.RockSedimentaryTypes) state.getValue(type)).getID());
    }


    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, TYPE);
    }



    @Override
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }





    @Override
    public boolean isFullCube(@Nonnull IBlockState state) {
        return false;
    }

    @Override
    @Nonnull
    public BlockFaceShape getBlockFaceShape(@Nonnull IBlockAccess worldIn, @Nonnull IBlockState state, @Nonnull BlockPos pos, @Nonnull EnumFacing face) {
        return BlockFaceShape.UNDEFINED;
    }

    @Override
    public boolean isOpaqueCube(@Nonnull IBlockState state) {
        return false;
    }

    @Override
    @Nonnull
    public AxisAlignedBB getBoundingBox(@Nonnull IBlockState state, @Nonnull IBlockAccess source, @Nonnull BlockPos pos) {
        return ROCKS_AABB;
    }



    public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) { return true; }
    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) { return NULL_AABB; }
    public Block.EnumOffsetType getOffsetType() { return Block.EnumOffsetType.XZ; }
}