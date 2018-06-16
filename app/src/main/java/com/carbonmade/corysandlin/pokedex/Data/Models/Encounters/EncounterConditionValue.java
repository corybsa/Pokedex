package com.carbonmade.corysandlin.pokedex.Data.Models.Encounters;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class EncounterConditionValue {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "conditions")
    private List<NamedApiResource> mConditions;

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

    public List<NamedApiResource> getConditions() {
        return mConditions;
    }

    public void setConditions(List<NamedApiResource> conditions) {
        mConditions = conditions;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }
}
