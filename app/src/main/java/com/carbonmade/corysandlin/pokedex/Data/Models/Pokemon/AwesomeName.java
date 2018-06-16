package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class AwesomeName {
    @Json(name = "awesome_name")
    private String mAwesomeName;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    public String getAwesomeName() {
        return mAwesomeName;
    }

    public void setAwesomeName(String awesomeName) {
        mAwesomeName = awesomeName;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }
}
