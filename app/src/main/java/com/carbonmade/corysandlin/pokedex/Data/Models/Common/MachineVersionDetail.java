package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

public class MachineVersionDetail {
    @Json(name = "machine")
    private ApiResource mMachine;

    @Json(name = "version_group")
    private NamedApiResource mVersionGroup;

    public ApiResource getMachine() {
        return mMachine;
    }

    public void setMachine(ApiResource machine) {
        mMachine = machine;
    }

    public NamedApiResource getVersionGroup() {
        return mVersionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        mVersionGroup = versionGroup;
    }
}
