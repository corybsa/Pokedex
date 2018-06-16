package com.carbonmade.corysandlin.pokedex.Data.Models.Encounters;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class EncounterMethodRate {
    @Json(name = "encounter_method")
    private NamedApiResource mEncounterMethod;

    @Json(name = "version_details")
    private List<EncounterVersionDetails> mVersionDetails;

    public NamedApiResource getEncounterMethod() {
        return mEncounterMethod;
    }

    public void setEncounterMethod(NamedApiResource encounterMethod) {
        mEncounterMethod = encounterMethod;
    }

    public List<EncounterVersionDetails> getVersionDetails() {
        return mVersionDetails;
    }

    public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
        mVersionDetails = versionDetails;
    }
}
