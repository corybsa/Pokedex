package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.EncounterCondition;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.EncounterConditionValue;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.EncounterMethod;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EncountersApi {
    @GET("encounter-method")
    Call<NamedApiResourceList> getEncounterMethods();

    @GET("encounter-method/{id}")
    Call<EncounterMethod> getEncounterMethod(@Path("id") int id);

    @GET("encounter-method/{name}")
    Call<EncounterMethod> getEncounterMethod(@Path("name") String name);

    @GET("encounter-condition")
    Call<NamedApiResourceList> getEncounterConditions();

    @GET("encounter-condition/{id}")
    Call<EncounterCondition> getEncounterCondition(@Path("id") int id);

    @GET("encounter-condition/{name}")
    Call<EncounterCondition> getEncounterCondition(@Path("name") String name);

    @GET("encounter-condition-value")
    Call<NamedApiResourceList> getEncounterConditionValues();

    @GET("encounter-condition-value/{id}")
    Call<EncounterConditionValue> getEncounterConditionValue(@Path("id") int id);

    @GET("encounter-condition-value/{name}")
    Call<EncounterConditionValue> getEncounterConditionValue(@Path("name") String name);
}
