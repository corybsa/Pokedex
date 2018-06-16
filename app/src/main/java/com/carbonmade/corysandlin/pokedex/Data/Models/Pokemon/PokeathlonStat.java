package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.squareup.moshi.Json;

import java.util.List;

public class PokeathlonStat {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "affecting_natures")
    private NaturePokeathlonStatAffectSet mAffectingNatures;

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

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public NaturePokeathlonStatAffectSet getAffectingNatures() {
        return mAffectingNatures;
    }

    public void setAffectingNatures(NaturePokeathlonStatAffectSet affectingNatures) {
        mAffectingNatures = affectingNatures;
    }
}
