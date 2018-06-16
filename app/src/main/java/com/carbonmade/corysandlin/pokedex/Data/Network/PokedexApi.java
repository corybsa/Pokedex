package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Locations.Location;
import com.carbonmade.corysandlin.pokedex.Data.Models.Utility.Language;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokedexApi {
    @GET("language/{id}")
    Call<Language> getLanguage(@Path("id") int id);

    @GET("location/{id}")
    Call<Location> getLocation(@Path("id") int id);
}
