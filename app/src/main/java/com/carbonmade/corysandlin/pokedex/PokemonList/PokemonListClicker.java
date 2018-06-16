package com.carbonmade.corysandlin.pokedex.PokemonList;

import android.app.Activity;
import android.widget.Toast;

import com.carbonmade.corysandlin.pokedex.Data.Models.Common.NamedApiResource;

interface OnPokemonSelectedListener {
    void onPokemonSelected(int index, NamedApiResource resource);
}

public class PokemonListClicker implements OnPokemonSelectedListener {
    private Activity mActivity;

    public PokemonListClicker(Activity activity) {
        mActivity = activity;
    }

    @Override
    public void onPokemonSelected(int index, NamedApiResource resource) {
        Toast.makeText(mActivity, resource.getFormattedName(), Toast.LENGTH_SHORT).show();
    }
}
