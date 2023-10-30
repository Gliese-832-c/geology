package gliese832c.geology.block.minerals;

import gliese832c.geology.block.BlockMetaFalling;
import gliese832c.geology.enums.BlockTypes;
import gliese832c.geology.tab.GeologyTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMineralsGravel extends BlockMetaFalling
{
    public final static PropertyEnum TYPE = PropertyEnum.create("type", BlockTypes.MineralsGravel.class);

    public BlockMineralsGravel()
    {
        super(BlockTypes.MineralsGravel.class, TYPE, Material.SAND);
        setCreativeTab(GeologyTabs.ORES);
        setSoundType(SoundType.GROUND);
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     * @deprecated call via {@link IBlockState#getMapColor(IBlockAccess,BlockPos)} whenever possible.
     * Implementing/overriding is fine.
     */
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return MapColor.STONE;
    }

    @Override
    public float getBlockHardness(IBlockState state, World world, BlockPos pos)
    {
        return ((BlockTypes.MineralsGravel) state.getValue(type)).getHardness();
    }

    @Override
    public String getHarvestTool(IBlockState state)
    {
        return ((BlockTypes.MineralsGravel) state.getValue(type)).getHarvestTool();
    }

    public int getHarvestLevel(IBlockState state)
    {
        return ((BlockTypes.MineralsGravel) state.getValue(type)).getHarvestLevel();
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((BlockTypes.MineralsGravel) state.getValue(type)).getID();
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(type, values[meta]);
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return ((BlockTypes.MineralsGravel) state.getValue(type)).getID();
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((BlockTypes.MineralsGravel) state.getValue(type)).getID());
    }


    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, TYPE);
    }
}