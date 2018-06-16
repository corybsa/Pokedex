package com.carbonmade.corysandlin.pokedex.Data.Services;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Games.Generation;
import com.carbonmade.corysandlin.pokedex.Data.Models.Games.Pokedex;
import com.carbonmade.corysandlin.pokedex.Data.Models.Games.Version;
import com.carbonmade.corysandlin.pokedex.Data.Models.Games.VersionGroup;
import com.carbonmade.corysandlin.pokedex.Data.Network.GamesApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class GamesService {
    private Retrofit mRetrofit;

    GamesService(Retrofit retrofit) {
        mRetrofit = retrofit;
    }

    public void getGenerations(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> generations = mRetrofit.create(GamesApi.class).getGenerations();
        generations.enqueue(callback);
    }

    public void getGeneration(int id, Callback<Generation> callback) {
        Call<Generation> generation = mRetrofit.create(GamesApi.class).getGeneration(id);
        generation.enqueue(callback);
    }

    public void getGeneration(String name, Callback<Generation> callback) {
        Call<Generation> generation = mRetrofit.create(GamesApi.class).getGeneration(name);
        generation.enqueue(callback);
    }

    public void getPokedexes(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> pokedexes = mRetrofit.create(GamesApi.class).getPokedexes();
        pokedexes.enqueue(callback);
    }

    public void getPokedex(int id, Callback<Pokedex> callback) {
        Call<Pokedex> pokedex = mRetrofit.create(GamesApi.class).getPokedex(id);
        pokedex.enqueue(callback);
    }

    public void getPokedex(String name, Callback<Pokedex> callback) {
        Call<Pokedex> pokedex = mRetrofit.create(GamesApi.class).getPokedex(name);
        pokedex.enqueue(callback);
    }

    public void getVersions(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> versions = mRetrofit.create(GamesApi.class).getVersions();
        versions.enqueue(callback);
    }

    public void getVersion(int id, Callback<Version> callback) {
        Call<Version> version = mRetrofit.create(GamesApi.class).getVersion(id);
        version.enqueue(callback);
    }

    public void getVersion(String name, Callback<Version> callback) {
        Call<Version> version = mRetrofit.create(GamesApi.class).getVersion(name);
        version.enqueue(callback);
    }

    public void getVersionGroups(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> groups = mRetrofit.create(GamesApi.class).getVersionGroups();
        groups.enqueue(callback);
    }

    public void getVersionGroup(int id, Callback<VersionGroup> callback) {
        Call<VersionGroup> group = mRetrofit.create(GamesApi.class).getVersionGroup(id);
        group.enqueue(callback);
    }

    public void getVersionGroup(String name, Callback<VersionGroup> callback) {
        Call<VersionGroup> group = mRetrofit.create(GamesApi.class).getVersionGroup(name);
        group.enqueue(callback);
    }
}
