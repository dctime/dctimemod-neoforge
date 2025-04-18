package github.dctime.dctimemod.block;

import net.minecraft.core.HolderLookup;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class BlockLootSubProvider extends net.minecraft.data.loot.BlockLootSubProvider {
    public BlockLootSubProvider(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RegisterBlocks.BLOCKS.getEntries().stream().map(e -> (Block)e.value()).toList();
    }

    @Override
    protected void generate() {
        this.add(RegisterBlocks.BUILD_HELPER_BLOCK.get(), this.createSingleItemTable(RegisterBlockItems.BUILD_HELPER_BLOCK_ITEM));

    }
}
