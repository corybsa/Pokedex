package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Gender {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "pokemon_species_details")
    private List<PokemonSpeciesGender> mPokemonSpeciesDetails;

    @Json(name = "required_for_evolution")
    private List<NamedApiResource> mRequiredForEvolution;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<PokemonSpeciesGender> getPokemonSpeciesDetails() {
        return mPokemonSpeciesDetails;
    }

    public void setPokemonSpeciesDetails(List<PokemonSpeciesGender> pokemonSpeciesDetails) {
        mPokemonSpeciesDetails = pokemonSpeciesDetails;
    }

    public List<NamedApiResource> getRequiredForEvolution() {
        return mRequiredForEvolution;
    }

    public void setRequiredForEvolution(List<NamedApiResource> requiredForEvolution) {
        mRequiredForEvolution = requiredForEvolution;
    }
}
