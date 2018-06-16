package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

import java.util.List;

public class VersionEncounterDetail {
    @Json(name = "version")
    private NamedApiResource mVersion;

    @Json(name = "max_chance")
    private int mMaxChance;

    @Json(name = "encounter_details")
    private List<Encounter> mEncounterDetails;

    public NamedApiResource getVersion() {
        return mVersion;
    }

    public void setVersion(NamedApiResource version) {
        mVersion = version;
    }

    public int getMaxChance() {
        return mMaxChance;
    }

    public void setMaxChance(int maxChance) {
        mMaxChance = maxChance;
    }

    public List<Encounter> getEncounterDetails() {
        return mEncounterDetails;
    }

    public void setEncounterDetails(List<Encounter> encounterDetails) {
        mEncounterDetails = encounterDetails;
    }
}
