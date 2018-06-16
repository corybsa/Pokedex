package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

public class Effect {
    @Json(name = "effect")
    private String mEffect;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    public String getEffect() {
        return mEffect;
    }

    public void setEffect(String effect) {
        mEffect = effect;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }
}
