package com.sirmrmagoo.learn.item;

import com.sirmrmagoo.learn.Learn;
import net.minecraft.commands.arguments.item.ItemInput;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Learn.MODID);


    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new SwordItem(Tiers.TEST, 5, 15f, new Item.Properties()));

    public static final RegistryObject<Item> SOUL_SCYTHE = ITEMS.register("soul_scythe",
            () -> new SwordItem(Tiers.SOUL_SCYTHE, 5, 15f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static class  Tiers {
        public static final Tier TEST = new ForgeTier(2, 150, 50f, 5, 500,null, () -> Ingredient.of(ItemStack.EMPTY));
        public static final Tier SOUL_SCYTHE = new ForgeTier(3, 800, 15f, 7, 700,null, () -> Ingredient.of(ItemStack.EMPTY));
    }
}
