package com.carbonmade.corysandlin.pokedex.Data.Models.Evolutions;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class EvolutionChainLink {
    @Json(name = "is_baby")
    private boolean mIsBaby;

    @Json(name = "species")
    private NamedApiResource mSpecies;

    @Json(name = "evolution_details")
    private List<EvolutionDetail> mEvolutionDetails;

    @Json(name = "evolves_to")
    private List<EvolutionChainLink> mEvolvesTo;

    public boolean isBaby() {
        return mIsBaby;
    }

    public void setBaby(boolean baby) {
        mIsBaby = baby;
    }

    public NamedApiResource getSpecies() {
        return mSpecies;
    }

    public void setSpecies(NamedApiResource species) {
        mSpecies = species;
    }

    public List<EvolutionDetail> getEvolutionDetails() {
        return mEvolutionDetails;
    }

    public void setEvolutionDetails(List<EvolutionDetail> evolutionDetails) {
        mEvolutionDetails = evolutionDetails;
    }

    public List<EvolutionChainLink> getEvolvesTo() {
        return mEvolvesTo;
    }

    public void setEvolvesTo(List<EvolutionChainLink> evolvesTo) {
        mEvolvesTo = evolvesTo;
    }
}
