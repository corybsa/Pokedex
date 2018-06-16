package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

public class Description {
    @Json(name = "description")
    private String mDescription;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }
}
