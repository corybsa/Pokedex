package com.carbonmade.corysandlin.pokedex.Data.Models.Moves;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.MachineVersionDetail;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VerboseEffect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Contests.ContestComboSet;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.AbilityEffectChange;
import com.squareup.moshi.Json;

import java.util.List;

public class Move {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "accuracy")
    private int mAccuracy;

    @Json(name = "effect_chance")
    private int mEffectChance;

    @Json(name = "pp")
    private int mPowerPoints;

    @Json(name = "priority")
    private int mPriority;

    @Json(name = "power")
    private int mPower;

    @Json(name = "contest_combos")
    private ContestComboSet mContestComboSet;

    @Json(name = "contest_type")
    private NamedApiResource mContestType;

    @Json(name = "contest_effect")
    private ApiResource mContestEffect;

    @Json(name = "damage_class")
    private NamedApiResource mDamageClass;

    @Json(name = "effect_entries")
    private List<VerboseEffect> mEffectEntries;

    @Json(name = "effect_changes")
    private List<AbilityEffectChange> mEffectChanges;

    @Json(name = "flavor_text_entries")
    private List<MoveFlavorText> mFlavorTextEntries;

    @Json(name = "generation")
    private NamedApiResource mGeneration;

    @Json(name = "machines")
    private List<MachineVersionDetail> mMachines;

    @Json(name = "meta")
    private MoveMetaData mMeta;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "past_values")
    private List<PastMoveStatValue> mPastMoveStatValues;

    @Json(name = "stat_changes")
    private List<MoveStatChange> mMoveStatChanges;

    @Json(name = "super_contest_effect")
    private ApiResource mSuperContestEffect;

    @Json(name = "target")
    private NamedApiResource mTarget;

    @Json(name = "type")
    private NamedApiResource mType;

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

    public int getPowerPoints() {
        return mPowerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        mPowerPoints = powerPoints;
    }

    public int getPriority() {
        return mPriority;
    }

    public void setPriority(int priority) {
        mPriority = priority;
    }

    public int getPower() {
        return mPower;
    }

    public void setPower(int power) {
        mPower = power;
    }

    public ContestComboSet getContestComboSet() {
        return mContestComboSet;
    }

    public void setContestComboSet(ContestComboSet contestComboSet) {
        mContestComboSet = contestComboSet;
    }

    public NamedApiResource getContestType() {
        return mContestType;
    }

    public void setContestType(NamedApiResource contestType) {
        mContestType = contestType;
    }

    public ApiResource getContestEffect() {
        return mContestEffect;
    }

    public void setContestEffect(ApiResource contestEffect) {
        mContestEffect = contestEffect;
    }

    public NamedApiResource getDamageClass() {
        return mDamageClass;
    }

    public void setDamageClass(NamedApiResource damageClass) {
        mDamageClass = damageClass;
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

    public List<MoveFlavorText> getFlavorTextEntries() {
        return mFlavorTextEntries;
    }

    public void setFlavorTextEntries(List<MoveFlavorText> flavorTextEntries) {
        mFlavorTextEntries = flavorTextEntries;
    }

    public NamedApiResource getGeneration() {
        return mGeneration;
    }

    public void setGeneration(NamedApiResource generation) {
        mGeneration = generation;
    }

    public List<MachineVersionDetail> getMachines() {
        return mMachines;
    }

    public void setMachines(List<MachineVersionDetail> machines) {
        mMachines = machines;
    }

    public MoveMetaData getMeta() {
        return mMeta;
    }

    public void setMeta(MoveMetaData meta) {
        mMeta = meta;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<PastMoveStatValue> getPastMoveStatValues() {
        return mPastMoveStatValues;
    }

    public void setPastMoveStatValues(List<PastMoveStatValue> pastMoveStatValues) {
        mPastMoveStatValues = pastMoveStatValues;
    }

    public List<MoveStatChange> getMoveStatChanges() {
        return mMoveStatChanges;
    }

    public void setMoveStatChanges(List<MoveStatChange> moveStatChanges) {
        mMoveStatChanges = moveStatChanges;
    }

    public ApiResource getSuperContestEffect() {
        return mSuperContestEffect;
    }

    public void setSuperContestEffect(ApiResource superContestEffect) {
        mSuperContestEffect = superContestEffect;
    }

    public NamedApiResource getTarget() {
        return mTarget;
    }

    public void setTarget(NamedApiResource target) {
        mTarget = target;
    }

    public NamedApiResource getType() {
        return mType;
    }

    public void setType(NamedApiResource type) {
        mType = type;
    }
}
