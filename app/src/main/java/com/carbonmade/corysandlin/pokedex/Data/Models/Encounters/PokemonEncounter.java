package com.carbonmade.corysandlin.pokedex.Data.Models.Encounters;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VersionEncounterDetail;
import com.squareup.moshi.Json;

import java.util.List;

public class PokemonEncounter {
    @Json(name = "pokemon")
    private NamedApiResource mPokemon;

    @Json(name = "version_details")
    private List<VersionEncounterDetail> mVersionDetails;

    public NamedApiResource getPokemon() {
        return mPokemon;
    }

    public void setPokemon(NamedApiResource pokemon) {
        mPokemon = pokemon;
    }

    public List<VersionEncounterDetail> getVersionDetails() {
        return mVersionDetails;
    }

    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        mVersionDetails = versionDetails;
    }
}
