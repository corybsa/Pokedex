package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Berries.Berry;
import com.carbonmade.corysandlin.pokedex.Data.Models.Berries.BerryFirmness;
import com.carbonmade.corysandlin.pokedex.Data.Models.Berries.BerryFlavor;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BerriesApi {
    @GET("berry")
    Call<NamedApiResourceList> getBerries();

    @GET("berry/{id}")
    Call<Berry> getBerry(@Path("id") int id);

    @GET("berry/{name}")
    Call<Berry> getBerry(@Path("name") String name);

    @GET("berry")
    Call<NamedApiResourceList> getBerryFirmnesses();

    @GET("berry-firmness/{id]")
    Call<BerryFirmness> getBerryFirmness(@Path("id") int id);

    @GET("berry-firmness/{name}")
    Call<BerryFirmness> getBerryFirmness(@Path("name") String name);

    @GET("berry-flavor/{id}")
    Call<BerryFlavor> getBerryFlavor(@Path("id") int id);

    @GET("berry-flavor/{name}")
    Call<BerryFlavor> getBerryFlavor(@Path("name") String name);
}
