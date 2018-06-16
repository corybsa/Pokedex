package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PalParkEncounterArea {
    @Json(name = "base_score")
    private int mBaseScore;

    @Json(name = "rate")
    private int mRate;

    @Json(name = "area")
    private NamedApiResource mArea;

    public int getBaseScore() {
        return mBaseScore;
    }

    public void setBaseScore(int baseScore) {
        mBaseScore = baseScore;
    }

    public int getRate() {
        return mRate;
    }

    public void setRate(int rate) {
        mRate = rate;
    }

    public NamedApiResource getArea() {
        return mArea;
    }

    public void setArea(NamedApiResource area) {
        mArea = area;
    }
}
