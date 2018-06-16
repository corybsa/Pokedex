package com.carbonmade.corysandlin.pokedex.Data.Models.Items;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Effect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class ItemFlingEffect {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "effect_entries")
    private List<Effect> mEffectEntries;

    @Json(name = "items")
    private List<NamedApiResource> mItems;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<Effect> getEffectEntries() {
        return mEffectEntries;
    }

    public void setEffectEntries(List<Effect> effectEntries) {
        mEffectEntries = effectEntries;
    }

    public List<NamedApiResource> getItems() {
        return mItems;
    }

    public void setItems(List<NamedApiResource> items) {
        mItems = items;
    }
}
