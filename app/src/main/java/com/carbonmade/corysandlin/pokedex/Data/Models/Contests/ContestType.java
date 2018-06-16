package com.carbonmade.corysandlin.pokedex.Data.Models.Contests;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class ContestType {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "berry_flavor")
    private NamedApiResource mBerryFlavor;

    @Json(name = "names")
    private List<ContestName> mNames;

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

    public NamedApiResource getBerryFlavor() {
        return mBerryFlavor;
    }

    public void setBerryFlavor(NamedApiResource berryFlavor) {
        mBerryFlavor = berryFlavor;
    }

    public List<ContestName> getNames() {
        return mNames;
    }

    public void setNames(List<ContestName> names) {
        mNames = names;
    }
}
