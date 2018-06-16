package com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon;

import android.arch.persistence.room.ColumnInfo;

import com.squareup.moshi.Json;

public class PokemonSprite {
    @ColumnInfo(name = "front_default")
    @Json(name = "front_default")
    private String mFrontDefault;

    @ColumnInfo(name = "front_shiny")
    @Json(name = "front_shiny")
    private String mFrontShiny;

    @ColumnInfo(name = "front_female")
    @Json(name = "front_female")
    private String mFrontFemale;

    @ColumnInfo(name = "front_shiny_female")
    @Json(name = "front_shiny_female")
    private String mFrontShinyFemale;

    @ColumnInfo(name = "back_default")
    @Json(name = "back_default")
    private String mBackDefault;

    @ColumnInfo(name = "back_shiny")
    @Json(name = "back_shiny")
    private String mBackShiny;

    @ColumnInfo(name = "back_female")
    @Json(name = "back_female")
    private String mBackFemale;

    @ColumnInfo(name = "back_shiny_female")
    @Json(name = "back_shiny_female")
    private String mBackShinyFemale;

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

    public String getFrontFemale() {
        return mFrontFemale;
    }

    public void setFrontFemale(String frontFemale) {
        mFrontFemale = frontFemale;
    }

    public String getFrontShinyFemale() {
        return mFrontShinyFemale;
    }

    public void setFrontShinyFemale(String frontShinyFemale) {
        mFrontShinyFemale = frontShinyFemale;
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

    public String getBackFemale() {
        return mBackFemale;
    }

    public void setBackFemale(String backFemale) {
        mBackFemale = backFemale;
    }

    public String getBackShinyFemale() {
        return mBackShinyFemale;
    }

    public void setBackShinyFemale(String backShinyFemale) {
        mBackShinyFemale = backShinyFemale;
    }
}
