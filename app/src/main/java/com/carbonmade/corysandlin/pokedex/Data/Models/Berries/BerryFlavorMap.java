package com.carbonmade.corysandlin.pokedex.Data.Models.Berries;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.squareup.moshi.Json;

public class BerryFlavorMap {
    @Json(name = "potency")
    private int mPotency;

    @Json(name = "flavor")
    private NamedApiResource mFlavor;
}
