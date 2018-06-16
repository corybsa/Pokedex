package com.carbonmade.corysandlin.pokedex.Data.Models.Evolutions;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class EvolutionChain {
    @Json(name = "id")
    private int mId;

    @Json(name = "baby_trigger_item")
    private NamedApiResource mBabyTriggerItem;

    @Json(name = "chain")
    private EvolutionChainLink mChain;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public NamedApiResource getBabyTriggerItem() {
        return mBabyTriggerItem;
    }

    public void setBabyTriggerItem(NamedApiResource babyTriggerItem) {
        mBabyTriggerItem = babyTriggerItem;
    }

    public EvolutionChainLink getChain() {
        return mChain;
    }

    public void setChain(EvolutionChainLink chain) {
        mChain = chain;
    }
}
