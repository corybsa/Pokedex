package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Utility.Language;
import com.carbonmade.corysandlin.pokedex.Data.Network.UtilitiesApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class UtilitiesService {
    private Retrofit mRetrofit;

    UtilitiesService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getLanguages(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> languages = mRetrofit.create(UtilitiesApi.class).getLanguages();
        languages.enqueue(callback);
    }

    public void getLanguage(int id, Callback<Language> callback) {
        Call<Language> language = mRetrofit.create(UtilitiesApi.class).getLanguage(id);
        language.enqueue(callback);
    }

    public void getLanguage(String name, Callback<Language> callback) {
        Call<Language> language = mRetrofit.create(UtilitiesApi.class).getLanguage(name);
        language.enqueue(callback);
    }
}
