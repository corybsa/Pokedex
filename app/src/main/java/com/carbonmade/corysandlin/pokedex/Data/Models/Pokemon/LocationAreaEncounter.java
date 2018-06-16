package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.VersionEncounterDetail;
import com.squareup.moshi.Json;

import java.util.List;

public class LocationAreaEncounter {
    @Json(name = "location_area")
    private NamedApiResource mLocationArea;

    @Json(name = "version_details")
    private List<VersionEncounterDetail> mVersionDetails;

    public NamedApiResource getLocationArea() {
        return mLocationArea;
    }

    public void setLocationArea(NamedApiResource locationArea) {
        mLocationArea = locationArea;
    }

    public List<VersionEncounterDetail> getVersionDetails() {
        return mVersionDetails;
    }

    public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
        mVersionDetails = versionDetails;
    }
}
