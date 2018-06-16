package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import com.squareup.moshi.Json;

public class PokemonFormSprite {
    @Json(name = "front_default")
    private String mFrontDefault;

    @Json(name = "front_shiny")
    private String mFrontShiny;

    @Json(name = "back_default")
    private String mBackDefault;

    @Json(name = "back_shiny")
    private String mBackShiny;

    public String getFrontDefault() {
        return mFrontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        mFrontDefault = frontDefault;
    }

    public String getFrontShiny() {
        return mFrontShiny;
    }

    public void setFrontShiny(String frontShiny) {
        mFrontShiny = frontShiny;
    }

    public String getBackDefault() {
        return mBackDefault;
    }

    public void setBackDefault(String backDefault) {
        mBackDefault = backDefault;
    }

    public String getBackShiny() {
        return mBackShiny;
    }

    public void setBackShiny(String backShiny) {
        mBackShiny = backShiny;
    }
}
