package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class NaturePokeathlonStatAffect {
    @Json(name = "max_change")
    private int mMaxChange;

    @Json(name = "nature")
    private NamedApiResource mNature;

    public int getMaxChange() {
        return mMaxChange;
    }

    public void setMaxChange(int maxChange) {
        mMaxChange = maxChange;
    }

    public NamedApiResource getNature() {
        return mNature;
    }

    public void setNature(NamedApiResource nature) {
        mNature = nature;
    }
}
