package com.carbonmade.corysandlin.pokedex.Data.Models.Locations;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.PalParkEncounterSpecies;
import com.squareup.moshi.Json;

import java.util.List;

public class PalParkArea {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pokemon_encounters")
    private List<PalParkEncounterSpecies> mPokemonEncounters;

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

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<PalParkEncounterSpecies> getPokemonEncounters() {
        return mPokemonEncounters;
    }

    public void setPokemonEncounters(List<PalParkEncounterSpecies> pokemonEncounters) {
        mPokemonEncounters = pokemonEncounters;
    }
}
