package com.carbonmade.corysandlin.pokedex.Data.Models.Items;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class ItemPocket {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "categories")
    private List<NamedApiResource> mCategories;

    @Json(name = "names")
    private List<Name> mNames;

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

    public List<NamedApiResource> getCategories() {
        return mCategories;
    }

    public void setCategories(List<NamedApiResource> categories) {
        mCategories = categories;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }
}
