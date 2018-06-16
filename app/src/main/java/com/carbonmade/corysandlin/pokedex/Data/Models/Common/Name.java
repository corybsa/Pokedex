package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

public class Name {
    @Json(name = "name")
    private String mName;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }
}
