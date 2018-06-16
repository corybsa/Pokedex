package com.carbonmade.corysandlin.pokedex.PokemonList;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.arch.persistence.room.Ignore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.carbonmade.corysandlin.pokedex.App;
import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;
import com.carbonmade.corysandlin.pokedex.R;

public class PokemonListActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokemonlist_activity);

        ((App)getApplication()).getAppComponent().inject(this);

        PokemonListFragment savedFragment = (PokemonListFragment)getFragmentManager().findFragmentById(R.id.placeholder);

        if(savedFragment == null) {
            PokemonListFragment fragment = new PokemonListFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.placeholder, fragment);
            fragmentTransaction.commit();
        }
    }
}

