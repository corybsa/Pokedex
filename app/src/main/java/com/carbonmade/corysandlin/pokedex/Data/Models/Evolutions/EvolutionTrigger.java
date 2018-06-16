package com.carbonmade.corysandlin.pokedex.Data.Models.Evolutions;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class EvolutionTrigger {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pokemon_species")
    private List<NamedApiResource> mPokemonSpecies;

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

    public List<NamedApiResource> getPokemonSpecies() {
        return mPokemonSpecies;
    }

    public void setPokemonSpecies(List<NamedApiResource> pokemonSpecies) {
        mPokemonSpecies = pokemonSpecies;
    }
}
