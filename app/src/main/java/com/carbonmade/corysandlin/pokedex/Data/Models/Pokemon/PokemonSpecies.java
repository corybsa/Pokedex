package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Description;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.FlavorText;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class PokemonSpecies {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "order")
    private int mOrder;

    @Json(name = "gender_rate")
    private int mGenderRate;

    @Json(name = "capture_rate")
    private int mCaptureRate;

    @Json(name = "base_happiness")
    private int mBaseHappiness;

    @Json(name = "is_baby")
    private boolean mIsBaby;

    @Json(name = "hatch_counter")
    private int mHatchCounter;

    @Json(name = "has_gender_differences")
    private boolean mHasGenderDifferences;

    @Json(name = "forms_switchable")
    private boolean mFormsSwitchable;

    @Json(name = "growth_rate")
    private NamedApiResource mGrowthRate;

    @Json(name = "pokedex_numbers")
    private List<PokemonSpeciesDexEntry> mPokedexNumbers;

    @Json(name = "egg_groups")
    private List<NamedApiResource> mEggGroups;

    @Json(name = "color")
    private NamedApiResource mColor;

    @Json(name = "shape")
    private NamedApiResource mShape;

    @Json(name = "evolves_from_species")
    private NamedApiResource mEvolvesFromSpecies;

    @Json(name = "evolution_chain")
    private ApiResource mEvolutionChain;

    @Json(name = "habitat")
    private NamedApiResource mHabitat;

    @Json(name = "generation")
    private NamedApiResource mGeneration;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pal_park_encounters")
    private List<PalParkEncounterArea> mPalParkEncounters;

    @Json(name = "flavor_text_entries")
    private List<FlavorText> mFlavorTextEntries;

    @Json(name = "form_descriptions")
    private List<Description> mFormDescriptions;

    @Json(name = "genera")
    private List<Genus> mGenera;

    @Json(name = "varieties")
    private List<PokemonSpeciesVariety> mVarieties;

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

    public int getOrder() {
        return mOrder;
    }

    public void setOrder(int order) {
        mOrder = order;
    }

    public int getGenderRate() {
        return mGenderRate;
    }

    public void setGenderRate(int genderRate) {
        mGenderRate = genderRate;
    }

    public int getCaptureRate() {
        return mCaptureRate;
    }

    public void setCaptureRate(int captureRate) {
        mCaptureRate = captureRate;
    }

    public int getBaseHappiness() {
        return mBaseHappiness;
    }

    public void setBaseHappiness(int baseHappiness) {
        mBaseHappiness = baseHappiness;
    }

    public boolean isBaby() {
        return mIsBaby;
    }

    public void setBaby(boolean baby) {
        mIsBaby = baby;
    }

    public int getHatchCounter() {
        return mHatchCounter;
    }

    public void setHatchCounter(int hatchCounter) {
        mHatchCounter = hatchCounter;
    }

    public boolean isHasGenderDifferences() {
        return mHasGenderDifferences;
    }

    public void setHasGenderDifferences(boolean hasGenderDifferences) {
        mHasGenderDifferences = hasGenderDifferences;
    }

    public boolean isFormsSwitchable() {
        return mFormsSwitchable;
    }

    public void setFormsSwitchable(boolean formsSwitchable) {
        mFormsSwitchable = formsSwitchable;
    }

    public NamedApiResource getGrowthRate() {
        return mGrowthRate;
    }

    public void setGrowthRate(NamedApiResource growthRate) {
        mGrowthRate = growthRate;
    }

    public List<PokemonSpeciesDexEntry> getPokedexNumbers() {
        return mPokedexNumbers;
    }

    public void setPokedexNumbers(List<PokemonSpeciesDexEntry> pokedexNumbers) {
        mPokedexNumbers = pokedexNumbers;
    }

    public List<NamedApiResource> getEggGroups() {
        return mEggGroups;
    }

    public void setEggGroups(List<NamedApiResource> eggGroups) {
        mEggGroups = eggGroups;
    }

    public NamedApiResource getColor() {
        return mColor;
    }

    public void setColor(NamedApiResource color) {
        mColor = color;
    }

    public NamedApiResource getShape() {
        return mShape;
    }

    public void setShape(NamedApiResource shape) {
        mShape = shape;
    }

    public NamedApiResource getEvolvesFromSpecies() {
        return mEvolvesFromSpecies;
    }

    public void setEvolvesFromSpecies(NamedApiResource evolvesFromSpecies) {
        mEvolvesFromSpecies = evolvesFromSpecies;
    }

    public ApiResource getEvolutionChain() {
        return mEvolutionChain;
    }

    public void setEvolutionChain(ApiResource evolutionChain) {
        mEvolutionChain = evolutionChain;
    }

    public NamedApiResource getHabitat() {
        return mHabitat;
    }

    public void setHabitat(NamedApiResource habitat) {
        mHabitat = habitat;
    }

    public NamedApiResource getGeneration() {
        return mGeneration;
    }

    public void setGeneration(NamedApiResource generation) {
        mGeneration = generation;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<PalParkEncounterArea> getPalParkEncounters() {
        return mPalParkEncounters;
    }

    public void setPalParkEncounters(List<PalParkEncounterArea> palParkEncounters) {
        mPalParkEncounters = palParkEncounters;
    }

    public List<FlavorText> getFlavorTextEntries() {
        return mFlavorTextEntries;
    }

    public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
        mFlavorTextEntries = flavorTextEntries;
    }

    public List<Description> getFormDescriptions() {
        return mFormDescriptions;
    }

    public void setFormDescriptions(List<Description> formDescriptions) {
        mFormDescriptions = formDescriptions;
    }

    public List<Genus> getGenera() {
        return mGenera;
    }

    public void setGenera(List<Genus> genera) {
        mGenera = genera;
    }

    public List<PokemonSpeciesVariety> getVarieties() {
        return mVarieties;
    }

    public void setVarieties(List<PokemonSpeciesVariety> varieties) {
        mVarieties = varieties;
    }
}
