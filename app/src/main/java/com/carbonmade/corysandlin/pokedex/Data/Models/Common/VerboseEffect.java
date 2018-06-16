package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

public class VerboseEffect {
    @Json(name = "effect")
    private String mEffect;

    @Json(name = "short_effect")
    private String mShortEffect;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    public String getEffect() {
        return mEffect;
    }

    public void setEffect(String effect) {
        mEffect = effect;
    }

    public String getShortEffect() {
        return mShortEffect;
    }

    public void setShortEffect(String shortEffect) {
        mShortEffect = shortEffect;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }
}
