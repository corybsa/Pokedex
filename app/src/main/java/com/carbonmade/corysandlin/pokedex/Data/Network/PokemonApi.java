package com.carbonmade.corysandlin.pokedex.Data.Network;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.ApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Ability;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Characteristic;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.EggGroup;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Gender;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.GrowthRate;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Nature;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokeathlonStat;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Pokemon;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonColor;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonForm;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonHabitat;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonShape;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.PokemonSpecies;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Stat;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Type;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonApi {
    @GET("ability")
    Call<NamedApiResourceList> getAbilities();

    @GET("ability/{id}")
    Call<Ability> getAbility(@Path("id") int id);

    @GET("ability/{name}")
    Call<Ability> getAbility(@Path("name") String name);

    @GET("characteristic")
    Call<ApiResourceList> getCharacteristics();

    @GET("characteristic/{id}")
    Call<Characteristic> getCharacteristic(@Path("id") int id);

    @GET("egg-group")
    Call<NamedApiResourceList> getEggGroups();

    @GET("egg-group/{id}")
    Call<EggGroup> getEggGroup(@Path("id") int id);

    @GET("egg-group/{name}")
    Call<EggGroup> getEggGroup(@Path("name") String name);

    @GET("gender")
    Call<NamedApiResourceList> getGenders();

    @GET("gender/{id}")
    Call<Gender> getGender(@Path("id") int id);

    @GET("gender/{name}")
    Call<Gender> getGender(@Path("name") String name);

    @GET("growth-rate")
    Call<NamedApiResourceList> getGrowthRates();

    @GET("growth-rate/{id}")
    Call<GrowthRate> getGrowthRate(@Path("id") int id);

    @GET("growth-rate/{name}")
    Call<GrowthRate> getGrowthRate(@Path("name") String name);

    @GET("nature")
    Call<NamedApiResourceList> getNatures();

    @GET("nature/{id}")
    Call<Nature> getNature(@Path("id") int id);

    @GET("nature/{name}")
    Call<Nature> getNature(@Path("name") String name);

    @GET("pokeathlon-stat")
    Call<NamedApiResourceList> getPokeathlonStats();

    @GET("pokeathlon-stat/{id}")
    Call<PokeathlonStat> getPokeathlonStat(@Path("id") int id);

    @GET("pokeathlon-stat/{name}")
    Call<PokeathlonStat> getPokeathlonStat(@Path("name") String name);

    @GET("pokemon")
    Call<NamedApiResourceList> getPokemon();

    @GET("pokemon/")
    Call<NamedApiResourceList> getMorePokemon(@Query("offset") int offset);

    @GET("pokemon/{id}")
    Call<Pokemon> getPokemon(@Path("id") int id);

    @GET("pokemon/{name}")
    Call<Pokemon> getPokemon(@Path("name") String name);

    @GET("pokemon-color")
    Call<NamedApiResourceList> getPokemonColors();

    @GET("pokemon-color/{id}")
    Call<PokemonColor> getPokemonColor(@Path("id") int id);

    @GET("pokemon-color/{name}")
    Call<PokemonColor> getPokemonColor(@Path("name") String name);

    @GET("pokemon-form")
    Call<NamedApiResourceList> getPokemonForms();

    @GET("pokemon-form/{id}")
    Call<PokemonForm> getPokemonForm(@Path("id") int id);

    @GET("pokemon-form/{name}")
    Call<PokemonForm> getPokemonForm(@Path("name") String name);

    @GET("pokemon-habitat")
    Call<NamedApiResourceList> getPokemonHabitats();

    @GET("pokemon-habitat/{id}")
    Call<PokemonHabitat> getPokemonHabitat(@Path("id") int id);

    @GET("pokemon-habitat/{name}")
    Call<PokemonHabitat> getPokemonHabitat(@Path("name") String name);

    @GET("pokemon-shape")
    Call<NamedApiResourceList> getPokemonShapes();

    @GET("pokemon-shape/{id}")
    Call<PokemonShape> getPokemonShape(@Path("id") int id);

    @GET("pokemon-shape/{name}")
    Call<PokemonShape> getPokemonShape(@Path("name") String name);

    @GET("pokemon-species")
    Call<NamedApiResourceList> getPokemonSpecies();

    @GET("pokemon-species/{id}")
    Call<PokemonSpecies> getPokemonSpecies(@Path("id") int id);

    @GET("pokemon-species/{name}")
    Call<PokemonSpecies> getPokemonSpecies(@Path("name") String name);

    @GET("stat")
    Call<NamedApiResourceList> getStats();

    @GET("stat/{id}")
    Call<Stat> getStat(@Path("id") int id);

    @GET("stat/{name}")
    Call<Stat> getStat(@Path("name") String name);

    @GET("type")
    Call<NamedApiResourceList> getTypes();

    @GET("type/{id}")
    Call<Type> getType(@Path("id") int id);

    @GET("type/{name}")
    Call<Type> getType(@Path("name") String name);
}
