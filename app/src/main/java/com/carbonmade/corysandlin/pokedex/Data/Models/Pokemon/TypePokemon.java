package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class TypePokemon {
    @Json(name = "slot")
    private int mSlot;

    @Json(name = "pokemon")
    private NamedApiResource mPokemon;

    public int getSlot() {
        return mSlot;
    }

    public void setSlot(int slot) {
        mSlot = slot;
    }

    public NamedApiResource getPokemon() {
        return mPokemon;
    }

    public void setPokemon(NamedApiResource pokemon) {
        mPokemon = pokemon;
    }
}
