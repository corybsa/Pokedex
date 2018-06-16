package com.carbonmade.corysandlin.pokedex.Data.Models.Games;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class VersionGroup {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "order")
    private int mOrder;

    @Json(name = "generation")
    private NamedApiResource mGeneration;

    @Json(name = "move_learn_methods")
    private List<NamedApiResource> mMoveLearnMethods;

    @Json(name = "pokedexes")
    private List<NamedApiResource> mPokedexes;

    @Json(name = "regions")
    private List<NamedApiResource> mRegions;

    @Json(name = "versions")
    private List<NamedApiResource> mVersions;

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

    public NamedApiResource getGeneration() {
        return mGeneration;
    }

    public void setGeneration(NamedApiResource generation) {
        mGeneration = generation;
    }

    public List<NamedApiResource> getMoveLearnMethods() {
        return mMoveLearnMethods;
    }

    public void setMoveLearnMethods(List<NamedApiResource> moveLearnMethods) {
        mMoveLearnMethods = moveLearnMethods;
    }

    public List<NamedApiResource> getPokedexes() {
        return mPokedexes;
    }

    public void setPokedexes(List<NamedApiResource> pokedexes) {
        mPokedexes = pokedexes;
    }

    public List<NamedApiResource> getRegions() {
        return mRegions;
    }

    public void setRegions(List<NamedApiResource> regions) {
        mRegions = regions;
    }

    public List<NamedApiResource> getVersions() {
        return mVersions;
    }

    public void setVersions(List<NamedApiResource> versions) {
        mVersions = versions;
    }
}
