package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;

import com.squareup.moshi.Json;

public class VersionGameIndex {
    @ColumnInfo(name = "game_index")
    @Json(name = "game_index")
    private int mGameIndex;

    @ColumnInfo(name = "version")
    @Json(name = "version")
    private NamedApiResource mVersion;

    public int getGameIndex() {
        return mGameIndex;
    }

    public void setGameIndex(int gameIndex) {
        mGameIndex = gameIndex;
    }

    public NamedApiResource getVersion() {
        return mVersion;
    }

    public void setVersion(NamedApiResource version) {
        mVersion = version;
    }
}
