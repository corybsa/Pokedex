package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokemonAbility {
    @ColumnInfo(name = "is_hidden")
    @Json(name = "is_hidden")
    private boolean mIsHidden;

    @ColumnInfo(name = "slot")
    @Json(name = "slot")
    private int mSlot;

    @ColumnInfo(name = "ability")
    @Json(name = "ability")
    private NamedApiResource mAbility;

    public boolean isHidden() {
        return mIsHidden;
    }

    public void setHidden(boolean hidden) {
        mIsHidden = hidden;
    }

    public int getSlot() {
        return mSlot;
    }

    public void setSlot(int slot) {
        mSlot = slot;
    }

    public NamedApiResource getAbility() {
        return mAbility;
    }

    public void setAbility(NamedApiResource ability) {
        mAbility = ability;
    }
}
