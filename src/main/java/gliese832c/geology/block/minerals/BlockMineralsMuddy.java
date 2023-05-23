package gliese832c.geology.block.minerals;

import gliese832c.geology.block.BlockMetaFalling;
import gliese832c.geology.enums.BlockTypes;
import gliese832c.geology.tab.GeologyTabs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockMineralsMuddy extends BlockMetaFalling
{
    public final static PropertyEnum TYPE = PropertyEnum.create("type", BlockTypes.MineralsMuddy.class);

    public BlockMineralsMuddy()
    {
        super(BlockTypes.MineralsMuddy.class, TYPE, Material.CLAY);
        setCreativeTab(GeologyTabs.ORES);
        setSoundType(SoundType.SLIME);
    }

    @Override
    public float getBlockHardness(IBlockState state, World world, BlockPos pos)
    {
        return ((BlockTypes.MineralsMuddy) state.getValue(type)).getHardness();
    }

    @Override
    public String getHarvestTool(IBlockState state)
    {
        return ((BlockTypes.MineralsMuddy) state.getValue(type)).getHarvestTool();
    }

    public int getHarvestLevel(IBlockState state)
    {
        return ((BlockTypes.MineralsMuddy) state.getValue(type)).getHarvestLevel();
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((BlockTypes.MineralsMuddy) state.getValue(type)).getID();
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(type, values[meta]);
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return ((BlockTypes.MineralsMuddy) state.getValue(type)).getID();
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((BlockTypes.MineralsMuddy) state.getValue(type)).getID());
    }


    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, TYPE);
    }
}