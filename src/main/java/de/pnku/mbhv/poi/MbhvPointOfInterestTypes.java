package de.pnku.mbhv.poi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import de.pnku.mbhv.init.MbhvBlockInit;
import de.pnku.mbhv.mixin.PoiTypesAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MbhvPointOfInterestTypes {
    public static void init() {
        Map<BlockState, Holder<PoiType>> poiStatesToType = PoiTypesAccessor
                .getPointOfInterestStatesToType();

        Holder<PoiType> beehiveEntry = BuiltInRegistries.POINT_OF_INTEREST_TYPE
                .getHolder(PoiTypes.BEEHIVE).get();

        PoiType beehivePoiType = BuiltInRegistries.POINT_OF_INTEREST_TYPE.get(PoiTypes.BEEHIVE);

        List<BlockState> beehiveBlockStates = new ArrayList<BlockState>(beehivePoiType.matchingStates);

        for (Block block : MbhvBlockInit.more_beehives) {
            ImmutableList<BlockState> blockStates = block.getStateDefinition().getPossibleStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, beehiveEntry);
            }

            beehiveBlockStates.addAll(blockStates);
        }

        beehivePoiType.matchingStates = ImmutableSet.copyOf(beehiveBlockStates);
    }
}