package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class PokemonHeldItem {
    @ColumnInfo(name = "item")
    @Json(name = "item")
    private NamedApiResource mItem;

    @ColumnInfo(name = "version_details")
    @Json(name = "version_details")
    private List<PokemonHeldItemVersion> mVersionDetails;

    public NamedApiResource getItem() {
        return mItem;
    }

    public void setItem(NamedApiResource item) {
        mItem = item;
    }

    public List<PokemonHeldItemVersion> getVersionDetails() {
        return mVersionDetails;
    }

    public void setVersionDetails(List<PokemonHeldItemVersion> versionDetails) {
        mVersionDetails = versionDetails;
    }
}
