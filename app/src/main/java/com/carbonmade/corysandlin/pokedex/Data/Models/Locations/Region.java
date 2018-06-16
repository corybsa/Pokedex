package com.carbonmade.corysandlin.pokedex.Data.Models.Locations;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Region {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "locations")
    private List<NamedApiResource> mLocations;

    @Json(name = "main_generation")
    private NamedApiResource mMainGeneration;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pokedexes")
    private List<NamedApiResource> mPokedexes;

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

    public List<NamedApiResource> getLocations() {
        return mLocations;
    }

    public void setLocations(List<NamedApiResource> locations) {
        mLocations = locations;
    }

    public NamedApiResource getMainGeneration() {
        return mMainGeneration;
    }

    public void setMainGeneration(NamedApiResource mainGeneration) {
        mMainGeneration = mainGeneration;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<NamedApiResource> getPokedexes() {
        return mPokedexes;
    }

    public void setPokedexes(List<NamedApiResource> pokedexes) {
        mPokedexes = pokedexes;
    }

    public List<NamedApiResource> getVersionGroups() {
        return mVersionGroups;
    }

    public void setVersionGroups(List<NamedApiResource> versionGroups) {
        mVersionGroups = versionGroups;
    }
}
