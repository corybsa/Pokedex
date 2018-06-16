package com.carbonmade.corysandlin.pokedex.Data.Models.Machines;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class Machine {
    @Json(name = "id")
    private int mId;

    @Json(name = "item")
    private NamedApiResource mItem;

    @Json(name = "move")
    private NamedApiResource mMove;

    @Json(name = "version_group")
    private NamedApiResource mVersionGroup;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public NamedApiResource getItem() {
        return mItem;
    }

    public void setItem(NamedApiResource item) {
        mItem = item;
    }

    public NamedApiResource getMove() {
        return mMove;
    }

    public void setMove(NamedApiResource move) {
        mMove = move;
    }

    public NamedApiResource getVersionGroup() {
        return mVersionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        mVersionGroup = versionGroup;
    }
}
