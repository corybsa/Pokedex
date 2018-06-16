package com.carbonmade.corysandlin.pokedex.Data.Models.Moves;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Description;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class MoveTarget {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "descriptions")
    private List<Description> mDescriptions;

    @Json(name = "moves")
    private List<NamedApiResource> mMoves;

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

    public List<Description> getDescriptions() {
        return mDescriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        mDescriptions = descriptions;
    }

    public List<NamedApiResource> getMoves() {
        return mMoves;
    }

    public void setMoves(List<NamedApiResource> moves) {
        mMoves = moves;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }
}
