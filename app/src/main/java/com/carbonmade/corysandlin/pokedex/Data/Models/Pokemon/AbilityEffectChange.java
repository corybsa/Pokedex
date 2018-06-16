package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Effect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

import java.util.List;

public class AbilityEffectChange {
    @Json(name = "effect_entries")
    private List<Effect> mEffectEntries;

    @Json(name = "version_group")
    private NamedApiResource mVersionGroup;

    public List<Effect> getEffectEntries() {
        return mEffectEntries;
    }

    public void setEffectEntries(List<Effect> effectEntries) {
        mEffectEntries = effectEntries;
    }

    public NamedApiResource getVersionGroup() {
        return mVersionGroup;
    }

    public void setVersionGroup(NamedApiResource versionGroup) {
        mVersionGroup = versionGroup;
    }
}
