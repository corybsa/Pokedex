package com.carbonmade.corysandlin.pokedex.PokemonList;

import android.app.Fragment;
import android.arch.lifecycle.Observer;
import android.os.AsyncTask;
import android.support.annotation.Nullable;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Pokemon;
import com.carbonmade.corysandlin.pokedex.Data.Services.PokedexService;
import com.carbonmade.corysandlin.pokedex.Data.Storage.AppDatabase;
import com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon.PokemonResource;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PokemonListPresenter implements PokemonListContract.Presenter {
    private PokemonListFragment mFragment;
    private PokedexService mPokedex;
    private Picasso mPicasso;
    private AppDatabase mDatabase;

    private Observer<PokemonResource> mPokemonResourceObserver;
    private NamedApiResourceList mNamedApiResourceList;
    private PokemonListAdapter mPokemonListAdapter;

    PokemonListPresenter(
        Fragment fragment,
        PokedexService pokedexService,
        Picasso picasso,
        AppDatabase database)
    {
        mFragment = (PokemonListFragment)fragment;
        mPokedex = pokedexService;
        mPicasso = picasso;
        mDatabase = database;

        mPokemonResourceObserver = new Observer<PokemonResource>() {
            @Override
            public void onChanged(@Nullable PokemonResource pokemonResource) {
                if(pokemonResource != null) {
                    boolean go = true;
                    mNamedApiResourceList = pokemonResource.getNamedApiResourceList();

                    if(mPokemonListAdapter != null) {
                        mPokemonListAdapter.setData(mNamedApiResourceList);
                        mPokemonListAdapter.notifyDataSetChanged();
                        go = false;
                    }

                    if(go) {
                        mNamedApiResourceList = new NamedApiResourceList();
                        mNamedApiResourceList.update(pokemonResource.getNamedApiResourceList());
                        mFragment.setupRecyclerView(mNamedApiResourceList);
                    }
                } else {
                    loadFromApi();
                }
            }
        };
    }

    @Override
    public void load(final PokemonListContract.OnPokemonLoadedListener listener) {
        mPokedex.pokemon.getPokemon(new Callback<NamedApiResourceList>() {
            @Override
            public void onResponse(Call<NamedApiResourceList> call, Response<NamedApiResourceList> response) {
                listener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<NamedApiResourceList> call, Throwable t) {
                if(!call.isCanceled()) {
                    listener.onError(call, t);
                }
            }
        });
    }

    @Override
    public void loadMore(String next, final PokemonListContract.OnPokemonLoadedListener listener) {
        mPokedex.pokemon.getMorePokemon(next, new Callback<NamedApiResourceList>() {
            @Override
            public void onResponse(Call<NamedApiResourceList> call, Response<NamedApiResourceList> response) {
                listener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<NamedApiResourceList> call, Throwable t) {
                if(!call.isCanceled()) {
                    listener.onError(call, t);
                }
            }
        });
    }

    @Override
    public void pokemonClicked(NamedApiResource resource, final PokemonListContract.OnPokemonClickedListener listener) {
        mPokedex.pokemon.getPokemon(resource.getName(), new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                listener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                if(!call.isCanceled()) {
                    listener.onError(call, t);
                }
            }
        });
    }

    @Override
    public void start() {
        mDatabase.pokemonResourceDao()
            .getAllPokemonResources()
            .observe((PokemonListActivity)mFragment.getActivity(), mPokemonResourceObserver);
    }

    void loadFromApi() {
        if(mFragment.hasNetworkConnection()) {
            mFragment.hideProgressBar();

            load(new PokemonListContract.OnPokemonLoadedListener() {
                @Override
                public void onSuccess(NamedApiResourceList namedApiResourceList) {
                    new InsertPokemonList(mDatabase).execute(namedApiResourceList);
                }

                @Override
                public void onSuccess(Pokemon pokemon) {

                }

                @Override
                public void onError(Call call, Throwable throwable) {
                    mFragment.showError(throwable, "loadFromApi");
                }
            });
        } else {
            mFragment.showConnectionError();
        }
    }

    void loadMore() {
        if(mFragment.hasNetworkConnection()) {
            loadMore(mNamedApiResourceList.getNext(), new PokemonListContract.OnPokemonLoadedListener() {
                @Override
                public void onSuccess(NamedApiResourceList namedApiResourceList) {
                    mNamedApiResourceList.update(namedApiResourceList);
                    new UpdatePokemonList(mDatabase).execute(mNamedApiResourceList);
                }

                @Override
                public void onSuccess(Pokemon pokemon) {

                }

                @Override
                public void onError(Call call, Throwable throwable) {
                    mFragment.showError(throwable, "loadMore");
                }
            });
        } else {
            mFragment.showConnectionError();
        }
    }
}
