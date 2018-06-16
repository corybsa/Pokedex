package com.carbonmade.corysandlin.pokedex.PokemonList;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Pokemon;
import com.carbonmade.corysandlin.pokedex.Util.BasePresenter;

import retrofit2.Call;

public interface PokemonListContract {
    interface View {
        void showPokemon();
    }

    interface Presenter extends BasePresenter {
        void load(OnPokemonLoadedListener listener);
        void loadMore(String next, OnPokemonLoadedListener listener);
        void pokemonClicked(NamedApiResource resource, OnPokemonClickedListener listener);
    }

    interface OnPokemonLoadedListener {
        void onSuccess(NamedApiResourceList namedApiResourceList);
        void onSuccess(Pokemon pokemon);
        void onError(Call call, Throwable throwable);
    }

    interface OnPokemonClickedListener {
        void onSuccess(Pokemon pokemon);
        void onError(Call call, Throwable throwable);
    }
}
