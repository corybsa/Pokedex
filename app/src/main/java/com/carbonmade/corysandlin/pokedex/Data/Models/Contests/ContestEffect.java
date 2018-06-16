package com.carbonmade.corysandlin.pokedex.Data.Models.Contests;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Effect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.FlavorText;
import com.squareup.moshi.Json;

import java.util.List;

public class ContestEffect {
    @Json(name = "id")
    private int mId;

    @Json(name = "appeal")
    private int mAppeal;

    @Json(name = "jam")
    private int mJam;

    @Json(name = "effect_entries")
    private List<Effect> mEffectEntries;

    @Json(name = "flavor_text_entries")
    private List<FlavorText> mFlavorTextEntries;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getAppeal() {
        return mAppeal;
    }

    public void setAppeal(int appeal) {
        mAppeal = appeal;
    }

    public int getJam() {
        return mJam;
    }

    public void setJam(int jam) {
        mJam = jam;
    }

    public List<Effect> getEffectEntries() {
        return mEffectEntries;
    }

    public void setEffectEntries(List<Effect> effectEntries) {
        mEffectEntries = effectEntries;
    }

    public List<FlavorText> getFlavorTextEntries() {
        return mFlavorTextEntries;
    }

    public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
        mFlavorTextEntries = flavorTextEntries;
    }
}
