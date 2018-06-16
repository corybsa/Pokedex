package com.carbonmade.corysandlin.pokedex.Data.Models.Utility;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.squareup.moshi.Json;

import java.util.List;

public class Language {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "official")
    private boolean mOfficial;

    @Json(name = "iso639")
    private String mIso639;

    @Json(name = "iso3166")
    private String mIso3166;

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

    public boolean isOfficial() {
        return mOfficial;
    }

    public void setOfficial(boolean official) {
        mOfficial = official;
    }

    public String getIso639() {
        return mIso639;
    }

    public void setIso639(String iso639) {
        mIso639 = iso639;
    }

    public String getIso3166() {
        return mIso3166;
    }

    public void setIso3166(String iso3166) {
        mIso3166 = iso3166;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }
}
