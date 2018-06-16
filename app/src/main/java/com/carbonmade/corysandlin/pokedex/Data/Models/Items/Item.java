package com.carbonmade.corysandlin.pokedex.Data.Models.Items;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.GenerationGameIndex;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.MachineVersionDetail;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VerboseEffect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VersionGroupFlavorText;
import com.squareup.moshi.Json;

import java.util.List;

public class Item {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "cost")
    private int mCost;

    @Json(name = "fling_power")
    private int mFlingPower;

    @Json(name = "fling_effect")
    private NamedApiResource mFlingEffect;

    @Json(name = "attributes")
    private List<NamedApiResource> mAttributes;

    @Json(name = "category")
    private ItemCategory mCategory;

    @Json(name = "effect_entries")
    private List<VerboseEffect> mEffectEntries;

    @Json(name = "flavor_text_entries")
    private List<VersionGroupFlavorText> mFlavorTextEntries;

    @Json(name = "game_indices")
    private List<GenerationGameIndex> mGameIndices;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "sprite")
    private ItemSprite mSprite;

    @Json(name = "held_by_pokemon")
    private List<ItemHolderPokemon> mHeldByPokemon;

    @Json(name = "baby_trigger_for")
    private ApiResource mBabyTriggerFor;

    @Json(name = "machines")
    private List<MachineVersionDetail> mMachines;

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

    public int getCost() {
        return mCost;
    }

    public void setCost(int cost) {
        mCost = cost;
    }

    public int getFlingPower() {
        return mFlingPower;
    }

    public void setFlingPower(int flingPower) {
        mFlingPower = flingPower;
    }

    public NamedApiResource getFlingEffect() {
        return mFlingEffect;
    }

    public void setFlingEffect(NamedApiResource flingEffect) {
        mFlingEffect = flingEffect;
    }

    public List<NamedApiResource> getAttributes() {
        return mAttributes;
    }

    public void setAttributes(List<NamedApiResource> attributes) {
        mAttributes = attributes;
    }

    public ItemCategory getCategory() {
        return mCategory;
    }

    public void setCategory(ItemCategory category) {
        mCategory = category;
    }

    public List<VerboseEffect> getEffectEntries() {
        return mEffectEntries;
    }

    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        mEffectEntries = effectEntries;
    }

    public List<VersionGroupFlavorText> getFlavorTextEntries() {
        return mFlavorTextEntries;
    }

    public void setFlavorTextEntries(List<VersionGroupFlavorText> flavorTextEntries) {
        mFlavorTextEntries = flavorTextEntries;
    }

    public List<GenerationGameIndex> getGameIndices() {
        return mGameIndices;
    }

    public void setGameIndices(List<GenerationGameIndex> gameIndices) {
        mGameIndices = gameIndices;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public ItemSprite getSprite() {
        return mSprite;
    }

    public void setSprite(ItemSprite sprite) {
        mSprite = sprite;
    }

    public List<ItemHolderPokemon> getHeldByPokemon() {
        return mHeldByPokemon;
    }

    public void setHeldByPokemon(List<ItemHolderPokemon> heldByPokemon) {
        mHeldByPokemon = heldByPokemon;
    }

    public ApiResource getBabyTriggerFor() {
        return mBabyTriggerFor;
    }

    public void setBabyTriggerFor(ApiResource babyTriggerFor) {
        mBabyTriggerFor = babyTriggerFor;
    }

    public List<MachineVersionDetail> getMachines() {
        return mMachines;
    }

    public void setMachines(List<MachineVersionDetail> machines) {
        mMachines = machines;
    }
}
