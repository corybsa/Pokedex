package com.carbonmade.corysandlin.pokedex.Data.Models.Moves;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VerboseEffect;
import com.squareup.moshi.Json;

import java.util.List;

public class PastMoveStatValue {
    @Json(name = "accuracy")
    private int mAccuracy;

    @Json(name = "effect_chance")
    private int mEffectChance;

    @Json(name = "power")
    private int mPower;

    @Json(name = "pp")
    private int mPowerPoints;

    @Json(name = "effect_entries")
    private List<VerboseEffect> mEffectEntries;

    @Json(name = "type")
    private NamedApiResource mType;

    @Json(name = "version_group")
    private NamedApiResource mVersionGroup;

    public int getAccuracy() {
        return mAccuracy;
    }

    public void setAccuracy(int accuracy) {
        mAccuracy = accuracy;
    }

    public int getEffectChance() {
        return mEffectChance;
    }

    public void setEffectChance(int effectChance) {
        mEffectChance = effectChance;
    }

    public int getPower() {
        return mPower;
    }

    public void setPower(int power) {
        mPower = power;
    }

    public int getPowerPoints() {
        return mPowerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        mPowerPoints = powerPoints;
    }

    public List<VerboseEffect> getEffectEntries() {
        return mEffectEntries;
    }

    public void setEffectEntries(List<VerboseEffect> effectEntries) {
        mEffectEntries = effectEntries;
    }

    public NamedApiResource getType() {
        return mType;
    }

    public void setType(NamedApiResource type) {
        mType = type;
    }

    public NamedApiResource getVersionGroup() {
        return mVersionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        mVersionGroup = versionGroup;
    }
}
