package com.carbonmade.corysandlin.pokedex.Data.Models.Games;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Generation {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "abilities")
    private List<NamedApiResource> mAbilities;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "main_region")
    private NamedApiResource mMainRegion;

    @Json(name = "moves")
    private List<NamedApiResource> mMoves;

    @Json(name = "pokemon_species")
    private List<NamedApiResource> mPokemonSpecies;

    @Json(name = "types")
    private List<NamedApiResource> mTypes;

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

    public List<NamedApiResource> getAbilities() {
        return mAbilities;
    }

    public void setAbilities(List<NamedApiResource> abilities) {
        mAbilities = abilities;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public NamedApiResource getMainRegion() {
        return mMainRegion;
    }

    public void setMainRegion(NamedApiResource mainRegion) {
        mMainRegion = mainRegion;
    }

    public List<NamedApiResource> getMoves() {
        return mMoves;
    }

    public void setMoves(List<NamedApiResource> moves) {
        mMoves = moves;
    }

    public List<NamedApiResource> getPokemonSpecies() {
        return mPokemonSpecies;
    }

    public void setPokemonSpecies(List<NamedApiResource> pokemonSpecies) {
        mPokemonSpecies = pokemonSpecies;
    }

    public List<NamedApiResource> getTypes() {
        return mTypes;
    }

    public void setTypes(List<NamedApiResource> types) {
        mTypes = types;
    }

    public List<NamedApiResource> getVersionGroups() {
        return mVersionGroups;
    }

    public void setVersionGroups(List<NamedApiResource> versionGroups) {
        mVersionGroups = versionGroups;
    }
}
