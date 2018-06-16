package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokemonType {
    @ColumnInfo(name = "slot")
    @Json(name = "slot")
    private int mSlot;

    @Embedded
    @Json(name = "type")
    private NamedApiResource mType;

    public int getSlot() {
        return mSlot;
    }

    public void setSlot(int slot) {
        mSlot = slot;
    }

    public NamedApiResource getType() {
        return mType;
    }

    public void setType(NamedApiResource type) {
        mType = type;
    }
}
