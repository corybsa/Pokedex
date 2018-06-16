package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

import java.util.List;

public class Encounter {
    @Json(name = "min_level")
    private int mMinLevel;

    @Json(name = "max_level")
    private int mMaxLevel;

    @Json(name = "condition_values")
    private List<NamedApiResource> mConditionValues;

    @Json(name = "chance")
    private int mChance;

    @Json(name = "method")
    private NamedApiResource mMethod;

    public int getMinLevel() {
        return mMinLevel;
    }

    public void setMinLevel(int minLevel) {
        mMinLevel = minLevel;
    }

    public int getMaxLevel() {
        return mMaxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        mMaxLevel = maxLevel;
    }

    public List<NamedApiResource> getConditionValues() {
        return mConditionValues;
    }

    public void setConditionValues(List<NamedApiResource> conditionValues) {
        mConditionValues = conditionValues;
    }

    public int getChance() {
        return mChance;
    }

    public void setChance(int chance) {
        mChance = chance;
    }

    public NamedApiResource getMethod() {
        return mMethod;
    }

    public void setMethod(NamedApiResource method) {
        mMethod = method;
    }
}
