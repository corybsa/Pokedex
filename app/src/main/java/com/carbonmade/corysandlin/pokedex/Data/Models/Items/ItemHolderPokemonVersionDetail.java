package com.carbonmade.corysandlin.pokedex.Data.Models.Items;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class ItemHolderPokemonVersionDetail {
    @Json(name = "rarity")
    private String mRarity;

    @Json(name = "version")
    private NamedApiResource mVersion;

    public String getRarity() {
        return mRarity;
    }

    public void setRarity(String rarity) {
        mRarity = rarity;
    }

    public NamedApiResource getVersion() {
        return mVersion;
    }

    public void setVersion(NamedApiResource version) {
        mVersion = version;
    }
}
