package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class PokemonMoveVersion {
    @ColumnInfo(name = "move_learn_method")
    @Json(name = "move_learn_method")
    private NamedApiResource mMoveLearnMethod;

    @ColumnInfo(name = "version_group")
    @Json(name = "version_group")
    private NamedApiResource mVersionGroup;

    @ColumnInfo(name = "level_learned_at")
    @Json(name = "level_learned_at")
    private int mLevelLearnedAt;

    public NamedApiResource getMoveLearnMethod() {
        return mMoveLearnMethod;
    }

    public void setMoveLearnMethod(NamedApiResource moveLearnMethod) {
        mMoveLearnMethod = moveLearnMethod;
    }

    public NamedApiResource getVersionGroup() {
        return mVersionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        mVersionGroup = versionGroup;
    }

    public int getLevelLearnedAt() {
        return mLevelLearnedAt;
    }

    public void setLevelLearnedAt(int levelLearnedAt) {
        mLevelLearnedAt = levelLearnedAt;
    }
}
