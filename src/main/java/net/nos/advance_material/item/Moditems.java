package net.nos.advance_material.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nos.advance_material.Advance_Material;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Advance_Material.MOD_ID);





    //Add items below
    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));
    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("limestone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));
    public static final RegistryObject<Item> COKE = ITEMS.register("coke",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));
    public static final RegistryObject<Item> SCRAP = ITEMS.register("scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));
    public static final RegistryObject<Item> HEMATITE = ITEMS.register("hematite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));
    public static final RegistryObject<Item> MAGNETITE = ITEMS.register("magnetite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));
    public static final RegistryObject<Item> GOETHITE = ITEMS.register("goethite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));
    public static final RegistryObject<Item> SIDERITE = ITEMS.register("siderite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));
    public static final RegistryObject<Item> LIMONITE = ITEMS.register("limonite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Advance_Material).stacksTo(64)));

    //Add items above





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
