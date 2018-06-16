package com.carbonmade.corysandlin.pokedex.Data.Models.Common;

import com.squareup.moshi.Json;

public class GenerationGameIndex {
    @Json(name = "game_index")
    private int mGameIndex;

    @Json(name = "generation")
    private NamedApiResource mGeneration;

    public int getGameIndex() {
        return mGameIndex;
    }

    public void setGameIndex(int gameIndex) {
        mGameIndex = gameIndex;
    }

    public NamedApiResource getGeneration() {
        return mGeneration;
    }

    public void setGeneration(NamedApiResource generation) {
        mGeneration = generation;
    }
}
