package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

public class VersionGroupFlavorText {
    @Json(name = "text")
    private String mText;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    @Json(name = "version_group")
    private NamedApiResource mVersionGroup;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public NamedApiResource getLanguage() {
        return mLanguage;
    }

    public void setLanguage(NamedApiResource language) {
        mLanguage = language;
    }

    public NamedApiResource getVersionGroup() {
        return mVersionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        mVersionGroup = versionGroup;
    }
}
