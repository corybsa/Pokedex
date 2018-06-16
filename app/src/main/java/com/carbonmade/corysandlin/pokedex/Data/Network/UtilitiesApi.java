package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Utility.Language;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UtilitiesApi {
    @GET("language")
    Call<NamedApiResourceList> getLanguages();

    @GET("language/{id}")
    Call<Language> getLanguage(@Path("id") int id);

    @GET("language/{name}")
    Call<Language> getLanguage(@Path("name") String name);
}
