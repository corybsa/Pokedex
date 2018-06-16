package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Games.Generation;
import com.carbonmade.corysandlin.pokedex.Data.Models.Games.Pokedex;
import com.carbonmade.corysandlin.pokedex.Data.Models.Games.Version;
import com.carbonmade.corysandlin.pokedex.Data.Models.Games.VersionGroup;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GamesApi {
    @GET("generation")
    Call<NamedApiResourceList> getGenerations();

    @GET("generation/{id}")
    Call<Generation> getGeneration(@Path("id") int id);

    @GET("generation/{name}")
    Call<Generation> getGeneration(@Path("name") String name);

    @GET("pokedex")
    Call<NamedApiResourceList> getPokedexes();

    @GET("pokedex/{id}")
    Call<Pokedex> getPokedex(@Path("id") int id);

    @GET("pokedex/{name}")
    Call<Pokedex> getPokedex(@Path("name") String name);

    @GET("version")
    Call<NamedApiResourceList> getVersions();

    @GET("version/{id}")
    Call<Version> getVersion(@Path("id") int id);

    @GET("version/{name}")
    Call<Version> getVersion(@Path("name") String name);

    @GET("version-group")
    Call<NamedApiResourceList> getVersionGroups();

    @GET("version-group/{id}")
    Call<VersionGroup> getVersionGroup(@Path("id") int id);

    @GET("version-group/{name}")
    Call<VersionGroup> getVersionGroup(@Path("name") String name);
}
