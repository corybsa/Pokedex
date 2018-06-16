package com.carbonmade.corysandlin.pokedex.Data.Models.Moves;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class MoveStatChange {
    @Json(name = "change")
    private int mChange;

    @Json(name = "stat")
    private NamedApiResource mStat;

    public int getChange() {
        return mChange;
    }

    public void setChange(int change) {
        mChange = change;
    }

    public NamedApiResource getStat() {
        return mStat;
    }

    public void setStat(NamedApiResource stat) {
        mStat = stat;
    }
}
