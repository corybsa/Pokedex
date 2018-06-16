package com.carbonmade.corysandlin.pokedex.Data.Models.Games;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokedexEntry {
    @Json(name = "entry_number")
    private int mEntryNumber;

    @Json(name = "pokemon_species")
    private NamedApiResource mPokemonSpecies;

    public int getEntryNumber() {
        return mEntryNumber;
    }

    public void setEntryNumber(int entryNumber) {
        mEntryNumber = entryNumber;
    }

    public NamedApiResource getPokemonSpecies() {
        return mPokemonSpecies;
    }

    public void setPokemonSpecies(NamedApiResource pokemonSpecies) {
        mPokemonSpecies = pokemonSpecies;
    }
}
