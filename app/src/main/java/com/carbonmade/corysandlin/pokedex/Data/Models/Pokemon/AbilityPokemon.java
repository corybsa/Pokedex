package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class AbilityPokemon {
    @Json(name = "is_hidden")
    private boolean mIsHidden;

    @Json(name = "slot")
    private int mSlot;

    @Json(name = "pokemon")
    private NamedApiResource mPokemon;

    public boolean isHidden() {
        return mIsHidden;
    }

    public void setHidden(boolean hidden) {
        mIsHidden = hidden;
    }

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
