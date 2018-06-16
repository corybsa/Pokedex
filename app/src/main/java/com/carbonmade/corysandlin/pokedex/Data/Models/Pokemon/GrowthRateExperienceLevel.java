package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.squareup.moshi.Json;

public class GrowthRateExperienceLevel {
    @Json(name = "level")
    private int mLevel;

    @Json(name = "experience")
    private int mExperience;

    public int getLevel() {
        return mLevel;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public int getExperience() {
        return mExperience;
    }

    public void setExperience(int experience) {
        mExperience = experience;
    }
}
