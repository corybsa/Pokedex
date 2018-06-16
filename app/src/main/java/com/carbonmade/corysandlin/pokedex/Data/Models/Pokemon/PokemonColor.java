package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class PokemonColor {
    @Json(name = "id")
    private int mid;

    @Json(name = "name")
    private String mName;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pokemon_species")
    private List<NamedApiResource> mPokemonSpecies;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
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
