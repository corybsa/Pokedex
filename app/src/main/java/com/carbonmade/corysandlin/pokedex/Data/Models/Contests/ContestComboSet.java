package com.carbonmade.corysandlin.pokedex.Data.Models.Contests;

import com.squareup.moshi.Json;

public class ContestComboSet {
    @Json(name = "normal")
    private ContestComboDetail mNormal;

    @Json(name = "super")
    private ContestComboDetail mSuper;

    public ContestComboDetail getNormal() {
        return mNormal;
    }

    public void setNormal(ContestComboDetail normal) {
        mNormal = normal;
    }

    public ContestComboDetail getSuper() {
        return mSuper;
    }

    public void setSuper(ContestComboDetail aSuper) {
        mSuper = aSuper;
    }
}
