package com.carbonmade.corysandlin.pokedex.Data.Models.Items;

import com.squareup.moshi.Json;

import java.util.List;

public class ItemHolderPokemon {
    @Json(name = "pokemon")
    private String mPokemon;

    @Json(name = "version_details")
    private List<ItemHolderPokemonVersionDetail> mVersionDetails;

    public String getPokemon() {
        return mPokemon;
    }

    public void setPokemon(String pokemon) {
        mPokemon = pokemon;
    }

    public List<ItemHolderPokemonVersionDetail> getVersionDetails() {
        return mVersionDetails;
    }

    public void setVersionDetails(List<ItemHolderPokemonVersionDetail> versionDetails) {
        mVersionDetails = versionDetails;
    }
}
