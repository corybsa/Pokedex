package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokemonStat {
    @ColumnInfo(name = "stat")
    @Json(name = "stat")
    private NamedApiResource mStat;

    @ColumnInfo(name = "effort")
    @Json(name = "effort")
    private int mEffort;

    @ColumnInfo(name = "base_stat")
    @Json(name = "base_stat")
    private int mBaseStat;

    public NamedApiResource getStat() {
        return mStat;
    }

    public void setStat(NamedApiResource stat) {
        mStat = stat;
    }

    public int getEffort() {
        return mEffort;
    }

    public void setEffort(int effort) {
        mEffort = effort;
    }

    public int getBaseStat() {
        return mBaseStat;
    }

    public void setBaseStat(int baseStat) {
        mBaseStat = baseStat;
    }
}
