package com.carbonmade.corysandlin.pokedex.Data.Models.Berries;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class BerryFlavor {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "berries")
    private List<BerryFlavorMap> mBerries;

    @Json(name = "content_type")
    private NamedApiResource mContentType;

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

    public List<BerryFlavorMap> getBerries() {
        return mBerries;
    }

    public void setBerries(List<BerryFlavorMap> berries) {
        mBerries = berries;
    }

    public NamedApiResource getContentType() {
        return mContentType;
    }

    public void setContentType(NamedApiResource contentType) {
        mContentType = contentType;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }
}
