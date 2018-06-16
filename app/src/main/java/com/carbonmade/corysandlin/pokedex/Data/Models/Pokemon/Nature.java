package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class Nature {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "decreased_stat")
    private NamedApiResource mDecreasedStat;

    @Json(name = "increased_stat")
    private NamedApiResource mIncreasedStat;

    @Json(name = "hates_flavor")
    private NamedApiResource mHatesFlavor;

    @Json(name = "likes_flavor")
    private NamedApiResource mLikesFlavor;

    @Json(name = "pokeathlon_stat_changes")
    private List<NatureStatChange> mPokeathlonStatChanges;

    @Json(name = "move_battle_style_preferences")
    private List<MoveBattleStylePreference> mMoveBattleStylePreferences;

    @Json(name = "names")
    private List<Name> mNames;

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

    public NamedApiResource getDecreasedStat() {
        return mDecreasedStat;
    }

    public void setDecreasedStat(NamedApiResource decreasedStat) {
        mDecreasedStat = decreasedStat;
    }

    public NamedApiResource getIncreasedStat() {
        return mIncreasedStat;
    }

    public void setIncreasedStat(NamedApiResource increasedStat) {
        mIncreasedStat = increasedStat;
    }

    public NamedApiResource getHatesFlavor() {
        return mHatesFlavor;
    }

    public void setHatesFlavor(NamedApiResource hatesFlavor) {
        mHatesFlavor = hatesFlavor;
    }

    public NamedApiResource getLikesFlavor() {
        return mLikesFlavor;
    }

    public void setLikesFlavor(NamedApiResource likesFlavor) {
        mLikesFlavor = likesFlavor;
    }

    public List<NatureStatChange> getPokeathlonStatChange() {
        return mPokeathlonStatChanges;
    }

    public void setPokeathlonStatChange(List<NatureStatChange> pokeathlonStatChange) {
        mPokeathlonStatChanges = pokeathlonStatChange;
    }

    public List<MoveBattleStylePreference> getMoveBattleStylePreferences() {
        return mMoveBattleStylePreferences;
    }

    public void setMoveBattleStylePreferences(List<MoveBattleStylePreference> moveBattleStylePreferences) {
        mMoveBattleStylePreferences = moveBattleStylePreferences;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }
}
