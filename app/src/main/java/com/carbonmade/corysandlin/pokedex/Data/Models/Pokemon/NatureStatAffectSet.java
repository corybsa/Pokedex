package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class NatureStatAffectSet {
    @Json(name = "increase")
    private NamedApiResource mIncrease;

    @Json(name = "decrease")
    private NamedApiResource mDecrease;

    public NamedApiResource getIncrease() {
        return mIncrease;
    }

    public void setIncrease(NamedApiResource increase) {
        mIncrease = increase;
    }

    public NamedApiResource getDecrease() {
        return mDecrease;
    }

    public void setDecrease(NamedApiResource decrease) {
        mDecrease = decrease;
    }
}
