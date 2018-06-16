package com.carbonmade.corysandlin.pokedex.Data.Models.Encounters;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class EncounterVersionDetails {
    @Json(name = "rate")
    private int mRate;

    @Json(name = "version")
    private NamedApiResource mVersion;

    public int getRate() {
        return mRate;
    }

    public void setRate(int rate) {
        mRate = rate;
    }

    public NamedApiResource getVersion() {
        return mVersion;
    }

    public void setVersion(NamedApiResource version) {
        mVersion = version;
    }
}
