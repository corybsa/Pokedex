package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Berries.Berry;
import com.carbonmade.corysandlin.pokedex.Data.Models.Berries.BerryFirmness;
import com.carbonmade.corysandlin.pokedex.Data.Models.Berries.BerryFlavor;
import com.carbonmade.corysandlin.pokedex.Data.Network.BerriesApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class BerriesService {
    private Retrofit mRetrofit;

    BerriesService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getBerry(int id, Callback<Berry> callback) {
        Call<Berry> berry = mRetrofit.create(BerriesApi.class).getBerry(id);
        berry.enqueue(callback);
    }

    public void getBerry(String name, Callback<Berry> callback) {
        Call<Berry> berry = mRetrofit.create(BerriesApi.class).getBerry(name);
        berry.enqueue(callback);
    }

    public void getBerryFirmness(int id, Callback<BerryFirmness> callback) {
        Call<BerryFirmness> firmness = mRetrofit.create(BerriesApi.class).getBerryFirmness(id);
        firmness.enqueue(callback);
    }

    public void getBerryFirmness(String name, Callback<BerryFirmness> callback) {
        Call<BerryFirmness> firmness = mRetrofit.create(BerriesApi.class).getBerryFirmness(name);
        firmness.enqueue(callback);
    }

    public void getBerryFlavor(int id, Callback<BerryFlavor> callback) {
        Call<BerryFlavor> flavor = mRetrofit.create(BerriesApi.class).getBerryFlavor(id);
        flavor.enqueue(callback);
    }

    public void getBerryFlavor(String name, Callback<BerryFlavor> callback) {
        Call<BerryFlavor> flavor = mRetrofit.create(BerriesApi.class).getBerryFlavor(name);
        flavor.enqueue(callback);
    }
}
