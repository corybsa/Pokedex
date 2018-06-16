package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class MoveStatAffect {
    @Json(name = "change")
    private int mChange;

    @Json(name = "move")
    private NamedApiResource mMove;

    public int getChange() {
        return mChange;
    }

    public void setChange(int change) {
        mChange = change;
    }

    public NamedApiResource getMove() {
        return mMove;
    }

    public void setMove(NamedApiResource move) {
        mMove = move;
    }
}
