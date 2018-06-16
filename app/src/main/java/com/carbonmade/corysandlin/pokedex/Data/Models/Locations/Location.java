package com.carbonmade.corysandlin.pokedex.Data.Models.Locations;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.GenerationGameIndex;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Location {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "region")
    private NamedApiResource mRegion;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "game_indices")
    private List<GenerationGameIndex> mGameIndices;

    @Json(name = "areas")
    private List<NamedApiResource> mAreas;

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

    public NamedApiResource getRegion() {
        return mRegion;
    }

    public void setRegion(NamedApiResource region) {
        mRegion = region;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<GenerationGameIndex> getGameIndices() {
        return mGameIndices;
    }

    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        mGameIndices = gameIndices;
    }

    public List<NamedApiResource> getAreas() {
        return mAreas;
    }

    public void setAreas(List<NamedApiResource> areas) {
        mAreas = areas;
    }
}
