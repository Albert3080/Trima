
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trima_biome.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.trima_biome.block.TriLeavesBlock;
import net.mcreator.trima_biome.block.TriGrassBlock;
import net.mcreator.trima_biome.TrimaMod;

public class TrimaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TrimaMod.MODID);
	public static final RegistryObject<Block> TRI_GRASS = REGISTRY.register("tri_grass", () -> new TriGrassBlock());
	public static final RegistryObject<Block> TRI_LEAVES = REGISTRY.register("tri_leaves", () -> new TriLeavesBlock());
}
