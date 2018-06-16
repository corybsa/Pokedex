package com.carbonmade.corysandlin.pokedex.Data.Models.Items;

import com.squareup.moshi.Json;

public class ItemSprite {
    @Json(name = "default")
    private String mDefault;

    public String getDefault() {
        return mDefault;
    }

    public void setDefault(String aDefault) {
        mDefault = aDefault;
    }
}
