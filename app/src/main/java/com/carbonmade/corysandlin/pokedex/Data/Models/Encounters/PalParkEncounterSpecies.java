package com.carbonmade.corysandlin.pokedex.Data.Models.Encounters;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PalParkEncounterSpecies {
    @Json(name = "base_score")
    private int mBaseScore;

    @Json(name = "rate")
    private int mRate;

    @Json(name = "pokemon_species")
    private NamedApiResource mPokemonSpecies;

    public int getBaseScore() {
        return mBaseScore;
    }

    public void setBaseScore(int baseScore) {
        mBaseScore = baseScore;
    }

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
