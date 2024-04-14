package com.poupeuu.not_enough_bugs;

import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(NotEnoughBugs.MODID)
public class NotEnoughBugs
{
    public static final String MODID = "not_enough_bugs";

    public static final NonNullSupplier<Registrate> REGISTRATE = NonNullSupplier.lazy(() -> Registrate.create(MODID));

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final RegistryEntry<Block> TEST_BLOCK = REGISTRATE.get().block("test_block", Block::new)
            .simpleItem()
            .defaultBlockstate()
            .defaultLoot()
            .lang("Test Block")
            .register();

    public NotEnoughBugs()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


    }
}
