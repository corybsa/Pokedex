package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class AbilityFlavorText {
    @Json(name = "flavor_text")
    private String mFlavorText;

    @Json(name = "language")
    private NamedApiResource mLanguage;

    @Json(name = "version_group")
    private NamedApiResource mVersionGroup;

    public String getFlavorText() {
        return mFlavorText;
    }

    public void setFlavorText(String flavorText) {
        mFlavorText = flavorText;
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
