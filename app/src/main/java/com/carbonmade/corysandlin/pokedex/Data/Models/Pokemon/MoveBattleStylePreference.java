package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class MoveBattleStylePreference {
    @Json(name = "low_hp_preference")
    private int mLowHpPreference;

    @Json(name = "high_hp_preference")
    private int mHighHpPreference;

    @Json(name = "move_battle_style")
    private NamedApiResource mMoveBattleStyle;

    public int getLowHpPreference() {
        return mLowHpPreference;
    }

    public void setLowHpPreference(int lowHpPreference) {
        mLowHpPreference = lowHpPreference;
    }

    public int getHighHpPreference() {
        return mHighHpPreference;
    }

    public void setHighHpPreference(int highHpPreference) {
        mHighHpPreference = highHpPreference;
    }

    public NamedApiResource getMoveBattleStyle() {
        return mMoveBattleStyle;
    }

    public void setMoveBattleStyle(NamedApiResource moveBattleStyle) {
        mMoveBattleStyle = moveBattleStyle;
    }
}
