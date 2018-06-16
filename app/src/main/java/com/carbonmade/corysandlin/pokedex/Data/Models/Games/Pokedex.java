package com.carbonmade.corysandlin.pokedex.Data.Models.Games;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Description;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Pokedex {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "is_main_series")
    private boolean mIsMainSeries;

    @Json(name = "descriptions")
    private List<Description> mDescriptions;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pokemon_entries")
    private List<PokedexEntry> mPokedexEntries;

    @Json(name = "region")
    private NamedApiResource mRegion;

    @Json(name = "version_groups")
    private List<NamedApiResource> mVersionGroups;

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

    public boolean isMainSeries() {
        return mIsMainSeries;
    }

    public void setMainSeries(boolean mainSeries) {
        mIsMainSeries = mainSeries;
    }

    public List<Description> getDescriptions() {
        return mDescriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        mDescriptions = descriptions;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<PokedexEntry> getPokedexEntries() {
        return mPokedexEntries;
    }

    public void setPokedexEntries(List<PokedexEntry> pokedexEntries) {
        mPokedexEntries = pokedexEntries;
    }

    public NamedApiResource getRegion() {
        return mRegion;
    }

    public void setRegion(NamedApiResource region) {
        mRegion = region;
    }

    public List<NamedApiResource> getVersionGroups() {
        return mVersionGroups;
    }

    public void setVersionGroups(List<NamedApiResource> versionGroups) {
        mVersionGroups = versionGroups;
    }
}
