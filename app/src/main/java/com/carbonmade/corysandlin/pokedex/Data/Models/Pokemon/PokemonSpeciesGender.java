package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokemonSpeciesGender {
    @Json(name = "rate")
    private int mRate;

    @Json(name = "pokemon_species")
    private NamedApiResource mPokemonSpecies;

    public int getRate() {
        return mRate;
    }

    public void setRate(int rate) {
        mRate = rate;
    }

    public NamedApiResource getPokemonSpecies() {
        return mPokemonSpecies;
    }

    public void setPokemonSpecies(NamedApiResource pokemonSpecies) {
        mPokemonSpecies = pokemonSpecies;
    }
}
