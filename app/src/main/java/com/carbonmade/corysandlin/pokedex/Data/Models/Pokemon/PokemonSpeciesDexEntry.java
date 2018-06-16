package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokemonSpeciesDexEntry {
    @Json(name = "entry_number")
    private int mEntryNumber;

    @Json(name = "pokedex")
    private NamedApiResource mPokedex;

    public int getEntryNumber() {
        return mEntryNumber;
    }

    public void setEntryNumber(int entryNumber) {
        mEntryNumber = entryNumber;
    }

    public NamedApiResource getPokedex() {
        return mPokedex;
    }

    public void setPokedex(NamedApiResource pokedex) {
        mPokedex = pokedex;
    }
}
