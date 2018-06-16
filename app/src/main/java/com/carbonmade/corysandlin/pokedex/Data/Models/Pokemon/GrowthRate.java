package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Description;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class GrowthRate {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "formula")
    private String mFormula;

    @Json(name = "descriptions")
    private List<Description> mDescriptions;

    @Json(name = "levels")
    private List<GrowthRateExperienceLevel> mLevels;

    @Json(name = "pokemon_species")
    private List<NamedApiResource> mPokemonSpecies;

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

    public String getFormula() {
        return mFormula;
    }

    public void setFormula(String formula) {
        mFormula = formula;
    }

    public List<Description> getDescriptions() {
        return mDescriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        mDescriptions = descriptions;
    }

    public List<GrowthRateExperienceLevel> getLevels() {
        return mLevels;
    }

    public void setLevels(List<GrowthRateExperienceLevel> levels) {
        mLevels = levels;
    }

    public List<NamedApiResource> getPokemonSpecies() {
        return mPokemonSpecies;
    }

    public void setPokemonSpecies(List<NamedApiResource> pokemonSpecies) {
        mPokemonSpecies = pokemonSpecies;
    }
}
