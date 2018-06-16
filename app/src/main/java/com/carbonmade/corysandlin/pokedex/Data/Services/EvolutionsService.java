package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Evolutions.EvolutionChain;
import com.carbonmade.corysandlin.pokedex.Data.Models.Evolutions.EvolutionTrigger;
import com.carbonmade.corysandlin.pokedex.Data.Network.EvolutionsApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class EvolutionsService {
    private Retrofit mRetrofit;

    public EvolutionsService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getEvolutionChains(Callback<ApiResourceList> callback) {
        Call<ApiResourceList> chains = mRetrofit.create(EvolutionsApi.class).getEvolutionChains();
        chains.enqueue(callback);
    }

    public void getEvolutionChain(int id, Callback<EvolutionChain> callback) {
        Call<EvolutionChain> chain = mRetrofit.create(EvolutionsApi.class).getEvolutionChain(id);
        chain.enqueue(callback);
    }

    public void getEvolutionTriggers(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> triggers = mRetrofit.create(EvolutionsApi.class).getEvolutionTriggers();
        triggers.enqueue(callback);
    }

    public void getEvolutionTrigger(int id, Callback<EvolutionTrigger> callback) {
        Call<EvolutionTrigger> trigger = mRetrofit.create(EvolutionsApi.class).getEvolutionTrigger(id);
        trigger.enqueue(callback);
    }

    public void getEvolutionTrigger(String name, Callback<EvolutionTrigger> callback) {
        Call<EvolutionTrigger> trigger = mRetrofit.create(EvolutionsApi.class).getEvolutionTrigger(name);
        trigger.enqueue(callback);
    }
}
