package com.carbonmade.corysandlin.pokedex.Data.Models.Encounters;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.squareup.moshi.Json;

import java.util.List;

public class EncounterMethod {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "order")
    private int mOrder;

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

    public int getOrder() {
        return mOrder;
    }

    public void setOrder(int order) {
        mOrder = order;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }
}
