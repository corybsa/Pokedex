package com.carbonmade.corysandlin.pokedex.Data.Models.Moves;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class MoveMetaData {
    @Json(name = "ailment")
    private NamedApiResource mAilment;

    @Json(name = "categor")
    private NamedApiResource mCategory;

    @Json(name = "min_hits")
    private int mMinHits;

    @Json(name = "max_hits")
    private int mMaxHits;

    @Json(name = "min_turns")
    private int mMinTurns;

    @Json(name = "max_turns")
    private int mMaxTurns;

    @Json(name = "drain")
    private int mDrain;

    @Json(name = "healing")
    private int mHealing;

    @Json(name = "crit_rate")
    private int mCritRate;

    @Json(name = "ailment_chance")
    private int mAilmentChance;

    @Json(name = "flinch_chance")
    private int mFlinchChance;

    @Json(name = "stat_chance")
    private int mStatChance;

    public NamedApiResource getAilment() {
        return mAilment;
    }

    public void setAilment(NamedApiResource ailment) {
        mAilment = ailment;
    }

    public NamedApiResource getCategory() {
        return mCategory;
    }

    public void setCategory(NamedApiResource category) {
        mCategory = category;
    }

    public int getMinHits() {
        return mMinHits;
    }

    public void setMinHits(int minHits) {
        mMinHits = minHits;
    }

    public int getMaxHits() {
        return mMaxHits;
    }

    public void setMaxHits(int maxHits) {
        mMaxHits = maxHits;
    }

    public int getMinTurns() {
        return mMinTurns;
    }

    public void setMinTurns(int minTurns) {
        mMinTurns = minTurns;
    }

    public int getMaxTurns() {
        return mMaxTurns;
    }

    public void setMaxTurns(int maxTurns) {
        mMaxTurns = maxTurns;
    }

    public int getDrain() {
        return mDrain;
    }

    public void setDrain(int drain) {
        mDrain = drain;
    }

    public int getHealing() {
        return mHealing;
    }

    public void setHealing(int healing) {
        mHealing = healing;
    }

    public int getCritRate() {
        return mCritRate;
    }

    public void setCritRate(int critRate) {
        mCritRate = critRate;
    }

    public int getAilmentChance() {
        return mAilmentChance;
    }

    public void setAilmentChance(int ailmentChance) {
        mAilmentChance = ailmentChance;
    }

    public int getFlinchChance() {
        return mFlinchChance;
    }

    public void setFlinchChance(int flinchChance) {
        mFlinchChance = flinchChance;
    }

    public int getStatChance() {
        return mStatChance;
    }

    public void setStatChance(int statChance) {
        mStatChance = statChance;
    }
}
