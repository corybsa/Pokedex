package com.carbonmade.corysandlin.pokedex.Data.Services;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;

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
import com.carbonmade.corysandlin.pokedex.Data.Network.PokemonApi;
import com.carbonmade.corysandlin.pokedex.Data.Storage.AppDatabase;
import com.carbonmade.corysandlin.pokedex.PokemonList.PokemonListFragment;
import com.carbonmade.corysandlin.pokedex.Util.QueryParser;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PokemonService {
    private Retrofit mRetrofit;
    private AppDatabase mDatabase;
    private Call<NamedApiResourceList> mListCall;

    PokemonService(Retrofit retrofit, AppDatabase database) {
        mRetrofit = retrofit;
        mDatabase = database;
    }

    public void getAbilities(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> abilities = mRetrofit.create(PokemonApi.class).getAbilities();
        abilities.enqueue(callback);
    }

    public void getAbility(int id, Callback<Ability> callback) {
        Call<Ability> ability = mRetrofit.create(PokemonApi.class).getAbility(id);
        ability.enqueue(callback);
    }

    public void getAbility(String name, Callback<Ability> callback) {
        Call<Ability> ability = mRetrofit.create(PokemonApi.class).getAbility(name);
        ability.enqueue(callback);
    }

    public void getCharacteristics(Callback<ApiResourceList> callback) {
        Call<ApiResourceList> characteristics = mRetrofit.create(PokemonApi.class).getCharacteristics();
        characteristics.enqueue(callback);
    }

    public void getCharacteristic(int id, Callback<Characteristic> callback) {
        Call<Characteristic> characteristic = mRetrofit.create(PokemonApi.class).getCharacteristic(id);
        characteristic.enqueue(callback);
    }

    public void getEggGroups(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> groups = mRetrofit.create(PokemonApi.class).getEggGroups();
        groups.enqueue(callback);
    }

    public void getEggGroup(int id, Callback<EggGroup> callback) {
        Call<EggGroup> group = mRetrofit.create(PokemonApi.class).getEggGroup(id);
        group.enqueue(callback);
    }

    public void getEggGroup(String name, Callback<EggGroup> callback) {
        Call<EggGroup> group = mRetrofit.create(PokemonApi.class).getEggGroup(name);
        group.enqueue(callback);
    }

    public void getGenders(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> genders = mRetrofit.create(PokemonApi.class).getGenders();
        genders.enqueue(callback);
    }

    public void getGender(int id, Callback<Gender> callback) {
        Call<Gender> gender = mRetrofit.create(PokemonApi.class).getGender(id);
        gender.enqueue(callback);
    }

    public void getGender(String name, Callback<Gender> callback) {
        Call<Gender> gender = mRetrofit.create(PokemonApi.class).getGender(name);
        gender.enqueue(callback);
    }

    public void getGrowthRates(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> rates = mRetrofit.create(PokemonApi.class).getGrowthRates();
        rates.enqueue(callback);
    }

    public void getGrowthRate(int id, Callback<GrowthRate> callback) {
        Call<GrowthRate> rate = mRetrofit.create(PokemonApi.class).getGrowthRate(id);
        rate.enqueue(callback);
    }

    public void getGrowthRate(String name, Callback<GrowthRate> callback) {
        Call<GrowthRate> rate = mRetrofit.create(PokemonApi.class).getGrowthRate(name);
        rate.enqueue(callback);
    }

    public void getNatures(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> natures = mRetrofit.create(PokemonApi.class).getNatures();
        natures.enqueue(callback);
    }

    public void getNature(int id, Callback<Nature> callback) {
        Call<Nature> nature = mRetrofit.create(PokemonApi.class).getNature(id);
        nature.enqueue(callback);
    }

    public void getNature(String name, Callback<Nature> callback) {
        Call<Nature> nature = mRetrofit.create(PokemonApi.class).getNature(name);
        nature.enqueue(callback);
    }

    public void getPokeathlonStats(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> stats = mRetrofit.create(PokemonApi.class).getPokeathlonStats();
        stats.enqueue(callback);
    }

    public void getPokeathlonStat(int id, Callback<PokeathlonStat> callback) {
        Call<PokeathlonStat> stat = mRetrofit.create(PokemonApi.class).getPokeathlonStat(id);
        stat.enqueue(callback);
    }

    public void getPokeathlonStat(String name, Callback<PokeathlonStat> callback) {
        Call<PokeathlonStat> stat = mRetrofit.create(PokemonApi.class).getPokeathlonStat(name);
        stat.enqueue(callback);
    }

    public void getPokemon(final Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> pokemon = mRetrofit.create(PokemonApi.class).getPokemon();
        pokemon.enqueue(callback);
    }

    public void getMorePokemon(String next, Callback<NamedApiResourceList> callback) {
        if(next != null) {
            if(mListCall != null) {
                mListCall.cancel();
            }

            int offset = new QueryParser(next).getNumber("offset");
            mListCall = mRetrofit.create(PokemonApi.class).getMorePokemon(offset);
            mListCall.enqueue(callback);
        }
    }

    public void getPokemon(int id, Callback<Pokemon> callback) {
        Call<Pokemon> pokemon = mRetrofit.create(PokemonApi.class).getPokemon(id);
        pokemon.enqueue(callback);
    }

    public void getPokemon(String name, Callback<Pokemon> callback) {
        Call<Pokemon> pokemon = mRetrofit.create(PokemonApi.class).getPokemon(name);
        pokemon.enqueue(callback);
    }

    public void getPokemonColors(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> colors = mRetrofit.create(PokemonApi.class).getPokemonColors();
        colors.enqueue(callback);
    }

    public void getPokemonColor(int id, Callback<PokemonColor> callback) {
        Call<PokemonColor> color = mRetrofit.create(PokemonApi.class).getPokemonColor(id);
        color.enqueue(callback);
    }

    public void getPokemonColor(String name, Callback<PokemonColor> callback) {
        Call<PokemonColor> color = mRetrofit.create(PokemonApi.class).getPokemonColor(name);
        color.enqueue(callback);
    }

    public void getPokemonForms(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> forms = mRetrofit.create(PokemonApi.class).getPokemonForms();
        forms.enqueue(callback);
    }

    public void getPokemonForm(int id, Callback<PokemonForm> callback) {
        Call<PokemonForm> form = mRetrofit.create(PokemonApi.class).getPokemonForm(id);
        form.enqueue(callback);
    }

    public void getPokemonForm(String name, Callback<PokemonForm> callback) {
        Call<PokemonForm> form = mRetrofit.create(PokemonApi.class).getPokemonForm(name);
        form.enqueue(callback);
    }

    public void getPokemonHabitats(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> habitats = mRetrofit.create(PokemonApi.class).getPokemonHabitats();
        habitats.enqueue(callback);
    }

    public void getPokemonHabitat(int id, Callback<PokemonHabitat> callback) {
        Call<PokemonHabitat> habitat = mRetrofit.create(PokemonApi.class).getPokemonHabitat(id);
        habitat.enqueue(callback);
    }

    public void getPokemonHabitat(String name, Callback<PokemonHabitat> callback) {
        Call<PokemonHabitat> habitat = mRetrofit.create(PokemonApi.class).getPokemonHabitat(name);
        habitat.enqueue(callback);
    }

    public void getPokemonShapes(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> shapes = mRetrofit.create(PokemonApi.class).getPokemonShapes();
        shapes.enqueue(callback);
    }

    public void getPokemonShape(int id, Callback<PokemonShape> callback) {
        Call<PokemonShape> shape = mRetrofit.create(PokemonApi.class).getPokemonShape(id);
        shape.enqueue(callback);
    }

    public void getPokemonShape(String name, Callback<PokemonShape> callback) {
        Call<PokemonShape> shape = mRetrofit.create(PokemonApi.class).getPokemonShape(name);
        shape.enqueue(callback);
    }

    public void getPokemonSpecies(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> species = mRetrofit.create(PokemonApi.class).getPokemonSpecies();
        species.enqueue(callback);
    }

    public void getPokemonSpecies(int id, Callback<PokemonSpecies> callback) {
        Call<PokemonSpecies> species = mRetrofit.create(PokemonApi.class).getPokemonSpecies(id);
        species.enqueue(callback);
    }

    public void getPokemonSpecies(String name, Callback<PokemonSpecies> callback) {
        Call<PokemonSpecies> species = mRetrofit.create(PokemonApi.class).getPokemonSpecies(name);
        species.enqueue(callback);
    }

    public void getStats(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> stats = mRetrofit.create(PokemonApi.class).getStats();
        stats.enqueue(callback);
    }

    public void getStat(int id, Callback<Stat> callback) {
        Call<Stat> stat = mRetrofit.create(PokemonApi.class).getStat(id);
        stat.enqueue(callback);
    }

    public void getStat(String name, Callback<Stat> callback) {
        Call<Stat> stat = mRetrofit.create(PokemonApi.class).getStat(name);
        stat.enqueue(callback);
    }

    public void getTypes(Callback<NamedApiResourceList> callback) {
        Call<NamedApiResourceList> types = mRetrofit.create(PokemonApi.class).getTypes();
        types.enqueue(callback);
    }

    public void getType(int id, Callback<Type> callback) {
        Call<Type> type = mRetrofit.create(PokemonApi.class).getType(id);
        type.enqueue(callback);
    }

    public void getType(String name, Callback<Type> callback) {
        Call<Type> type = mRetrofit.create(PokemonApi.class).getType(name);
        type.enqueue(callback);
    }
}
