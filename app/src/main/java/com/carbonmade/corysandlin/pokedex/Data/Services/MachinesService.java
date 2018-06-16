package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Machines.Machine;
import com.carbonmade.corysandlin.pokedex.Data.Network.MachinesApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class MachinesService {
    private Retrofit mRetrofit;

    MachinesService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getMachines(Callback<ApiResourceList> callback) {
        Call<ApiResourceList> machines = mRetrofit.create(MachinesApi.class).getMachines();
        machines.enqueue(callback);
    }

    public void getMachine(int id, Callback<Machine> callback) {
        Call<Machine> machine = mRetrofit.create(MachinesApi.class).getMachine(id);
        machine.enqueue(callback);
    }
}
