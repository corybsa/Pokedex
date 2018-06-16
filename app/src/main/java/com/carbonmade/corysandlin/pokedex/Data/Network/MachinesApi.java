package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Machines.Machine;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MachinesApi {
    @GET("machine")
    Call<ApiResourceList> getMachines();

    @GET("machine/{id}")
    Call<Machine> getMachine(@Path("id") int id);
}
