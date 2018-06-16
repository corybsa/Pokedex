package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class Genus {
    @Json(name = "genus")
    private String mGenus;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    public String getGenus() {
        return mGenus;
    }

    public void setGenus(String genus) {
        mGenus = genus;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }
}
