package com.carbonmade.corysandlin.pokedex.PokemonList;

import android.app.Fragment;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.carbonmade.corysandlin.pokedex.App;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResourceList;
import com.carbonmade.corysandlin.pokedex.Data.Models.Pokemon.Pokemon;
import com.carbonmade.corysandlin.pokedex.Data.Storage.AppDatabase;
import com.carbonmade.corysandlin.pokedex.Data.Storage.Pokemon.PokemonResource;
import com.carbonmade.corysandlin.pokedex.R;
import com.carbonmade.corysandlin.pokedex.Data.Services.PokedexService;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public class PokemonListFragment extends Fragment {
    private final String TAG = this.getClass().getSimpleName();
    private View mView;
    private Context mContext;
    private NamedApiResourceList mNamedApiResourceList;
    private PokemonListAdapter mPokemonListAdapter;
    private PokemonListPresenter mPresenter;
    private Observer<PokemonResource> mPokemonResourceObserver;

    @BindView(R.id.listRecyclerView) RecyclerView mRecyclerView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    @Inject PokedexService mPokedex;
    @Inject Picasso mPicasso;
    @Inject AppDatabase mDatabase;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        ((App)context.getApplicationContext()).getAppComponent().inject(this);
        mPresenter = new PokemonListPresenter(this, mPokedex, mPicasso, mDatabase);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.pokemonlist_fragment, container, false);
        ButterKnife.bind(this, mView);

        mPresenter.start();

        return mView;
    }

    void setupRecyclerView(NamedApiResourceList namedApiResourceList) {
        mNamedApiResourceList = namedApiResourceList;
        OnPokemonSelectedListener listener = new PokemonListClicker(getActivity());
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());

        mPokemonListAdapter = new PokemonListAdapter(mNamedApiResourceList, mPicasso, listener);

        mRecyclerView.setAdapter(mPokemonListAdapter);
        mRecyclerView.setLayoutManager(manager);

        mProgressBar.setVisibility(View.GONE);
        mRecyclerView.setVisibility(View.VISIBLE);

        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                // 1 is down
                if(!recyclerView.canScrollVertically(1)) {
                    mPresenter.loadMore();
                }
            }
        });
    }

    void hideProgressBar() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    boolean hasNetworkConnection() {
        ConnectivityManager cm = (ConnectivityManager)mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

    void showConnectionError() {
        Snackbar.make(mView, R.string.network_connection_unavailable, Snackbar.LENGTH_INDEFINITE).setAction(getString(R.string.snackbar_action_retry), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.loadFromApi();
            }
        });
    }

    void showError(Throwable throwable, final String method) {
        String message;

        switch(throwable.getMessage()) {
            case "timeout":
                message = getString(R.string.network_request_timed_out);
                break;
            default:
                message = getString(R.string.error_unknown);
                Log.e(TAG, throwable.getMessage(), throwable);
                break;
        }

        mProgressBar.setVisibility(View.GONE);

        Snackbar.make(mView, message, Snackbar.LENGTH_INDEFINITE).setAction(getString(R.string.snackbar_action_retry), new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(method) {
                    case "loadFromApi":
                        mPresenter.loadFromApi();
                        break;
                    case "loadMore":
                        mPresenter.loadMore();
                        break;
                }
            }
        }).show();
    }
}

class InsertPokemonList extends AsyncTask<NamedApiResourceList, Integer, Long> {
    private AppDatabase mDatabase;

    InsertPokemonList(AppDatabase database) {
        mDatabase = database;
    }

    @Override
    protected Long doInBackground(NamedApiResourceList... namedApiResourceLists) {
        for(NamedApiResourceList namedApiResourceList : namedApiResourceLists) {
            PokemonResource resource = new PokemonResource(1, namedApiResourceList);
            mDatabase.pokemonResourceDao().insertPokemonResources(resource);

            if(isCancelled()) {
                break;
            }
        }

        return 0L;
    }
}

class UpdatePokemonList extends AsyncTask<NamedApiResourceList, Integer, Long> {
    private AppDatabase mDatabase;

    UpdatePokemonList(AppDatabase database) {
        mDatabase = database;
    }

    @Override
    protected Long doInBackground(NamedApiResourceList... namedApiResourceLists) {
        for(NamedApiResourceList namedApiResourceList : namedApiResourceLists) {
            PokemonResource resource = new PokemonResource(1, namedApiResourceList);
            mDatabase.pokemonResourceDao().updatePokemonResources(resource);

            if(isCancelled()) {
                break;
            }
        }

        return 0L;
    }
}