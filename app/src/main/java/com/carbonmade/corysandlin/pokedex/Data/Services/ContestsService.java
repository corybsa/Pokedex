package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Contests.ContestEffect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Contests.ContestType;
import com.carbonmade.corysandlin.pokedex.Data.Models.Contests.SuperContestEffect;
import com.carbonmade.corysandlin.pokedex.Data.Network.ContestsApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class ContestsService {
    private Retrofit mRetrofit;

    ContestsService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getContestTypes(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> types = mRetrofit.create(ContestsApi.class).getContestTypes();
        types.enqueue(callback);
    }

    public void getContestType(int id, Callback<ContestType> callback) {
        Call<ContestType> type = mRetrofit.create(ContestsApi.class).getContestType(id);
        type.enqueue(callback);
    }

    public void getContestType(String name, Callback<ContestType> callback) {
        Call<ContestType> type = mRetrofit.create(ContestsApi.class).getContestType(name);
        type.enqueue(callback);
    }

    public void getContestEffects(Callback<ApiResourceList> callback) {
        Call<ApiResourceList> effects = mRetrofit.create(ContestsApi.class).getContestEffects();
        effects.enqueue(callback);
    }

    public void getContestEffect(int id, Callback<ContestEffect> callback) {
        Call<ContestEffect> effect = mRetrofit.create(ContestsApi.class).getContestEffect(id);
        effect.enqueue(callback);
    }

    public void getSuperContestEffects(Callback<ApiResourceList> callback) {
        Call<ApiResourceList> effects = mRetrofit.create(ContestsApi.class).getSuperContestEffects();
        effects.enqueue(callback);
    }

    public void getSuperContestEffect(int id, Callback<SuperContestEffect> callback) {
        Call<SuperContestEffect> effect = mRetrofit.create(ContestsApi.class).getSuperContestEffect(id);
        effect.enqueue(callback);
    }
}
