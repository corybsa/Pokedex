package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class PokemonMove {
    @ColumnInfo(name = "move")
    @Json(name = "move")
    private NamedApiResource mMove;

    @ColumnInfo(name = "version_group_details")
    @Json(name = "version_group_details")
    private List<PokemonMoveVersion> mVersionGroupDetails;

    public NamedApiResource getMove() {
        return mMove;
    }

    public void setMove(NamedApiResource move) {
        mMove = move;
    }

    public List<PokemonMoveVersion> getVersionGroupDetails() {
        return mVersionGroupDetails;
    }

    public void setVersionGroupDetails(List<PokemonMoveVersion> versionGroupDetails) {
        mVersionGroupDetails = versionGroupDetails;
    }
}
