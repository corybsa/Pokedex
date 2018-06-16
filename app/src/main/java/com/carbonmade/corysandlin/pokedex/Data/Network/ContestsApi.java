package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Contests.ContestEffect;
import com.carbonmade.corysandlin.pokedex.Data.Models.Contests.ContestType;
import com.carbonmade.corysandlin.pokedex.Data.Models.Contests.SuperContestEffect;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ContestsApi {
    @GET("contest-type")
    Call<NamedApiResourceList> getContestTypes();

    @GET("contest-type/{id}")
    Call<ContestType> getContestType(@Path("id") int id);

    @GET("contest-type/{name}")
    Call<ContestType> getContestType(@Path("name") String name);

    @GET("contest-effect")
    Call<ApiResourceList> getContestEffects();

    @GET("contest-effect/{id}")
    Call<ContestEffect> getContestEffect(@Path("id") int id);

    @GET("super-contest-effect")
    Call<ApiResourceList> getSuperContestEffects();

    @GET("super-contest-effect/{id}")
    Call<SuperContestEffect> getSuperContestEffect(@Path("id") int id);
}
