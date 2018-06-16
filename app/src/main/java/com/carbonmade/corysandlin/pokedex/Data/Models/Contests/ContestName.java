package com.carbonmade.corysandlin.pokedex.Data.Models.Contests;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class ContestName {
    @Json(name = "name")
    private String mName;

    @Json(name = "color")
    private String mColor;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }
}
