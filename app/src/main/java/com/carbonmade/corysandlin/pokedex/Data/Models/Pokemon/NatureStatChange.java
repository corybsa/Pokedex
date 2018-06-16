package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class NatureStatChange {
    @Json(name = "max_change")
    private int mMaxChange;

    @Json(name = "pokeathlon_stat")
    private NamedApiResource mPokeathlonStat;

    public int getMaxChange() {
        return mMaxChange;
    }

    public void setMaxChange(int maxChange) {
        mMaxChange = maxChange;
    }

    public NamedApiResource getPokeathlonStat() {
        return mPokeathlonStat;
    }

    public void setPokeathlonStat(NamedApiResource pokeathlonStat) {
        mPokeathlonStat = pokeathlonStat;
    }
}
