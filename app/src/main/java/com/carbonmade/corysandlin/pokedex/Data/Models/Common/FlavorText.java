package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

public class FlavorText {
    @Json(name = "flavor_text")
    private String mFlavorText;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    public String getFlavorText() {
        return mFlavorText;
    }

    public void setFlavorText(String flavorText) {
        mFlavorText = flavorText;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }
}
