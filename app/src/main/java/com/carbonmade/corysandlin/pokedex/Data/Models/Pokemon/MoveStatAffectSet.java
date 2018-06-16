package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.squareup.moshi.Json;

import java.util.List;

public class MoveStatAffectSet {
    @Json(name = "increase")
    private List<MoveStatAffect> mIncrease;

    @Json(name = "decrease")
    private List<MoveStatAffect> mDecrease;

    public List<MoveStatAffect> getIncrease() {
        return mIncrease;
    }

    public void setIncrease(List<MoveStatAffect> increase) {
        mIncrease = increase;
    }

    public List<MoveStatAffect> getDecrease() {
        return mDecrease;
    }

    public void setDecrease(List<MoveStatAffect> decrease) {
        mDecrease = decrease;
    }
}
