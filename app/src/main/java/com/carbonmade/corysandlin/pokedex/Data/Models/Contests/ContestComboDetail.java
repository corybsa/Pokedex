package com.carbonmade.corysandlin.pokedex.Data.Models.Contests;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class ContestComboDetail {
    @Json(name = "use_before")
    private List<NamedApiResource> mUseBefore;

    @Json(name = "use_after")
    private List<NamedApiResource> mUseAfter;

    public List<NamedApiResource> getUseBefore() {
        return mUseBefore;
    }

    public void setUseBefore(List<NamedApiResource> useBefore) {
        mUseBefore = useBefore;
    }

    public List<NamedApiResource> getUseAfter() {
        return mUseAfter;
    }

    public void setUseAfter(List<NamedApiResource> useAfter) {
        mUseAfter = useAfter;
    }
}
