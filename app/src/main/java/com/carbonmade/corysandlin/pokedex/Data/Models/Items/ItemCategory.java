package com.carbonmade.corysandlin.pokedex.Data.Models.Items;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class ItemCategory {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "items")
    private List<NamedApiResource> mItems;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pocket")
    private NamedApiResource mPocket;

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

    public List<NamedApiResource> getItems() {
        return mItems;
    }

    public void setItems(List<NamedApiResource> items) {
        mItems = items;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public NamedApiResource getPocket() {
        return mPocket;
    }

    public void setPocket(NamedApiResource pocket) {
        mPocket = pocket;
    }
}
