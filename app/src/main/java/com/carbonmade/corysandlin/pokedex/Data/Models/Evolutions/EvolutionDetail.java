package com.carbonmade.corysandlin.pokedex.Data.Models.Evolutions;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class EvolutionDetail {
    @Json(name = "item")
    private NamedApiResource mItem;

    @Json(name = "trigger")
    private NamedApiResource mTrigger;

    @Json(name = "gender")
    private int mGender;

    @Json(name = "held_item")
    private NamedApiResource mHeldItem;

    @Json(name = "known_move")
    private NamedApiResource mKnownMove;

    @Json(name = "known_move_type")
    private NamedApiResource mKnownMoveType;

    @Json(name = "location")
    private NamedApiResource mLocation;

    @Json(name = "min_level")
    private int mMinLevel;

    @Json(name = "min_happiness")
    private int mMinHappiness;

    @Json(name = "min_beauty")
    private int mMinBeauty;

    @Json(name = "min_affection")
    private int mMinAffection;

    @Json(name = "needs_overworld_rain")
    private boolean mNeedsOverworldRain;

    @Json(name = "party_species")
    private NamedApiResource mPartySpecies;

    @Json(name = "party_type")
    private NamedApiResource mPartyType;

    @Json(name = "relative_physical_stats")
    private int mRelativePhysicalStats;

    @Json(name = "time_of_day")
    private String mTimeOfDay;

    @Json(name = "trade_species")
    private NamedApiResource mTradeSpecies;

    @Json(name = "turn_upside_down")
    private boolean mTurnUpsideDown;

    public NamedApiResource getItem() {
        return mItem;
    }

    public void setItem(NamedApiResource item) {
        mItem = item;
    }

    public NamedApiResource getTrigger() {
        return mTrigger;
    }

    public void setTrigger(NamedApiResource trigger) {
        mTrigger = trigger;
    }

    public int getGender() {
        return mGender;
    }

    public void setGender(int gender) {
        mGender = gender;
    }

    public NamedApiResource getHeldItem() {
        return mHeldItem;
    }

    public void setHeldItem(NamedApiResource heldItem) {
        mHeldItem = heldItem;
    }

    public NamedApiResource getKnownMove() {
        return mKnownMove;
    }

    public void setKnownMove(NamedApiResource knownMove) {
        mKnownMove = knownMove;
    }

    public NamedApiResource getKnownMoveType() {
        return mKnownMoveType;
    }

    public void setKnownMoveType(NamedApiResource knownMoveType) {
        mKnownMoveType = knownMoveType;
    }

    public NamedApiResource getLocation() {
        return mLocation;
    }

    public void setLocation(NamedApiResource location) {
        mLocation = location;
    }

    public int getMinLevel() {
        return mMinLevel;
    }

    public void setMinLevel(int minLevel) {
        mMinLevel = minLevel;
    }

    public int getMinHappiness() {
        return mMinHappiness;
    }

    public void setMinHappiness(int minHappiness) {
        mMinHappiness = minHappiness;
    }

    public int getMinBeauty() {
        return mMinBeauty;
    }

    public void setMinBeauty(int minBeauty) {
        mMinBeauty = minBeauty;
    }

    public int getMinAffection() {
        return mMinAffection;
    }

    public void setMinAffection(int minAffection) {
        mMinAffection = minAffection;
    }

    public boolean isNeedsOverworldRain() {
        return mNeedsOverworldRain;
    }

    public void setNeedsOverworldRain(boolean needsOverworldRain) {
        mNeedsOverworldRain = needsOverworldRain;
    }

    public NamedApiResource getPartySpecies() {
        return mPartySpecies;
    }

    public void setPartySpecies(NamedApiResource partySpecies) {
        mPartySpecies = partySpecies;
    }

    public NamedApiResource getPartyType() {
        return mPartyType;
    }

    public void setPartyType(NamedApiResource partyType) {
        mPartyType = partyType;
    }

    public int getRelativePhysicalStats() {
        return mRelativePhysicalStats;
    }

    public void setRelativePhysicalStats(int relativePhysicalStats) {
        mRelativePhysicalStats = relativePhysicalStats;
    }

    public String getTimeOfDay() {
        return mTimeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        mTimeOfDay = timeOfDay;
    }

    public NamedApiResource getTradeSpecies() {
        return mTradeSpecies;
    }

    public void setTradeSpecies(NamedApiResource tradeSpecies) {
        mTradeSpecies = tradeSpecies;
    }

    public boolean isTurnUpsideDown() {
        return mTurnUpsideDown;
    }

    public void setTurnUpsideDown(boolean turnUpsideDown) {
        mTurnUpsideDown = turnUpsideDown;
    }
}
