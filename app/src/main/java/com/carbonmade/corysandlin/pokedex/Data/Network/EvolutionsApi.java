package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Evolutions.EvolutionChain;
import com.carbonmade.corysandlin.pokedex.Data.Models.Evolutions.EvolutionTrigger;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EvolutionsApi {
    @GET("evolution-chain")
    Call<ApiResourceList> getEvolutionChains();

    @GET("evolution-chain/{id}")
    Call<EvolutionChain> getEvolutionChain(@Path("id") int id);

    @GET("evolution-trigger")
    Call<NamedApiResourceList> getEvolutionTriggers();

    @GET("evolution-trigger/{id}")
    Call<EvolutionTrigger> getEvolutionTrigger(@Path("id") int id);

    @GET("evolution-trigger/{name}")
    Call<EvolutionTrigger> getEvolutionTrigger(@Path("name") String name);
}
