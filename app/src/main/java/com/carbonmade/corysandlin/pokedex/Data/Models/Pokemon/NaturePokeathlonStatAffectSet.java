package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.squareup.moshi.Json;

import java.util.List;

public class NaturePokeathlonStatAffectSet {
    @Json(name = "increase")
    private List<NaturePokeathlonStatAffect> mIncrease;

    @Json(name = "decrease")
    private List<NaturePokeathlonStatAffect> mDecrease;

    public List<NaturePokeathlonStatAffect> getIncrease() {
        return mIncrease;
    }

    public void setIncrease(List<NaturePokeathlonStatAffect> increase) {
        mIncrease = increase;
    }

    public List<NaturePokeathlonStatAffect> getDecrease() {
        return mDecrease;
    }

    public void setDecrease(List<NaturePokeathlonStatAffect> decrease) {
        mDecrease = decrease;
    }
}
