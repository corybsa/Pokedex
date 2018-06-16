package com.carbonmade.corysandlin.pokedex.Data.Models.Locations;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.Name;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.EncounterMethodRate;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.PokemonEncounter;
import com.squareup.moshi.Json;

import java.util.List;

public class LocationArea {
    @Json(name = "id")
    private int mId;

    @Json(name = "name")
    private String mName;

    @Json(name = "game_index")
    private int mGameIndex;

    @Json(name = "encounter_method_rates")
    private List<EncounterMethodRate> mEncounterMethodRates;

    @Json(name = "location")
    private NamedApiResource mLocation;

    @Json(name = "names")
    private List<Name> mNames;

    @Json(name = "pokemon_encounters")
    private List<PokemonEncounter> mPokemonEncounters;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getGameIndex() {
        return mGameIndex;
    }

    public void setGameIndex(int gameIndex) {
        mGameIndex = gameIndex;
    }

    public List<EncounterMethodRate> getEncounterMethodRates() {
        return mEncounterMethodRates;
    }

    public void setEncounterMethodRates(List<EncounterMethodRate> encounterMethodRates) {
        mEncounterMethodRates = encounterMethodRates;
    }

    public NamedApiResource getLocation() {
        return mLocation;
    }

    public void setLocation(NamedApiResource location) {
        mLocation = location;
    }

    public List<Name> getNames() {
        return mNames;
    }

    public void setNames(List<Name> names) {
        mNames = names;
    }

    public List<PokemonEncounter> getPokemonEncounters() {
        return mPokemonEncounters;
    }

    public void setPokemonEncounters(List<PokemonEncounter> pokemonEncounters) {
        mPokemonEncounters = pokemonEncounters;
    }
}
