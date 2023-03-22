package net.nos.advance_material.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nos.advance_material.Advance_Material;
import net.nos.advance_material.item.ModCreativeModeTab;
import net.nos.advance_material.item.Moditems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Advance_Material.MOD_ID);





//Add blocks below
    public static final RegistryObject<Block> LIMESTONE_BLOCK = registerBlock("limestone_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().
                    strength(0.8f,4.0f)),
            ModCreativeModeTab.Advance_Material);
    public static final RegistryObject<Block> COKE_BLOCK = registerBlock("coke_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().
                    strength(6.0f,6.0f)),
            ModCreativeModeTab.Advance_Material);
    public static final RegistryObject<Block> RAW_IRON_ORE = registerBlock("raw_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().
                    strength(6.0f,6.0f)),
            ModCreativeModeTab.Advance_Material);

//Add blocks above





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block );
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
