package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VerboseEffect;
import com.squareup.moshi.Json;

import java.util.List;

public class Ability {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "is_main_series")
    private boolean mIsMainSeries;

    @Json(name = "generation")
    private NamedApiResource mGeneration;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "effect_entries")
    private List<VerboseEffect> mEffectEntries;

    @Json(name = "effect_changes")
    private List<AbilityEffectChange> mEffectChanges;

    @Json(name = "flavor_text_entries")
    private List<AbilityFlavorText> mFlavorTextEntries;

    @Json(name = "pokemon")
    private List<AbilityPokemon> mPokemon;

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

    public boolean isMainSeries() {
        return mIsMainSeries;
    }

    public void setMainSeries(boolean mainSeries) {
        mIsMainSeries = mainSeries;
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

    public List<VerboseEffect> getEffectEntries() {
        return mEffectEntries;
    }

    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        mEffectEntries = effectEntries;
    }

    public List<AbilityEffectChange> getEffectChanges() {
        return mEffectChanges;
    }

    public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
        mEffectChanges = effectChanges;
    }

    public List<AbilityFlavorText> getFlavorTextEntries() {
        return mFlavorTextEntries;
    }

    public void setFlavorTextEntries(List<AbilityFlavorText> flavorTextEntries) {
        mFlavorTextEntries = flavorTextEntries;
    }

    public List<AbilityPokemon> getPokemon() {
        return mPokemon;
    }

    public void setPokemon(List<AbilityPokemon> pokemon) {
        mPokemon = pokemon;
    }
}
