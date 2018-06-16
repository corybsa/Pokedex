package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokemonHeldItemVersion {
    @ColumnInfo(name = "version")
    @Json(name = "version")
    private NamedApiResource mVersion;

    @ColumnInfo(name = "rarity")
    @Json(name = "rarity")
    private int mRarity;

    public NamedApiResource getVersion() {
        return mVersion;
    }

    public void setVersion(NamedApiResource version) {
        mVersion = version;
    }

    public int getRarity() {
        return mRarity;
    }

    public void setRarity(int rarity) {
        mRarity = rarity;
    }
}
