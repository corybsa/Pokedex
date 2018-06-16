package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokemonSpeciesVariety {
    @Json(name = "is_default")
    private boolean mIsDefault;

    @Json(name = "pokemon")
    private NamedApiResource mPokemon;

    public boolean isDefault() {
        return mIsDefault;
    }

    public void setDefault(boolean aDefault) {
        mIsDefault = aDefault;
    }

    public NamedApiResource getPokemon() {
        return mPokemon;
    }

    public void setPokemon(NamedApiResource pokemon) {
        mPokemon = pokemon;
    }
}
