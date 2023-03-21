package net.nos.advance_material.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Advance_Material = new CreativeModeTab("advance_material") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.TEST.get());
        }
    };
}
