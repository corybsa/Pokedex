package com.carbonmade.corysandlin.pokedex.Data.Models.Contests;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.FlavorText;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class SuperContestEffect {
    @Json(name = "id")
    private int mId;

    @Json(name = "appeal")
    private int mAppeal;

    @Json(name = "flavor_text_entries")
    private List<FlavorText> mFlavorTextEntries;

    @Json(name = "moves")
    private List<NamedApiResource> mMoves;

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

    public List<FlavorText> getFlavorTextEntries() {
        return mFlavorTextEntries;
    }

    public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
        mFlavorTextEntries = flavorTextEntries;
    }

    public List<NamedApiResource> getMoves() {
        return mMoves;
    }

    public void setMoves(List<NamedApiResource> moves) {
        mMoves = moves;
    }
}
