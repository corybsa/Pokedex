package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.EncounterCondition;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.EncounterConditionValue;
import com.carbonmade.corysandlin.pokedex.Data.Models.Encounters.EncounterMethod;
import com.carbonmade.corysandlin.pokedex.Data.Network.EncountersApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class EncountersService {
    private Retrofit mRetrofit;

    EncountersService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getEncounterMethods(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> method = mRetrofit.create(EncountersApi.class).getEncounterMethods();
        method.enqueue(callback);
    }

    public void getEncounterMethod(int id, Callback<EncounterMethod> callback) {
        Call<EncounterMethod> method = mRetrofit.create(EncountersApi.class).getEncounterMethod(id);
        method.enqueue(callback);
    }

    public void getEncounterMethod(String name, Callback<EncounterMethod> callback) {
        Call<EncounterMethod> method = mRetrofit.create(EncountersApi.class).getEncounterMethod(name);
        method.enqueue(callback);
    }

    public void getEncounterConditions(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> conditions = mRetrofit.create(EncountersApi.class).getEncounterConditions();
        conditions.enqueue(callback);
    }

    public void getEncounterCondition(int id, Callback<EncounterCondition> callback) {
        Call<EncounterCondition> condition = mRetrofit.create(EncountersApi.class).getEncounterCondition(id);
        condition.enqueue(callback);
    }

    public void getEncounterCondition(String name, Callback<EncounterCondition> callback) {
        Call<EncounterCondition> condition = mRetrofit.create(EncountersApi.class).getEncounterCondition(name);
        condition.enqueue(callback);
    }

    public void getEncounterConditionValues(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> values = mRetrofit.create(EncountersApi.class).getEncounterConditionValues();
        values.enqueue(callback);
    }

    public void getEncounterConditionValue(int id, Callback<EncounterConditionValue> callback) {
        Call<EncounterConditionValue> value = mRetrofit.create(EncountersApi.class).getEncounterConditionValue(id);
        value.enqueue(callback);
    }

    public void getEncounterConditionValue(String name, Callback<EncounterConditionValue> callback) {
        Call<EncounterConditionValue> value = mRetrofit.create(EncountersApi.class).getEncounterConditionValue(name);
        value.enqueue(callback);
    }
}
