package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VersionGameIndex;
import com.squareup.moshi.Json;

import java.util.List;

@Entity
public class Pokemon {
    @PrimaryKey
    @ColumnInfo(name = "id")
    @Json(name = "id")
    private int mId;

    @ColumnInfo(name = "pokemon_name")
    @Json(name = "name")
    private String mName;

    @ColumnInfo(name = "base_experience")
    @Json(name = "base_experience")
    private int mBaseExperience;

    @ColumnInfo(name = "height")
    @Json(name = "height")
    private int mHeight;

    @ColumnInfo(name = "is_default")
    @Json(name = "is_default")
    private boolean mIsDefault;

    @ColumnInfo(name = "order")
    @Json(name = "order")
    private int mOrder;

    @ColumnInfo(name = "weight")
    @Json(name = "weight")
    private int mWeight;

    @ColumnInfo(name = "abilities")
    @Json(name = "abilities")
    private List<PokemonAbility> mAbilities;

    @ColumnInfo(name = "forms")
    @Json(name = "forms")
    private List<NamedApiResource> mForms;

    @ColumnInfo(name = "game_indices")
    @Json(name = "game_indices")
    private List<VersionGameIndex> mGameIndices;

    @ColumnInfo(name = "held_items")
    @Json(name = "held_items")
    private List<PokemonHeldItem> mHeldItems;

    @ColumnInfo(name = "location_area_encounters")
    @Json(name = "location_area_encounters")
    private String mLocationAreaEncounters;

    @ColumnInfo(name = "moves")
    @Json(name = "moves")
    private List<PokemonMove> mMoves;

    @ColumnInfo(name = "sprites")
    @Json(name = "sprites")
    private PokemonSprite mSprite;

    @ColumnInfo(name = "species")
    @Json(name = "species")
    private NamedApiResource mSpecies;

    @ColumnInfo(name = "stats")
    @Json(name = "stats")
    private List<PokemonStat> mStats;

    @ColumnInfo(name = "types")
    @Json(name = "types")
    private List<PokemonType> mTypes;

    public Pokemon() {}

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

    public int getBaseExperience() {
        return mBaseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        mBaseExperience = baseExperience;
    }

    public int getHeight() {
        return mHeight;
    }

    public void setHeight(int height) {
        mHeight = height;
    }

    public boolean isDefault() {
        return mIsDefault;
    }

    public void setIsDefault(boolean aDefault) {
        mIsDefault = aDefault;
    }

    public int getOrder() {
        return mOrder;
    }

    public void setOrder(int order) {
        mOrder = order;
    }

    public int getWeight() {
        return mWeight;
    }

    public void setWeight(int weight) {
        mWeight = weight;
    }

    public List<PokemonAbility> getAbilities() {
        return mAbilities;
    }

    public void setAbilities(List<PokemonAbility> abilities) {
        mAbilities = abilities;
    }

    public List<NamedApiResource> getForms() {
        return mForms;
    }

    public void setForms(List<NamedApiResource> forms) {
        mForms = forms;
    }

    public List<VersionGameIndex> getGameIndices() {
        return mGameIndices;
    }

    public void setGameIndices(List<VersionGameIndex> gameIndices) {
        mGameIndices = gameIndices;
    }

    public List<PokemonHeldItem> getHeldItems() {
        return mHeldItems;
    }

    public void setHeldItems(List<PokemonHeldItem> heldItems) {
        mHeldItems = heldItems;
    }

    public String getLocationAreaEncounters() {
        return mLocationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        mLocationAreaEncounters = locationAreaEncounters;
    }

    public List<PokemonMove> getMoves() {
        return mMoves;
    }

    public void setMoves(List<PokemonMove> moves) {
        mMoves = moves;
    }

    public PokemonSprite getSprite() {
        return mSprite;
    }

    public void setSprite(PokemonSprite sprite) {
        mSprite = sprite;
    }

    public NamedApiResource getSpecies() {
        return mSpecies;
    }

    public void setSpecies(NamedApiResource species) {
        mSpecies = species;
    }

    public List<PokemonStat> getStats() {
        return mStats;
    }

    public void setStats(List<PokemonStat> stats) {
        mStats = stats;
    }

    public List<PokemonType> getTypes() {
        return mTypes;
    }

    public void setTypes(List<PokemonType> types) {
        mTypes = types;
    }
}
